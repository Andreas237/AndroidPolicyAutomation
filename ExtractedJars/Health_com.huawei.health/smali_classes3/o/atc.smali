.class public final Lo/atc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/atc;


# instance fields
.field private a:Lo/atw;

.field private c:Lo/atu;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    const/4 v0, 0x0

    sput-object v0, Lo/atc;->d:Lo/atc;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atc;->c:Lo/atu;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atc;->a:Lo/atw;

    .line 63
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 64
    new-instance v0, Lo/atu;

    invoke-direct {v0, v1}, Lo/atu;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/atc;->c:Lo/atu;

    .line 65
    new-instance v0, Lo/atw;

    invoke-direct {v0, v1}, Lo/atw;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/atc;->a:Lo/atw;

    .line 66
    return-void
.end method

.method private static c(Ljava/lang/String;J)V
    .locals 2

    .line 470
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/ata;->c(J)V

    .line 472
    invoke-static {p0}, Lo/bbk;->c(Ljava/lang/String;)V

    .line 474
    invoke-static {p0}, Lo/bbn;->b(Ljava/lang/String;)V

    .line 475
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lo/bbk;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 476
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Lo/bbk;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 477
    return-void
.end method

.method public static declared-synchronized d()Lo/atc;
    .locals 3

    const-class v1, Lo/atc;

    monitor-enter v1

    .line 75
    :try_start_0
    sget-object v0, Lo/atc;->d:Lo/atc;

    if-nez v0, :cond_0

    .line 77
    new-instance v0, Lo/atc;

    invoke-direct {v0}, Lo/atc;-><init>()V

    sput-object v0, Lo/atc;->d:Lo/atc;

    .line 79
    :cond_0
    sget-object v0, Lo/atc;->d:Lo/atc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private d(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroid/support/v4/util/LongSparseArray;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/group/Group;>;Lcom/huawei/health/sns/model/group/Group;)V"
        }
    .end annotation

    .line 566
    invoke-virtual {p5}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {p4, v0, v1}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/group/Group;

    .line 567
    invoke-virtual {p5}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 571
    if-eqz v2, :cond_3

    .line 573
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setState(I)V

    .line 574
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 575
    invoke-interface {p3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 580
    :cond_0
    if-eqz v2, :cond_2

    .line 582
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 584
    const/4 v0, 0x0

    invoke-virtual {p5, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 586
    :cond_1
    invoke-interface {p2, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 590
    :cond_2
    invoke-interface {p1, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 593
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    .line 173
    iget-object v0, p0, Lo/atc;->c:Lo/atu;

    invoke-virtual {v0, p1}, Lo/atu;->b(I)I

    move-result v0

    return v0
.end method

.method public a(J)Ljava/lang/String;
    .locals 2

    .line 365
    invoke-virtual {p0, p1, p2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    .line 366
    if-nez v1, :cond_0

    .line 368
    const-string v0, ""

    return-object v0

    .line 370
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v1, v0}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a()Z
    .locals 7

    .line 325
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lo/atc;->e(IZ)Ljava/util/ArrayList;

    move-result-object v3

    .line 326
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 328
    const-string v0, "GroupManager"

    const-string v1, "batchUpdateNormalGroupName allGroupList size is 0 "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    const/4 v0, 0x1

    return v0

    .line 331
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 332
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/Group;

    .line 334
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 336
    const/4 v0, 0x0

    invoke-virtual {p0, v6, v0}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 337
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    :cond_1
    goto :goto_0

    .line 341
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 342
    if-nez v5, :cond_3

    .line 344
    const-string v0, "GroupManager"

    const-string v1, "batchUpdateNormalGroupName updateList size is 0 "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    const/4 v0, 0x1

    return v0

    .line 348
    :cond_3
    iget-object v0, p0, Lo/atc;->a:Lo/atw;

    invoke-virtual {v0, v4}, Lo/atw;->c(Ljava/util/List;)I

    move-result v6

    .line 349
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 351
    const-string v0, "GroupManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batchUpdateNormalGroupName updateCount:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " updateList size is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    :cond_4
    if-ne v6, v5, :cond_5

    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public a(Lcom/huawei/health/sns/model/group/Group;)Z
    .locals 2

    .line 416
    if-nez p1, :cond_0

    .line 418
    const-string v0, "GroupManager"

    const-string v1, "updateGroup group=null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    const/4 v0, 0x0

    return v0

    .line 422
    :cond_0
    iget-object v0, p0, Lo/atc;->c:Lo/atu;

    invoke-virtual {v0, p1}, Lo/atu;->a(Lcom/huawei/health/sns/model/group/Group;)Z

    move-result v0

    return v0
.end method

.method public b(J)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 135
    iget-object v0, p0, Lo/atc;->c:Lo/atu;

    invoke-virtual {v0, p1, p2}, Lo/atu;->c(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 7

    .line 296
    const/4 v0, 0x3

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lo/atc;->e(IZ)Ljava/util/ArrayList;

    move-result-object v3

    .line 297
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 298
    if-nez v4, :cond_0

    .line 300
    const-string v0, "GroupManager"

    const-string v1, "batchUpdateGroupSearchPinYin allGroupList size is 0 "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    const/4 v0, 0x1

    return v0

    .line 304
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/Group;

    .line 306
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/Group;->buildSearchPinyin()V

    .line 307
    goto :goto_0

    .line 309
    :cond_1
    iget-object v0, p0, Lo/atc;->a:Lo/atw;

    invoke-virtual {v0, v3}, Lo/atw;->c(Ljava/util/List;)I

    move-result v5

    .line 311
    if-ne v5, v4, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    .line 312
    :goto_1
    const-string v0, "GroupManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batchUpdateGroupSearchPinYin isSuccess:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    return v6
.end method

.method public c(J)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 124
    iget-object v0, p0, Lo/atc;->c:Lo/atu;

    invoke-virtual {v0, p1, p2}, Lo/atu;->e(J)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public c()Z
    .locals 6

    .line 271
    const/4 v0, 0x3

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lo/atc;->e(IZ)Ljava/util/ArrayList;

    move-result-object v3

    .line 272
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 273
    if-nez v4, :cond_0

    .line 275
    const-string v0, "GroupManager"

    const-string v1, "batchUpdateGroupSortPinYin allGroupList size is 0 "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    const/4 v0, 0x1

    return v0

    .line 279
    :cond_0
    iget-object v0, p0, Lo/atc;->a:Lo/atw;

    invoke-virtual {v0, v3}, Lo/atw;->c(Ljava/util/List;)I

    move-result v5

    .line 280
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 282
    const-string v0, "GroupManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batchUpdateGroupSortPinYin updateCount:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " allGroupList size is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    :cond_1
    if-ne v5, v4, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Lcom/huawei/health/sns/model/group/Group;)Z
    .locals 1

    .line 602
    iget-object v0, p0, Lo/atc;->c:Lo/atu;

    invoke-virtual {v0, p1}, Lo/atu;->b(Lcom/huawei/health/sns/model/group/Group;)Z

    move-result v0

    return v0
.end method

.method public d(IZ)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation

    .line 113
    iget-object v0, p0, Lo/atc;->c:Lo/atu;

    invoke-virtual {v0, p1, p2}, Lo/atu;->c(IZ)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public d(J)Z
    .locals 2

    .line 145
    invoke-virtual {p0, p1, p2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    .line 146
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    if-nez v0, :cond_0

    .line 148
    const/4 v0, 0x1

    return v0

    .line 150
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public declared-synchronized d(Ljava/util/List;Ljava/util/List;)Z
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 487
    const/4 v6, 0x0

    .line 488
    if-eqz p2, :cond_0

    :try_start_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 490
    :cond_0
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 493
    :cond_1
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 494
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 495
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 498
    const/4 v0, 0x3

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lo/atc;->e(IZ)Ljava/util/ArrayList;

    move-result-object v10

    .line 499
    new-instance v11, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v11}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    .line 500
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 502
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/health/sns/model/group/Group;

    .line 504
    invoke-virtual {v13}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {v11, v0, v1, v13}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 505
    goto :goto_0

    .line 511
    :cond_2
    if-eqz p1, :cond_5

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 514
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 515
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/health/sns/model/group/Group;

    .line 517
    invoke-virtual {v14}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    goto :goto_1

    .line 521
    :cond_3
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/health/sns/model/group/Group;

    .line 523
    invoke-virtual {v14}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 526
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lcom/huawei/health/sns/model/group/Group;->setState(I)V

    .line 527
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 529
    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 530
    invoke-virtual {v14}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {v11, v0, v1}, Landroid/support/v4/util/LongSparseArray;->delete(J)V

    .line 532
    :cond_4
    goto :goto_2

    .line 535
    :cond_5
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/health/sns/model/group/Group;

    .line 537
    move-object v0, p0

    move-object v1, v7

    move-object v2, v8

    move-object v3, v9

    move-object v4, v11

    move-object v5, v13

    invoke-direct/range {v0 .. v5}, Lo/atc;->d(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroid/support/v4/util/LongSparseArray;Lcom/huawei/health/sns/model/group/Group;)V

    .line 538
    goto :goto_3

    .line 541
    :cond_6
    iget-object v0, p0, Lo/atc;->a:Lo/atw;

    invoke-virtual {v0, v7, v8, v9}, Lo/atw;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)I

    move-result v12

    .line 543
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-interface {v9}, Ljava/util/List;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    add-int/2addr v0, v1

    if-ne v12, v0, :cond_7

    const/4 v6, 0x1

    goto :goto_4

    :cond_7
    const/4 v6, 0x0

    .line 546
    :goto_4
    if-eqz v6, :cond_8

    .line 551
    :cond_8
    monitor-exit p0

    return v6

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public e(Lcom/huawei/health/sns/model/group/Group;Z)Ljava/lang/String;
    .locals 5

    .line 381
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 382
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGrpNameFlag()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 384
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 387
    :cond_1
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ath;->d(Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList;

    move-result-object v2

    .line 389
    const-string v3, ""

    .line 391
    invoke-static {v2}, Lo/ati;->e(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v3

    .line 394
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 396
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v4

    .line 397
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_deteted_name:I

    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 400
    :cond_2
    invoke-virtual {p1, v3}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 402
    if-eqz p2, :cond_3

    .line 404
    invoke-virtual {p0, p1}, Lo/atc;->a(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 406
    :cond_3
    return-object v3
.end method

.method public e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation

    .line 89
    iget-object v0, p0, Lo/atc;->c:Lo/atu;

    invoke-virtual {v0}, Lo/atu;->c()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public e(IZ)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lo/atc;->c:Lo/atu;

    invoke-virtual {v0, p1, p2}, Lo/atu;->d(IZ)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public e(J)Z
    .locals 4

    .line 247
    const/4 v2, 0x0

    .line 248
    invoke-virtual {p0, p1, p2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 249
    if-eqz v3, :cond_1

    .line 252
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bqz;->e(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    const-string v0, "GroupManager"

    const-string v1, "updateOldImageUrl is same string."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    const/4 v0, 0x1

    return v0

    .line 257
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/Group;->setOldGroupImageUrl(Ljava/lang/String;)V

    .line 258
    invoke-virtual {p0, v3}, Lo/atc;->c(Lcom/huawei/health/sns/model/group/Group;)Z

    move-result v2

    .line 260
    :cond_1
    return v2
.end method

.method public e(JZ)Z
    .locals 5

    .line 183
    const/4 v3, 0x0

    .line 184
    invoke-virtual {p0, p1, p2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v4

    .line 186
    new-instance v0, Lo/atk;

    invoke-direct {v0}, Lo/atk;-><init>()V

    invoke-virtual {v0, p1, p2}, Lo/atk;->a(J)V

    .line 187
    if-eqz v4, :cond_2

    .line 189
    if-eqz p3, :cond_0

    .line 192
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/ast;->b(J)Z

    .line 193
    iget-object v0, p0, Lo/atc;->c:Lo/atu;

    invoke-virtual {v0, p1, p2}, Lo/atu;->a(J)Z

    move-result v3

    goto :goto_0

    .line 197
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/group/Group;->setState(I)V

    .line 198
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 199
    iget-object v0, p0, Lo/atc;->c:Lo/atu;

    invoke-virtual {v0, v4}, Lo/atu;->a(Lcom/huawei/health/sns/model/group/Group;)Z

    move-result v3

    .line 203
    :goto_0
    if-eqz v3, :cond_1

    .line 205
    if-eqz p3, :cond_1

    .line 207
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/ath;->c(J)Z

    .line 214
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    if-eqz p3, :cond_3

    .line 216
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v0

    .line 217
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v1

    .line 216
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/bbk;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 218
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v0

    .line 219
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v1

    .line 218
    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/bbk;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_1

    .line 224
    :cond_2
    const-string v0, "GroupManager"

    const-string v1, "deleteGroupById group is not exist.groupId"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    const/4 v3, 0x1

    .line 228
    :cond_3
    :goto_1
    if-eqz p3, :cond_4

    .line 231
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/aqx;->d(Ljava/lang/String;)V

    .line 232
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/apm;->e(J)Z

    .line 233
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/auu;->b(J)V

    .line 236
    :cond_4
    return v3
.end method

.method public declared-synchronized e(Lcom/huawei/health/sns/model/group/Group;)Z
    .locals 5

    monitor-enter p0

    .line 432
    if-nez p1, :cond_0

    .line 434
    const-string v0, "GroupManager"

    const-string v1, "updateOrInsertGroup group=null."

    :try_start_0
    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 437
    :cond_0
    const/4 v3, 0x0

    .line 438
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v4

    .line 440
    if-eqz v4, :cond_1

    .line 442
    iget-object v0, p0, Lo/atc;->c:Lo/atu;

    invoke-virtual {v0, p1}, Lo/atu;->a(Lcom/huawei/health/sns/model/group/Group;)Z

    move-result v3

    .line 444
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 446
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/atc;->c(Ljava/lang/String;J)V

    goto :goto_0

    .line 451
    :cond_1
    iget-object v0, p0, Lo/atc;->c:Lo/atu;

    invoke-virtual {v0, p1}, Lo/atu;->d(Lcom/huawei/health/sns/model/group/Group;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v3

    .line 453
    .line 459
    :cond_2
    :goto_0
    monitor-exit p0

    return v3

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
