.class public Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final Column_createTime:Ljava/lang/String; = "createTime"

.field private static final Column_data:Ljava/lang/String; = "data"

.field private static final Column_huid:Ljava/lang/String; = "huid "

.field private static final Column_lastModifyTime:Ljava/lang/String; = "lastModifyTime"

.field private static final Column_type:Ljava/lang/String; = "type"

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_UserPreferenceData"

.field public static final TABLE_NAME:Ljava/lang/String; = "user_preference_data"

.field private static final columns:[Ljava/lang/String;


# instance fields
.field private mContext:Landroid/content/Context;

.field private writableDatabase:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 67
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "huid "

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "type"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "data"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "createTime"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "lastModifyTime"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->columns:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->mContext:Landroid/content/Context;

    .line 77
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 78
    return-void
.end method

.method private declared-synchronized deletTableSync()V
    .locals 6

    monitor-enter p0

    .line 86
    const-string v4, "DROP TABLE  IF EXISTS  user_preference_data"

    .line 88
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    goto :goto_0

    .line 89
    :catch_0
    move-exception v5

    .line 90
    const-string v0, "Debug_DB_UserPreferenceData"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    goto :goto_0

    .line 91
    :catch_1
    move-exception v5

    .line 92
    const-string v0, "Debug_DB_UserPreferenceData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
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

    .line 166
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->getKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized getAllSync()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;>;"
        }
    .end annotation

    monitor-enter p0

    .line 102
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "user_preference_data"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->columns:[Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 103
    invoke-direct {p0, v8}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->getPreferenceDataTables(Landroid/database/Cursor;)Ljava/util/List;
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

.method private declared-synchronized getLastHuidSync()J
    .locals 13

    monitor-enter p0

    .line 112
    const-string v8, "huid  >? "

    .line 113
    const/4 v0, 0x1

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 114
    const-string v10, "lastModifyTime desc limit 0,1"

    .line 115
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "user_preference_data"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->columns:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    move-object v7, v10

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 116
    invoke-direct {p0, v11}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->getPreferenceDataTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v12

    .line 117
    const/4 v0, 0x0

    if-eq v0, v12, :cond_0

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 119
    :cond_0
    monitor-exit p0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 121
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->getHuid()J
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

.method private getPreferenceDataTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;>;"
        }
    .end annotation

    .line 144
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 146
    const-string v0, "Debug_DB_UserPreferenceData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const/4 v0, 0x0

    return-object v0

    .line 149
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 150
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;-><init>()V

    .line 153
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->setHuid(J)V

    .line 154
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->setType(Ljava/lang/String;)V

    .line 155
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->setData(Ljava/lang/String;)V

    .line 156
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->setCreateTime(J)V

    .line 157
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->setLastModifyTime(J)V

    .line 158
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    goto :goto_0

    .line 160
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 161
    return-object v4
.end method

.method private declared-synchronized getSync(JLjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;
    .locals 12

    monitor-enter p0

    .line 130
    const-string v0, "Debug_DB_UserPreferenceData"

    const/4 v1, 0x4

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get(String huid,String type)  huid= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", type = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    const-string v8, "huid =? and type=?"

    .line 132
    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    const/4 v0, 0x1

    aput-object p3, v9, v0

    .line 133
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "user_preference_data"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->columns:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 134
    invoke-direct {p0, v10}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->getPreferenceDataTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v11

    .line 135
    const/4 v0, 0x0

    if-eq v0, v11, :cond_0

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 137
    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 139
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public deletTable()V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->deletTableSync()V

    .line 82
    return-void
.end method

.method public get(JLjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;
    .locals 1

    .line 125
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->getSync(JLjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;

    move-result-object v0

    return-object v0
.end method

.method public getAll()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;>;"
        }
    .end annotation

    .line 97
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->getAllSync()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getLastHuid()J
    .locals 2

    .line 107
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->getLastHuidSync()J

    move-result-wide v0

    return-wide v0
.end method
