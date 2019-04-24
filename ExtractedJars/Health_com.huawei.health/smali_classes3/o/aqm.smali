.class public Lo/aqm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final d:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    .line 41
    return-void
.end method

.method private a(J)Z
    .locals 7

    .line 253
    const/4 v2, 0x0

    .line 254
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 255
    const-string v0, "send_msg_status"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 258
    const-string v4, "user_id =?  AND msg_status =?  AND send_msg_status =?"

    .line 260
    const/4 v0, 0x3

    :try_start_0
    new-array v5, v0, [Ljava/lang/String;

    .line 261
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 262
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    .line 263
    iget-object v0, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    .line 264
    if-lez v6, :cond_0

    .line 266
    const/4 v2, 0x1

    .line 267
    sget-object v0, Lo/bbz$h;->d:Landroid/net/Uri;

    iget-object v1, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 277
    :cond_0
    goto :goto_0

    .line 270
    :catch_0
    move-exception v4

    .line 272
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "setMessageTableIsRead SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    goto :goto_0

    .line 274
    :catch_1
    move-exception v4

    .line 276
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "setMessageTableIsRead IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    :goto_0
    return v2
.end method

.method private d(J)Z
    .locals 8

    .line 289
    const/4 v3, 0x0

    .line 291
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 292
    const-string v0, "message_unread_number"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 293
    const-string v0, "unread_reffered_self_msg_number"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 296
    const-string v5, "user_id =? "

    .line 297
    const/4 v0, 0x1

    :try_start_0
    new-array v6, v0, [Ljava/lang/String;

    .line 298
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 299
    iget-object v0, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$e;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1, v4, v5, v6}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7

    .line 300
    if-lez v7, :cond_0

    .line 302
    const/4 v3, 0x1

    .line 303
    sget-object v0, Lo/bbz$e;->b:Landroid/net/Uri;

    iget-object v1, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V

    goto :goto_0

    .line 307
    :cond_0
    const-string v0, "ChatUpdateDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setConversationTableIsRead error iRet:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 317
    :goto_0
    goto :goto_1

    .line 310
    :catch_0
    move-exception v5

    .line 312
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "setConversationTableIsRead SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    goto :goto_1

    .line 314
    :catch_1
    move-exception v5

    .line 316
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "setConversationTableIsRead IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    :goto_1
    return v3
.end method


# virtual methods
.method public b(Ljava/lang/String;I)V
    .locals 6

    .line 51
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMessageStatus failed, the msgId is empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    return-void

    .line 57
    :cond_0
    const-string v2, "msg_id =? "

    .line 58
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v3, v0

    .line 62
    :try_start_0
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 63
    const-string v0, "send_msg_status"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 64
    iget-object v0, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 65
    if-lez v5, :cond_1

    .line 67
    sget-object v0, Lo/bbz$h;->d:Landroid/net/Uri;

    iget-object v1, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 77
    :cond_1
    goto :goto_0

    .line 70
    :catch_0
    move-exception v4

    .line 72
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMsgStatus SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    goto :goto_0

    .line 74
    :catch_1
    move-exception v4

    .line 76
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMsgStatus IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 125
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMediaUrl failed, the msgId is empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    return-void

    .line 131
    :cond_0
    const-string v2, "msg_id =? "

    .line 132
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v3, v0

    .line 136
    :try_start_0
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 137
    const-string v0, "media_url"

    invoke-virtual {v4, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    iget-object v0, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 139
    if-lez v5, :cond_1

    .line 141
    sget-object v0, Lo/bbz$h;->d:Landroid/net/Uri;

    iget-object v1, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 151
    :cond_1
    goto :goto_0

    .line 144
    :catch_0
    move-exception v4

    .line 146
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMediaUrl SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    goto :goto_0

    .line 148
    :catch_1
    move-exception v4

    .line 150
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMediaUrl IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    :goto_0
    return-void
.end method

.method public c(J)Z
    .locals 3

    .line 240
    invoke-direct {p0, p1, p2}, Lo/aqm;->a(J)Z

    move-result v1

    .line 241
    invoke-direct {p0, p1, p2}, Lo/aqm;->d(J)Z

    move-result v2

    .line 242
    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(Ljava/lang/String;IZ)V
    .locals 6

    .line 163
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMediaDownloadStatus failed, the msgId is empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    return-void

    .line 169
    :cond_0
    const-string v2, "msg_id =? "

    .line 170
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v3, v0

    .line 174
    :try_start_0
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 175
    if-eqz p3, :cond_1

    .line 177
    const-string v0, "mts_ori_download_status"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_0

    .line 181
    :cond_1
    const-string v0, "mts_download_status"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 184
    :goto_0
    iget-object v0, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 185
    if-lez v5, :cond_2

    .line 187
    sget-object v0, Lo/bbz$h;->d:Landroid/net/Uri;

    iget-object v1, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 197
    :cond_2
    goto :goto_1

    .line 190
    :catch_0
    move-exception v4

    .line 192
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMediaDownloadStatus SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    goto :goto_1

    .line 194
    :catch_1
    move-exception v4

    .line 196
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMediaDownloadStatus IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    :goto_1
    return-void
.end method

.method public d()Z
    .locals 7

    .line 328
    const/4 v2, 0x0

    .line 329
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 330
    const-string v0, "send_msg_status"

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 333
    const-string v4, "msg_status =?  AND send_msg_status =?"

    .line 334
    const/4 v0, 0x2

    :try_start_0
    new-array v5, v0, [Ljava/lang/String;

    .line 335
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 336
    iget-object v0, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    .line 337
    if-lez v6, :cond_0

    .line 339
    const/4 v2, 0x1

    .line 340
    sget-object v0, Lo/bbz$h;->d:Landroid/net/Uri;

    iget-object v1, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V

    goto :goto_0

    .line 344
    :cond_0
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "setAllSendingMessageToFailedMessage effect size:0"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 354
    :goto_0
    goto :goto_1

    .line 347
    :catch_0
    move-exception v4

    .line 349
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "setAllSendingMessageToFailedMessage SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    goto :goto_1

    .line 351
    :catch_1
    move-exception v4

    .line 353
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "setAllSendingMessageToFailedMessage IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    :goto_1
    return v2
.end method

.method public e(J)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 12

    .line 363
    const/4 v6, 0x0

    .line 364
    const/4 v7, 0x0

    .line 367
    const-string v8, "user_id =? "

    .line 368
    const/4 v0, 0x1

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    .line 369
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 370
    const-string v10, "_id desc limit 1"

    .line 371
    iget-object v0, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    move-object v3, v8

    move-object v4, v9

    move-object v5, v10

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v6, v0

    .line 372
    if-eqz v6, :cond_1

    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 376
    :cond_0
    invoke-static {v6}, Lo/aqh;->d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    move-object v7, v0

    .line 378
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 387
    :cond_1
    invoke-static {v6}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 388
    goto :goto_0

    .line 381
    :catch_0
    move-exception v8

    .line 383
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "getConversationLastMsg Throwable."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 387
    invoke-static {v6}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 388
    goto :goto_0

    .line 387
    :catchall_0
    move-exception v11

    invoke-static {v6}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 388
    throw v11

    .line 389
    :goto_0
    return-object v7
.end method

.method public e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 6

    .line 209
    :try_start_0
    invoke-static {p1}, Lo/aqh;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)Landroid/content/ContentValues;

    move-result-object v2

    .line 211
    const-string v3, "msg_id =? "

    .line 212
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 214
    iget-object v0, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 215
    if-lez v5, :cond_0

    .line 217
    sget-object v0, Lo/bbz$h;->d:Landroid/net/Uri;

    iget-object v1, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 227
    :cond_0
    goto :goto_0

    .line 220
    :catch_0
    move-exception v2

    .line 222
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMessage SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    goto :goto_0

    .line 224
    :catch_1
    move-exception v2

    .line 226
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMessage IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 88
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMediaThumbnail failed, the msgId is empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    return-void

    .line 94
    :cond_0
    const-string v2, "msg_id =? "

    .line 95
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v3, v0

    .line 99
    :try_start_0
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 100
    const-string v0, "media_thumbnail"

    invoke-virtual {v4, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$h;->d:Landroid/net/Uri;

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 102
    if-lez v5, :cond_1

    .line 104
    sget-object v0, Lo/bbz$h;->d:Landroid/net/Uri;

    iget-object v1, p0, Lo/aqm;->d:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 114
    :cond_1
    goto :goto_0

    .line 107
    :catch_0
    move-exception v4

    .line 109
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMediaThumbnail SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    goto :goto_0

    .line 111
    :catch_1
    move-exception v4

    .line 113
    const-string v0, "ChatUpdateDBHelper"

    const-string v1, "updateMediaThumbnail IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    :goto_0
    return-void
.end method
