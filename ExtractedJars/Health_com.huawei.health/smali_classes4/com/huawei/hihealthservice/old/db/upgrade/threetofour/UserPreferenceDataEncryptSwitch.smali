.class public Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;
.super Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;
.source "SourceFile"


# static fields
.field private static final Column_createTime:Ljava/lang/String; = "createTime"

.field private static final Column_data:Ljava/lang/String; = "data"

.field private static final Column_huid:Ljava/lang/String; = "huid "

.field private static final Column_lastModifyTime:Ljava/lang/String; = "lastModifyTime"

.field private static final Column_type:Ljava/lang/String; = "type"

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_UserPreferenceDataEncryptSwitch"

.field private static final TABLE_NAME:Ljava/lang/String; = "user_preference_data"

.field private static final columns:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 65
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

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->columns:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    return-void
.end method

.method private getContentValues(Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;)Landroid/content/ContentValues;
    .locals 4

    .line 142
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x5

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 143
    const-string v0, "huid "

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->getHuid()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 144
    const-string v0, "type"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    const-string v0, "data"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const-string v0, "createTime"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 147
    const-string v0, "lastModifyTime"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->getLastModifyTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 148
    return-object v3
.end method

.method private getMore(JI)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;>;"
        }
    .end annotation

    .line 92
    const-string v0, "Debug_DB_UserPreferenceDataEncryptSwitch"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getMore(long startIndex ,int count) count = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",startIndex="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid   limit "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 98
    const-string v0, "Debug_DB_UserPreferenceDataEncryptSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " orderBy = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "user_preference_data"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->columns:[Ljava/lang/String;

    move-object v7, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 100
    invoke-direct {p0, v9}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->getPreferenceDataTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private getPreferenceDataTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;>;"
        }
    .end annotation

    .line 120
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 122
    const-string v0, "Debug_DB_UserPreferenceDataEncryptSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    const/4 v0, 0x0

    return-object v0

    .line 125
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 126
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 128
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;-><init>()V

    .line 129
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->setHuid(J)V

    .line 130
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->setType(Ljava/lang/String;)V

    .line 131
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->setData(Ljava/lang/String;)V

    .line 132
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->setCreateTime(J)V

    .line 133
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->setLastModifyTime(J)V

    .line 134
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    goto :goto_0

    .line 136
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 137
    return-object v4
.end method

.method private declared-synchronized updateSync(Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;)I
    .locals 9

    monitor-enter p0

    .line 109
    const-string v0, "Debug_DB_UserPreferenceDataEncryptSwitch"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update(PreferenceDataTable t)  t= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;)Landroid/content/ContentValues;

    move-result-object v4

    .line 111
    const-string v5, "huid =? and type=?"

    .line 113
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->getHuid()J

    move-result-wide v6

    .line 114
    const/4 v0, 0x2

    new-array v8, v0, [Ljava/lang/String;

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->getType()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 115
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "user_preference_data"

    invoke-virtual {v0, v1, v4, v5, v8}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
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


# virtual methods
.method public encryptSwitch()V
    .locals 7

    .line 76
    const-wide/16 v2, 0x0

    .line 77
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->count:I

    invoke-direct {p0, v2, v3, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->getMore(JI)Ljava/util/List;

    move-result-object v4

    .line 78
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 80
    const/4 v5, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 82
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;

    .line 83
    invoke-virtual {p0, v6}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->update(Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;)I

    .line 80
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 85
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->count:I

    int-to-long v0, v0

    add-long/2addr v2, v0

    .line 86
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->count:I

    invoke-direct {p0, v2, v3, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->getMore(JI)Ljava/util/List;

    move-result-object v4

    goto :goto_0

    .line 88
    :cond_1
    return-void
.end method

.method public update(Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;)I
    .locals 1

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->updateSync(Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;)I

    move-result v0

    return v0
.end method
