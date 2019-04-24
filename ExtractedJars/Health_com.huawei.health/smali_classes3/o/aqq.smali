.class public Lo/aqq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final c:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/aqq;->c:Landroid/content/ContentResolver;

    .line 47
    iput-object p1, p0, Lo/aqq;->a:Landroid/content/Context;

    .line 48
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/chat/MessageItem;Z)Ljava/util/ArrayList;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/chat/MessageItem;Z)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 189
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v6

    .line 190
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v8

    .line 192
    const-string v9, "user_id =? and msg_content_type =? and _id"

    .line 193
    const-string v10, " asc "

    .line 194
    if-eqz p2, :cond_0

    .line 196
    const-string v10, " desc "

    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " <? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 201
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " >? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 203
    :goto_0
    const/4 v0, 0x3

    new-array v11, v0, [Ljava/lang/String;

    .line 204
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v11, v1

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v11, v1

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v11, v1

    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " limit 50"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 207
    const/4 v13, 0x0

    .line 208
    const/4 v14, 0x0

    .line 212
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/aqq;->c:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v3, v9

    move-object v4, v11

    move-object v5, v12

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v14, v0

    .line 214
    const/4 v0, 0x0

    if-eq v0, v14, :cond_3

    invoke-interface {v14}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 216
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v13, v0

    .line 218
    const/4 v15, 0x0

    .line 221
    :cond_1
    invoke-static {v14}, Lo/aqh;->d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v15

    .line 222
    if-eqz v15, :cond_2

    .line 224
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    :cond_2
    invoke-interface {v14}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 236
    :cond_3
    invoke-static {v14}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 237
    goto :goto_1

    .line 230
    :catch_0
    move-exception v15

    .line 232
    const-string v0, "ChatListDBHelper"

    const-string v1, "getImgMessagesFromUserId SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    invoke-static {v14}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 237
    goto :goto_1

    .line 236
    :catchall_0
    move-exception v16

    invoke-static {v14}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 237
    throw v16

    .line 238
    :goto_1
    return-object v13
.end method


# virtual methods
.method public a(JIJZ)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JIJZ)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v7, 0x0

    .line 67
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_id desc limit "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 70
    if-eqz p6, :cond_0

    .line 72
    const-string v8, "user_id =?  AND msg_status<>3"

    .line 74
    const/4 v0, 0x1

    new-array v10, v0, [Ljava/lang/String;

    .line 75
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    goto :goto_0

    .line 79
    :cond_0
    const-string v8, "user_id =?  AND msg_status<>3 AND _id <? "

    .line 81
    const/4 v0, 0x2

    new-array v10, v0, [Ljava/lang/String;

    .line 82
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    invoke-static/range {p4 .. p5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v10, v1

    .line 84
    :goto_0
    iget-object v0, p0, Lo/aqq;->c:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v3, v8

    move-object v4, v10

    move-object v5, v9

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 85
    invoke-static {v7}, Lo/aqh;->b(Landroid/database/Cursor;)Ljava/util/ArrayList;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 93
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 94
    goto :goto_1

    .line 87
    :catch_0
    move-exception v8

    .line 89
    const-string v0, "ChatListDBHelper"

    const-string v1, "getSpecifiedMessagesById SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 94
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v11

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 94
    throw v11

    .line 95
    :goto_1
    return-object v6
.end method

.method public a(JJJ)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 381
    const/4 v6, 0x0

    .line 382
    const/4 v7, 0x0

    .line 385
    const-string v8, "user_id =?  AND _id >=? AND _id <?"

    .line 386
    const/4 v0, 0x3

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    .line 387
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    invoke-static/range {p3 .. p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    invoke-static/range {p5 .. p6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 388
    const-string v10, "_id asc"

    .line 389
    iget-object v0, p0, Lo/aqq;->c:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v3, v8

    move-object v4, v9

    move-object v5, v10

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 390
    invoke-static {v7}, Lo/aqh;->b(Landroid/database/Cursor;)Ljava/util/ArrayList;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 398
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 399
    goto :goto_0

    .line 392
    :catch_0
    move-exception v8

    .line 394
    const-string v0, "ChatListDBHelper"

    const-string v1, "getMessagesBetweenMsgId SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 398
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 399
    goto :goto_0

    .line 398
    :catchall_0
    move-exception v11

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 399
    throw v11

    .line 400
    :goto_0
    return-object v6
.end method

.method public b(Lcom/huawei/health/sns/model/chat/MessageItem;[I)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/chat/MessageItem;[I)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 148
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 150
    if-nez p1, :cond_0

    .line 152
    return-object v2

    .line 156
    :cond_0
    new-instance v0, Lo/aqk;

    iget-object v1, p0, Lo/aqq;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/aqk;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aqk;->d(Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v3

    .line 158
    if-nez v3, :cond_1

    .line 160
    move-object v3, p1

    .line 163
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v3, v0}, Lo/aqq;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Z)Ljava/util/ArrayList;

    move-result-object v4

    .line 164
    if-eqz v4, :cond_2

    .line 166
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    aput v0, p2, v1

    .line 167
    invoke-static {v4}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 168
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 170
    :cond_2
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    const/4 v0, 0x0

    invoke-direct {p0, v3, v0}, Lo/aqq;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Z)Ljava/util/ArrayList;

    move-result-object v5

    .line 173
    if-eqz v5, :cond_3

    .line 175
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 177
    :cond_3
    return-object v2
.end method

.method public c(J)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 105
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 106
    const/4 v7, 0x0

    .line 110
    const-string v8, "user_id=? and msg_status<>?"

    .line 111
    const/4 v0, 0x2

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    .line 112
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 113
    iget-object v0, p0, Lo/aqq;->c:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v3, v8

    move-object v4, v9

    const-string v5, "_id asc"

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 114
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 116
    const/4 v10, 0x0

    .line 119
    :cond_0
    invoke-static {v7}, Lo/aqh;->d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v10

    .line 120
    const/4 v0, 0x0

    if-eq v0, v10, :cond_1

    .line 122
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    :cond_1
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 134
    :cond_2
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 135
    goto :goto_0

    .line 128
    :catch_0
    move-exception v8

    .line 130
    const-string v0, "ChatListDBHelper"

    const-string v1, "getAllMessageListByUserId SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 135
    goto :goto_0

    .line 134
    :catchall_0
    move-exception v11

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 135
    throw v11

    .line 136
    :goto_0
    return-object v6
.end method

.method public e(JI)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 348
    const/4 v6, 0x0

    .line 349
    const/4 v7, 0x0

    .line 352
    const-string v8, "user_id =?  AND _id >=? AND msg_status <>?"

    .line 354
    const/4 v0, 0x3

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    .line 355
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 356
    const-string v10, "_id asc"

    .line 357
    iget-object v0, p0, Lo/aqq;->c:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v3, v8

    move-object v4, v9

    move-object v5, v10

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 358
    invoke-static {v7}, Lo/aqh;->b(Landroid/database/Cursor;)Ljava/util/ArrayList;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 366
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 367
    goto :goto_0

    .line 360
    :catch_0
    move-exception v8

    .line 362
    const-string v0, "ChatListDBHelper"

    const-string v1, "getMessagesAfterMsgId SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 366
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 367
    goto :goto_0

    .line 366
    :catchall_0
    move-exception v11

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 367
    throw v11

    .line 368
    :goto_0
    return-object v6
.end method

.method public e(Ljava/lang/String;J)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 250
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 252
    const/4 v0, 0x0

    return-object v0

    .line 255
    :cond_0
    invoke-static {p1}, Lo/bqz;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 256
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "user_id = \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' AND ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "msg_status"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " or "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "msg_status"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "msg_content_type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " <> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "msg_content_type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " <> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "msg_content"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 261
    const-string v7, "_id asc"

    .line 262
    const/4 v8, 0x0

    .line 263
    const/4 v9, 0x0

    .line 267
    :try_start_0
    iget-object v0, p0, Lo/aqq;->c:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v3, v6

    move-object v5, v7

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    .line 269
    const/4 v0, 0x0

    if-eq v0, v9, :cond_3

    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 271
    const/4 v10, 0x0

    .line 272
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v8, v0

    .line 275
    :cond_1
    invoke-static {v9}, Lo/aqh;->d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v10

    .line 276
    if-eqz v10, :cond_2

    .line 278
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    :cond_2
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 290
    :cond_3
    invoke-static {v9}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 291
    goto :goto_0

    .line 284
    :catch_0
    move-exception v10

    .line 286
    const-string v0, "ChatListDBHelper"

    const-string v1, "searchMessageRecord SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 290
    invoke-static {v9}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 291
    goto :goto_0

    .line 290
    :catchall_0
    move-exception v11

    invoke-static {v9}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 291
    throw v11

    .line 292
    :goto_0
    return-object v8
.end method
