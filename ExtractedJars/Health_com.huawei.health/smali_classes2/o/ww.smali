.class public Lo/ww;
.super Lo/xc;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lo/xc;-><init>()V

    .line 35
    return-void
.end method


# virtual methods
.method public b(Lo/wr;Ljava/lang/String;I)I
    .locals 7

    .line 200
    const-string v0, "SocialRankingDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter updateOwnSteps steps:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    const/4 v4, -0x1

    .line 204
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 205
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 206
    const-string v0, "stepLength"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 208
    const-string v0, "socialuser"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1, v6, v5}, Lo/wr;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    move-result v0

    move v4, v0

    .line 209
    const-string v0, "SocialRankingDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter updateOwnSteps retVal:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 214
    goto :goto_0

    .line 211
    :catch_0
    move-exception v5

    .line 212
    const-string v0, "SocialRankingDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateOwnSteps ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    const-string v0, "SocialRankingDB"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    :goto_0
    const-string v0, "SocialRankingDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter updateOwnSteps retVal:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    return v4
.end method

.method public b(Lo/wr;)Lcom/huawei/bone/social/manager/db/SocialRankingTable;
    .locals 10

    .line 147
    const/4 v4, 0x0

    .line 148
    new-instance v5, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    invoke-direct {v5}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;-><init>()V

    .line 156
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT huid,stepLength,likeCount,status,bg_wall FROM "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "socialuser"

    .line 160
    invoke-virtual {p1, v1}, Lo/wr;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " WHERE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/xx$b;->b:Lo/xx$b;

    .line 161
    invoke-virtual {v1}, Lo/xx$b;->ordinal()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 162
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v6, v1}, Lo/wr;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 164
    if-nez v4, :cond_1

    .line 166
    const/4 v7, 0x0

    .line 191
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 192
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 166
    :cond_0
    return-object v7

    .line 168
    :cond_1
    :try_start_1
    invoke-static {}, Lo/xo;->e()Lo/xo;

    move-result-object v7

    .line 169
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 170
    const-string v0, "huid"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setHuId(J)V

    .line 171
    invoke-virtual {v5}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getHuId()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/xo;->b(J)Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    move-result-object v8

    .line 173
    iget-object v0, v8, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->displayName:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setName(Ljava/lang/String;)V

    .line 175
    const-string v0, "stepLength"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setSteps(I)V

    .line 176
    const-string v0, "likeCount"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setLikes(I)V

    .line 178
    iget-object v0, v8, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->imagePath:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setImgUrl(Ljava/lang/String;)V

    .line 179
    const-string v0, "status"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setStatus(Ljava/lang/String;)V

    .line 181
    const-string v0, "bg_wall"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setBgImgUrl(Ljava/lang/String;)V

    .line 184
    goto :goto_0

    .line 185
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setHuId(J)V
    :try_end_1
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 191
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 192
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 188
    :catch_0
    move-exception v6

    .line 189
    const-string v0, "SocialRankingDB"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lnet/sqlcipher/database/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 191
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 192
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 191
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 192
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 194
    :cond_3
    throw v9

    .line 195
    :cond_4
    :goto_1
    return-object v5
.end method

.method public c(Lo/wr;JII)I
    .locals 7

    .line 220
    const/4 v4, 0x0

    .line 223
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 224
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 225
    const-string v0, "likeCount"

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 226
    const-string v0, "isLiked"

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 228
    const-string v0, "socialuser"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1, v6, v5}, Lo/wr;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 232
    goto :goto_0

    .line 230
    :catch_0
    move-exception v5

    .line 231
    const-string v0, "SocialRankingDB"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    :goto_0
    return v4
.end method

.method public e(Lo/wr;)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/wr;)Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/SocialRankingTable;>;"
        }
    .end annotation

    .line 89
    const/4 v3, 0x0

    .line 90
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 95
    const-string v5, "stepLength DESC "

    .line 101
    const-string v6, "SELECT huid,stepLength,likeCount,image,isLiked,userType,status,bg_wall FROM socialuser"

    .line 110
    const-string v0, "socialuser"

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p1, v0, v1, v2, v5}, Lo/wr;->queryStorageDataToOrder(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v3, v0

    .line 112
    if-nez v3, :cond_1

    .line 113
    const/4 v7, 0x0

    .line 138
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 139
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 113
    :cond_0
    return-object v7

    .line 115
    :cond_1
    :try_start_1
    invoke-static {}, Lo/xo;->e()Lo/xo;

    move-result-object v7

    .line 116
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 117
    new-instance v8, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    invoke-direct {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;-><init>()V

    .line 118
    const-string v0, "huid"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setHuId(J)V

    .line 119
    invoke-virtual {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getHuId()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/xo;->b(J)Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    move-result-object v9

    .line 121
    iget-object v0, v9, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->displayName:Ljava/lang/String;

    invoke-virtual {v8, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setName(Ljava/lang/String;)V

    .line 122
    const-string v0, "stepLength"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setSteps(I)V

    .line 123
    const-string v0, "likeCount"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setLikes(I)V

    .line 125
    iget-object v0, v9, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->imagePath:Ljava/lang/String;

    invoke-virtual {v8, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setImgUrl(Ljava/lang/String;)V

    .line 126
    const-string v0, "userType"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setUserType(I)V

    .line 127
    const-string v0, "isLiked"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setIsLiked(I)V

    .line 128
    const-string v0, "bg_wall"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setBgImgUrl(Ljava/lang/String;)V

    .line 130
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    goto/16 :goto_0

    .line 138
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v3, :cond_5

    .line 139
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 133
    :catch_0
    move-exception v5

    .line 134
    if-eqz v3, :cond_3

    .line 135
    :try_start_2
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v3, :cond_5

    .line 139
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 138
    :catchall_0
    move-exception v10

    const/4 v0, 0x0

    if-eq v0, v3, :cond_4

    .line 139
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 142
    :cond_4
    throw v10

    .line 143
    :cond_5
    :goto_1
    return-object v4
.end method
