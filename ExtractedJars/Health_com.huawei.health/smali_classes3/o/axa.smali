.class public final Lo/axa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/axa;


# instance fields
.field private a:Lo/axo;

.field private c:Lo/axn;

.field private d:Lo/axk;

.field private e:Lo/axg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    new-instance v0, Lo/axa;

    invoke-direct {v0}, Lo/axa;-><init>()V

    sput-object v0, Lo/axa;->b:Lo/axa;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/axa;->a:Lo/axo;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lo/axa;->d:Lo/axk;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/axa;->e:Lo/axg;

    .line 77
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 78
    new-instance v0, Lo/axn;

    invoke-direct {v0, v1}, Lo/axn;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/axa;->c:Lo/axn;

    .line 79
    new-instance v0, Lo/axo;

    invoke-direct {v0, v1}, Lo/axo;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/axa;->a:Lo/axo;

    .line 80
    new-instance v0, Lo/axk;

    invoke-direct {v0, v1}, Lo/axk;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/axa;->d:Lo/axk;

    .line 81
    new-instance v0, Lo/axg;

    invoke-direct {v0, v1}, Lo/axg;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/axa;->e:Lo/axg;

    .line 82
    return-void
.end method

.method public static a()Lo/axa;
    .locals 1

    .line 91
    sget-object v0, Lo/axa;->b:Lo/axa;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(J)Lcom/huawei/health/sns/model/user/User;
    .locals 1

    monitor-enter p0

    .line 437
    :try_start_0
    iget-object v0, p0, Lo/axa;->c:Lo/axn;

    invoke-virtual {v0, p1, p2}, Lo/axn;->c(J)Lcom/huawei/health/sns/model/user/User;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(JLjava/lang/String;)Z
    .locals 1

    .line 363
    invoke-static {p1, p2, p3}, Lo/axe;->c(JLjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public declared-synchronized a(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 1

    monitor-enter p0

    .line 426
    :try_start_0
    iget-object v0, p0, Lo/axa;->c:Lo/axn;

    invoke-virtual {v0, p1}, Lo/axn;->g(Lcom/huawei/health/sns/model/user/User;)Z
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

.method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 482
    invoke-static {p1, p2}, Lo/axe;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 141
    iget-object v0, p0, Lo/axa;->a:Lo/axo;

    invoke-virtual {v0}, Lo/axo;->a()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public b(JI)V
    .locals 0

    .line 343
    invoke-static {p1, p2, p3}, Lo/axe;->c(JI)V

    .line 344
    return-void
.end method

.method public declared-synchronized b(J)Z
    .locals 1

    monitor-enter p0

    .line 296
    :try_start_0
    iget-object v0, p0, Lo/axa;->c:Lo/axn;

    invoke-virtual {v0, p1, p2}, Lo/axn;->a(J)Z
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

.method public declared-synchronized b(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 1

    monitor-enter p0

    .line 404
    :try_start_0
    iget-object v0, p0, Lo/axa;->c:Lo/axn;

    invoke-virtual {v0, p1}, Lo/axn;->d(Lcom/huawei/health/sns/model/user/User;)Z
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

.method public declared-synchronized b(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 245
    :try_start_0
    iget-object v0, p0, Lo/axa;->a:Lo/axo;

    invoke-virtual {v0}, Lo/axo;->e()Ljava/util/List;

    move-result-object v1

    .line 246
    iget-object v0, p0, Lo/axa;->d:Lo/axk;

    invoke-virtual {v0, v1, p1}, Lo/axk;->c(Ljava/util/List;Ljava/util/List;)Z

    move-result v2

    .line 247
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/axi;->e(Ljava/util/List;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 248
    monitor-exit p0

    return v2

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public c()Landroid/support/v4/util/LongSparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 131
    iget-object v0, p0, Lo/axa;->a:Lo/axo;

    invoke-virtual {v0}, Lo/axo;->d()Landroid/support/v4/util/LongSparseArray;

    move-result-object v0

    return-object v0
.end method

.method public c(J)Z
    .locals 1

    .line 494
    invoke-static {p1, p2}, Lo/axe;->d(J)Z

    move-result v0

    return v0
.end method

.method public declared-synchronized c(JI)Z
    .locals 1

    monitor-enter p0

    .line 331
    :try_start_0
    iget-object v0, p0, Lo/axa;->c:Lo/axn;

    invoke-virtual {v0, p1, p2, p3}, Lo/axn;->a(JI)Z
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

.method public c(JLjava/lang/String;)Z
    .locals 1

    .line 308
    invoke-static {p1, p2, p3}, Lo/axe;->d(JLjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public declared-synchronized c(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 1

    monitor-enter p0

    .line 319
    :try_start_0
    iget-object v0, p0, Lo/axa;->c:Lo/axn;

    invoke-virtual {v0, p1}, Lo/axn;->b(Lcom/huawei/health/sns/model/user/User;)Z
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

.method public declared-synchronized c(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 274
    :try_start_0
    iget-object v0, p0, Lo/axa;->d:Lo/axk;

    invoke-virtual {v0, p1}, Lo/axk;->a(Ljava/util/List;)Z
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

.method public declared-synchronized c(Ljava/util/List;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;>;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/HashMap<Ljava/lang/String;Lo/asd;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 263
    :try_start_0
    iget-object v0, p0, Lo/axa;->d:Lo/axk;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/axk;->b(Ljava/util/List;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)Z
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

.method public d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 121
    iget-object v0, p0, Lo/axa;->e:Lo/axg;

    invoke-virtual {v0}, Lo/axg;->e()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public d(J)Z
    .locals 1

    .line 285
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lo/axa;->c(JI)Z

    move-result v0

    return v0
.end method

.method public declared-synchronized d(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 1

    monitor-enter p0

    .line 415
    :try_start_0
    iget-object v0, p0, Lo/axa;->c:Lo/axn;

    invoke-virtual {v0, p1}, Lo/axn;->a(Lcom/huawei/health/sns/model/user/User;)Z
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

.method public e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lo/axa;->a:Lo/axo;

    invoke-virtual {v0}, Lo/axo;->c()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public e(J)V
    .locals 0

    .line 352
    invoke-static {p1, p2}, Lo/axe;->b(J)V

    .line 353
    return-void
.end method

.method public declared-synchronized e(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 7

    monitor-enter p0

    .line 373
    const-string v0, "UserManager"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateUserSnsInfo :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    iget-object v0, p0, Lo/axa;->c:Lo/axn;

    invoke-virtual {v0, p1}, Lo/axn;->c(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v3

    .line 375
    const-string v0, "UserManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateUserSnsInfo isSuccess:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    if-eqz v3, :cond_3

    .line 379
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axi;->c(J)Lcom/huawei/health/sns/model/user/UserNotify;

    move-result-object v4

    .line 380
    if-eqz v4, :cond_2

    .line 381
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/UserNotify;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 382
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/UserNotify;->getNickName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/UserNotify;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 384
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setNickName(Ljava/lang/String;)V

    .line 385
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/axi;->e(Lcom/huawei/health/sns/model/user/UserNotify;)Z

    .line 388
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 389
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/aov;->a(Landroid/content/Context;)Lo/aov;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Lo/aov;->c(J)V

    .line 390
    const-string v0, "UserManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NowTime: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 392
    :cond_3
    monitor-exit p0

    return v3

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized e(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 448
    :try_start_0
    invoke-virtual {p0}, Lo/axa;->c()Landroid/support/v4/util/LongSparseArray;

    move-result-object v1

    .line 449
    iget-object v0, p0, Lo/axa;->d:Lo/axk;

    invoke-virtual {v0, v1, p1}, Lo/axk;->b(Landroid/support/v4/util/LongSparseArray;Ljava/util/List;)Z
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

.method public g()Z
    .locals 7

    .line 152
    iget-object v0, p0, Lo/axa;->a:Lo/axo;

    invoke-virtual {v0}, Lo/axo;->b()Ljava/util/ArrayList;

    move-result-object v3

    .line 154
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 155
    if-nez v4, :cond_0

    .line 157
    const-string v0, "UserManager"

    const-string v1, "batchUpdateUserSortPinYin allUserList size is 0 "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    const/4 v0, 0x1

    return v0

    .line 161
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/user/User;

    .line 163
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 165
    invoke-static {}, Lo/bpm;->b()Lo/bpp;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bpp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/user/User;->setSortPinYin(Ljava/lang/String;)V

    .line 167
    :cond_1
    goto :goto_0

    .line 169
    :cond_2
    iget-object v0, p0, Lo/axa;->d:Lo/axk;

    invoke-virtual {v0, v3}, Lo/axk;->d(Ljava/util/List;)Z

    move-result v5

    .line 171
    const-string v0, "UserManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batchUpdateUserSortPinYin isSuccess:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    return v5
.end method

.method public g(J)Z
    .locals 1

    .line 506
    invoke-static {p1, p2}, Lo/axe;->e(J)Z

    move-result v0

    return v0
.end method

.method public declared-synchronized g(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 1

    monitor-enter p0

    .line 471
    :try_start_0
    iget-object v0, p0, Lo/axa;->c:Lo/axn;

    invoke-virtual {v0, p1}, Lo/axn;->h(Lcom/huawei/health/sns/model/user/User;)Z
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

.method public h()Z
    .locals 7

    .line 184
    iget-object v0, p0, Lo/axa;->a:Lo/axo;

    invoke-virtual {v0}, Lo/axo;->f()Ljava/util/ArrayList;

    move-result-object v3

    .line 186
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 187
    if-nez v4, :cond_0

    .line 189
    const-string v0, "UserManager"

    const-string v1, "batchUpdateContactSortPinYin allUserList size is 0 "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    const/4 v0, 0x1

    return v0

    .line 193
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/user/User;

    .line 195
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 197
    invoke-static {}, Lo/bpm;->b()Lo/bpp;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bpp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/user/User;->setContactSortPinYin(Ljava/lang/String;)V

    .line 199
    :cond_1
    goto :goto_0

    .line 201
    :cond_2
    iget-object v0, p0, Lo/axa;->d:Lo/axk;

    invoke-virtual {v0, v3}, Lo/axk;->d(Ljava/util/List;)Z

    move-result v5

    .line 203
    const-string v0, "UserManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batchUpdateContactSortPinYin isSuccess:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    return v5
.end method

.method public i()Z
    .locals 7

    .line 216
    iget-object v0, p0, Lo/axa;->a:Lo/axo;

    invoke-virtual {v0}, Lo/axo;->e()Ljava/util/List;

    move-result-object v3

    .line 218
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    .line 219
    if-nez v4, :cond_0

    .line 221
    const-string v0, "UserManager"

    const-string v1, "batchUpdateUserSearchPinYin allUserList size is 0 "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    const/4 v0, 0x1

    return v0

    .line 225
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/user/User;

    .line 227
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 228
    goto :goto_0

    .line 230
    :cond_1
    iget-object v0, p0, Lo/axa;->d:Lo/axk;

    invoke-virtual {v0, v3}, Lo/axk;->d(Ljava/util/List;)Z

    move-result v5

    .line 232
    const-string v0, "UserManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batchUpdateUserSearchPinYin isSuccess:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    return v5
.end method

.method public i(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 1

    .line 518
    invoke-static {p1}, Lo/axe;->c(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v0

    return v0
.end method

.method public declared-synchronized k(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 1

    monitor-enter p0

    .line 460
    :try_start_0
    iget-object v0, p0, Lo/axa;->c:Lo/axn;

    invoke-virtual {v0, p1}, Lo/axn;->i(Lcom/huawei/health/sns/model/user/User;)Z
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
