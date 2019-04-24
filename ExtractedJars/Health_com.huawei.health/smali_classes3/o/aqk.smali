.class public Lo/aqk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final b:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    .line 42
    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 15

    .line 171
    const-wide v6, 0x7fffffffffffffffL

    .line 173
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    const-string v0, "_id"

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 177
    const-string v9, "user_id =? AND msg_status<>3"

    .line 179
    const/4 v0, 0x1

    new-array v10, v0, [Ljava/lang/String;

    .line 180
    invoke-static/range {p1 .. p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 182
    const-string v11, "_id limit 1"

    .line 184
    const/4 v12, 0x0

    .line 187
    :try_start_0
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v2, v8

    move-object v3, v9

    move-object v4, v10

    move-object v5, v11

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v12, v0

    .line 188
    const/4 v0, 0x0

    if-eq v0, v12, :cond_0

    invoke-interface {v12}, Landroid/database/Cursor;->getCount()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    invoke-interface {v12}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 190
    const-string v0, "_id"

    invoke-interface {v12, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v12, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    move-wide v6, v0

    .line 203
    :cond_0
    invoke-static {v12}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 204
    goto :goto_0

    .line 193
    :catch_0
    move-exception v13

    .line 195
    const-string v0, "ChatDBHelper"

    const-string v1, "getMinId SQLException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    invoke-static {v12}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 204
    goto :goto_0

    .line 197
    :catch_1
    move-exception v13

    .line 199
    const-string v0, "ChatDBHelper"

    const-string v1, "getMinId IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 203
    invoke-static {v12}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 204
    goto :goto_0

    .line 203
    :catchall_0
    move-exception v14

    invoke-static {v12}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 204
    throw v14

    .line 205
    :goto_0
    return-wide v6
.end method

.method public a([Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/String;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 494
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 496
    if-eqz p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    .line 498
    :cond_0
    return-object v6

    .line 501
    :cond_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 502
    const-string v0, "msg_id"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    const-string v0, " in ("

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    const/4 v8, 0x0

    :goto_0
    array-length v0, p1

    if-ge v8, v0, :cond_2

    .line 506
    const-string v0, "?,"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 508
    :cond_2
    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    const-string v0, ","

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result v8

    .line 510
    add-int/lit8 v0, v8, 0x1

    const-string v1, ""

    invoke-virtual {v7, v8, v0, v1}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    move-object v9, p1

    .line 514
    const/4 v10, 0x0

    .line 517
    :try_start_0
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v4, v9

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 518
    invoke-static {v10}, Lo/aqh;->b(Landroid/database/Cursor;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 530
    invoke-static {v10}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 531
    goto :goto_1

    .line 520
    :catch_0
    move-exception v11

    .line 522
    const-string v0, "ChatDBHelper"

    const-string v1, "getMessageById SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 530
    invoke-static {v10}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 531
    goto :goto_1

    .line 524
    :catch_1
    move-exception v11

    .line 526
    const-string v0, "ChatDBHelper"

    const-string v1, "getMessageById IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 530
    invoke-static {v10}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 531
    goto :goto_1

    .line 530
    :catchall_0
    move-exception v12

    invoke-static {v10}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 531
    throw v12

    .line 532
    :goto_1
    return-object v6
.end method

.method public a(Ljava/lang/String;)V
    .locals 5

    .line 248
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    const-string v0, "ChatDBHelper"

    const-string v1, "deleteMessage failed, the msgId is empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    return-void

    .line 255
    :cond_0
    const-string v2, "msg_id =? "

    .line 257
    const/4 v0, 0x1

    :try_start_0
    new-array v3, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v3, v0

    .line 260
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    .line 261
    if-lez v4, :cond_1

    .line 263
    sget-object v0, Lo/bbz$h;->d:Landroid/net/Uri;

    iget-object v1, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 273
    :cond_1
    goto :goto_0

    .line 266
    :catch_0
    move-exception v2

    .line 268
    const-string v0, "ChatDBHelper"

    const-string v1, "deleteMessage SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    goto :goto_0

    .line 270
    :catch_1
    move-exception v2

    .line 272
    const-string v0, "ChatDBHelper"

    const-string v1, "deleteMessage IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    :goto_0
    return-void
.end method

.method public a()Z
    .locals 10

    .line 650
    const/4 v6, 0x0

    .line 653
    const-string v7, "is_reffered_self=\'1\' AND msg_status=\'2\' AND send_msg_status=\'0\'"

    .line 656
    :try_start_0
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v3, v7

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v6, v0

    .line 657
    if-eqz v6, :cond_0

    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-lez v0, :cond_0

    .line 659
    const/4 v8, 0x1

    .line 676
    invoke-static {v6}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 659
    return v8

    .line 663
    :cond_0
    const/4 v8, 0x0

    .line 676
    invoke-static {v6}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 663
    return v8

    .line 666
    :catch_0
    move-exception v7

    .line 668
    const-string v0, "ChatDBHelper"

    const-string v1, "hasUnreadAtSelfMsg SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 676
    invoke-static {v6}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 677
    goto :goto_0

    .line 670
    :catch_1
    move-exception v7

    .line 672
    const-string v0, "ChatDBHelper"

    const-string v1, "hasUnreadAtSelfMsg IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 676
    invoke-static {v6}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 677
    goto :goto_0

    .line 676
    :catchall_0
    move-exception v9

    invoke-static {v6}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 677
    throw v9

    .line 678
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;)Z
    .locals 11

    .line 96
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 98
    const/4 v0, 0x0

    return v0

    .line 100
    :cond_0
    const/4 v6, 0x0

    .line 103
    const-string v7, "msg_id =? AND user_id =? "

    .line 104
    const/4 v0, 0x2

    :try_start_0
    new-array v8, v0, [Ljava/lang/String;

    .line 105
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 106
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v3, v7

    move-object v4, v8

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v6, v0

    .line 107
    if-eqz v6, :cond_1

    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-lez v0, :cond_1

    .line 109
    const/4 v9, 0x1

    .line 126
    invoke-static {v6}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 109
    return v9

    .line 113
    :cond_1
    const/4 v9, 0x0

    .line 126
    invoke-static {v6}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 113
    return v9

    .line 116
    :catch_0
    move-exception v7

    .line 118
    const-string v0, "ChatDBHelper"

    const-string v1, "isMessageExist SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    invoke-static {v6}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 127
    goto :goto_0

    .line 120
    :catch_1
    move-exception v7

    .line 122
    const-string v0, "ChatDBHelper"

    const-string v1, "isMessageExist IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    invoke-static {v6}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 127
    goto :goto_0

    .line 126
    :catchall_0
    move-exception v10

    invoke-static {v6}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 127
    throw v10

    .line 128
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public b(J)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 12

    .line 412
    const-string v6, "user_id =? and msg_status =? "

    .line 413
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    .line 414
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 416
    const/4 v8, 0x0

    .line 417
    const/4 v9, 0x0

    .line 420
    :try_start_0
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v3, v6

    move-object v4, v7

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 422
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 426
    :cond_0
    invoke-static {v8}, Lo/aqh;->d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    move-object v9, v0

    .line 428
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 441
    :cond_1
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 442
    goto :goto_0

    .line 431
    :catch_0
    move-exception v10

    .line 433
    const-string v0, "ChatDBHelper"

    const-string v1, "getDraftMessageByUserId SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 441
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 442
    goto :goto_0

    .line 435
    :catch_1
    move-exception v10

    .line 437
    const-string v0, "ChatDBHelper"

    const-string v1, "getDraftMessageByUserId IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 441
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 442
    goto :goto_0

    .line 441
    :catchall_0
    move-exception v11

    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 442
    throw v11

    .line 443
    :goto_0
    return-object v9
.end method

.method public c(Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 5

    .line 52
    const/4 v2, -0x1

    .line 53
    if-nez p1, :cond_0

    .line 55
    const-string v0, "ChatDBHelper"

    const-string v1, "insertMessageToDB messageItem = null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    return v2

    .line 60
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lo/aqk;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    const-string v0, "ChatDBHelper"

    const-string v1, "insertMessageToDB failed, the message already exist in the table t_message"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 66
    :cond_1
    invoke-static {p1}, Lo/aqh;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)Landroid/content/ContentValues;

    move-result-object v3

    .line 68
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v4

    .line 69
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 71
    invoke-static {v4}, Lo/aqh;->b(Landroid/net/Uri;)J

    move-result-wide v0

    long-to-int v0, v0

    move v2, v0

    .line 72
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    invoke-static {v4, v0}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 84
    :cond_2
    :goto_0
    goto :goto_1

    .line 77
    :catch_0
    move-exception v3

    .line 79
    const-string v0, "ChatDBHelper"

    const-string v1, "insertMessageToDB meet SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    goto :goto_1

    .line 81
    :catch_1
    move-exception v3

    .line 83
    const-string v0, "ChatDBHelper"

    const-string v1, "insertMessageToDB meet IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    :goto_1
    return v2
.end method

.method public c(J)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 372
    const/4 v6, 0x0

    .line 373
    const/4 v7, 0x0

    .line 376
    const-string v8, "user_id =? and msg_status = ? and send_msg_status=?"

    .line 379
    const/4 v0, 0x3

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    .line 380
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 381
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 383
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v3, v8

    move-object v4, v9

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 384
    if-eqz v7, :cond_0

    .line 386
    invoke-static {v7}, Lo/aqh;->b(Landroid/database/Cursor;)Ljava/util/ArrayList;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 399
    :cond_0
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 400
    goto :goto_0

    .line 389
    :catch_0
    move-exception v8

    .line 391
    const-string v0, "ChatDBHelper"

    const-string v1, "getUnreadMsgList SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 399
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 400
    goto :goto_0

    .line 393
    :catch_1
    move-exception v8

    .line 395
    const-string v0, "ChatDBHelper"

    const-string v1, "getUnreadMsgList IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 399
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 400
    goto :goto_0

    .line 399
    :catchall_0
    move-exception v10

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 400
    throw v10

    .line 401
    :goto_0
    return-object v6
.end method

.method public d(J)I
    .locals 13

    .line 284
    const v6, 0x7fffffff

    .line 285
    const/4 v7, 0x0

    .line 288
    const-string v8, "user_id =? and msg_status = ? and send_msg_status=?"

    .line 291
    const/4 v0, 0x1

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "_id"

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 293
    const/4 v0, 0x3

    new-array v10, v0, [Ljava/lang/String;

    .line 294
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v10, v1

    .line 295
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v10, v1

    .line 297
    const-string v11, "_id asc limit 1"

    .line 299
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v2, v9

    move-object v3, v8

    move-object v4, v10

    move-object v5, v11

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 301
    if-eqz v7, :cond_0

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    const-string v0, "_id"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    move v6, v0

    .line 316
    :cond_0
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 317
    goto :goto_0

    .line 306
    :catch_0
    move-exception v8

    .line 308
    const-string v0, "ChatDBHelper"

    const-string v1, "getUnreadMsgFirstId SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 316
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 317
    goto :goto_0

    .line 310
    :catch_1
    move-exception v8

    .line 312
    const-string v0, "ChatDBHelper"

    const-string v1, "getUnreadMsgFirstId IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 316
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 317
    goto :goto_0

    .line 316
    :catchall_0
    move-exception v12

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 317
    throw v12

    .line 318
    :goto_0
    return v6
.end method

.method public d(Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 12

    .line 453
    const-string v6, "msg_id =? "

    .line 454
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v7, v0

    .line 457
    const/4 v8, 0x0

    .line 458
    const/4 v9, 0x0

    .line 461
    :try_start_0
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v3, v6

    move-object v4, v7

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 463
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 467
    :cond_0
    invoke-static {v8}, Lo/aqh;->d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    move-object v9, v0

    .line 469
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 482
    :cond_1
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 483
    goto :goto_0

    .line 472
    :catch_0
    move-exception v10

    .line 474
    const-string v0, "ChatDBHelper"

    const-string v1, "getMessageById SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 482
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 483
    goto :goto_0

    .line 476
    :catch_1
    move-exception v10

    .line 478
    const-string v0, "ChatDBHelper"

    const-string v1, "getMessageById IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 482
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 483
    goto :goto_0

    .line 482
    :catchall_0
    move-exception v11

    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 483
    throw v11

    .line 484
    :goto_0
    return-object v9
.end method

.method public d()Z
    .locals 6

    .line 540
    const/4 v4, 0x0

    .line 543
    :try_start_0
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    const-string v2, ""

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 544
    if-lez v5, :cond_0

    .line 546
    const/4 v4, 0x1

    .line 547
    sget-object v0, Lo/bbz$h;->d:Landroid/net/Uri;

    iget-object v1, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 557
    :cond_0
    goto :goto_0

    .line 550
    :catch_0
    move-exception v5

    .line 552
    const-string v0, "ChatDBHelper"

    const-string v1, "clearAllMessage SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 557
    goto :goto_0

    .line 554
    :catch_1
    move-exception v5

    .line 556
    const-string v0, "ChatDBHelper"

    const-string v1, "clearAllMessage IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 558
    :goto_0
    return v4
.end method

.method public e()J
    .locals 11

    .line 215
    const-wide/16 v6, 0x0

    .line 216
    const/4 v8, 0x0

    .line 219
    const-string v9, "seq desc limit 1"

    .line 220
    :try_start_0
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v5, v9

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 221
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    const-string v0, "seq"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    move-wide v6, v0

    .line 236
    :cond_0
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 237
    goto :goto_0

    .line 226
    :catch_0
    move-exception v9

    .line 228
    const-string v0, "ChatDBHelper"

    const-string v1, "getMaxSeq SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 237
    goto :goto_0

    .line 230
    :catch_1
    move-exception v9

    .line 232
    const-string v0, "ChatDBHelper"

    const-string v1, "getMaxSeq IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 236
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 237
    goto :goto_0

    .line 236
    :catchall_0
    move-exception v10

    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 237
    throw v10

    .line 238
    :goto_0
    return-wide v6
.end method

.method public e(J)Z
    .locals 6

    .line 138
    const/4 v2, 0x0

    .line 141
    const-string v3, "user_id=?"

    .line 142
    const/4 v0, 0x1

    :try_start_0
    new-array v4, v0, [Ljava/lang/String;

    .line 143
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 145
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 146
    if-ltz v5, :cond_0

    .line 148
    const/4 v2, 0x1

    .line 149
    sget-object v0, Lo/bbz$h;->d:Landroid/net/Uri;

    iget-object v1, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 159
    :cond_0
    goto :goto_0

    .line 152
    :catch_0
    move-exception v3

    .line 154
    const-string v0, "ChatDBHelper"

    const-string v1, "deleteMessageByUserId SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    goto :goto_0

    .line 156
    :catch_1
    move-exception v3

    .line 158
    const-string v0, "ChatDBHelper"

    const-string v1, "deleteMessageByUserId IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    :goto_0
    return v2
.end method

.method public g(J)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 12

    .line 610
    const-string v6, "_id =?"

    .line 611
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    .line 612
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 613
    const/4 v8, 0x0

    .line 614
    const/4 v9, 0x0

    .line 617
    :try_start_0
    iget-object v0, p0, Lo/aqk;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v3, v6

    move-object v4, v7

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 619
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 623
    :cond_0
    invoke-static {v8}, Lo/aqh;->d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    move-object v9, v0

    .line 625
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 638
    :cond_1
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 639
    goto :goto_0

    .line 628
    :catch_0
    move-exception v10

    .line 630
    const-string v0, "ChatDBHelper"

    const-string v1, "getMessageByPrimaryKey SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 638
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 639
    goto :goto_0

    .line 632
    :catch_1
    move-exception v10

    .line 634
    const-string v0, "ChatDBHelper"

    const-string v1, "getMessageByPrimaryKey IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 638
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 639
    goto :goto_0

    .line 638
    :catchall_0
    move-exception v11

    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 639
    throw v11

    .line 640
    :goto_0
    return-object v9
.end method
