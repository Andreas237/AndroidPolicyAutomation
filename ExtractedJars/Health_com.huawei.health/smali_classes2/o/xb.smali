.class public Lo/xb;
.super Lo/xc;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/xc;-><init>()V

    .line 26
    return-void
.end method


# virtual methods
.method public a(Lo/wr;JLjava/lang/String;)I
    .locals 7

    .line 97
    const/4 v4, 0x0

    .line 100
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

    .line 101
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 102
    const-string v0, "status"

    invoke-virtual {v6, v0, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    const-string v1, "socialuser"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v6, v5}, Lo/wr;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 108
    goto :goto_0

    .line 106
    :catch_0
    move-exception v5

    .line 107
    const-string v0, "SocialUserDB"

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

    .line 109
    :goto_0
    return v4
.end method

.method public a(Lo/wr;Ljava/lang/String;)Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;
    .locals 10

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 31
    if-eqz p2, :cond_2

    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 38
    const-string v0, "socialuser"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1, v6}, Lo/wr;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 40
    if-nez v4, :cond_1

    .line 42
    const/4 v7, 0x0

    .line 88
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 89
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 42
    :cond_0
    return-object v7

    .line 52
    :cond_1
    :try_start_1
    invoke-static {}, Lo/xo;->e()Lo/xo;

    move-result-object v7

    .line 55
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 56
    new-instance v0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    invoke-direct {v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;-><init>()V

    move-object v5, v0

    .line 57
    const-string v0, "huid"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setHuId(J)V

    .line 58
    invoke-virtual {v5}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->getHuId()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/xo;->b(J)Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    move-result-object v8

    .line 59
    const-string v0, "hobbies"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setHobbies(I)V

    .line 61
    iget-object v0, v8, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->displayName:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setName(Ljava/lang/String;)V

    .line 62
    const-string v0, "age"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setAge(I)V

    .line 63
    const-string v0, "height"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setHeight(I)V

    .line 64
    const-string v0, "weight"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setWeight(I)V

    .line 66
    const-string v0, "settings"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setSettings(I)V

    .line 67
    const-string v0, "status"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setStatus(Ljava/lang/String;)V

    .line 68
    const-string v0, "gender"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setGender(I)V

    .line 69
    const-string v0, "userType"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setUserType(I)V

    .line 72
    iget-object v0, v8, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->imagePath:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setImgUrl(Ljava/lang/String;)V

    .line 76
    const-string v0, "bg_wall"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setBgImgUrl(Ljava/lang/String;)V

    .line 77
    const-string v0, "notified_side"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setNotifiedSide(I)V

    .line 78
    const-string v0, "need_verify"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setNeedVerify(Ljava/lang/String;)V

    .line 79
    const-string v0, "note"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setNote(Ljava/lang/String;)V
    :try_end_1
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 89
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 85
    :catch_0
    move-exception v6

    .line 86
    const-string v0, "SocialUserDB"

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

    .line 88
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 89
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 88
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 89
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 92
    :cond_3
    throw v9

    .line 93
    :cond_4
    :goto_0
    return-object v5
.end method

.method public d(Lo/wr;JI)I
    .locals 7

    .line 129
    const/4 v4, 0x0

    .line 132
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

    .line 133
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 134
    const-string v0, "settings"

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 136
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    const-string v1, "socialuser"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v6, v5}, Lo/wr;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 140
    goto :goto_0

    .line 138
    :catch_0
    move-exception v5

    .line 139
    const-string v0, "SocialUserDB"

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

    .line 141
    :goto_0
    return v4
.end method

.method public e(Lo/wr;JI)I
    .locals 7

    .line 113
    const/4 v4, 0x0

    .line 116
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

    .line 117
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 118
    const-string v0, "hobbies"

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 120
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    const-string v1, "socialuser"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v6, v5}, Lo/wr;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 124
    goto :goto_0

    .line 122
    :catch_0
    move-exception v5

    .line 123
    const-string v0, "SocialUserDB"

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

    .line 125
    :goto_0
    return v4
.end method
