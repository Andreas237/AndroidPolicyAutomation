.class public Lcom/huawei/hihealthservice/old/db/dao/Stat;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ALL:I = 0x1

.field private static final Column_createTime:Ljava/lang/String; = "createTime"

.field private static final Column_lastModifyVersion:Ljava/lang/String; = "lastModifyVersion"

.field private static final Column_statData:Ljava/lang/String; = "statData"

.field private static final Column_timespan:Ljava/lang/String; = "timespan"

.field public static final DAY:I = 0x5

.field public static final DAY_SPAN:I = 0x1dcd6500

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_Stat"

.field public static final MONTH:I = 0x3

.field public static final WEEK:I = 0x4

.field public static final YEAR:I = 0x2

.field private static final columns:[Ljava/lang/String;


# instance fields
.field private baseHelper:Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

.field private mContext:Landroid/content/Context;

.field private tableName:Ljava/lang/String;

.field private writableDatabase:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 103
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

    sput-object v0, Lcom/huawei/hihealthservice/old/db/dao/Stat;->columns:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Stat;->mContext:Landroid/content/Context;

    .line 116
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Stat;->mContext:Landroid/content/Context;

    .line 117
    iput-object p2, p0, Lcom/huawei/hihealthservice/old/db/dao/Stat;->tableName:Ljava/lang/String;

    .line 118
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Stat;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Stat;->baseHelper:Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    .line 119
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Stat;->baseHelper:Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Stat;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 120
    return-void
.end method

.method private declared-synchronized deletTableSync()V
    .locals 6

    monitor-enter p0

    .line 132
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DROP TABLE  IF EXISTS  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/Stat;->getTableName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 134
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Stat;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_1
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    goto :goto_0

    .line 135
    :catch_0
    move-exception v5

    .line 136
    const-string v0, "Debug_DB_Stat"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    goto :goto_0

    .line 137
    :catch_1
    move-exception v5

    .line 138
    const-string v0, "Debug_DB_Stat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 140
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

    .line 180
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 182
    const/4 v0, 0x0

    return-object v0

    .line 184
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Stat;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->getKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    .line 158
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 160
    const-string v0, "Debug_DB_Stat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const/4 v0, 0x0

    return-object v0

    .line 164
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 165
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 167
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/StatTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;-><init>()V

    .line 169
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->setTimespan(I)V

    .line 170
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/db/dao/Stat;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->setStatData(Ljava/lang/String;)V

    .line 171
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    goto :goto_0

    .line 173
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 174
    return-object v4
.end method


# virtual methods
.method public deletTable()V
    .locals 0

    .line 127
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/Stat;->deletTableSync()V

    .line 128
    return-void
.end method

.method public getDayStaAll()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/StatTable;>;"
        }
    .end annotation

    .line 143
    const-string v8, "timespan>=?"

    .line 144
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    const v0, 0x1dcd6500

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 145
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Stat;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 146
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/Stat;->getTableName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/huawei/hihealthservice/old/db/dao/Stat;->columns:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    const-string v7, "timespan DESC "

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 147
    invoke-direct {p0, v10}, Lcom/huawei/hihealthservice/old/db/dao/Stat;->getStatTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getTableName()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Stat;->tableName:Ljava/lang/String;

    return-object v0
.end method
