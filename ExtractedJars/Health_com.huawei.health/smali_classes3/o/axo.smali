.class public Lo/axo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/axo;->a:Landroid/content/ContentResolver;

    .line 39
    return-void
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 182
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 183
    new-instance v7, Lo/axl;

    invoke-direct {v7}, Lo/axl;-><init>()V

    .line 184
    const-string v8, "display_name <> ?"

    .line 185
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\'\'"

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 187
    const-string v10, "contact_sort_pinyin ASC"

    .line 188
    const/4 v11, 0x0

    .line 191
    :try_start_0
    iget-object v0, p0, Lo/axo;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    move-object v3, v8

    move-object v4, v9

    move-object v5, v10

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v11, v0

    .line 192
    if-eqz v11, :cond_1

    .line 194
    const/4 v12, 0x0

    .line 195
    :cond_0
    :goto_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 197
    invoke-virtual {v7, v11}, Lo/axl;->c(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v12

    .line 198
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/User;->getUserType()I

    move-result v0

    if-nez v0, :cond_0

    .line 200
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 211
    :cond_1
    if-eqz v11, :cond_3

    .line 213
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 205
    :catch_0
    move-exception v12

    .line 207
    const-string v0, "UserDBHelper"

    const-string v1, "queryAllUserFromPhoneBook SQLException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 211
    if-eqz v11, :cond_3

    .line 213
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 211
    :catchall_0
    move-exception v13

    if-eqz v11, :cond_2

    .line 213
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 215
    :cond_2
    throw v13

    .line 217
    :cond_3
    :goto_1
    return-object v6
.end method

.method public a(I)Ljava/util/ArrayList;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 87
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 88
    const-string v7, "is_friend =? "

    .line 89
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    .line 90
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 92
    const-string v9, "user_sort_pinyin ASC"

    .line 93
    new-instance v10, Lo/axl;

    invoke-direct {v10}, Lo/axl;-><init>()V

    .line 94
    const/4 v11, 0x0

    .line 97
    :try_start_0
    iget-object v0, p0, Lo/axo;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    invoke-virtual {v10}, Lo/axl;->e()[Ljava/lang/String;

    move-result-object v2

    move-object v3, v7

    move-object v4, v8

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v11, v0

    .line 99
    const/4 v12, 0x0

    .line 100
    if-eqz v11, :cond_2

    .line 102
    :cond_0
    :goto_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 104
    invoke-virtual {v10, v11}, Lo/axl;->c(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v12

    .line 106
    const/4 v0, 0x3

    if-eq v0, p1, :cond_1

    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/User;->getUserType()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 108
    :cond_1
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 119
    :cond_2
    if-eqz v11, :cond_4

    .line 121
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 113
    :catch_0
    move-exception v12

    .line 115
    const-string v0, "UserDBHelper"

    const-string v1, "getFriendList SQLException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    if-eqz v11, :cond_4

    .line 121
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 119
    :catchall_0
    move-exception v13

    if-eqz v11, :cond_3

    .line 121
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 123
    :cond_3
    throw v13

    .line 124
    :cond_4
    :goto_1
    return-object v6
.end method

.method public b()Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 227
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 228
    new-instance v7, Lo/axl;

    invoke-direct {v7}, Lo/axl;-><init>()V

    .line 229
    const/4 v8, 0x0

    .line 232
    const-string v9, "sort_pinyin is null or LENGTH(trim(sort_pinyin))<1"

    .line 234
    :try_start_0
    iget-object v0, p0, Lo/axo;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    move-object v3, v9

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 235
    const/4 v10, 0x0

    .line 236
    if-eqz v8, :cond_0

    .line 238
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 240
    invoke-virtual {v7, v8}, Lo/axl;->c(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v10

    .line 242
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 252
    :cond_0
    if-eqz v8, :cond_2

    .line 254
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 246
    :catch_0
    move-exception v9

    .line 248
    const-string v0, "UserDBHelper"

    const-string v1, "getRepairUserlist SQLException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 252
    if-eqz v8, :cond_2

    .line 254
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 252
    :catchall_0
    move-exception v11

    if-eqz v8, :cond_1

    .line 254
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 256
    :cond_1
    throw v11

    .line 257
    :cond_2
    :goto_1
    return-object v6
.end method

.method public c()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 134
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/axo;->a(I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/support/v4/util/LongSparseArray;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 48
    new-instance v6, Lo/axl;

    invoke-direct {v6}, Lo/axl;-><init>()V

    .line 49
    new-instance v7, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v7}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    .line 50
    const/4 v8, 0x0

    .line 53
    :try_start_0
    iget-object v0, p0, Lo/axo;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 54
    const/4 v9, 0x0

    .line 55
    if-eqz v8, :cond_0

    .line 57
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    invoke-virtual {v6, v8}, Lo/axl;->c(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v9

    .line 61
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1, v9}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 71
    :cond_0
    if-eqz v8, :cond_2

    .line 73
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 65
    :catch_0
    move-exception v9

    .line 67
    const-string v0, "UserDBHelper"

    const-string v1, "getAllUser SQLException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    if-eqz v8, :cond_2

    .line 73
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 71
    :catchall_0
    move-exception v10

    if-eqz v8, :cond_1

    .line 73
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 75
    :cond_1
    throw v10

    .line 76
    :cond_2
    :goto_1
    return-object v7
.end method

.method public e()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 144
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 145
    new-instance v7, Lo/axl;

    invoke-direct {v7}, Lo/axl;-><init>()V

    .line 146
    const/4 v8, 0x0

    .line 149
    :try_start_0
    iget-object v0, p0, Lo/axo;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 150
    const/4 v9, 0x0

    .line 151
    if-eqz v8, :cond_0

    .line 153
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    invoke-virtual {v7, v8}, Lo/axl;->c(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v9

    .line 157
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 167
    :cond_0
    if-eqz v8, :cond_2

    .line 169
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 161
    :catch_0
    move-exception v9

    .line 163
    const-string v0, "UserDBHelper"

    const-string v1, "getAllUserList SQLException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    if-eqz v8, :cond_2

    .line 169
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 167
    :catchall_0
    move-exception v10

    if-eqz v8, :cond_1

    .line 169
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 171
    :cond_1
    throw v10

    .line 172
    :cond_2
    :goto_1
    return-object v6
.end method

.method public f()Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 267
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 268
    new-instance v7, Lo/axl;

    invoke-direct {v7}, Lo/axl;-><init>()V

    .line 269
    const/4 v8, 0x0

    .line 273
    const-string v9, "display_name is not null and ("

    .line 274
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "contact_sort_pinyin is null or LENGTH(trim(contact_sort_pinyin))<1) "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 276
    iget-object v0, p0, Lo/axo;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    move-object v3, v9

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 277
    const/4 v10, 0x0

    .line 278
    if-eqz v8, :cond_0

    .line 280
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    invoke-virtual {v7, v8}, Lo/axl;->c(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v10

    .line 284
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 294
    :cond_0
    if-eqz v8, :cond_2

    .line 296
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 288
    :catch_0
    move-exception v9

    .line 290
    const-string v0, "UserDBHelper"

    const-string v1, "getRepairContactlist SQLException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 294
    if-eqz v8, :cond_2

    .line 296
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 294
    :catchall_0
    move-exception v11

    if-eqz v8, :cond_1

    .line 296
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 298
    :cond_1
    throw v11

    .line 299
    :cond_2
    :goto_1
    return-object v6
.end method
