.class public final Lo/ath;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/ath;


# instance fields
.field private b:Lo/atx;

.field private e:Lo/auc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 40
    const/4 v0, 0x0

    sput-object v0, Lo/ath;->d:Lo/ath;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ath;->e:Lo/auc;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ath;->b:Lo/atx;

    .line 54
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 55
    new-instance v0, Lo/auc;

    invoke-direct {v0, v1}, Lo/auc;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ath;->e:Lo/auc;

    .line 56
    new-instance v0, Lo/atx;

    invoke-direct {v0, v1}, Lo/atx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ath;->b:Lo/atx;

    .line 57
    return-void
.end method

.method public static declared-synchronized a()Lo/ath;
    .locals 3

    const-class v1, Lo/ath;

    monitor-enter v1

    .line 66
    :try_start_0
    sget-object v0, Lo/ath;->d:Lo/ath;

    if-nez v0, :cond_0

    .line 68
    new-instance v0, Lo/ath;

    invoke-direct {v0}, Lo/ath;-><init>()V

    sput-object v0, Lo/ath;->d:Lo/ath;

    .line 70
    :cond_0
    sget-object v0, Lo/ath;->d:Lo/ath;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private b(Lcom/huawei/health/sns/model/group/GroupMember;Landroid/support/v4/util/LongSparseArray;)Lcom/huawei/health/sns/model/user/User;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/group/GroupMember;Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/User;>;)Lcom/huawei/health/sns/model/user/User;"
        }
    .end annotation

    .line 373
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 374
    if-nez v2, :cond_0

    .line 376
    new-instance v2, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 377
    invoke-direct {p0, p1, v2}, Lo/ath;->e(Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/model/user/User;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    goto :goto_0

    .line 381
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 383
    invoke-direct {p0, p1, v2}, Lo/ath;->e(Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/model/user/User;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    .line 386
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 387
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getSiteId()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSiteId(I)V

    .line 388
    return-object v2
.end method

.method private c(Lcom/huawei/health/sns/model/group/GroupMember;)Lcom/huawei/health/sns/model/user/User;
    .locals 3

    .line 415
    new-instance v2, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 416
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 417
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 418
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 419
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 420
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getSiteId()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSiteId(I)V

    .line 421
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setRemarkName(Ljava/lang/String;)V

    .line 422
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 423
    return-object v2
.end method

.method private static d(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Lcom/huawei/health/sns/model/group/Group;)V"
        }
    .end annotation

    .line 128
    const/4 v4, 0x0

    .line 129
    const/4 v5, 0x0

    .line 131
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v6

    .line 132
    const/4 v8, 0x0

    .line 133
    const/4 v9, 0x0

    .line 135
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v10

    .line 136
    const/4 v11, 0x0

    .line 137
    const/4 v12, 0x0

    :goto_0
    if-ge v12, v10, :cond_2

    .line 139
    invoke-virtual {p0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 141
    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 143
    move v9, v12

    .line 144
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setManager(Z)V

    .line 145
    move-object v5, v11

    .line 149
    :cond_0
    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-nez v0, :cond_1

    .line 151
    move v8, v12

    .line 152
    move-object v4, v11

    .line 137
    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 157
    :cond_2
    const/4 v0, 0x1

    if-gt v10, v0, :cond_3

    .line 159
    return-void

    .line 163
    :cond_3
    if-eqz v5, :cond_4

    .line 166
    if-eqz v9, :cond_4

    .line 168
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 169
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 174
    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->isManager()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 177
    const/4 v0, 0x1

    if-eq v8, v0, :cond_5

    .line 179
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 180
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 183
    :cond_5
    return-void
.end method

.method private d(JLjava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;)Z"
        }
    .end annotation

    .line 348
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    invoke-virtual {v0, p1, p2, p3}, Lo/auc;->e(JLjava/util/List;)Z

    move-result v0

    return v0
.end method

.method private e(Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/model/user/User;)Lcom/huawei/health/sns/model/user/User;
    .locals 1

    .line 399
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 400
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 401
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 402
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/user/User;->setRemarkName(Ljava/lang/String;)V

    .line 403
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 404
    return-object p2
.end method


# virtual methods
.method public a(JJ)Lcom/huawei/health/sns/model/group/GroupMember;
    .locals 1

    .line 447
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/auc;->d(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v0

    return-object v0
.end method

.method public a(J)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lo/auc;->e(JZ)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public a(JJI)Z
    .locals 6

    .line 195
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/auc;->d(JJI)Z

    move-result v0

    return v0
.end method

.method public a(JLjava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;)Z"
        }
    .end annotation

    .line 259
    const-string v0, "GroupMemberManager"

    const-string v1, "Enter updateGroupMemberList"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    const/4 v3, 0x0

    .line 261
    if-eqz p3, :cond_2

    .line 263
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 264
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0}, Lo/axa;->c()Landroid/support/v4/util/LongSparseArray;

    move-result-object v5

    .line 265
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 267
    invoke-direct {p0, v7, v5}, Lo/ath;->b(Lcom/huawei/health/sns/model/group/GroupMember;Landroid/support/v4/util/LongSparseArray;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    goto :goto_0

    .line 270
    :cond_0
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/axa;->e(Ljava/util/List;)Z

    move-result v3

    .line 271
    if-nez v3, :cond_1

    .line 273
    const-string v0, "GroupMemberManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateMemberListToUser false. userList.size is"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lo/ath;->d(JLjava/util/List;)Z

    move-result v3

    .line 278
    :cond_2
    return v3
.end method

.method public b(J)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Lo/auc;->e(JZ)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public b(JZ)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 508
    const-wide/16 v2, -0x2

    .line 510
    if-eqz p3, :cond_0

    .line 512
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v2

    .line 515
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 516
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Lo/auc;->e(JZ)Ljava/util/ArrayList;

    move-result-object v5

    .line 517
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 519
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    if-nez v0, :cond_2

    .line 521
    if-eqz p3, :cond_1

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 523
    goto :goto_0

    .line 525
    :cond_1
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 527
    :cond_2
    goto :goto_0

    .line 528
    :cond_3
    return-object v4
.end method

.method public c(J)Z
    .locals 1

    .line 486
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    invoke-virtual {v0, p1, p2}, Lo/auc;->b(J)Z

    move-result v0

    return v0
.end method

.method public c(JJLjava/lang/String;)Z
    .locals 6

    .line 208
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/auc;->c(JJLjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public d(J)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 116
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    invoke-virtual {v0, p1, p2}, Lo/auc;->d(J)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 81
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/ath;->b(J)Ljava/util/ArrayList;

    move-result-object v2

    .line 82
    invoke-static {v2, p1}, Lo/ath;->d(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;)V

    .line 83
    return-object v2
.end method

.method public d()Z
    .locals 6

    .line 289
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    invoke-virtual {v0}, Lo/auc;->c()Ljava/util/ArrayList;

    move-result-object v3

    .line 291
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 292
    if-nez v4, :cond_0

    .line 294
    const-string v0, "GroupMemberManager"

    const-string v1, "batchUpdateMemberGrpNameSortPinYin allGroupMemberList size is 0 "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    const/4 v0, 0x1

    return v0

    .line 299
    :cond_0
    iget-object v0, p0, Lo/ath;->b:Lo/atx;

    invoke-virtual {v0, v3}, Lo/atx;->b(Ljava/util/List;)I

    move-result v5

    .line 301
    const-string v0, "GroupMemberManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batchUpdateMemberGrpNameSortPinYin updateCount:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " allGroupMemberList size is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    if-ne v5, v4, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(JJ)Z
    .locals 1

    .line 435
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/auc;->a(JJ)Z

    move-result v0

    return v0
.end method

.method public d(JLjava/util/List;Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;)Z"
        }
    .end annotation

    .line 226
    if-eqz p3, :cond_3

    .line 228
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 229
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 231
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    goto :goto_0

    .line 234
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 235
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 237
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    if-nez v0, :cond_1

    .line 238
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 240
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 242
    :cond_1
    goto :goto_1

    .line 243
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 245
    iget-object v0, p0, Lo/ath;->b:Lo/atx;

    invoke-virtual {v0, v3}, Lo/atx;->d(Ljava/util/List;)I

    .line 248
    :cond_3
    invoke-virtual {p0, p1, p2, p4}, Lo/ath;->a(JLjava/util/List;)Z

    move-result v0

    return v0
.end method

.method public d(Lcom/huawei/health/sns/model/group/GroupMember;)Z
    .locals 2

    .line 360
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-direct {p0, p1}, Lo/ath;->c(Lcom/huawei/health/sns/model/group/GroupMember;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/axa;->k(Lcom/huawei/health/sns/model/user/User;)Z

    .line 362
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    invoke-virtual {v0, p1}, Lo/auc;->b(Lcom/huawei/health/sns/model/group/GroupMember;)Z

    move-result v0

    return v0
.end method

.method public e(J)I
    .locals 1

    .line 475
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    invoke-virtual {v0, p1, p2}, Lo/auc;->c(J)I

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 7

    .line 315
    iget-object v0, p0, Lo/ath;->e:Lo/auc;

    invoke-virtual {v0}, Lo/auc;->d()Ljava/util/ArrayList;

    move-result-object v3

    .line 317
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 318
    if-nez v4, :cond_0

    .line 320
    const-string v0, "GroupMemberManager"

    const-string v1, "batchUpdateMemberSearchPinYin allGroupMemberList size is 0 "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    const/4 v0, 0x1

    return v0

    .line 323
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

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 325
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->buildSearchPinyin()V

    .line 326
    goto :goto_0

    .line 328
    :cond_1
    iget-object v0, p0, Lo/ath;->b:Lo/atx;

    invoke-virtual {v0, v3}, Lo/atx;->b(Ljava/util/List;)I

    move-result v5

    .line 330
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 332
    const-string v0, "GroupMemberManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batchUpdateMemberSearchPinYin updateCount:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " allGroupMemberList size is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    :cond_2
    if-ne v5, v4, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public e(JJ)Z
    .locals 2

    .line 459
    invoke-virtual {p0, p1, p2, p3, p4}, Lo/ath;->a(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v1

    .line 460
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    if-nez v0, :cond_0

    .line 462
    const/4 v0, 0x1

    return v0

    .line 464
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f(J)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 497
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lo/ath;->b(JZ)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
