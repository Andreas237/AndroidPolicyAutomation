.class public Lo/aub;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private c:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aub;->a:Landroid/content/Context;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aub;->c:Landroid/content/ContentResolver;

    .line 119
    iput-object p1, p0, Lo/aub;->a:Landroid/content/Context;

    .line 120
    iget-object v0, p0, Lo/aub;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/aub;->c:Landroid/content/ContentResolver;

    .line 121
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/group/GroupNotify;)Landroid/content/ContentValues;
    .locals 4

    .line 371
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 372
    const-string v0, "type"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 373
    const-string v0, "user_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 374
    const-string v0, "group_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 376
    const-string v0, "user_account"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserAccount()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/aub;->b(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    const-string v0, "user_nickname"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserNickname()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/aub;->b(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    const-string v0, "user_image_url"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/aub;->b(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    const-string v0, "old_user_image_url"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/aub;->b(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    const-string v0, "user_image_download_url"

    .line 381
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v1

    .line 380
    invoke-direct {p0, v3, v0, v1}, Lo/aub;->b(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    const-string v0, "group_name"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/aub;->b(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    const-string v0, "group_image_url"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/aub;->b(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    const-string v0, "old_group_image_url"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/aub;->b(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    const-string v0, "group_image_download_url"

    .line 386
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v1

    .line 385
    invoke-direct {p0, v3, v0, v1}, Lo/aub;->b(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    const-string v0, "send_time"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getSendTime()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/aub;->b(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    return-object v3
.end method

.method private a()[Ljava/lang/String;
    .locals 3

    .line 414
    const/16 v0, 0xe

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "t_group_notify.user_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "t_group_notify.type"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "t_group_notify.user_account"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "t_group_notify.user_nickname"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "t_group_notify.user_image_url"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "t_group_notify.old_user_image_url"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "t_group_notify.user_image_download_url"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "t_group_notify.group_id"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "t_group_notify.group_name"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "t_group_notify.group_image_url"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "t_group_notify.old_group_image_url"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "t_group_notify.group_image_download_url"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "t_group_notify.send_time"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "t_user.remark_name"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    return-object v0
.end method

.method private b(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 401
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 403
    invoke-virtual {p1, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    :cond_0
    return-void
.end method

.method private d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupNotify;
    .locals 3

    .line 435
    new-instance v2, Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/group/GroupNotify;-><init>()V

    .line 436
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/GroupNotify;->setUserId(J)V

    .line 437
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setType(I)V

    .line 438
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setUserAccount(Ljava/lang/String;)V

    .line 439
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setUserNickname(Ljava/lang/String;)V

    .line 440
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setUserImageUrl(Ljava/lang/String;)V

    .line 441
    const/4 v0, 0x5

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setOldUserImageUrl(Ljava/lang/String;)V

    .line 442
    const/4 v0, 0x6

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setUserImageDownloadUrl(Ljava/lang/String;)V

    .line 443
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/GroupNotify;->setGroupId(J)V

    .line 444
    const/16 v0, 0x8

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setGroupName(Ljava/lang/String;)V

    .line 445
    const/16 v0, 0x9

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setGroupImageUrl(Ljava/lang/String;)V

    .line 446
    const/16 v0, 0xa

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setOldGroupImageUrl(Ljava/lang/String;)V

    .line 447
    const/16 v0, 0xb

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 448
    const/16 v0, 0xc

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setSendTime(Ljava/lang/String;)V

    .line 449
    const/16 v0, 0xd

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setRemarkName(Ljava/lang/String;)V

    .line 450
    return-object v2
.end method


# virtual methods
.method public a(JJ)Lcom/huawei/health/sns/model/group/GroupNotify;
    .locals 12

    .line 220
    const/4 v6, 0x0

    .line 221
    const/4 v7, 0x0

    .line 224
    const/4 v0, 0x2

    :try_start_0
    new-array v8, v0, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    invoke-static/range {p3 .. p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 226
    const-string v9, "t_group_notify.group_id =?  and t_group_notify.user_id =? "

    .line 229
    iget-object v0, p0, Lo/aub;->c:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$i;->b:Landroid/net/Uri;

    invoke-direct {p0}, Lo/aub;->a()[Ljava/lang/String;

    move-result-object v2

    move-object v3, v9

    move-object v4, v8

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 231
    if-nez v7, :cond_1

    .line 233
    const/4 v10, 0x0

    .line 248
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 250
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 251
    const/4 v7, 0x0

    .line 233
    :cond_0
    return-object v10

    .line 235
    :cond_1
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 237
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 239
    invoke-direct {p0, v7}, Lo/aub;->d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupNotify;
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 248
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 250
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 251
    const/4 v7, 0x0

    goto :goto_0

    .line 242
    :catch_0
    move-exception v8

    .line 244
    const-string v0, "GroupNotifyDBHelper"

    const-string v1, "getGroupNotifyById SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 248
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 250
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 251
    const/4 v7, 0x0

    goto :goto_0

    .line 248
    :catchall_0
    move-exception v11

    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 250
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 251
    const/4 v7, 0x0

    .line 253
    :cond_3
    throw v11

    .line 254
    :cond_4
    :goto_0
    return-object v6
.end method

.method public b(Lcom/huawei/health/sns/model/group/GroupNotify;)Z
    .locals 7

    .line 266
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserId()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 269
    :cond_0
    const-string v0, "GroupNotifyDBHelper"

    const-string v1, "insertGroupNotify groupNotify=null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    const/4 v0, 0x0

    return v0

    .line 272
    :cond_1
    const/4 v4, 0x0

    .line 275
    :try_start_0
    invoke-direct {p0, p1}, Lo/aub;->a(Lcom/huawei/health/sns/model/group/GroupNotify;)Landroid/content/ContentValues;

    move-result-object v5

    .line 277
    iget-object v0, p0, Lo/aub;->c:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$i;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1, v5}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v6

    .line 278
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 280
    const/4 v4, 0x1

    .line 281
    iget-object v0, p0, Lo/aub;->c:Landroid/content/ContentResolver;

    invoke-static {v6, v0}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 287
    :cond_2
    goto :goto_0

    .line 284
    :catch_0
    move-exception v5

    .line 286
    const-string v0, "GroupNotifyDBHelper"

    const-string v1, "insertGroupNotify SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    :goto_0
    return v4
.end method

.method public c()I
    .locals 11

    .line 130
    const/4 v6, 0x0

    .line 131
    const/4 v7, 0x0

    .line 134
    const/4 v8, 0x0

    .line 136
    const/4 v0, 0x1

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 138
    const-string v8, "type =? "

    .line 140
    iget-object v0, p0, Lo/aub;->c:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$i;->a:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "count(*)"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 143
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    move v6, v0

    .line 155
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 157
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 158
    const/4 v7, 0x0

    goto :goto_0

    .line 149
    :catch_0
    move-exception v8

    .line 151
    const-string v0, "GroupNotifyDBHelper"

    const-string v1, "getGroupNotifyCount SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 157
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 158
    const/4 v7, 0x0

    goto :goto_0

    .line 155
    :catchall_0
    move-exception v10

    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 157
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 158
    const/4 v7, 0x0

    .line 160
    :cond_1
    throw v10

    .line 161
    :cond_2
    :goto_0
    return v6
.end method

.method public d()Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupNotify;>;"
        }
    .end annotation

    .line 171
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 172
    const/4 v7, 0x0

    .line 175
    const/4 v8, 0x0

    .line 177
    const/4 v0, 0x1

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 179
    const-string v8, "t_group_notify.type =? "

    .line 181
    iget-object v0, p0, Lo/aub;->c:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$i;->b:Landroid/net/Uri;

    invoke-direct {p0}, Lo/aub;->a()[Ljava/lang/String;

    move-result-object v2

    move-object v3, v8

    move-object v4, v9

    const-string v5, "t_group_notify.send_time desc"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 183
    if-nez v7, :cond_1

    .line 185
    move-object v10, v6

    .line 202
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 204
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 205
    const/4 v7, 0x0

    .line 185
    :cond_0
    return-object v10

    .line 187
    :cond_1
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 189
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 192
    :cond_2
    invoke-direct {p0, v7}, Lo/aub;->d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupNotify;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_2

    .line 202
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    .line 204
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 205
    const/4 v7, 0x0

    goto :goto_0

    .line 196
    :catch_0
    move-exception v8

    .line 198
    const-string v0, "GroupNotifyDBHelper"

    const-string v1, "getGroupNotifyList SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 202
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    .line 204
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 205
    const/4 v7, 0x0

    goto :goto_0

    .line 202
    :catchall_0
    move-exception v11

    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 204
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 205
    const/4 v7, 0x0

    .line 207
    :cond_4
    throw v11

    .line 208
    :cond_5
    :goto_0
    return-object v6
.end method

.method public e(JJ)Z
    .locals 6

    .line 300
    const/4 v2, 0x0

    .line 301
    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 303
    const-string v4, "group_id =?  and user_id =? "

    .line 306
    :try_start_0
    iget-object v0, p0, Lo/aub;->c:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$i;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1, v4, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 307
    if-lez v5, :cond_0

    .line 309
    const/4 v2, 0x1

    .line 310
    sget-object v0, Lo/bbz$i;->a:Landroid/net/Uri;

    iget-object v1, p0, Lo/aub;->c:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 316
    :cond_0
    goto :goto_0

    .line 313
    :catch_0
    move-exception v5

    .line 315
    const-string v0, "GroupNotifyDBHelper"

    const-string v1, "deleteGroupNotifyById SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    :goto_0
    return v2
.end method

.method public e(Lcom/huawei/health/sns/model/group/GroupNotify;)Z
    .locals 9

    .line 328
    const/4 v4, 0x0

    .line 330
    if-nez p1, :cond_0

    .line 332
    const-string v0, "GroupNotifyDBHelper"

    const-string v1, "updateGroupNotify groupNotify=null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    return v4

    .line 335
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserId()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 338
    :cond_1
    const-string v0, "GroupNotifyDBHelper"

    const-string v1, "updateGroupNotify gId or uId invalidate."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 339
    return v4

    .line 344
    :cond_2
    :try_start_0
    invoke-direct {p0, p1}, Lo/aub;->a(Lcom/huawei/health/sns/model/group/GroupNotify;)Landroid/content/ContentValues;

    move-result-object v5

    .line 346
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 347
    const-string v7, "group_id =? "

    .line 349
    iget-object v0, p0, Lo/aub;->c:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$i;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1, v5, v7, v6}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v8

    .line 350
    if-lez v8, :cond_3

    .line 352
    const/4 v4, 0x1

    .line 353
    sget-object v0, Lo/bbz$i;->a:Landroid/net/Uri;

    iget-object v1, p0, Lo/aub;->c:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 359
    :cond_3
    goto :goto_0

    .line 356
    :catch_0
    move-exception v5

    .line 358
    const-string v0, "GroupNotifyDBHelper"

    const-string v1, "updateGroupNotify SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    :goto_0
    return v4
.end method
