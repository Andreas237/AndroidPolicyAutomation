.class public Lo/auc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Landroid/content/Context;

.field private d:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/auc;->c:Landroid/content/Context;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    .line 48
    iput-object p1, p0, Lo/auc;->c:Landroid/content/Context;

    .line 49
    iget-object v0, p0, Lo/auc;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    .line 50
    return-void
.end method

.method private c(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 200
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 201
    new-instance v7, Lo/atz;

    invoke-direct {v7}, Lo/atz;-><init>()V

    .line 202
    const/4 v8, 0x0

    .line 206
    :try_start_0
    iget-object v0, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    move-object v3, p1

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 208
    if-nez v8, :cond_1

    .line 210
    move-object v9, v6

    .line 229
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 231
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 232
    const/4 v8, 0x0

    .line 210
    :cond_0
    return-object v9

    .line 212
    :cond_1
    :try_start_1
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 214
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 217
    :cond_2
    invoke-virtual {v7, v8}, Lo/atz;->a(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v9

    .line 218
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_2

    .line 229
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 231
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 232
    const/4 v8, 0x0

    goto :goto_0

    .line 223
    :catch_0
    move-exception v9

    .line 225
    const-string v0, "GroupMemberDBHelper"

    const-string v1, "getMemberList SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 229
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 231
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 232
    const/4 v8, 0x0

    goto :goto_0

    .line 229
    :catchall_0
    move-exception v10

    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 231
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 232
    const/4 v8, 0x0

    .line 234
    :cond_4
    throw v10

    .line 235
    :cond_5
    :goto_0
    return-object v6
.end method

.method private c(Lcom/huawei/health/sns/model/group/GroupMember;)Z
    .locals 5

    .line 457
    const/4 v2, 0x0

    .line 459
    new-instance v0, Lo/atz;

    invoke-direct {v0}, Lo/atz;-><init>()V

    invoke-virtual {v0, p1}, Lo/atz;->a(Lcom/huawei/health/sns/model/group/GroupMember;)Landroid/content/ContentValues;

    move-result-object v3

    .line 462
    :try_start_0
    iget-object v0, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v4

    .line 463
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 465
    const/4 v2, 0x1

    .line 466
    iget-object v0, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    invoke-static {v4, v0}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 472
    :cond_0
    goto :goto_0

    .line 469
    :catch_0
    move-exception v4

    .line 471
    const-string v0, "GroupMemberDBHelper"

    const-string v1, "updateGroupMember SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 473
    :goto_0
    return v2
.end method

.method private e(Lcom/huawei/health/sns/model/group/GroupMember;)Z
    .locals 7

    .line 484
    const/4 v2, 0x0

    .line 486
    new-instance v0, Lo/atz;

    invoke-direct {v0}, Lo/atz;-><init>()V

    invoke-virtual {v0, p1}, Lo/atz;->a(Lcom/huawei/health/sns/model/group/GroupMember;)Landroid/content/ContentValues;

    move-result-object v3

    .line 489
    const-string v4, "group_id =? and user_id =? "

    .line 491
    const/4 v0, 0x2

    :try_start_0
    new-array v5, v0, [Ljava/lang/String;

    .line 492
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 494
    iget-object v0, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    .line 495
    if-lez v6, :cond_0

    .line 497
    const/4 v2, 0x1

    .line 498
    sget-object v0, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v1, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 504
    :cond_0
    goto :goto_0

    .line 501
    :catch_0
    move-exception v4

    .line 503
    const-string v0, "GroupMemberDBHelper"

    const-string v1, "updateGroupMember SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    :goto_0
    return v2
.end method


# virtual methods
.method public a(JJ)Z
    .locals 6

    .line 517
    const/4 v2, 0x0

    .line 519
    const-string v3, "group_id =? and user_id =? "

    .line 521
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    .line 522
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 526
    :try_start_0
    iget-object v0, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 527
    if-lez v5, :cond_0

    .line 529
    const/4 v2, 0x1

    .line 530
    sget-object v0, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v1, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 536
    :cond_0
    goto :goto_0

    .line 533
    :catch_0
    move-exception v5

    .line 535
    const-string v0, "GroupMemberDBHelper"

    const-string v1, "deleteGroupMemberByUserId SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 537
    :goto_0
    return v2
.end method

.method public b(J)Z
    .locals 6

    .line 548
    const/4 v2, 0x0

    .line 550
    const-string v3, "group_id =? "

    .line 552
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    .line 553
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 557
    :try_start_0
    iget-object v0, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 558
    if-lez v5, :cond_0

    .line 560
    const/4 v2, 0x1

    .line 561
    sget-object v0, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v1, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 567
    :cond_0
    goto :goto_0

    .line 564
    :catch_0
    move-exception v5

    .line 566
    const-string v0, "GroupMemberDBHelper"

    const-string v1, "deleteGroupMemberByGroupId SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 568
    :goto_0
    return v2
.end method

.method public declared-synchronized b(Lcom/huawei/health/sns/model/group/GroupMember;)Z
    .locals 5

    monitor-enter p0

    .line 413
    if-nez p1, :cond_0

    .line 415
    const-string v0, "GroupMemberDBHelper"

    const-string v1, "updateGroupMember groupMember=null."

    :try_start_0
    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 419
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 421
    :cond_1
    const-string v0, "GroupMemberDBHelper"

    const-string v1, "updateGroupMember gId or uId invalidate."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 425
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/auc;->d(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v4

    .line 428
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 430
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    .line 432
    const-string v0, "GroupMemberDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "delete state_deleted groupMember, id is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/auc;->a(JJ)Z

    move-result v0

    monitor-exit p0

    return v0

    .line 436
    :cond_3
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 438
    :cond_4
    if-nez v4, :cond_5

    .line 440
    invoke-direct {p0, p1}, Lo/auc;->c(Lcom/huawei/health/sns/model/group/GroupMember;)Z

    move-result v0

    monitor-exit p0

    return v0

    .line 444
    :cond_5
    invoke-direct {p0, p1}, Lo/auc;->e(Lcom/huawei/health/sns/model/group/GroupMember;)Z
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

.method public c(J)I
    .locals 12

    .line 246
    const/4 v6, 0x0

    .line 247
    const/4 v7, 0x0

    .line 250
    const-string v8, "group_id =? and state =? "

    .line 252
    const/4 v0, 0x2

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    .line 253
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 255
    iget-object v0, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "count(*)"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 258
    if-nez v7, :cond_1

    .line 260
    const/4 v10, 0x0

    .line 276
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 278
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 279
    const/4 v7, 0x0

    .line 260
    :cond_0
    return v10

    .line 263
    :cond_1
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 265
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 266
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    move v6, v0

    .line 276
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 278
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 279
    const/4 v7, 0x0

    goto :goto_0

    .line 270
    :catch_0
    move-exception v8

    .line 272
    const-string v0, "GroupMemberDBHelper"

    const-string v1, "getGroupMemberCount SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 276
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 278
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 279
    const/4 v7, 0x0

    goto :goto_0

    .line 276
    :catchall_0
    move-exception v11

    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 278
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 279
    const/4 v7, 0x0

    .line 281
    :cond_3
    throw v11

    .line 283
    :cond_4
    :goto_0
    return v6
.end method

.method public c()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 178
    const-string v1, "user_group_nickname is not null"

    .line 179
    invoke-direct {p0, v1}, Lo/auc;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public c(JJLjava/lang/String;)Z
    .locals 3

    .line 382
    invoke-virtual {p0, p1, p2, p3, p4}, Lo/auc;->d(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v2

    .line 383
    if-nez v2, :cond_0

    .line 385
    const-string v0, "GroupMemberDBHelper"

    const-string v1, "modifyGroupNickname oldMember is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    const/4 v0, 0x0

    return v0

    .line 388
    :cond_0
    invoke-virtual {v2, p5}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserGroupNickname(Ljava/lang/String;)V

    .line 389
    invoke-direct {p0, v2}, Lo/auc;->e(Lcom/huawei/health/sns/model/group/GroupMember;)Z

    move-result v0

    return v0
.end method

.method public d(JJ)Lcom/huawei/health/sns/model/group/GroupMember;
    .locals 13

    .line 295
    new-instance v6, Lo/atz;

    invoke-direct {v6}, Lo/atz;-><init>()V

    .line 296
    const/4 v7, 0x0

    .line 297
    const/4 v8, 0x0

    .line 300
    const-string v9, "t_group_member.group_id =? and t_group_member.user_id =? "

    .line 303
    const/4 v0, 0x2

    :try_start_0
    new-array v10, v0, [Ljava/lang/String;

    .line 304
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    invoke-static/range {p3 .. p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v10, v1

    .line 306
    iget-object v0, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$g;->c:Landroid/net/Uri;

    .line 307
    invoke-virtual {v6}, Lo/atz;->e()[Ljava/lang/String;

    move-result-object v2

    move-object v3, v9

    move-object v4, v10

    .line 306
    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 309
    if-nez v8, :cond_1

    .line 311
    const/4 v11, 0x0

    .line 328
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 330
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 331
    const/4 v8, 0x0

    .line 311
    :cond_0
    return-object v11

    .line 314
    :cond_1
    :try_start_1
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 316
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 318
    invoke-virtual {v6, v8}, Lo/atz;->e(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupMember;
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 328
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 330
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 331
    const/4 v8, 0x0

    goto :goto_0

    .line 322
    :catch_0
    move-exception v9

    .line 324
    const-string v0, "GroupMemberDBHelper"

    const-string v1, "getGroupMember SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 328
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 330
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 331
    const/4 v8, 0x0

    goto :goto_0

    .line 328
    :catchall_0
    move-exception v12

    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    .line 330
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 331
    const/4 v8, 0x0

    .line 333
    :cond_3
    throw v12

    .line 334
    :cond_4
    :goto_0
    const-string v0, "GroupMemberDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getGroupMember SQLException.groupMember\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    if-ne v2, v7, :cond_5

    const-string v2, "null"

    goto :goto_1

    :cond_5
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    return-object v7
.end method

.method public d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 189
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/auc;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public d(J)Ljava/util/ArrayList;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 60
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 61
    new-instance v7, Lo/atz;

    invoke-direct {v7}, Lo/atz;-><init>()V

    .line 62
    const/4 v8, 0x0

    .line 65
    const-string v9, "t_group_member.group_id=?"

    .line 67
    const/4 v0, 0x1

    :try_start_0
    new-array v10, v0, [Ljava/lang/String;

    .line 68
    invoke-static/range {p1 .. p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 70
    const-string v11, "pinyin_alias ASC, t_group_member.join_time ASC"

    .line 73
    iget-object v0, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$g;->c:Landroid/net/Uri;

    .line 74
    invoke-virtual {v7}, Lo/atz;->a()[Ljava/lang/String;

    move-result-object v2

    move-object v3, v9

    move-object v4, v10

    move-object v5, v11

    .line 73
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 76
    if-nez v8, :cond_1

    .line 78
    move-object v12, v6

    .line 97
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 99
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 100
    const/4 v8, 0x0

    .line 78
    :cond_0
    return-object v12

    .line 80
    :cond_1
    :try_start_1
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 82
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 85
    :cond_2
    invoke-virtual {v7, v8}, Lo/atz;->d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v12

    .line 86
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_2

    .line 97
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 99
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 100
    const/4 v8, 0x0

    goto :goto_0

    .line 91
    :catch_0
    move-exception v9

    .line 93
    const-string v0, "GroupMemberDBHelper"

    const-string v1, "getGroupMemberList SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 99
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 100
    const/4 v8, 0x0

    goto :goto_0

    .line 97
    :catchall_0
    move-exception v13

    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 99
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 100
    const/4 v8, 0x0

    .line 102
    :cond_4
    throw v13

    .line 103
    :cond_5
    :goto_0
    return-object v6
.end method

.method public d(JJI)Z
    .locals 7

    .line 348
    const/4 v2, 0x0

    .line 349
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 350
    const-string v0, "state"

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 353
    const-string v4, "group_id =? and user_id =? "

    .line 355
    const/4 v0, 0x2

    :try_start_0
    new-array v5, v0, [Ljava/lang/String;

    .line 356
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 358
    iget-object v0, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    .line 359
    if-lez v6, :cond_0

    .line 361
    const/4 v2, 0x1

    .line 362
    sget-object v0, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v1, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 368
    :cond_0
    goto :goto_0

    .line 365
    :catch_0
    move-exception v4

    .line 367
    const-string v0, "GroupMemberDBHelper"

    const-string v1, "modifyGroupMemberState SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    :goto_0
    return v2
.end method

.method public e(JZ)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 115
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 116
    new-instance v7, Lo/atz;

    invoke-direct {v7}, Lo/atz;-><init>()V

    .line 117
    const/4 v8, 0x0

    .line 121
    const/4 v10, 0x0

    .line 122
    if-eqz p3, :cond_0

    .line 124
    const-string v9, "t_group_member.group_id=?"

    .line 125
    const/4 v0, 0x1

    :try_start_0
    new-array v10, v0, [Ljava/lang/String;

    .line 126
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    goto :goto_0

    .line 130
    :cond_0
    const-string v9, "t_group_member.group_id=? and t_group_member.state=?"

    .line 132
    const/4 v0, 0x2

    new-array v10, v0, [Ljava/lang/String;

    .line 133
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v10, v1

    .line 136
    :goto_0
    iget-object v0, p0, Lo/auc;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$g;->c:Landroid/net/Uri;

    .line 137
    invoke-virtual {v7}, Lo/atz;->e()[Ljava/lang/String;

    move-result-object v2

    move-object v3, v9

    move-object v4, v10

    const-string v5, "t_group_member.join_time ASC, t_user.sort_pinyin ASC"

    .line 136
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 141
    if-nez v8, :cond_2

    .line 143
    move-object v11, v6

    .line 162
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 164
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 165
    const/4 v8, 0x0

    .line 143
    :cond_1
    return-object v11

    .line 145
    :cond_2
    :try_start_1
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_4

    .line 147
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 150
    :cond_3
    invoke-virtual {v7, v8}, Lo/atz;->e(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v11

    .line 151
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_3

    .line 162
    :cond_4
    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    .line 164
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 165
    const/4 v8, 0x0

    goto :goto_1

    .line 156
    :catch_0
    move-exception v9

    .line 158
    const-string v0, "GroupMemberDBHelper"

    const-string v1, "getGroupMemberList SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 162
    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    .line 164
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 165
    const/4 v8, 0x0

    goto :goto_1

    .line 162
    :catchall_0
    move-exception v12

    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 164
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 165
    const/4 v8, 0x0

    .line 167
    :cond_5
    throw v12

    .line 168
    :cond_6
    :goto_1
    return-object v6
.end method

.method public declared-synchronized e(JLjava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 401
    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Lo/auc;->e(JZ)Ljava/util/ArrayList;

    move-result-object v2

    .line 402
    new-instance v0, Lo/atx;

    iget-object v1, p0, Lo/auc;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/atx;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p3, v2}, Lo/atx;->e(Ljava/util/List;Ljava/util/List;)Z
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
