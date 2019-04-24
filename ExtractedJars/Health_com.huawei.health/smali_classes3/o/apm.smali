.class public final Lo/apm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "UseSparseArrays"
    }
.end annotation


# static fields
.field private static c:Lo/apm;


# instance fields
.field private a:Lo/aqq;

.field private d:Lo/aqk;

.field private e:Lo/aqm;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 71
    new-instance v0, Lo/aqk;

    invoke-direct {v0, v1}, Lo/aqk;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/apm;->d:Lo/aqk;

    .line 72
    new-instance v0, Lo/aqq;

    invoke-direct {v0, v1}, Lo/aqq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/apm;->a:Lo/aqq;

    .line 73
    new-instance v0, Lo/aqm;

    invoke-direct {v0, v1}, Lo/aqm;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/apm;->e:Lo/aqm;

    .line 74
    return-void
.end method

.method public static declared-synchronized a()Lo/apm;
    .locals 4

    const-class v2, Lo/apm;

    monitor-enter v2

    .line 83
    :try_start_0
    sget-object v0, Lo/apm;->c:Lo/apm;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 85
    new-instance v0, Lo/apm;

    invoke-direct {v0}, Lo/apm;-><init>()V

    sput-object v0, Lo/apm;->c:Lo/apm;

    .line 87
    :cond_0
    sget-object v0, Lo/apm;->c:Lo/apm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private static e(Ljava/lang/String;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 525
    new-instance v0, Lo/apm$3;

    invoke-direct {v0, p0}, Lo/apm$3;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private h()V
    .locals 0

    .line 178
    invoke-static {}, Lo/aob;->c()V

    .line 179
    return-void
.end method

.method private m(J)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 1

    .line 476
    iget-object v0, p0, Lo/apm;->e:Lo/aqm;

    invoke-virtual {v0, p1, p2}, Lo/aqm;->e(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    return-object v0
.end method

.method private static n(J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 554
    new-instance v0, Lo/apm$1;

    invoke-direct {v0, p0, p1}, Lo/apm$1;-><init>(J)V

    return-object v0
.end method


# virtual methods
.method public a(J)I
    .locals 1

    .line 298
    iget-object v0, p0, Lo/apm;->d:Lo/aqk;

    invoke-virtual {v0, p1, p2}, Lo/aqk;->d(J)I

    move-result v0

    return v0
.end method

.method public declared-synchronized a(Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 1

    monitor-enter p0

    .line 98
    :try_start_0
    iget-object v0, p0, Lo/apm;->d:Lo/aqk;

    invoke-virtual {v0, p1}, Lo/aqk;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;[I)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/chat/MessageItem;[I)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 358
    iget-object v0, p0, Lo/apm;->a:Lo/aqq;

    invoke-virtual {v0, p1, p2}, Lo/aqq;->b(Lcom/huawei/health/sns/model/chat/MessageItem;[I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;J)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 370
    iget-object v0, p0, Lo/apm;->a:Lo/aqq;

    invoke-virtual {v0, p1, p2, p3}, Lo/aqq;->e(Ljava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public a(JIJZ)Ljava/util/HashMap;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JIJZ)Ljava/util/HashMap<Ljava/lang/Long;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;>;"
        }
    .end annotation

    .line 139
    iget-object v0, p0, Lo/apm;->a:Lo/aqq;

    move-wide v1, p1

    move v3, p3

    move-wide v4, p4

    move/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/aqq;->a(JIJZ)Ljava/util/ArrayList;

    move-result-object v7

    .line 140
    if-nez v7, :cond_0

    .line 142
    const/4 v0, 0x0

    return-object v0

    .line 145
    :cond_0
    invoke-static {}, Lcom/huawei/health/sns/model/chat/MessageItem;->newComparator()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v7, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 146
    const/4 v8, 0x0

    .line 147
    const-wide v9, 0x7fffffffffffffffL

    .line 148
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 151
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v0

    int-to-long v9, v0

    .line 153
    :cond_1
    const-wide v0, 0x7fffffffffffffffL

    cmp-long v0, v9, v0

    if-eqz v0, :cond_2

    .line 155
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 156
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v8, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    :cond_2
    return-object v8
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 520
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1}, Lo/apm;->e(Ljava/lang/String;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 521
    return-void
.end method

.method public declared-synchronized b(J)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    monitor-enter p0

    .line 121
    :try_start_0
    iget-object v0, p0, Lo/apm;->a:Lo/aqq;

    invoke-virtual {v0, p1, p2}, Lo/aqq;->c(J)Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 124
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b([Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/String;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 391
    iget-object v0, p0, Lo/apm;->d:Lo/aqk;

    invoke-virtual {v0, p1}, Lo/aqk;->a([Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public b(JI)Ljava/util/HashMap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)Ljava/util/HashMap<Ljava/lang/Long;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;>;"
        }
    .end annotation

    .line 413
    iget-object v0, p0, Lo/apm;->a:Lo/aqq;

    invoke-virtual {v0, p1, p2, p3}, Lo/aqq;->e(JI)Ljava/util/ArrayList;

    move-result-object v2

    .line 414
    if-nez v2, :cond_0

    .line 416
    const/4 v0, 0x0

    return-object v0

    .line 419
    :cond_0
    const/4 v3, 0x0

    .line 420
    const-wide v4, 0x7fffffffffffffffL

    .line 421
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 424
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v0

    int-to-long v4, v0

    .line 426
    :cond_1
    const-wide v0, 0x7fffffffffffffffL

    cmp-long v0, v4, v0

    if-eqz v0, :cond_2

    .line 428
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 429
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v3, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    :cond_2
    return-object v3
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 245
    iget-object v0, p0, Lo/apm;->e:Lo/aqm;

    invoke-virtual {v0, p1, p2}, Lo/aqm;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    return-void
.end method

.method public b()Z
    .locals 2

    .line 186
    iget-object v0, p0, Lo/apm;->d:Lo/aqk;

    invoke-virtual {v0}, Lo/aqk;->d()Z

    move-result v1

    .line 187
    if-eqz v1, :cond_0

    .line 189
    invoke-direct {p0}, Lo/apm;->h()V

    .line 191
    :cond_0
    return v1
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 277
    iget-object v0, p0, Lo/apm;->d:Lo/aqk;

    invoke-virtual {v0, p1}, Lo/aqk;->a(Ljava/lang/String;)V

    .line 278
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 234
    iget-object v0, p0, Lo/apm;->e:Lo/aqm;

    invoke-virtual {v0, p1, p2}, Lo/aqm;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    return-void
.end method

.method public c()Z
    .locals 1

    .line 465
    iget-object v0, p0, Lo/apm;->d:Lo/aqk;

    invoke-virtual {v0}, Lo/aqk;->a()Z

    move-result v0

    return v0
.end method

.method public c(J)Z
    .locals 2

    .line 330
    iget-object v0, p0, Lo/apm;->e:Lo/aqm;

    invoke-virtual {v0, p1, p2}, Lo/aqm;->c(J)Z

    move-result v1

    .line 331
    if-eqz v1, :cond_0

    .line 333
    invoke-direct {p0}, Lo/apm;->h()V

    .line 335
    :cond_0
    return v1
.end method

.method public c(Lcom/huawei/health/sns/model/chat/MessageItem;)Z
    .locals 1

    .line 109
    iget-object v0, p0, Lo/apm;->d:Lo/aqk;

    invoke-virtual {v0, p1}, Lo/aqk;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v0

    return v0
.end method

.method public d()J
    .locals 2

    .line 212
    iget-object v0, p0, Lo/apm;->d:Lo/aqk;

    invoke-virtual {v0}, Lo/aqk;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(J)J
    .locals 2

    .line 202
    iget-object v0, p0, Lo/apm;->d:Lo/aqk;

    invoke-virtual {v0, p1, p2}, Lo/aqk;->a(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public d(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 266
    const-string v0, "updateMessage"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateMessage:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    iget-object v0, p0, Lo/apm;->e:Lo/aqm;

    invoke-virtual {v0, p1}, Lo/aqm;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 268
    return-void
.end method

.method public d(Ljava/lang/String;I)V
    .locals 1

    .line 223
    iget-object v0, p0, Lo/apm;->e:Lo/aqm;

    invoke-virtual {v0, p1, p2}, Lo/aqm;->b(Ljava/lang/String;I)V

    .line 224
    return-void
.end method

.method public d(Ljava/lang/String;IZ)V
    .locals 1

    .line 256
    iget-object v0, p0, Lo/apm;->e:Lo/aqm;

    invoke-virtual {v0, p1, p2, p3}, Lo/aqm;->d(Ljava/lang/String;IZ)V

    .line 257
    return-void
.end method

.method public e(JJJ)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 443
    iget-object v0, p0, Lo/apm;->a:Lo/aqq;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    invoke-virtual/range {v0 .. v6}, Lo/aqq;->a(JJJ)Ljava/util/ArrayList;

    move-result-object v7

    .line 444
    return-object v7
.end method

.method public e()Z
    .locals 1

    .line 401
    iget-object v0, p0, Lo/apm;->e:Lo/aqm;

    invoke-virtual {v0}, Lo/aqm;->d()Z

    move-result v0

    return v0
.end method

.method public e(J)Z
    .locals 2

    .line 168
    iget-object v0, p0, Lo/apm;->d:Lo/aqk;

    invoke-virtual {v0, p1, p2}, Lo/aqk;->e(J)Z

    move-result v1

    .line 169
    if-eqz v1, :cond_0

    .line 171
    invoke-direct {p0}, Lo/apm;->h()V

    .line 173
    :cond_0
    return v1
.end method

.method public f(J)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 1

    .line 381
    iget-object v0, p0, Lo/apm;->d:Lo/aqk;

    invoke-virtual {v0, p1, p2}, Lo/aqk;->b(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    return-object v0
.end method

.method public g(J)V
    .locals 2

    .line 543
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2}, Lo/apm;->n(J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 544
    return-void
.end method

.method public h(J)V
    .locals 7

    .line 486
    invoke-direct {p0, p1, p2}, Lo/apm;->m(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v3

    .line 488
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 489
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->isTipMessage()Z

    move-result v0

    if-nez v0, :cond_2

    .line 491
    const/4 v4, 0x0

    .line 492
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v1

    invoke-virtual {v0, p1, p2, v1, v2}, Lo/ath;->a(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v5

    .line 493
    if-eqz v5, :cond_0

    .line 495
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 499
    :cond_0
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v6

    .line 500
    if-eqz v6, :cond_1

    .line 502
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getDisplayName()Ljava/lang/String;

    move-result-object v4

    .line 505
    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 507
    invoke-virtual {v3, v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderName(Ljava/lang/String;)V

    .line 508
    invoke-virtual {p0, v3}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 511
    :cond_2
    return-void
.end method

.method public i(J)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 1

    .line 455
    iget-object v0, p0, Lo/apm;->d:Lo/aqk;

    invoke-virtual {v0, p1, p2}, Lo/aqk;->g(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    return-object v0
.end method

.method public k(J)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 346
    iget-object v0, p0, Lo/apm;->d:Lo/aqk;

    invoke-virtual {v0, p1, p2}, Lo/aqk;->c(J)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
