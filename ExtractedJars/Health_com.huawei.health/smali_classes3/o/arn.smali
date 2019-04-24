.class public Lo/arn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:J

.field private c:J

.field private d:J

.field private e:I

.field private f:Z

.field private g:I

.field private h:I

.field private i:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<Lcom/huawei/health/sns/logic/chat/task/ChatMessage;>;"
        }
    .end annotation
.end field

.field private k:Landroid/os/Handler;

.field private l:Landroid/os/Handler;

.field private m:Landroid/support/v4/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation
.end field

.field private n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private o:J

.field private p:I


# direct methods
.method public constructor <init>(JZI)V
    .locals 2

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    const/16 v0, 0x14

    iput v0, p0, Lo/arn;->e:I

    .line 67
    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lo/arn;->c:J

    .line 72
    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lo/arn;->d:J

    .line 82
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/arn;->a:Z

    .line 92
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lo/arn;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 97
    const/4 v0, -0x1

    iput v0, p0, Lo/arn;->h:I

    .line 102
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/arn;->f:Z

    .line 107
    const/4 v0, -0x1

    iput v0, p0, Lo/arn;->g:I

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lo/arn;->l:Landroid/os/Handler;

    .line 122
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lo/arn;->m:Landroid/support/v4/util/LongSparseArray;

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lo/arn;->n:Ljava/util/ArrayList;

    .line 132
    const/4 v0, -0x1

    iput v0, p0, Lo/arn;->p:I

    .line 137
    const-wide/32 v0, 0x7fffffff

    iput-wide v0, p0, Lo/arn;->o:J

    .line 163
    iput-wide p1, p0, Lo/arn;->b:J

    .line 164
    iput-boolean p3, p0, Lo/arn;->f:Z

    .line 165
    iput p4, p0, Lo/arn;->g:I

    .line 166
    invoke-direct {p0}, Lo/arn;->k()V

    .line 167
    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;JZI)V
    .locals 2

    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    const/16 v0, 0x14

    iput v0, p0, Lo/arn;->e:I

    .line 67
    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lo/arn;->c:J

    .line 72
    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lo/arn;->d:J

    .line 82
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/arn;->a:Z

    .line 92
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lo/arn;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 97
    const/4 v0, -0x1

    iput v0, p0, Lo/arn;->h:I

    .line 102
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/arn;->f:Z

    .line 107
    const/4 v0, -0x1

    iput v0, p0, Lo/arn;->g:I

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lo/arn;->l:Landroid/os/Handler;

    .line 122
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lo/arn;->m:Landroid/support/v4/util/LongSparseArray;

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lo/arn;->n:Ljava/util/ArrayList;

    .line 132
    const/4 v0, -0x1

    iput v0, p0, Lo/arn;->p:I

    .line 137
    const-wide/32 v0, 0x7fffffff

    iput-wide v0, p0, Lo/arn;->o:J

    .line 154
    iput-object p1, p0, Lo/arn;->l:Landroid/os/Handler;

    .line 155
    iput-wide p2, p0, Lo/arn;->b:J

    .line 156
    iput-boolean p4, p0, Lo/arn;->f:Z

    .line 157
    iput p5, p0, Lo/arn;->g:I

    .line 158
    invoke-direct {p0}, Lo/arn;->k()V

    .line 159
    return-void
.end method

.method private a(J)Lcom/huawei/health/sns/model/user/User;
    .locals 3

    .line 757
    iget-object v1, p0, Lo/arn;->m:Landroid/support/v4/util/LongSparseArray;

    monitor-enter v1

    .line 759
    :try_start_0
    iget-object v0, p0, Lo/arn;->m:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/user/User;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 760
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private a(Ljava/util/HashMap;Lcom/huawei/health/sns/model/chat/MessageItem;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/Long;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;>;Lcom/huawei/health/sns/model/chat/MessageItem;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 561
    const/4 v2, 0x0

    .line 562
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 564
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lo/arn;->d:J

    .line 565
    iget-wide v0, p0, Lo/arn;->d:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/ArrayList;

    .line 567
    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 570
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lo/arn;->h:I

    .line 572
    :cond_1
    return-object v2
.end method

.method private a(IILandroid/os/Bundle;)V
    .locals 3

    .line 398
    iget-object v0, p0, Lo/arn;->l:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 400
    const-string v0, "ChatPreReadTask"

    const-string v1, "notifyMessage msgHandler is null return."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    return-void

    .line 404
    :cond_0
    iget-object v0, p0, Lo/arn;->l:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 405
    iput p1, v2, Landroid/os/Message;->what:I

    .line 406
    iput p2, v2, Landroid/os/Message;->arg1:I

    .line 407
    invoke-virtual {v2, p3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 408
    iget-object v0, p0, Lo/arn;->l:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 409
    return-void
.end method

.method static synthetic a(Lo/arn;Ljava/lang/Object;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lo/arn;->e(Ljava/lang/Object;)V

    return-void
.end method

.method private a(Z)V
    .locals 4

    .line 418
    iget-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 420
    const-string v0, "ChatPreReadTask"

    const-string v1, "sendQueryDataTask preReadHandler handler is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    return-void

    .line 423
    :cond_0
    iget-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    if-eqz p1, :cond_1

    const/16 v1, 0x3eb

    goto :goto_0

    :cond_1
    const/16 v1, 0x3ea

    :goto_0
    iget-boolean v2, p0, Lo/arn;->a:Z

    if-eqz v2, :cond_2

    const-wide/16 v2, 0x12c

    goto :goto_1

    :cond_2
    const-wide/16 v2, 0x0

    :goto_1
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 426
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/arn;->a:Z

    .line 427
    return-void
.end method

.method private b(JLcom/huawei/health/sns/model/user/User;)V
    .locals 3

    .line 742
    iget-object v1, p0, Lo/arn;->m:Landroid/support/v4/util/LongSparseArray;

    monitor-enter v1

    .line 744
    :try_start_0
    iget-object v0, p0, Lo/arn;->m:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 745
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 746
    :goto_0
    return-void
.end method

.method private b(Z)V
    .locals 1

    .line 339
    invoke-direct {p0}, Lo/arn;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 341
    invoke-direct {p0, p1}, Lo/arn;->a(Z)V

    .line 343
    :cond_0
    return-void
.end method

.method private c(Ljava/util/ArrayList;Z)Lcom/huawei/health/sns/logic/chat/task/ChatMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;Z)Lcom/huawei/health/sns/logic/chat/task/ChatMessage;"
        }
    .end annotation

    .line 284
    new-instance v0, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;-><init>()V

    .line 285
    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->setMessageItems(Ljava/util/ArrayList;)V

    .line 286
    invoke-virtual {v0, p2}, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->setHasMore(Z)V

    .line 287
    return-object v0
.end method

.method private c(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 522
    if-nez p1, :cond_0

    .line 524
    return-void

    .line 526
    :cond_0
    iget-object v0, p0, Lo/arn;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 528
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 529
    iget-object v0, p0, Lo/arn;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 530
    const/4 v3, 0x0

    .line 531
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 533
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;

    .line 534
    invoke-virtual {v4}, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;->getMessageItems()Ljava/util/ArrayList;

    move-result-object v3

    .line 535
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 538
    const/4 v0, 0x0

    invoke-virtual {v1, v0, v3}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 540
    :cond_1
    goto :goto_0

    .line 541
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 544
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 547
    :cond_3
    iget-object v0, p0, Lo/arn;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 549
    :cond_4
    return-void
.end method

.method private d(Ljava/util/ArrayList;Z)Landroid/os/Bundle;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;Z)Landroid/os/Bundle;"
        }
    .end annotation

    .line 269
    invoke-direct {p0, p1, p2}, Lo/arn;->c(Ljava/util/ArrayList;Z)Lcom/huawei/health/sns/logic/chat/task/ChatMessage;

    move-result-object v1

    .line 270
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 271
    const-string v0, "bundleMsgKey"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 272
    return-object v2
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 631
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v0

    .line 634
    invoke-direct {p0, v0, v1}, Lo/arn;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    .line 635
    if-eqz v2, :cond_0

    .line 637
    return-void

    .line 640
    :cond_0
    invoke-direct {p0, p1}, Lo/arn;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 641
    return-void
.end method

.method static synthetic d(Lo/arn;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/arn;->i()V

    return-void
.end method

.method static synthetic d(Lo/arn;Z)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lo/arn;->d(Z)V

    return-void
.end method

.method private d(Z)V
    .locals 11

    .line 437
    const/4 v7, 0x0

    .line 438
    const/4 v8, 0x0

    .line 440
    const-string v0, "ChatPreReadTask"

    const-string v1, "query message"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-wide v1, p0, Lo/arn;->b:J

    iget v3, p0, Lo/arn;->e:I

    iget-wide v4, p0, Lo/arn;->d:J

    iget-boolean v6, p0, Lo/arn;->a:Z

    invoke-virtual/range {v0 .. v6}, Lo/apm;->a(JIJZ)Ljava/util/HashMap;

    move-result-object v7

    .line 443
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 446
    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lo/arn;->d:J

    .line 447
    const-string v0, "ChatPreReadTask"

    const-string v1, "query page new thresholdDate "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    iget-wide v0, p0, Lo/arn;->d:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/ArrayList;

    goto :goto_0

    .line 452
    :cond_0
    const-string v0, "ChatPreReadTask"

    const-string v1, "query page by thresholdId  data has done, but result is null!"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 455
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    .line 458
    iget-boolean v0, p0, Lo/arn;->a:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lo/arn;->f:Z

    if-eqz v0, :cond_2

    .line 460
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget v1, p0, Lo/arn;->g:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lo/apm;->i(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v9

    .line 462
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 465
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lo/arn;->h:I

    goto :goto_1

    .line 470
    :cond_1
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-wide v1, p0, Lo/arn;->b:J

    iget v3, p0, Lo/arn;->g:I

    invoke-virtual {v0, v1, v2, v3}, Lo/apm;->b(JI)Ljava/util/HashMap;

    move-result-object v7

    .line 471
    invoke-direct {p0, v7, v9}, Lo/arn;->a(Ljava/util/HashMap;Lcom/huawei/health/sns/model/chat/MessageItem;)Ljava/util/ArrayList;

    move-result-object v8

    .line 476
    :cond_2
    :goto_1
    iget-wide v0, p0, Lo/arn;->o:J

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lo/arn;->f:Z

    if-nez v0, :cond_3

    .line 478
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-wide v1, p0, Lo/arn;->o:J

    invoke-virtual {v0, v1, v2}, Lo/apm;->i(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v9

    .line 480
    if-eqz v8, :cond_3

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 483
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lo/arn;->p:I

    .line 489
    :cond_3
    invoke-direct {p0, v8}, Lo/arn;->e(Ljava/util/ArrayList;)V

    .line 491
    invoke-direct {p0}, Lo/arn;->h()Z

    move-result v9

    .line 494
    if-eqz p1, :cond_4

    .line 496
    const-string v0, "ChatPreReadTask"

    const-string v1, "send msg to ui."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 500
    invoke-direct {p0, v8}, Lo/arn;->c(Ljava/util/ArrayList;)V

    .line 502
    invoke-direct {p0, v8, v9}, Lo/arn;->d(Ljava/util/ArrayList;Z)Landroid/os/Bundle;

    move-result-object v0

    const/16 v1, 0x7e0

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lo/arn;->a(IILandroid/os/Bundle;)V

    .line 505
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/arn;->b(Z)V

    goto :goto_2

    .line 509
    :cond_4
    const-string v0, "ChatPreReadTask"

    const-string v1, "add msg to cache."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    invoke-direct {p0, v8, v9}, Lo/arn;->c(Ljava/util/ArrayList;Z)Lcom/huawei/health/sns/logic/chat/task/ChatMessage;

    move-result-object v10

    .line 511
    iget-object v0, p0, Lo/arn;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, v10}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 513
    :goto_2
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 6

    .line 650
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v3

    .line 651
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-gtz v0, :cond_0

    .line 653
    return-void

    .line 657
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v2

    invoke-static {v3, v4, v0, v1, v2}, Lo/aro;->c(JJI)Lcom/huawei/health/sns/model/user/User;

    move-result-object v5

    .line 660
    if-nez v5, :cond_1

    .line 663
    iget-object v0, p0, Lo/arn;->n:Ljava/util/ArrayList;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 666
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/arn$4;

    invoke-direct {v1, p0, v3, v4}, Lo/arn$4;-><init>(Lo/arn;J)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 682
    iget-object v0, p0, Lo/arn;->n:Ljava/util/ArrayList;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 687
    :cond_1
    const-string v0, "ChatPreReadTask"

    const-string v1, "findUserInfoByMessage  user != null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 689
    invoke-direct {p0, v3, v4, v5}, Lo/arn;->b(JLcom/huawei/health/sns/model/user/User;)V

    .line 691
    :cond_2
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/Object;)V
    .locals 12

    .line 803
    if-nez p1, :cond_0

    .line 805
    return-void

    .line 807
    :cond_0
    const-wide/16 v7, 0x0

    .line 811
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v7, v0

    .line 816
    goto :goto_0

    .line 813
    :catch_0
    move-exception v9

    .line 815
    const-string v0, "ChatPreReadTask"

    const-string v1, "getBetweenTwoIdMessages msgId parse error."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 819
    :goto_0
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-wide v1, p0, Lo/arn;->o:J

    invoke-virtual {v0, v1, v2}, Lo/apm;->i(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v9

    .line 821
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-wide v1, p0, Lo/arn;->b:J

    iget-wide v3, p0, Lo/arn;->o:J

    move-wide v5, v7

    invoke-virtual/range {v0 .. v6}, Lo/apm;->e(JJJ)Ljava/util/ArrayList;

    move-result-object v10

    .line 824
    const/4 v0, 0x0

    if-ne v0, v10, :cond_1

    .line 826
    iget v0, p0, Lo/arn;->p:I

    const/16 v1, 0x7ec

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/arn;->a(IILandroid/os/Bundle;)V

    .line 827
    return-void

    .line 830
    :cond_1
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 833
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lo/arn;->p:I

    .line 834
    iget v0, p0, Lo/arn;->p:I

    new-instance v1, Lo/api;

    invoke-direct {v1}, Lo/api;-><init>()V

    iget-wide v2, p0, Lo/arn;->b:J

    invoke-virtual {v1, v2, v3}, Lo/api;->a(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 837
    :cond_2
    iget-object v0, p0, Lo/arn;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 839
    iget-wide v0, p0, Lo/arn;->o:J

    iput-wide v0, p0, Lo/arn;->d:J

    .line 840
    invoke-direct {p0}, Lo/arn;->h()Z

    move-result v11

    .line 842
    iget v0, p0, Lo/arn;->p:I

    invoke-direct {p0, v10, v11}, Lo/arn;->d(Ljava/util/ArrayList;Z)Landroid/os/Bundle;

    move-result-object v1

    const/16 v2, 0x7ec

    invoke-direct {p0, v2, v0, v1}, Lo/arn;->a(IILandroid/os/Bundle;)V

    .line 844
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/arn;->b(Z)V

    .line 845
    return-void
.end method

.method private e(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 584
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 586
    :cond_0
    return-void

    .line 589
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 592
    invoke-static {v2}, Lo/aro;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 594
    invoke-static {v2}, Lo/aro;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 595
    invoke-direct {p0, v2}, Lo/arn;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 596
    goto :goto_0

    .line 597
    :cond_2
    return-void
.end method

.method static synthetic e(Lo/arn;JLcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2, p3}, Lo/arn;->b(JLcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method private g()Z
    .locals 2

    .line 322
    iget-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 324
    iget-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    .line 325
    const/16 v1, 0x3ec

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 324
    :goto_0
    return v0

    .line 327
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private h()Z
    .locals 4

    .line 771
    iget-wide v0, p0, Lo/arn;->c:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lo/arn;->c:J

    iget-wide v2, p0, Lo/arn;->d:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 773
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 775
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private i()V
    .locals 4

    .line 245
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-wide v1, p0, Lo/arn;->b:J

    invoke-virtual {v0, v1, v2}, Lo/apm;->d(J)J

    move-result-wide v0

    iput-wide v0, p0, Lo/arn;->c:J

    .line 246
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-wide v1, p0, Lo/arn;->b:J

    invoke-virtual {v0, v1, v2}, Lo/apm;->a(J)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lo/arn;->o:J

    .line 248
    iget-wide v0, p0, Lo/arn;->c:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    .line 251
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/arn;->d(Ljava/util/ArrayList;Z)Landroid/os/Bundle;

    move-result-object v0

    const/16 v1, 0x7e0

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lo/arn;->a(IILandroid/os/Bundle;)V

    goto :goto_0

    .line 256
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/arn;->d(Z)V

    .line 258
    :goto_0
    return-void
.end method

.method private k()V
    .locals 3

    .line 174
    invoke-static {}, Lo/aph;->e()Landroid/os/HandlerThread;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    .line 175
    if-nez v2, :cond_0

    .line 177
    const-string v0, "ChatPreReadTask"

    const-string v1, "ChatPreReadTask:looper is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    return-void

    .line 181
    :cond_0
    new-instance v0, Lo/arn$1;

    invoke-direct {v0, p0, v2}, Lo/arn$1;-><init>(Lo/arn;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    .line 221
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 849
    iget-wide v0, p0, Lo/arn;->o:J

    return-wide v0
.end method

.method public a(JJI)V
    .locals 8

    .line 608
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/arn$2;

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    move v7, p5

    invoke-direct/range {v1 .. v7}, Lo/arn$2;-><init>(Lo/arn;JJI)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 622
    return-void
.end method

.method public b(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/model/user/User;
    .locals 5

    .line 701
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v2

    .line 703
    invoke-direct {p0, v2, v3}, Lo/arn;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    .line 705
    if-nez v4, :cond_0

    .line 707
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/arn$5;

    invoke-direct {v1, p0, p1, v2, v3}, Lo/arn$5;-><init>(Lo/arn;Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 730
    :cond_0
    return-object v4
.end method

.method public b()V
    .locals 1

    .line 785
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/arn;->a:Z

    .line 786
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/arn;->f:Z

    .line 787
    const/4 v0, -0x1

    iput v0, p0, Lo/arn;->h:I

    .line 788
    const/4 v0, -0x1

    iput v0, p0, Lo/arn;->g:I

    .line 789
    iget-object v0, p0, Lo/arn;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    if-eqz v0, :cond_0

    .line 791
    iget-object v0, p0, Lo/arn;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 793
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 228
    iget-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 230
    const-string v0, "ChatPreReadTask"

    const-string v1, "loadFirstBatchDataAsync preReadHandler handler is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 235
    :cond_0
    iget-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 237
    :goto_0
    return-void
.end method

.method public d()Lcom/huawei/health/sns/logic/chat/task/ChatMessage;
    .locals 6

    .line 296
    const/4 v3, 0x0

    .line 299
    iget-object v0, p0, Lo/arn;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v4

    .line 301
    if-nez v4, :cond_0

    .line 303
    iget-object v0, p0, Lo/arn;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/logic/chat/task/ChatMessage;

    .line 306
    :cond_0
    invoke-direct {p0}, Lo/arn;->g()Z

    move-result v5

    .line 307
    const-string v0, "ChatPreReadTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isEmpty:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",hasSendUITask:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    if-eqz v4, :cond_1

    if-nez v5, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lo/arn;->b(Z)V

    .line 312
    return-object v3
.end method

.method public d(Ljava/lang/Boolean;J)V
    .locals 4

    .line 366
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 368
    iget v0, p0, Lo/arn;->p:I

    const/16 v1, 0x7ec

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/arn;->a(IILandroid/os/Bundle;)V

    .line 369
    return-void

    .line 372
    :cond_0
    iget-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    if-nez v0, :cond_1

    .line 374
    const-string v0, "ChatPreReadTask"

    const-string v1, "getUnreadMsgPos preReadHandler handler is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    return-void

    .line 379
    :cond_1
    iget-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    const/16 v1, 0x3ec

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 381
    const-string v0, "ChatPreReadTask"

    const-string v1, "getUnreadMsgPos already has QUERY_DATA_BETWEEN_TWO_ID Messages."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    return-void

    .line 385
    :cond_2
    iget-object v0, p0, Lo/arn;->k:Landroid/os/Handler;

    iget-object v1, p0, Lo/arn;->k:Landroid/os/Handler;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x3ec

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 387
    return-void
.end method

.method public e()I
    .locals 1

    .line 353
    iget v0, p0, Lo/arn;->h:I

    .line 354
    return v0
.end method
