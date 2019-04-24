.class public Lo/wx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field private static final c:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 28
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "huid"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "time"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/wx;->c:[Ljava/lang/String;

    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    const-string v0, "create table  IF NOT EXISTS likedetails("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    const-string v0, "_id integer primary key autoincrement,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    const-string v0, "huid BIGINT UNIQUE,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    const-string v0, "time INTEGER"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/wx;->a:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 2

    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    const-string v0, "_id integer primary key autoincrement,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    const-string v0, "huid BIGINT UNIQUE,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    const-string v0, "time INTEGER"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lo/wr;Ljava/util/ArrayList;)J
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/wr;Ljava/util/ArrayList<Lo/xa;>;)J"
        }
    .end annotation

    .line 97
    const-wide/16 v4, 0x0

    .line 99
    :try_start_0
    invoke-virtual {p0, p1}, Lo/wx;->d(Lo/wr;)I

    .line 103
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 104
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/xa;

    .line 105
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 106
    invoke-virtual {v7}, Lo/xa;->e()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 107
    const-string v0, "huid"

    invoke-virtual {v7}, Lo/xa;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 110
    :cond_0
    invoke-virtual {v7}, Lo/xa;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 111
    const-string v0, "time"

    invoke-virtual {v7}, Lo/xa;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    :cond_1
    const-string v0, "likedetails"

    const/4 v1, 0x1

    const/4 v2, 0x5

    invoke-virtual {p1, v0, v1, v8, v2}, Lo/wr;->insertStorageDataWithOnConfict(Ljava/lang/String;ILandroid/content/ContentValues;I)J

    move-result-wide v4

    .line 118
    const-wide/16 v0, -0x1

    cmp-long v0, v0, v4

    if-nez v0, :cond_2

    .line 119
    const-string v0, "LikeDetailsDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert() failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 125
    :cond_3
    move-wide v6, v4

    return-wide v6

    .line 126
    :catch_0
    move-exception v6

    .line 127
    const-string v0, "LikeDetailsDB"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "insert() Exception="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    goto :goto_1

    .line 128
    :catchall_0
    move-exception v9

    .line 133
    throw v9

    .line 134
    :goto_1
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public a(Lo/wr;)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/wr;)Ljava/util/ArrayList<Lo/xa;>;"
        }
    .end annotation

    .line 138
    const/4 v5, 0x0

    .line 139
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 144
    const-string v0, "likedetails"

    const-string v1, "time DESC"

    const/4 v2, 0x1

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p1, v0, v2, v3, v1}, Lo/wr;->queryStorageDataToOrder(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v5, v0

    .line 145
    if-nez v5, :cond_1

    .line 147
    const/4 v7, 0x0

    .line 171
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 172
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 147
    :cond_0
    return-object v7

    .line 149
    :cond_1
    :try_start_1
    invoke-static {}, Lo/xo;->e()Lo/xo;

    move-result-object v7

    .line 151
    :goto_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 152
    new-instance v8, Lo/xa;

    invoke-direct {v8}, Lo/xa;-><init>()V

    .line 153
    const-string v0, "huid"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/xa;->e(J)V

    .line 154
    invoke-virtual {v8}, Lo/xa;->e()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/xo;->b(J)Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    move-result-object v9

    .line 155
    const-string v0, "LikeDetailsDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "likes.getHuId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lo/xa;->e()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    iget-object v0, v9, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->displayName:Ljava/lang/String;

    invoke-virtual {v8, v0}, Lo/xa;->d(Ljava/lang/String;)V

    .line 158
    const-string v0, "LikeDetailsDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "likes.setName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v9, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->displayName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    const-string v0, "time"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xa;->b(Ljava/lang/String;)V

    .line 162
    iget-object v0, v9, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->imagePath:Ljava/lang/String;

    invoke-virtual {v8, v0}, Lo/xa;->c(Ljava/lang/String;)V

    .line 163
    const-string v0, "LikeDetailsDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "likes.imagePath:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v9, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->imagePath:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    goto/16 :goto_0

    .line 171
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 172
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 168
    :catch_0
    move-exception v7

    .line 169
    const-string v0, "LikeDetailsDB"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fetchLikeDetails() Exception="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 171
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 172
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 171
    :catchall_0
    move-exception v10

    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 172
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 176
    :cond_3
    throw v10

    .line 177
    :cond_4
    :goto_1
    return-object v6
.end method

.method public c(Lo/wr;)V
    .locals 3

    .line 50
    const-string v0, "likedetails"

    invoke-direct {p0}, Lo/wx;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2, v1}, Lo/wr;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 52
    return-void
.end method

.method public d(Lo/wr;)I
    .locals 5

    .line 205
    const-string v0, "likedetails"

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p1, v0, v1, v2}, Lo/wr;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    move-result v4

    .line 206
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 207
    const-string v0, "LikeDetailsDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete() failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    :cond_0
    return v4

    .line 211
    :catch_0
    move-exception v4

    .line 212
    const-string v0, "LikeDetailsDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteAll() Exception="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    const/4 v0, -0x1

    return v0
.end method
