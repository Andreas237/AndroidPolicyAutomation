.class public Lcom/huawei/hihealthservice/old/db/dao/Data;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "HiH_Data"


# instance fields
.field private Column_createTime:Ljava/lang/String;

.field private Column_data:Ljava/lang/String;

.field private Column_lastModifyVersion:Ljava/lang/String;

.field private Column_recordDay:Ljava/lang/String;

.field private Column_timeZone:Ljava/lang/String;

.field private columns:[Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private mTableName:Ljava/lang/String;

.field private type:I

.field private writableDatabase:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 3

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const-string v0, "recordDay"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_recordDay:Ljava/lang/String;

    .line 55
    const-string v0, "data"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_data:Ljava/lang/String;

    .line 57
    const-string v0, "timeZone"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_timeZone:Ljava/lang/String;

    .line 59
    const-string v0, "createTime"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_createTime:Ljava/lang/String;

    .line 61
    const-string v0, "lastModifyVersion"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_lastModifyVersion:Ljava/lang/String;

    .line 63
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_recordDay:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_data:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_timeZone:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_createTime:Ljava/lang/String;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_lastModifyVersion:Ljava/lang/String;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->columns:[Ljava/lang/String;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->mContext:Landroid/content/Context;

    .line 76
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->mContext:Landroid/content/Context;

    .line 77
    iput-object p2, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->mTableName:Ljava/lang/String;

    .line 78
    iput p3, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->type:I

    .line 79
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 80
    return-void
.end method

.method private declared-synchronized deletTableSync()V
    .locals 6

    monitor-enter p0

    .line 92
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DROP TABLE  IF EXISTS  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/Data;->getTableName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 94
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_1
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    goto :goto_0

    .line 95
    :catch_0
    move-exception v5

    .line 96
    const-string v0, "HiH_Data"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    goto :goto_0

    .line 97
    :catch_1
    move-exception v5

    .line 98
    const-string v0, "HiH_Data"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
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

    .line 104
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->getKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getArray(Lcom/huawei/hihealthservice/old/db/dao/DataTable;)[Lcom/huawei/hihealthservice/old/model/HealthData;
    .locals 3

    .line 163
    const/4 v2, 0x0

    .line 164
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->getData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->isJsonData(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->type:I

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->getObject(ILjava/lang/String;)[Lcom/huawei/hihealthservice/old/model/HealthData;

    move-result-object v2

    goto :goto_0

    .line 170
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->type:I

    const/16 v1, 0x100

    if-ne v0, v1, :cond_1

    .line 172
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->getData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/SportDataUtil;->parseArraySportData(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/SportData;

    move-result-object v2

    goto :goto_0

    .line 175
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->type:I

    const/16 v1, 0x400

    if-ne v0, v1, :cond_2

    .line 178
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->getData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;->parseMotionPathArray(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/MotionPath;

    move-result-object v2

    goto :goto_0

    .line 181
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->type:I

    const/16 v1, 0x303

    if-ne v0, v1, :cond_3

    .line 184
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->getData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;->parseArrayMotionTimeLine(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/MotionTimeLine;

    move-result-object v2

    .line 188
    :cond_3
    :goto_0
    return-object v2
.end method

.method private getDataTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/DataTable;>;"
        }
    .end annotation

    .line 109
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 111
    const/4 v0, 0x0

    return-object v0

    .line 114
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 115
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 117
    new-instance v3, Lcom/huawei/hihealthservice/old/db/dao/DataTable;

    invoke-direct {v3}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;-><init>()V

    .line 118
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->setRecordDay(I)V

    .line 119
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/db/dao/Data;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->setData(Ljava/lang/String;)V

    .line 120
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 121
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 123
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->setTimeZone(Ljava/lang/Integer;)V

    goto :goto_1

    .line 127
    :cond_1
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->setTimeZone(Ljava/lang/Integer;)V

    .line 130
    :goto_1
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->setCreateTime(J)V

    .line 131
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->setLastModifyVersion(J)V

    .line 133
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    goto :goto_0

    .line 135
    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 136
    return-object v2
.end method

.method private getTableName()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->mTableName:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public deletTable()V
    .locals 0

    .line 87
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/Data;->deletTableSync()V

    .line 88
    return-void
.end method

.method public getAll()Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<[Lcom/huawei/hihealthservice/old/model/HealthData;>;"
        }
    .end annotation

    .line 142
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/Data;->getTableName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->columns:[Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_recordDay:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " DESC "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 144
    const/4 v9, 0x0

    .line 145
    invoke-direct {p0, v8}, Lcom/huawei/hihealthservice/old/db/dao/Data;->getDataTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v10

    .line 146
    const/4 v0, 0x0

    if-eq v0, v10, :cond_1

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 148
    new-instance v9, Ljava/util/ArrayList;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealthservice/old/db/dao/DataTable;

    .line 151
    invoke-direct {p0, v12}, Lcom/huawei/hihealthservice/old/db/dao/Data;->getArray(Lcom/huawei/hihealthservice/old/db/dao/DataTable;)[Lcom/huawei/hihealthservice/old/model/HealthData;

    move-result-object v13

    .line 152
    const/4 v0, 0x0

    if-eq v0, v13, :cond_0

    .line 154
    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    :cond_0
    goto :goto_0

    .line 158
    :cond_1
    return-object v9
.end method

.method public getDaysData(II)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<[Lcom/huawei/hihealthservice/old/model/HealthData;>;"
        }
    .end annotation

    .line 193
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_recordDay:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">=?  and  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_recordDay:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "<=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 194
    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    invoke-static/range {p2 .. p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hihealthservice/old/db/dao/Data;->Column_recordDay:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  DESC"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 197
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/old/db/dao/Data;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    invoke-direct/range {p0 .. p0}, Lcom/huawei/hihealthservice/old/db/dao/Data;->getTableName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/hihealthservice/old/db/dao/Data;->columns:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    move-object v7, v10

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 199
    const/4 v12, 0x0

    .line 200
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lcom/huawei/hihealthservice/old/db/dao/Data;->getDataTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v13

    .line 201
    const/4 v0, 0x0

    if-eq v0, v13, :cond_1

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 203
    new-instance v12, Ljava/util/ArrayList;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v12, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/hihealthservice/old/db/dao/DataTable;

    .line 206
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/huawei/hihealthservice/old/db/dao/Data;->getArray(Lcom/huawei/hihealthservice/old/db/dao/DataTable;)[Lcom/huawei/hihealthservice/old/model/HealthData;

    move-result-object v16

    .line 207
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_0

    .line 209
    move-object/from16 v0, v16

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    :cond_0
    goto :goto_0

    .line 213
    :cond_1
    return-object v12
.end method
