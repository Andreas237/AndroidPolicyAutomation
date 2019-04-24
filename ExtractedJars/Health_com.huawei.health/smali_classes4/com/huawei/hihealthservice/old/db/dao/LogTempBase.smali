.class public Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;
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

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_LogTempBase"

.field private static final TABLE_NAME:Ljava/lang/String; = "user_templog"

.field private static columns:[Ljava/lang/String; = null

.field public static final createTableSQL:Ljava/lang/String;


# instance fields
.field private mContext:Landroid/content/Context;

.field private writableDatabase:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 75
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

    sput-object v0, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->columns:[Ljava/lang/String;

    .line 85
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    const-string v0, "create table  IF NOT EXISTS user_templog("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    const-string v0, "_id integer primary key autoincrement,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    const-string v0, "localUserDeviceCode integer not null,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    const-string v0, "dataType integer not null,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    const-string v0, "actionCode integer not null,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    const-string v0, "referData varchar(100) not null,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    const-string v0, "createTime integer not null,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    const-string v0, "lastModifyVersion integer not null,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    const-string v0, "errorInfo varchar(100)"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->createTableSQL:Ljava/lang/String;

    .line 97
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->mContext:Landroid/content/Context;

    .line 104
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 105
    return-void
.end method

.method private addLeft(Lcom/huawei/hihealthservice/old/db/dao/LogTable;)J
    .locals 7

    .line 144
    const-string v0, "Debug_DB_LogTempBase"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " addLeft(LogTable t)  t = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/LogTable;)Landroid/content/ContentValues;

    move-result-object v4

    .line 146
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "user_templog"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v5

    .line 147
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v5

    if-ltz v0, :cond_0

    .line 149
    const-string v0, "Debug_DB_LogTempBase"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert 0 >= insert : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    :cond_0
    return-wide v5
.end method

.method private desEncrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->getKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private encrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 203
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->getKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized getAllSync()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/LogTable;>;"
        }
    .end annotation

    monitor-enter p0

    .line 160
    const-string v0, "Debug_DB_LogTempBase"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getAll()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "user_templog"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->columns:[Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 162
    invoke-direct {p0, v8}, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->getLogTables(Landroid/database/Cursor;)Ljava/util/List;
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

.method private getContentValues(Lcom/huawei/hihealthservice/old/db/dao/LogTable;)Landroid/content/ContentValues;
    .locals 4

    .line 189
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x7

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 190
    const-string v0, "actionCode"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getActionCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 191
    const-string v0, "createTime"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 193
    const-string v0, "localUserDeviceCode"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getLocalUserDeviceCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 194
    const-string v0, "referData"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getReferData()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    const-string v0, "errorInfo"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getErrorInfo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    const-string v0, "dataType"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getDataType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 197
    const-string v0, "lastModifyVersion"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getLastModifyVersion()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 198
    return-object v3
.end method

.method private getLogTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/LogTable;>;"
        }
    .end annotation

    .line 166
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 167
    const-string v0, "Debug_DB_LogTempBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    const/4 v0, 0x0

    return-object v0

    .line 170
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 171
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 172
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/LogTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;-><init>()V

    .line 173
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setId(J)V

    .line 174
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setLocalUserDeviceCode(I)V

    .line 175
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setActionCode(I)V

    .line 176
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setReferData(Ljava/lang/String;)V

    .line 177
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setCreateTime(J)V

    .line 178
    const/4 v0, 0x5

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setErrorInfo(Ljava/lang/String;)V

    .line 179
    const/4 v0, 0x6

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setDataType(I)V

    .line 180
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setLastModifyVersion(J)V

    .line 181
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    goto :goto_0

    .line 183
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 184
    return-object v4
.end method

.method private declared-synchronized saveSync(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/hihealthservice/old/model/HealthData;>;)V"
        }
    .end annotation

    monitor-enter p0

    .line 113
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealthservice/old/model/HealthData;

    .line 115
    const/4 v5, 0x0

    .line 116
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, [Ljava/lang/Object;

    .line 117
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    .line 118
    instance-of v0, v4, Lcom/huawei/hihealthservice/old/model/SportData;

    if-eqz v0, :cond_0

    .line 120
    move-object v0, v6

    check-cast v0, [Lcom/huawei/hihealthservice/old/model/SportData;

    check-cast v0, [Lcom/huawei/hihealthservice/old/model/SportData;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/SportDataUtil;->getByteArraySportData([Lcom/huawei/hihealthservice/old/model/SportData;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 122
    :cond_0
    instance-of v0, v4, Lcom/huawei/hihealthservice/old/model/MotionPath;

    if-eqz v0, :cond_1

    .line 124
    move-object v0, v6

    check-cast v0, [Lcom/huawei/hihealthservice/old/model/MotionPath;

    check-cast v0, [Lcom/huawei/hihealthservice/old/model/MotionPath;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;->getByteMotionPathArray([Lcom/huawei/hihealthservice/old/model/MotionPath;)Ljava/lang/String;

    move-result-object v5

    .line 128
    :cond_1
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 130
    const-string v0, "Debug_DB_LogTempBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == json"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    monitor-exit p0

    return-void

    .line 133
    :cond_2
    new-instance v7, Lcom/huawei/hihealthservice/old/db/dao/LogTable;

    invoke-direct {v7}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;-><init>()V

    .line 134
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setActionCode(I)V

    .line 135
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setCreateTime(J)V

    .line 136
    invoke-virtual {v4}, Lcom/huawei/hihealthservice/old/model/HealthData;->getType()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setDataType(I)V

    .line 137
    invoke-virtual {v7, v5}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setReferData(Ljava/lang/String;)V

    .line 138
    invoke-direct {p0, v7}, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->addLeft(Lcom/huawei/hihealthservice/old/db/dao/LogTable;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public getAll()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/LogTable;>;"
        }
    .end annotation

    .line 155
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->getAllSync()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public save(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/hihealthservice/old/model/HealthData;>;)V"
        }
    .end annotation

    .line 108
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->saveSync(Ljava/util/ArrayList;)V

    .line 109
    return-void
.end method
