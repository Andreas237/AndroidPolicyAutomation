.class public Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final Column_actionCode:Ljava/lang/String; = "actionCode"

.field private static final Column_createTime:Ljava/lang/String; = "createTime"

.field private static final Column_dataType:Ljava/lang/String; = "dataType"

.field private static final Column_errorInfo:Ljava/lang/String; = "errorInfo"

.field private static final Column_id:Ljava/lang/String; = "_id"

.field private static final Column_lastModifyVersion:Ljava/lang/String; = "lastModifyVersion"

.field private static final Column_localUserDeviceCode:Ljava/lang/String; = "localUserDeviceCode"

.field private static final Column_referData:Ljava/lang/String; = "referData"

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_LogBinBase"

.field private static final columns:[Ljava/lang/String;


# instance fields
.field private mContext:Landroid/content/Context;

.field private mTableName:Ljava/lang/String;

.field private writableDatabase:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 74
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "localUserDeviceCode"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "actionCode"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "referData"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "createTime"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "errorInfo"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "dataType"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "lastModifyVersion"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->columns:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->mContext:Landroid/content/Context;

    .line 83
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->mContext:Landroid/content/Context;

    .line 84
    iput-object p2, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->mTableName:Ljava/lang/String;

    .line 85
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 86
    return-void
.end method

.method private declared-synchronized deletSync(Lcom/huawei/hihealthservice/old/db/dao/LogTable;)I
    .locals 10

    monitor-enter p0

    .line 110
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getId()J

    move-result-wide v4

    .line 111
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getLastModifyVersion()J

    move-result-wide v6

    .line 112
    const-string v0, "Debug_DB_LogBinBase"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " delet(String id)  id = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",version = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    const-string v8, "_id=?   and  lastModifyVersion=?"

    .line 114
    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 115
    const-string v0, "Debug_DB_LogBinBase"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " whereClause = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    const-string v0, "Debug_DB_LogBinBase"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " whereArgs = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->mTableName:Ljava/lang/String;

    invoke-virtual {v0, v1, v8, v9}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
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

.method private declared-synchronized deletTableSync()V
    .locals 6

    monitor-enter p0

    .line 94
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DROP TABLE  IF EXISTS  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->mTableName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 96
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_1
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    goto :goto_0

    .line 97
    :catch_0
    move-exception v5

    .line 98
    const-string v0, "Debug_DB_LogBinBase"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    goto :goto_0

    .line 99
    :catch_1
    move-exception v5

    .line 100
    const-string v0, "Debug_DB_LogBinBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method private desEncrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 186
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 188
    const/4 v0, 0x0

    return-object v0

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->getKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized getCountSync()J
    .locals 6

    monitor-enter p0

    .line 151
    const-string v0, "Debug_DB_LogBinBase"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getCount() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "select count(*) from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->mTableName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 153
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    .line 154
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 155
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 156
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method private getLogTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/LogTable;>;"
        }
    .end annotation

    .line 161
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 163
    const-string v0, "Debug_DB_LogBinBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const/4 v0, 0x0

    return-object v0

    .line 166
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 167
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/LogTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;-><init>()V

    .line 170
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setId(J)V

    .line 171
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setLocalUserDeviceCode(I)V

    .line 172
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setActionCode(I)V

    .line 173
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setReferData(Ljava/lang/String;)V

    .line 174
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setCreateTime(J)V

    .line 175
    const/4 v0, 0x5

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setErrorInfo(Ljava/lang/String;)V

    .line 176
    const/4 v0, 0x6

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setDataType(I)V

    .line 177
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setLastModifyVersion(J)V

    .line 178
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    goto :goto_0

    .line 180
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 181
    return-object v4
.end method

.method private declared-synchronized getMoreSync(I)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/LogTable;>;"
        }
    .end annotation

    monitor-enter p0

    .line 126
    const-string v0, "Debug_DB_LogBinBase"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getMore(int count) count = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_id  limit 0,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 128
    const-string v0, "Debug_DB_LogBinBase"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " orderBy = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->mTableName:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->columns:[Ljava/lang/String;

    move-object v7, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 130
    invoke-direct {p0, v9}, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->getLogTables(Landroid/database/Cursor;)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public delet(Lcom/huawei/hihealthservice/old/db/dao/LogTable;)I
    .locals 1

    .line 105
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->deletSync(Lcom/huawei/hihealthservice/old/db/dao/LogTable;)I

    move-result v0

    return v0
.end method

.method public deletTable()V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->deletTableSync()V

    .line 90
    return-void
.end method

.method public getCount()J
    .locals 2

    .line 146
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->getCountSync()J

    move-result-wide v0

    return-wide v0
.end method

.method public getMore(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/LogTable;>;"
        }
    .end annotation

    .line 121
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->getMoreSync(I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
