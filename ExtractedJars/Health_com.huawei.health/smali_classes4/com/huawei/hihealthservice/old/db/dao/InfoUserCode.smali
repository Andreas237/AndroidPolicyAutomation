.class public Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final Column_createTime:Ljava/lang/String; = "createTime"

.field private static final Column_huid:Ljava/lang/String; = "huid"

.field private static final Column_lastModifyTime:Ljava/lang/String; = "lastModifyTime"

.field private static final Column_localUserCode:Ljava/lang/String; = "localUserCode"

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_InfoUserCode"

.field private static final TABLE_NAME:Ljava/lang/String; = "user_code_info"

.field private static final columns:[Ljava/lang/String;


# instance fields
.field private writableDatabase:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 57
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "localUserCode"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "huid"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "createTime"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "lastModifyTime"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->columns:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 64
    return-void
.end method

.method private static getHuid(Landroid/database/Cursor;)J
    .locals 6

    .line 128
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 130
    const-string v0, "Debug_DB_InfoUserCode"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    const-wide/16 v0, 0x0

    return-wide v0

    .line 133
    :cond_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 135
    const-wide/16 v0, 0x0

    return-wide v0

    .line 137
    :cond_1
    const-string v0, "huid"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 138
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 139
    return-wide v4
.end method

.method private declared-synchronized getHuidSync(J)J
    .locals 11

    monitor-enter p0

    .line 163
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    .line 164
    monitor-exit p0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 166
    :cond_0
    const-string v0, "Debug_DB_InfoUserCode"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHuid(long huid) userCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const-string v8, "localUserCode=?"

    .line 168
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 169
    const-string v0, "Debug_DB_InfoUserCode"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "selection  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const-string v0, "Debug_DB_InfoUserCode"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "selectionArgs = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "user_code_info"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->columns:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 172
    invoke-static {v10}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getHuid(Landroid/database/Cursor;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized getInfoUserCodeSync(J)I
    .locals 11

    monitor-enter p0

    .line 148
    const-string v0, "Debug_DB_InfoUserCode"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInfoUserCode(long huid) huid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const-string v8, "huid=?"

    .line 150
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 151
    const-string v0, "Debug_DB_InfoUserCode"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "selection  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    const-string v0, "Debug_DB_InfoUserCode"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "selectionArgs = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "user_code_info"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->columns:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 154
    invoke-static {v10}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getUserCode(Landroid/database/Cursor;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private static getInfoUserCodeTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;>;"
        }
    .end annotation

    .line 90
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 92
    const-string v0, "Debug_DB_InfoUserCode"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    const/4 v0, 0x0

    return-object v0

    .line 95
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 96
    :goto_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;-><init>()V

    .line 100
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->setUserCode(J)V

    .line 101
    const/4 v0, 0x1

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->setHuid(J)V

    .line 102
    const/4 v0, 0x2

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->setCreateTime(J)V

    .line 103
    const/4 v0, 0x3

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->setLastModifyTime(J)V

    .line 104
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    goto :goto_0

    .line 106
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 107
    return-object v4
.end method

.method private declared-synchronized getLastHuidSync()J
    .locals 12

    monitor-enter p0

    .line 180
    const-string v8, "huid >? "

    .line 181
    const/4 v0, 0x1

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 182
    const-string v10, "lastModifyTime desc limit 0,1"

    .line 183
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "user_code_info"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->columns:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    move-object v7, v10

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 184
    invoke-static {v11}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getHuid(Landroid/database/Cursor;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v8

    monitor-exit p0

    throw v8
.end method

.method private declared-synchronized getLoginedAllHuidSync()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;>;"
        }
    .end annotation

    monitor-enter p0

    .line 192
    const-string v8, "huid >? "

    .line 193
    const/4 v0, 0x1

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 194
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "user_code_info"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->columns:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 195
    invoke-static {v10}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getInfoUserCodeTables(Landroid/database/Cursor;)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v8

    monitor-exit p0

    throw v8
.end method

.method private declared-synchronized getSync(J)Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;
    .locals 12

    monitor-enter p0

    .line 72
    const-string v0, "Debug_DB_InfoUserCode"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get(String userCode))  userCode= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    const-string v8, "localUserCode=?"

    .line 74
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 78
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "user_code_info"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->columns:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 80
    invoke-static {v10}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getInfoUserCodeTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v11

    .line 81
    const/4 v0, 0x0

    if-eq v0, v11, :cond_0

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 83
    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 85
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private static getUserCode(Landroid/database/Cursor;)I
    .locals 5

    .line 112
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 114
    const-string v0, "Debug_DB_InfoUserCode"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    const/4 v0, 0x0

    return v0

    .line 117
    :cond_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 119
    const/4 v0, 0x0

    return v0

    .line 121
    :cond_1
    const-string v0, "localUserCode"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    .line 122
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 123
    return v4
.end method


# virtual methods
.method public get(J)Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;
    .locals 1

    .line 67
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getSync(J)Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;

    move-result-object v0

    return-object v0
.end method

.method public getHuid(J)J
    .locals 2

    .line 158
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getHuidSync(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getInfoUserCode(J)I
    .locals 1

    .line 143
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getInfoUserCodeSync(J)I

    move-result v0

    return v0
.end method

.method public getLastHuid()J
    .locals 2

    .line 176
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getLastHuidSync()J

    move-result-wide v0

    return-wide v0
.end method

.method public getLoginedAllHuid()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;>;"
        }
    .end annotation

    .line 188
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getLoginedAllHuidSync()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
