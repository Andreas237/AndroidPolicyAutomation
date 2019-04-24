.class public Lo/axn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private a:Landroid/content/ContentResolver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const-class v0, Lo/axn;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/axn;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/axn;->a:Landroid/content/ContentResolver;

    .line 39
    return-void
.end method

.method private f(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 6

    .line 290
    const/4 v3, 0x0

    .line 292
    if-eqz p1, :cond_2

    .line 296
    :try_start_0
    new-instance v0, Lo/axl;

    invoke-direct {v0}, Lo/axl;-><init>()V

    invoke-virtual {v0, p1}, Lo/axl;->e(Lcom/huawei/health/sns/model/user/User;)Landroid/content/ContentValues;

    move-result-object v4

    .line 297
    iget-object v0, p0, Lo/axn;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    invoke-virtual {v0, v1, v4}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v5

    .line 298
    if-eqz v5, :cond_0

    .line 300
    const/4 v3, 0x1

    .line 301
    iget-object v0, p0, Lo/axn;->a:Landroid/content/ContentResolver;

    invoke-static {v5, v0}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V

    .line 303
    :cond_0
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 305
    sget-object v0, Lo/axn;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isInsertSuccess = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 315
    :cond_1
    goto :goto_0

    .line 308
    :catch_0
    move-exception v4

    .line 310
    sget-object v0, Lo/axn;->c:Ljava/lang/String;

    const-string v1, "insertUser SQLException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    goto :goto_0

    .line 312
    :catch_1
    move-exception v4

    .line 314
    sget-object v0, Lo/axn;->c:Ljava/lang/String;

    const-string v1, "insertUser IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    :cond_2
    :goto_0
    return v3
.end method


# virtual methods
.method public a(J)Z
    .locals 6

    .line 446
    const/4 v2, 0x0

    .line 449
    const-string v3, "user_id =? "

    .line 451
    const/4 v0, 0x1

    :try_start_0
    new-array v4, v0, [Ljava/lang/String;

    .line 452
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 454
    iget-object v0, p0, Lo/axn;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 455
    if-lez v5, :cond_0

    .line 457
    const/4 v2, 0x1

    .line 458
    sget-object v0, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v1, p0, Lo/axn;->a:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 468
    :cond_0
    goto :goto_0

    .line 461
    :catch_0
    move-exception v3

    .line 463
    sget-object v0, Lo/axn;->c:Ljava/lang/String;

    const-string v1, "deleteUser error, SQLException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 468
    goto :goto_0

    .line 465
    :catch_1
    move-exception v3

    .line 467
    sget-object v0, Lo/axn;->c:Ljava/lang/String;

    const-string v1, "deleteUser error IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    :goto_0
    return v2
.end method

.method public a(JI)Z
    .locals 3

    .line 76
    const/4 v1, 0x0

    .line 77
    invoke-virtual {p0, p1, p2}, Lo/axn;->c(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    .line 78
    if-eqz v2, :cond_1

    .line 80
    invoke-virtual {v2, p3}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 83
    if-nez p3, :cond_0

    .line 85
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setRelation(I)V

    .line 87
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->buildSortPinYin()V

    .line 88
    invoke-virtual {p0, v2}, Lo/axn;->g(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v1

    goto :goto_0

    .line 92
    :cond_1
    const/4 v0, 0x1

    if-ne p3, v0, :cond_2

    .line 94
    new-instance v2, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 95
    invoke-virtual {v2, p1, p2}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 96
    invoke-virtual {v2, p3}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 97
    invoke-direct {p0, v2}, Lo/axn;->f(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v1

    .line 100
    .line 105
    :cond_2
    :goto_0
    return v1
.end method

.method public a(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 4

    .line 179
    const/4 v2, 0x0

    .line 180
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/axn;->c(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 181
    if-eqz v3, :cond_0

    .line 183
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 184
    invoke-virtual {p0, v3}, Lo/axn;->g(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v2

    goto :goto_0

    .line 188
    :cond_0
    invoke-direct {p0, p1}, Lo/axn;->f(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v2

    .line 190
    .line 195
    :goto_0
    return v2
.end method

.method public b(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 4

    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/axn;->c(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 51
    if-eqz v3, :cond_0

    .line 53
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setRemarkName(Ljava/lang/String;)V

    .line 54
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->buildSortPinYin()V

    .line 55
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 56
    invoke-virtual {p0, v3}, Lo/axn;->g(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v2

    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->buildSortPinYin()V

    .line 61
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 62
    invoke-direct {p0, p1}, Lo/axn;->f(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v2

    .line 64
    :goto_0
    return v2
.end method

.method public c(J)Lcom/huawei/health/sns/model/user/User;
    .locals 13

    .line 329
    const/4 v6, 0x0

    .line 330
    const-string v7, "user_id = ?"

    .line 331
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    .line 332
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 333
    const/4 v9, 0x0

    .line 334
    new-instance v10, Lo/axl;

    invoke-direct {v10}, Lo/axl;-><init>()V

    .line 337
    :try_start_0
    iget-object v0, p0, Lo/axn;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    move-object v3, v7

    move-object v4, v8

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    .line 338
    if-eqz v9, :cond_0

    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 340
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    .line 341
    invoke-virtual {v10, v9}, Lo/axl;->c(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/User;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 354
    :cond_0
    if-eqz v9, :cond_2

    .line 356
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 344
    :catch_0
    move-exception v11

    .line 346
    :try_start_1
    sget-object v0, Lo/axn;->c:Ljava/lang/String;

    const-string v1, "queryUserFromDB SQLException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 354
    if-eqz v9, :cond_2

    .line 356
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 348
    :catch_1
    move-exception v11

    .line 350
    :try_start_2
    sget-object v0, Lo/axn;->c:Ljava/lang/String;

    const-string v1, "queryUserFromDB IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 354
    if-eqz v9, :cond_2

    .line 356
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 354
    :catchall_0
    move-exception v12

    if-eqz v9, :cond_1

    .line 356
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 358
    :cond_1
    throw v12

    .line 359
    :cond_2
    :goto_0
    return-object v6
.end method

.method public c(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 4

    .line 116
    const/4 v2, 0x0

    .line 117
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/axn;->c(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 118
    if-eqz v3, :cond_0

    .line 120
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 121
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 122
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 123
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getGender()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setGender(I)V

    .line 124
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSignature()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setSignature(Ljava/lang/String;)V

    .line 125
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getAccount()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setAccount(Ljava/lang/String;)V

    .line 126
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNeedVerify()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setNeedVerify(I)V

    .line 127
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getProvince()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setProvince(Ljava/lang/String;)V

    .line 128
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneDigest(Ljava/lang/String;)V

    .line 129
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getCity()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setCity(Ljava/lang/String;)V

    .line 130
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSiteId()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setSiteId(I)V

    .line 132
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->buildSortPinYin()V

    .line 133
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 134
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOriginType()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setOriginType(I)V

    .line 135
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOriginDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setOriginDesc(Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0, v3}, Lo/axn;->e(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v2

    goto :goto_0

    .line 140
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->buildSortPinYin()V

    .line 141
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 142
    invoke-direct {p0, p1}, Lo/axn;->f(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v2

    .line 144
    :goto_0
    return v2
.end method

.method public d(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 4

    .line 156
    const/4 v2, 0x0

    .line 157
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/axn;->c(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 158
    if-eqz v3, :cond_0

    .line 160
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSetFlags()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setSetFlags(Ljava/lang/String;)V

    .line 161
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getStickTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setStickTime(Ljava/lang/String;)V

    .line 162
    invoke-virtual {p0, v3}, Lo/axn;->g(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v2

    goto :goto_0

    .line 166
    :cond_0
    invoke-direct {p0, p1}, Lo/axn;->f(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v2

    .line 168
    :goto_0
    return v2
.end method

.method public e(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 9

    .line 206
    const/4 v6, 0x0

    .line 208
    if-eqz p1, :cond_1

    .line 212
    :try_start_0
    new-instance v0, Lo/axl;

    invoke-direct {v0}, Lo/axl;-><init>()V

    invoke-virtual {v0, p1}, Lo/axl;->c(Lcom/huawei/health/sns/model/user/User;)Landroid/content/ContentValues;

    move-result-object v7

    .line 213
    const-string v0, "sort_pinyin"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSortPinYin()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    const-string v0, "nick_name"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    iget-object v0, p0, Lo/axn;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    const-string v2, "user_id =? "

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    .line 217
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 215
    invoke-virtual {v0, v1, v7, v2, v3}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v8

    .line 218
    if-lez v8, :cond_0

    .line 220
    sget-object v0, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v1, p0, Lo/axn;->a:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V

    .line 221
    const/4 v6, 0x1

    goto :goto_0

    .line 225
    :cond_0
    sget-object v0, Lo/axn;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isUpdateSucc = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 235
    :goto_0
    goto :goto_1

    .line 228
    :catch_0
    move-exception v7

    .line 230
    sget-object v0, Lo/axn;->c:Ljava/lang/String;

    const-string v1, "updateSNSUser SQLException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    goto :goto_1

    .line 232
    :catch_1
    move-exception v7

    .line 234
    sget-object v0, Lo/axn;->c:Ljava/lang/String;

    const-string v1, "updateSNSUser IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    :cond_1
    :goto_1
    return v6
.end method

.method public g(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 9

    .line 249
    const/4 v6, 0x0

    .line 251
    if-eqz p1, :cond_1

    .line 255
    :try_start_0
    new-instance v0, Lo/axl;

    invoke-direct {v0}, Lo/axl;-><init>()V

    invoke-virtual {v0, p1}, Lo/axl;->c(Lcom/huawei/health/sns/model/user/User;)Landroid/content/ContentValues;

    move-result-object v7

    .line 256
    iget-object v0, p0, Lo/axn;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    const-string v2, "user_id =? "

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    .line 258
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 256
    invoke-virtual {v0, v1, v7, v2, v3}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v8

    .line 259
    if-lez v8, :cond_0

    .line 261
    const/4 v6, 0x1

    .line 262
    sget-object v0, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v1, p0, Lo/axn;->a:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V

    goto :goto_0

    .line 266
    :cond_0
    sget-object v0, Lo/axn;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isUpdateSucc = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 276
    :goto_0
    goto :goto_1

    .line 269
    :catch_0
    move-exception v7

    .line 271
    sget-object v0, Lo/axn;->c:Ljava/lang/String;

    const-string v1, "updateUser SQLException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    goto :goto_1

    .line 273
    :catch_1
    move-exception v7

    .line 275
    sget-object v0, Lo/axn;->c:Ljava/lang/String;

    const-string v1, "updateUser IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    :cond_1
    :goto_1
    return v6
.end method

.method public h(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 4

    .line 413
    const/4 v2, 0x0

    .line 415
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/axn;->c(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 417
    if-eqz v3, :cond_1

    .line 420
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setUserType(I)V

    .line 422
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 424
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 426
    :cond_0
    invoke-virtual {p0, v3}, Lo/axn;->g(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v2

    goto :goto_0

    .line 431
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->buildSortPinYin()V

    .line 432
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 433
    invoke-direct {p0, p1}, Lo/axn;->f(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v2

    .line 435
    :goto_0
    return v2
.end method

.method public i(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 4

    .line 370
    const/4 v2, 0x0

    .line 373
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/axn;->c(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 375
    if-eqz v3, :cond_1

    .line 377
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    if-nez v0, :cond_0

    .line 380
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 381
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 382
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 383
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getState()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setState(I)V

    .line 385
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->buildSortPinYin()V

    .line 386
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 387
    invoke-virtual {p0, v3}, Lo/axn;->g(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v2

    goto :goto_0

    .line 392
    :cond_0
    const/4 v2, 0x1

    goto :goto_0

    .line 398
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->buildSortPinYin()V

    .line 399
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 400
    invoke-direct {p0, p1}, Lo/axn;->f(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v2

    .line 402
    :goto_0
    return v2
.end method
