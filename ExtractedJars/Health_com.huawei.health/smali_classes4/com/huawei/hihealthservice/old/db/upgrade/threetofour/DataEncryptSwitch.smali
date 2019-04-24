.class public Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;
.super Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;
.source "SourceFile"


# static fields
.field private static final Column_createTime:Ljava/lang/String; = "createTime"

.field private static final Column_data:Ljava/lang/String; = "data"

.field private static final Column_lastModifyVersion:Ljava/lang/String; = "lastModifyVersion"

.field private static final Column_recordDay:Ljava/lang/String; = "recordDay"

.field private static final Column_timeZone:Ljava/lang/String; = "timeZone"

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_DataEncryptSwitch"

.field private static final columns:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 49
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "recordDay"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "data"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "timeZone"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "createTime"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "lastModifyVersion"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->columns:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    return-void
.end method

.method private getContentValues(Lcom/huawei/hihealthservice/old/db/dao/DataTable;)Landroid/content/ContentValues;
    .locals 4

    .line 134
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x5

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 135
    const-string v0, "recordDay"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->getRecordDay()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 136
    const-string v0, "data"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v0, "timeZone"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->getTimeZone()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 138
    const-string v0, "createTime"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 139
    const-string v0, "lastModifyVersion"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->getLastModifyVersion()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 140
    return-object v3
.end method

.method private getDataTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/DataTable;>;"
        }
    .end annotation

    .line 89
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 90
    const-string v0, "Debug_DB_DataEncryptSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    const/4 v0, 0x0

    return-object v0

    .line 93
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 94
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 96
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/DataTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;-><init>()V

    .line 97
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->setRecordDay(I)V

    .line 98
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->setData(Ljava/lang/String;)V

    .line 99
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 100
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 102
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->setTimeZone(Ljava/lang/Integer;)V

    goto :goto_1

    .line 106
    :cond_1
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->setTimeZone(Ljava/lang/Integer;)V

    .line 109
    :goto_1
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->setCreateTime(J)V

    .line 110
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->setLastModifyVersion(J)V

    .line 112
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    goto :goto_0

    .line 114
    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 115
    return-object v4
.end method

.method private getMore(Ljava/lang/String;JI)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;JI)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/DataTable;>;"
        }
    .end annotation

    .line 76
    const-string v0, "Debug_DB_DataEncryptSwitch"

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

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "recordDay  limit "

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

    .line 82
    const-string v0, "Debug_DB_DataEncryptSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " orderBy = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    move-object v1, p1

    sget-object v2, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->columns:[Ljava/lang/String;

    move-object v7, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 84
    invoke-direct {p0, v9}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->getDataTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private update(Ljava/lang/String;Lcom/huawei/hihealthservice/old/db/dao/DataTable;)I
    .locals 8

    .line 120
    const-string v0, "Debug_DB_DataEncryptSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update(DataTable t)  t = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    invoke-direct {p0, p2}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/DataTable;)Landroid/content/ContentValues;

    move-result-object v4

    .line 122
    const-string v5, "recordDay=?"

    .line 123
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->getRecordDay()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 124
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7

    .line 125
    const/4 v0, 0x0

    if-lt v0, v7, :cond_0

    .line 127
    const-string v0, "Debug_DB_DataEncryptSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update 0 >= update \uff1a "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    :cond_0
    return v7
.end method


# virtual methods
.method public encryptSwitch(Ljava/lang/String;)V
    .locals 7

    .line 60
    const-wide/16 v2, 0x0

    .line 61
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->count:I

    invoke-direct {p0, p1, v2, v3, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->getMore(Ljava/lang/String;JI)Ljava/util/List;

    move-result-object v4

    .line 62
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 64
    const/4 v5, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 66
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealthservice/old/db/dao/DataTable;

    .line 67
    invoke-direct {p0, p1, v6}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->update(Ljava/lang/String;Lcom/huawei/hihealthservice/old/db/dao/DataTable;)I

    .line 64
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 69
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->count:I

    int-to-long v0, v0

    add-long/2addr v2, v0

    .line 70
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->count:I

    invoke-direct {p0, p1, v2, v3, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->getMore(Ljava/lang/String;JI)Ljava/util/List;

    move-result-object v4

    goto :goto_0

    .line 72
    :cond_1
    return-void
.end method
