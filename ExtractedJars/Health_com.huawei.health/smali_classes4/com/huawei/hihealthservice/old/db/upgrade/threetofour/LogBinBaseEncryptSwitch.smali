.class public Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;
.super Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;
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

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_LogBinBaseEncryptSwitch"

.field private static final columns:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 77
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

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->columns:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 82
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    return-void
.end method

.method private getContentValues(Lcom/huawei/hihealthservice/old/db/dao/LogTable;)Landroid/content/ContentValues;
    .locals 4

    .line 150
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x7

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 151
    const-string v0, "actionCode"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getActionCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 152
    const-string v0, "createTime"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 154
    const-string v0, "localUserDeviceCode"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getLocalUserDeviceCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 155
    const-string v0, "referData"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getReferData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const-string v0, "errorInfo"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getErrorInfo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const-string v0, "dataType"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getDataType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 158
    const-string v0, "lastModifyVersion"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getLastModifyVersion()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 159
    return-object v3
.end method

.method private getLogTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/LogTable;>;"
        }
    .end annotation

    .line 127
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 128
    const-string v0, "Debug_DB_LogBinBaseEncryptSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const/4 v0, 0x0

    return-object v0

    .line 131
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 132
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/LogTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;-><init>()V

    .line 134
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setId(J)V

    .line 135
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setLocalUserDeviceCode(I)V

    .line 136
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setActionCode(I)V

    .line 137
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setReferData(Ljava/lang/String;)V

    .line 138
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setCreateTime(J)V

    .line 139
    const/4 v0, 0x5

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setErrorInfo(Ljava/lang/String;)V

    .line 140
    const/4 v0, 0x6

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setDataType(I)V

    .line 141
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->setLastModifyVersion(J)V

    .line 142
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    goto :goto_0

    .line 144
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 145
    return-object v4
.end method

.method private getMore(Ljava/lang/String;JI)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;JI)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/LogTable;>;"
        }
    .end annotation

    .line 103
    const-string v0, "Debug_DB_LogBinBaseEncryptSwitch"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getMore(long startIndex ,int count) count = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",startIndex="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_id  limit "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 109
    const-string v0, "Debug_DB_LogBinBaseEncryptSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " orderBy = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    move-object v1, p1

    sget-object v2, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->columns:[Ljava/lang/String;

    move-object v7, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 111
    invoke-direct {p0, v9}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->getLogTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private update(Ljava/lang/String;Lcom/huawei/hihealthservice/old/db/dao/LogTable;)I
    .locals 7

    .line 116
    const-string v0, "Debug_DB_LogBinBaseEncryptSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " updateLeft(LogTable logTableLast)  logTableLast = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    const-string v4, "_id=?"

    .line 118
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 119
    const-string v0, "Debug_DB_LogBinBaseEncryptSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " whereClause = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const-string v0, "Debug_DB_LogBinBaseEncryptSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " whereArgs = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    invoke-direct {p0, p2}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/LogTable;)Landroid/content/ContentValues;

    move-result-object v6

    .line 122
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, v6, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method


# virtual methods
.method public encryptSwitch(Ljava/lang/String;)V
    .locals 7

    .line 87
    const-wide/16 v2, 0x0

    .line 88
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->count:I

    invoke-direct {p0, p1, v2, v3, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->getMore(Ljava/lang/String;JI)Ljava/util/List;

    move-result-object v4

    .line 89
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 91
    const/4 v5, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 93
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealthservice/old/db/dao/LogTable;

    .line 94
    invoke-direct {p0, p1, v6}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->update(Ljava/lang/String;Lcom/huawei/hihealthservice/old/db/dao/LogTable;)I

    .line 91
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 96
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->count:I

    int-to-long v0, v0

    add-long/2addr v2, v0

    .line 97
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->count:I

    invoke-direct {p0, p1, v2, v3, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->getMore(Ljava/lang/String;JI)Ljava/util/List;

    move-result-object v4

    goto :goto_0

    .line 99
    :cond_1
    return-void
.end method
