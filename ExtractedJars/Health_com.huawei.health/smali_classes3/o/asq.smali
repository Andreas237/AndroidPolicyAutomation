.class public Lo/asq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asq;->b:Landroid/content/ContentResolver;

    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/asq;->b:Landroid/content/ContentResolver;

    .line 39
    return-void
.end method


# virtual methods
.method public a(J)Lo/axv;
    .locals 13

    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    const-string v8, "t_conversation.user_id =? "

    .line 49
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    .line 50
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 51
    const-string v10, "last_message_date desc"

    .line 54
    :try_start_0
    iget-object v0, p0, Lo/asq;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$e;->c:Landroid/net/Uri;

    new-instance v2, Lo/axv;

    invoke-direct {v2}, Lo/axv;-><init>()V

    .line 55
    invoke-virtual {v2}, Lo/axv;->d()[Ljava/lang/String;

    move-result-object v2

    move-object v3, v8

    move-object v4, v9

    move-object v5, v10

    .line 54
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 56
    const/4 v11, 0x0

    .line 57
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 59
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 62
    :cond_0
    invoke-static {v7}, Lo/axv;->b(Landroid/database/Cursor;)Lo/axv;

    move-result-object v11

    .line 64
    move-object v6, v11

    .line 67
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 80
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 82
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 83
    const/4 v7, 0x0

    goto :goto_0

    .line 70
    :catch_0
    move-exception v11

    .line 72
    const-string v0, "ConversationDBHelper"

    const-string v1, "getAllMessageListByUserId SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 82
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 83
    const/4 v7, 0x0

    goto :goto_0

    .line 74
    :catch_1
    move-exception v11

    .line 76
    const-string v0, "ConversationDBHelper"

    const-string v1, "getAllMessageListByUserId IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 80
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 82
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 83
    const/4 v7, 0x0

    goto :goto_0

    .line 80
    :catchall_0
    move-exception v12

    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 82
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 83
    const/4 v7, 0x0

    .line 85
    :cond_2
    throw v12

    .line 86
    :cond_3
    :goto_0
    return-object v6
.end method

.method public b()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/axv;>;"
        }
    .end annotation

    .line 95
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 96
    const/4 v7, 0x0

    .line 99
    :try_start_0
    iget-object v0, p0, Lo/asq;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$e;->c:Landroid/net/Uri;

    new-instance v2, Lo/axv;

    invoke-direct {v2}, Lo/axv;-><init>()V

    .line 100
    invoke-virtual {v2}, Lo/axv;->d()[Ljava/lang/String;

    move-result-object v2

    const-string v5, "last_message_date desc"

    .line 99
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 101
    const/4 v8, 0x0

    .line 102
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 104
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 107
    :cond_0
    invoke-static {v7}, Lo/axv;->b(Landroid/database/Cursor;)Lo/axv;

    move-result-object v8

    .line 109
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 125
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 127
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 128
    const/4 v7, 0x0

    goto :goto_0

    .line 115
    :catch_0
    move-exception v8

    .line 117
    const-string v0, "ConversationDBHelper"

    const-string v1, "getAllMessageListByUserId SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 127
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 128
    const/4 v7, 0x0

    goto :goto_0

    .line 119
    :catch_1
    move-exception v8

    .line 121
    const-string v0, "ConversationDBHelper"

    const-string v1, "getAllMessageListByUserId IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 127
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 128
    const/4 v7, 0x0

    goto :goto_0

    .line 125
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 127
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 128
    const/4 v7, 0x0

    .line 130
    :cond_2
    throw v9

    .line 131
    :cond_3
    :goto_0
    return-object v6
.end method

.method public b(JLjava/lang/String;)Z
    .locals 7

    .line 217
    const/4 v2, 0x0

    .line 218
    if-nez p3, :cond_0

    .line 220
    const-string p3, "0"

    .line 222
    :cond_0
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 223
    const-string v0, "top_time"

    invoke-virtual {v3, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    const-string v4, "user_id =? "

    .line 227
    const/4 v0, 0x1

    :try_start_0
    new-array v5, v0, [Ljava/lang/String;

    .line 228
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 229
    iget-object v0, p0, Lo/asq;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$e;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    .line 230
    if-lez v6, :cond_1

    .line 232
    const/4 v2, 0x1

    .line 233
    sget-object v0, Lo/bbz$e;->b:Landroid/net/Uri;

    iget-object v1, p0, Lo/asq;->b:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V

    goto :goto_0

    .line 237
    :cond_1
    const-string v0, "ConversationDBHelper"

    const-string v1, "setConversationItemToTop error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 247
    :goto_0
    goto :goto_1

    .line 240
    :catch_0
    move-exception v4

    .line 242
    const-string v0, "ConversationDBHelper"

    const-string v1, "setConversationItemToTop SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    goto :goto_1

    .line 244
    :catch_1
    move-exception v4

    .line 246
    const-string v0, "ConversationDBHelper"

    const-string v1, "setConversationItemToTop IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    :goto_1
    return v2
.end method

.method public c()[I
    .locals 18

    .line 259
    const/4 v6, 0x0

    .line 260
    const/4 v7, 0x0

    .line 262
    const/4 v0, 0x4

    new-array v8, v0, [Ljava/lang/String;

    const-string v0, "t_conversation.chat_type"

    const/4 v1, 0x0

    aput-object v0, v8, v1

    const-string v0, "t_conversation.message_unread_number"

    const/4 v1, 0x1

    aput-object v0, v8, v1

    const-string v0, "t_user.set_flags"

    const/4 v1, 0x2

    aput-object v0, v8, v1

    const-string v0, "t_group.disturb_mode"

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 269
    const-string v9, "t_conversation.message_unread_number >0 "

    .line 271
    const/4 v10, 0x0

    .line 274
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/asq;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$e;->c:Landroid/net/Uri;

    move-object v2, v8

    move-object v3, v9

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 275
    if-eqz v10, :cond_2

    .line 278
    const/4 v11, 0x0

    .line 280
    const/4 v12, 0x1

    .line 282
    const/4 v13, 0x2

    .line 284
    const/4 v14, 0x3

    .line 285
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 287
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v15

    .line 288
    const/4 v0, 0x1

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v16

    .line 291
    const/4 v0, 0x1

    if-ne v15, v0, :cond_0

    .line 293
    const/4 v0, 0x2

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-nez v0, :cond_1

    .line 295
    add-int v0, v7, v16

    move v7, v0

    .line 297
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 300
    :cond_0
    const/4 v0, 0x2

    if-ne v15, v0, :cond_1

    .line 302
    const/4 v0, 0x3

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 304
    add-int v0, v7, v16

    move v7, v0

    .line 306
    add-int/lit8 v6, v6, 0x1

    .line 309
    :cond_1
    :goto_1
    goto :goto_0

    .line 322
    :cond_2
    invoke-static {v10}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 323
    goto :goto_2

    .line 312
    :catch_0
    move-exception v11

    .line 314
    const-string v0, "ConversationDBHelper"

    const-string v1, "get unread exclude undisturb SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 322
    invoke-static {v10}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 323
    goto :goto_2

    .line 316
    :catch_1
    move-exception v11

    .line 318
    const-string v0, "ConversationDBHelper"

    const-string v1, "get unread exclude undisturb IllegalStateException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 322
    invoke-static {v10}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 323
    goto :goto_2

    .line 322
    :catchall_0
    move-exception v17

    invoke-static {v10}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 323
    throw v17

    .line 325
    :goto_2
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 327
    const-string v0, "ConversationDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get unread message count is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    :cond_3
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v6, v0, v1

    const/4 v1, 0x1

    aput v7, v0, v1

    return-object v0
.end method

.method public d(J)Z
    .locals 6

    .line 143
    const/4 v2, 0x0

    .line 145
    const-string v3, "user_id =? "

    .line 147
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    .line 148
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 152
    :try_start_0
    iget-object v0, p0, Lo/asq;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$e;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 153
    if-lez v5, :cond_0

    .line 155
    const/4 v2, 0x1

    .line 156
    sget-object v0, Lo/bbz$e;->b:Landroid/net/Uri;

    iget-object v1, p0, Lo/asq;->b:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V

    goto :goto_0

    .line 160
    :cond_0
    const-string v0, "ConversationDBHelper"

    const-string v1, "deleteConversationItemByUserId error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 170
    :goto_0
    goto :goto_1

    .line 163
    :catch_0
    move-exception v5

    .line 165
    const-string v0, "ConversationDBHelper"

    const-string v1, "deleteConversationItemByUserId SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    goto :goto_1

    .line 167
    :catch_1
    move-exception v5

    .line 169
    const-string v0, "ConversationDBHelper"

    const-string v1, "deleteConversationItemByUserId IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    :goto_1
    return v2
.end method

.method public e()Z
    .locals 6

    .line 181
    const/4 v4, 0x0

    .line 185
    :try_start_0
    iget-object v0, p0, Lo/asq;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$e;->b:Landroid/net/Uri;

    const-string v2, ""

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 186
    if-lez v5, :cond_0

    .line 188
    const/4 v4, 0x1

    .line 189
    sget-object v0, Lo/bbz$e;->b:Landroid/net/Uri;

    iget-object v1, p0, Lo/asq;->b:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V

    goto :goto_0

    .line 193
    :cond_0
    const-string v0, "ConversationDBHelper"

    const-string v1, "deleteAllConversationItem error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 204
    :goto_0
    goto :goto_1

    .line 197
    :catch_0
    move-exception v5

    .line 199
    const-string v0, "ConversationDBHelper"

    const-string v1, "deleteAllConversationItem SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    goto :goto_1

    .line 201
    :catch_1
    move-exception v5

    .line 203
    const-string v0, "ConversationDBHelper"

    const-string v1, "deleteAllConversationItem IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    :goto_1
    return v4
.end method

.method public e(JLjava/lang/String;)Z
    .locals 7

    .line 343
    const/4 v2, 0x0

    .line 344
    if-nez p3, :cond_0

    .line 346
    const-string v0, "ConversationDBHelper"

    const-string v1, "setLastMessageDate date = null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    return v2

    .line 349
    :cond_0
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 350
    const-string v0, "last_message_date"

    invoke-virtual {v3, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    const-string v4, "user_id =? "

    .line 354
    const/4 v0, 0x1

    :try_start_0
    new-array v5, v0, [Ljava/lang/String;

    .line 355
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 356
    iget-object v0, p0, Lo/asq;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$e;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    .line 357
    if-lez v6, :cond_1

    .line 359
    const/4 v2, 0x1

    .line 360
    sget-object v0, Lo/bbz$e;->b:Landroid/net/Uri;

    iget-object v1, p0, Lo/asq;->b:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V

    goto :goto_0

    .line 364
    :cond_1
    const-string v0, "ConversationDBHelper"

    const-string v1, "setLastMessageDate error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 374
    :goto_0
    goto :goto_1

    .line 367
    :catch_0
    move-exception v4

    .line 369
    const-string v0, "ConversationDBHelper"

    const-string v1, "setLastMessageDate SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    goto :goto_1

    .line 371
    :catch_1
    move-exception v4

    .line 373
    const-string v0, "ConversationDBHelper"

    const-string v1, "setLastMessageDate IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    :goto_1
    return v2
.end method
