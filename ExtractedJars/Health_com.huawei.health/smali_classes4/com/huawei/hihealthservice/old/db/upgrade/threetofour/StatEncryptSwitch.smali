.class public Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;
.super Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;
.source "SourceFile"


# static fields
.field public static final ALL:I = 0x1

.field private static final Column_createTime:Ljava/lang/String; = "createTime"

.field private static final Column_lastModifyVersion:Ljava/lang/String; = "lastModifyVersion"

.field private static final Column_statData:Ljava/lang/String; = "statData"

.field private static final Column_timespan:Ljava/lang/String; = "timespan"

.field public static final DAY:I = 0x5

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_StatEncryptSwitch"

.field public static final MONTH:I = 0x3

.field public static final YEAR:I = 0x2

.field private static final columns:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 109
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "timespan"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "statData"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "createTime"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "lastModifyVersion"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->columns:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 116
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    return-void
.end method

.method private getContentValues(Lcom/huawei/hihealthservice/old/db/dao/StatTable;)Landroid/content/ContentValues;
    .locals 4

    .line 161
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x4

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 162
    const-string v0, "statData"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->getStatData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    const-string v0, "timespan"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->getTimespan()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 164
    const-string v0, "createTime"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 165
    const-string v0, "lastModifyVersion"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->getLastModifyVersion()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 166
    return-object v3
.end method

.method private getMore(Ljava/lang/String;JI)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;JI)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/StatTable;>;"
        }
    .end annotation

    .line 139
    const-string v0, "Debug_DB_StatEncryptSwitch"

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

    .line 144
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "timespan  limit "

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

    .line 145
    const-string v0, "Debug_DB_StatEncryptSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " orderBy = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    move-object v1, p1

    sget-object v2, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->columns:[Ljava/lang/String;

    move-object v7, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 147
    invoke-direct {p0, v9}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->getStatTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private getStatTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/StatTable;>;"
        }
    .end annotation

    .line 171
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 173
    const-string v0, "Debug_DB_StatEncryptSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const/4 v0, 0x0

    return-object v0

    .line 177
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 178
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 180
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/StatTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;-><init>()V

    .line 182
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->setTimespan(I)V

    .line 183
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->setStatData(Ljava/lang/String;)V

    .line 184
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->setCreateTime(J)V

    .line 185
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->setLastModifyVersion(J)V

    .line 186
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    goto :goto_0

    .line 188
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 189
    return-object v4
.end method

.method private update(Ljava/lang/String;Lcom/huawei/hihealthservice/old/db/dao/StatTable;)I
    .locals 7

    .line 152
    const-string v0, "Debug_DB_StatEncryptSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update(StatTable t)   t= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    invoke-direct {p0, p2}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/StatTable;)Landroid/content/ContentValues;

    move-result-object v4

    .line 154
    const-string v5, "timespan=?"

    .line 155
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->getTimespan()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 156
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method


# virtual methods
.method public encryptSwitch(Ljava/lang/String;)V
    .locals 7

    .line 121
    const-wide/16 v2, 0x0

    .line 122
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->count:I

    invoke-direct {p0, p1, v2, v3, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->getMore(Ljava/lang/String;JI)Ljava/util/List;

    move-result-object v4

    .line 123
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 125
    const/4 v5, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 127
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealthservice/old/db/dao/StatTable;

    .line 128
    invoke-direct {p0, p1, v6}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->update(Ljava/lang/String;Lcom/huawei/hihealthservice/old/db/dao/StatTable;)I

    .line 125
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 130
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->count:I

    int-to-long v0, v0

    add-long/2addr v2, v0

    .line 131
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->count:I

    invoke-direct {p0, p1, v2, v3, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->getMore(Ljava/lang/String;JI)Ljava/util/List;

    move-result-object v4

    goto :goto_0

    .line 133
    :cond_1
    return-void
.end method
