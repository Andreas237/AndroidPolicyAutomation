.class public Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;
.super Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;
.source "SourceFile"


# static fields
.field private static final Column_createTime:Ljava/lang/String; = "createTime"

.field private static final Column_data:Ljava/lang/String; = "data"

.field private static final Column_key:Ljava/lang/String; = "key"

.field private static final Column_lastModifyTime:Ljava/lang/String; = "lastModifyTime"

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_SystemPropertyDataEncryptSwitch"

.field private static final TABLE_NAME:Ljava/lang/String; = "system_property_data"

.field private static final columns:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 60
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "key"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "data"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "createTime"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "lastModifyTime"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;->columns:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    return-void
.end method

.method private getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;
    .locals 4

    .line 135
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x4

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 136
    const-string v0, "key"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v0, "data"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    const-string v0, "createTime"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 139
    const-string v0, "lastModifyTime"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getLastModifyTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 140
    return-object v3
.end method

.method private getLeft(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;
    .locals 13

    .line 94
    const-string v0, "Debug_DB_SystemPropertyDataEncryptSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLeft(String key)  key= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    const-string v8, "key=?"

    .line 96
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v9, v0

    .line 100
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "system_property_data"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;->columns:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 102
    const/4 v11, 0x0

    .line 103
    invoke-direct {p0, v10}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;->getSystemPropertyDataTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v12

    .line 104
    const/4 v0, 0x0

    if-eq v0, v12, :cond_0

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    const/4 v0, 0x0

    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    .line 108
    :cond_0
    return-object v11
.end method

.method private getSystemPropertyDataTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;>;"
        }
    .end annotation

    .line 113
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 115
    const-string v0, "Debug_DB_SystemPropertyDataEncryptSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    const/4 v0, 0x0

    return-object v0

    .line 118
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 119
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 122
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;-><init>()V

    .line 123
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setData(Ljava/lang/String;)V

    .line 124
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setKey(Ljava/lang/String;)V

    .line 125
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setCreateTime(J)V

    .line 126
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setLastModifyTime(J)V

    .line 127
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    goto :goto_0

    .line 129
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 130
    return-object v4
.end method

.method private update(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)I
    .locals 8

    .line 80
    const-string v0, "Debug_DB_SystemPropertyDataEncryptSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update(SystemPropertyDataTable t)  t= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;

    move-result-object v4

    .line 82
    const-string v5, "key=?"

    .line 83
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getKey()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 84
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "system_property_data"

    invoke-virtual {v0, v1, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7

    .line 85
    const/4 v0, 0x0

    if-lt v0, v7, :cond_0

    .line 87
    const-string v0, "Debug_DB_SystemPropertyDataEncryptSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update 0 >= update : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    :cond_0
    return v7
.end method


# virtual methods
.method public encryptSwitchAccount()V
    .locals 2

    .line 70
    const-string v0, "Account"

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;->getLeft(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    move-result-object v1

    .line 71
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 73
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setData(Ljava/lang/String;)V

    .line 74
    invoke-direct {p0, v1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;->update(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)I

    .line 76
    :cond_0
    return-void
.end method
