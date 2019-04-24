.class public final Lo/axi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lo/axi;


# instance fields
.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private e:Lo/axt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    new-instance v0, Lo/axi;

    invoke-direct {v0}, Lo/axi;-><init>()V

    sput-object v0, Lo/axi;->b:Lo/axi;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lo/axi;->e:Lo/axt;

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/axi;->d:Ljava/util/List;

    .line 64
    new-instance v0, Lo/axt;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/axt;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/axi;->e:Lo/axt;

    .line 65
    const-string v0, "onClickNotificationCachedFrdUid"

    iget-object v1, p0, Lo/axi;->d:Ljava/util/List;

    invoke-static {v0, v1}, Lo/axj;->b(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/axi;->d:Ljava/util/List;

    .line 67
    return-void
.end method

.method private static c(Landroid/os/Handler;)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;)Lo/brc<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 277
    new-instance v0, Lo/axi$3;

    invoke-direct {v0, p0}, Lo/axi$3;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method

.method public static d()Lo/axi;
    .locals 1

    .line 76
    sget-object v0, Lo/axi;->b:Lo/axi;

    return-object v0
.end method

.method public static e(Landroid/os/Handler;)V
    .locals 3

    .line 266
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {}, Lo/axj;->c()Lo/brd;

    move-result-object v1

    invoke-static {p0}, Lo/axi;->c(Landroid/os/Handler;)Lo/brc;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 267
    return-void
.end method


# virtual methods
.method public a(J)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;"
        }
    .end annotation

    .line 143
    iget-object v0, p0, Lo/axi;->e:Lo/axt;

    invoke-virtual {v0, p1, p2}, Lo/axt;->e(J)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public a()Z
    .locals 6

    .line 122
    const/4 v2, 0x1

    .line 123
    invoke-virtual {p0}, Lo/axi;->e()Ljava/util/List;

    move-result-object v3

    .line 124
    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 126
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 128
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    .line 129
    goto :goto_0

    .line 130
    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v3, v1}, Lo/axi;->e(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z

    move-result v2

    .line 132
    :cond_1
    return v2
.end method

.method public declared-synchronized b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Long;>;"
        }
    .end annotation

    monitor-enter p0

    .line 322
    :try_start_0
    iget-object v0, p0, Lo/axi;->d:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public c(J)Lcom/huawei/health/sns/model/user/UserNotify;
    .locals 1

    .line 102
    iget-object v0, p0, Lo/axi;->e:Lo/axt;

    invoke-virtual {v0, p1, p2}, Lo/axt;->d(J)Lcom/huawei/health/sns/model/user/UserNotify;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized c(Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation

    monitor-enter p0

    .line 87
    :try_start_0
    iget-object v0, p0, Lo/axi;->e:Lo/axt;

    invoke-virtual {v0, p1}, Lo/axt;->c(Z)Ljava/util/List;

    move-result-object v1

    .line 90
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c()V
    .locals 3

    monitor-enter p0

    .line 310
    :try_start_0
    iget-object v0, p0, Lo/axi;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 311
    const-string v0, "onClickNotificationCachedFrdUid"

    iget-object v1, p0, Lo/axi;->d:Ljava/util/List;

    invoke-static {v0, v1}, Lo/axj;->e(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 313
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public d(Lcom/huawei/health/sns/model/user/UserNotify;)Z
    .locals 4

    .line 191
    const/4 v2, 0x0

    .line 192
    if-eqz p1, :cond_0

    .line 194
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/axi;->a(J)Ljava/util/ArrayList;

    move-result-object v3

    .line 195
    iget-object v0, p0, Lo/axi;->e:Lo/axt;

    invoke-virtual {v0, p1, v3}, Lo/axt;->d(Lcom/huawei/health/sns/model/user/UserNotify;Ljava/util/List;)Z

    move-result v2

    .line 197
    :cond_0
    return v2
.end method

.method public d(Ljava/lang/String;JLjava/lang/String;)Z
    .locals 3

    .line 154
    const/4 v1, 0x0

    .line 155
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 157
    new-instance v2, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/UserNotifyNote;-><init>()V

    .line 158
    invoke-virtual {v2, p2, p3}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setUserId(J)V

    .line 159
    invoke-virtual {v2, p1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setNote(Ljava/lang/String;)V

    .line 160
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setSender(I)V

    .line 161
    invoke-static {p4}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setSendTime(Ljava/lang/String;)V

    .line 162
    iget-object v0, p0, Lo/axi;->e:Lo/axt;

    invoke-virtual {v0, v2}, Lo/axt;->a(Lcom/huawei/health/sns/model/user/UserNotifyNote;)Z

    move-result v1

    .line 164
    :cond_0
    return v1
.end method

.method public declared-synchronized e(Z)I
    .locals 12

    monitor-enter p0

    .line 333
    const/4 v4, 0x0

    .line 334
    :try_start_0
    invoke-virtual {p0}, Lo/axi;->e()Ljava/util/List;

    move-result-object v5

    .line 335
    if-eqz v5, :cond_0

    .line 337
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v4, v0, 0x0

    .line 339
    :cond_0
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {v0}, Lo/ave;->i()Ljava/util/List;

    move-result-object v6

    .line 341
    if-eqz p1, :cond_4

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 343
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 344
    if-eqz v5, :cond_3

    .line 346
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 348
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/avh;

    .line 351
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v11}, Lo/avh;->c()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 353
    invoke-interface {v7, v11}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 354
    goto :goto_2

    .line 356
    :cond_1
    goto :goto_1

    .line 357
    :cond_2
    :goto_2
    goto :goto_0

    .line 360
    :cond_3
    invoke-static {v7}, Lo/avj;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    .line 363
    invoke-interface {v7}, Ljava/util/List;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    add-int/2addr v4, v0

    .line 365
    :cond_4
    monitor-exit p0

    return v4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation

    .line 112
    iget-object v0, p0, Lo/axi;->e:Lo/axt;

    invoke-virtual {v0}, Lo/axt;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(Lcom/huawei/health/sns/model/user/UserNotify;)Z
    .locals 2

    .line 175
    const/4 v1, 0x0

    .line 176
    if-eqz p1, :cond_0

    .line 178
    iget-object v0, p0, Lo/axi;->e:Lo/axt;

    invoke-virtual {v0, p1}, Lo/axt;->e(Lcom/huawei/health/sns/model/user/UserNotify;)Z

    move-result v1

    .line 180
    :cond_0
    return v1
.end method

.method public declared-synchronized e(Ljava/util/List;)Z
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 228
    :try_start_0
    iget-object v0, p0, Lo/axi;->e:Lo/axt;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/axt;->c(Z)Ljava/util/List;

    move-result-object v4

    .line 230
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 232
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 233
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 235
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->i:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_0

    .line 237
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 239
    :cond_0
    goto :goto_0

    .line 240
    :cond_1
    const/4 v7, 0x0

    .line 241
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 243
    const/4 v7, 0x0

    .line 244
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;

    .line 246
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v11}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getFrdUID_()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 248
    const/4 v7, 0x1

    .line 249
    goto :goto_3

    .line 251
    :cond_2
    goto :goto_2

    .line 252
    :cond_3
    :goto_3
    if-eqz v7, :cond_4

    .line 254
    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setType(Lcom/huawei/health/sns/model/user/UserNotify$b;)V

    .line 255
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    :cond_4
    goto :goto_1

    .line 258
    :cond_5
    iget-object v0, p0, Lo/axi;->e:Lo/axt;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v2}, Lo/axt;->d(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z
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

.method public declared-synchronized e(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 211
    :try_start_0
    iget-object v0, p0, Lo/axi;->e:Lo/axt;

    invoke-virtual {v0, p1, p2, p3}, Lo/axt;->d(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    .line 214
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
