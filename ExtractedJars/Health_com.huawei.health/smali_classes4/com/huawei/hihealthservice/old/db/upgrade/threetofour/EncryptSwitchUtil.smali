.class public abstract Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitchUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_EncryptSwitchUtil"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static addKey(Landroid/database/sqlite/SQLiteDatabase;)J
    .locals 10

    .line 172
    new-instance v4, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    invoke-direct {v4}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;-><init>()V

    .line 173
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/RootKeyUtil_6_7;->genRandBytes(I)[B

    move-result-object v5

    .line 174
    const/4 v0, 0x0

    invoke-static {v5, v0}, Lcom/huawei/hihealthservice/old/util/HEX;->encode([BI)Ljava/lang/String;

    move-result-object v6

    .line 175
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setCreateTime(J)V

    .line 176
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setData(Ljava/lang/String;)V

    .line 177
    const-string v0, "AES_CBC"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setKey(Ljava/lang/String;)V

    .line 178
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setLastModifyTime(J)V

    .line 179
    const-string v0, "Debug_DB_EncryptSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addKey systemPropertyDataTable = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitchUtil;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;

    move-result-object v7

    .line 181
    const-string v0, "system_property_data"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v7}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v8

    .line 182
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v8

    if-ltz v0, :cond_0

    .line 184
    const-string v0, "Debug_DB_EncryptSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "add 0 >= insert : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    :cond_0
    return-wide v8
.end method

.method private static dataEncryptSwitchFun(Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;)V
    .locals 6
    .param p0    # Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 99
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchName()Ljava/lang/String;

    move-result-object v1

    .line 100
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchmContext()Landroid/content/Context;

    move-result-object v2

    .line 101
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 102
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchEncryptKey()Ljava/lang/String;

    move-result-object v4

    .line 103
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchDesEncrypt()Ljava/lang/String;

    move-result-object v5

    .line 104
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 105
    new-instance p1, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;

    invoke-direct {p1, v2, v3, v4, v5}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    :cond_0
    invoke-virtual {p1, v1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->encryptSwitch(Ljava/lang/String;)V

    .line 108
    return-void
.end method

.method private static getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;
    .locals 4

    .line 190
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x4

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 191
    const-string v0, "key"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    const-string v0, "data"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const-string v0, "createTime"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 194
    const-string v0, "lastModifyTime"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getLastModifyTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 195
    return-object v3
.end method

.method private static getKey(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 145
    const-string v0, "Debug_DB_EncryptSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getKey(String key)  key= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    const-string v8, "key=?"

    .line 147
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v9, v0

    .line 148
    const/4 v0, 0x1

    new-array v10, v0, [Ljava/lang/String;

    const-string v0, "data"

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 149
    move-object v0, p0

    const-string v1, "system_property_data"

    move-object v2, v10

    move-object v3, v8

    move-object v4, v9

    .line 150
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 158
    const/4 v0, 0x0

    if-ne v0, v11, :cond_0

    .line 160
    const-string v0, "Debug_DB_EncryptSwitchUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const/4 v0, 0x0

    return-object v0

    .line 163
    :cond_0
    const/4 v12, 0x0

    .line 164
    :goto_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 166
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_0

    .line 168
    :cond_1
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 169
    return-object v12
.end method

.method private static isNameNotEqualmetadataAndSequence(Ljava/lang/String;)Z
    .locals 1

    .line 91
    const-string v0, "android_metadata"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "sqlite_sequence"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static isdataEncryptSwitch(Ljava/lang/String;)Z
    .locals 1

    .line 111
    const-string v0, "_data"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "user_preference_data"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "system_property_data"

    .line 112
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "device_setting_data"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 111
    :goto_0
    return v0
.end method

.method private static islogBinBaseEncryptSwitch(Ljava/lang/String;)Z
    .locals 1

    .line 140
    const-string v0, "_binlog"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "user_templog"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static issqliteTablesHasTable(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 95
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static logBinBaseEncryptSwitchFun(Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;)V
    .locals 6
    .param p0    # Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 128
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchName()Ljava/lang/String;

    move-result-object v1

    .line 129
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchmContext()Landroid/content/Context;

    move-result-object v2

    .line 130
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 131
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchEncryptKey()Ljava/lang/String;

    move-result-object v4

    .line 132
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchDesEncrypt()Ljava/lang/String;

    move-result-object v5

    .line 133
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 134
    new-instance p1, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;

    invoke-direct {p1, v2, v3, v4, v5}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    :cond_0
    invoke-virtual {p1, v1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->encryptSwitch(Ljava/lang/String;)V

    .line 137
    return-void
.end method

.method public static newVerSion3to4(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/util/List;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 26
    invoke-static/range {p2 .. p2}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitchUtil;->issqliteTablesHasTable(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v9, 0x0

    .line 32
    const-string v0, "CBC"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitchUtil;->getKey(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 33
    const/4 v0, 0x0

    if-ne v0, v10, :cond_0

    .line 35
    return-void

    .line 37
    :cond_0
    invoke-static/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitchUtil;->addKey(Landroid/database/sqlite/SQLiteDatabase;)J

    .line 38
    const-string v0, "AES_CBC"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitchUtil;->getKey(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 39
    const/4 v12, 0x0

    :goto_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_8

    .line 42
    move-object/from16 v0, p2

    :try_start_0
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/String;

    .line 43
    new-instance v0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;-><init>()V

    move-object v14, v0

    .line 44
    move-object/from16 v0, p1

    invoke-virtual {v14, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->configDatabase(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 45
    invoke-virtual {v14, v10}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->configDesEncrypt(Ljava/lang/String;)V

    .line 46
    invoke-virtual {v14, v11}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->configEncryptKey(Ljava/lang/String;)V

    .line 47
    move-object/from16 v0, p0

    invoke-virtual {v14, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->configmContext(Landroid/content/Context;)V

    .line 48
    invoke-virtual {v14, v13}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->configName(Ljava/lang/String;)V

    .line 49
    invoke-static {v13}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitchUtil;->isNameNotEqualmetadataAndSequence(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 50
    const-string v0, "Debug_DB_EncryptSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start name = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    const/4 v0, 0x0

    if-ne v0, v13, :cond_1

    .line 52
    goto/16 :goto_2

    .line 54
    :cond_1
    :try_start_1
    invoke-static {v13}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitchUtil;->isdataEncryptSwitch(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 55
    invoke-static {v14, v8}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitchUtil;->dataEncryptSwitchFun(Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;)V

    goto :goto_1

    .line 57
    :cond_2
    const-string v0, "_stat"

    invoke-virtual {v13, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 58
    invoke-static {v14, v9}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitchUtil;->statEncryptSwitchFun(Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;)V

    goto :goto_1

    .line 60
    :cond_3
    invoke-static {v13}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitchUtil;->islogBinBaseEncryptSwitch(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 61
    invoke-static {v14, v7}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitchUtil;->logBinBaseEncryptSwitchFun(Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;)V

    goto :goto_1

    .line 63
    :cond_4
    const-string v0, "system_property_data"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 64
    new-instance v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v11

    move-object v4, v10

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    .line 66
    invoke-virtual {v15}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;->encryptSwitchAccount()V

    .line 67
    goto :goto_1

    .line 68
    :cond_5
    const-string v0, "user_preference_data"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 69
    new-instance v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v11

    move-object v4, v10

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    .line 71
    invoke-virtual {v15}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->encryptSwitch()V

    .line 72
    goto :goto_1

    .line 74
    :cond_6
    const-string v0, "Debug_DB_EncryptSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newVerSion3to4 name is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    :goto_1
    const-string v0, "Debug_DB_EncryptSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end name is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    :cond_7
    goto :goto_2

    .line 79
    :catch_0
    move-exception v13

    .line 82
    const-string v0, "Debug_DB_EncryptSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v13}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "EncryptSwitchUtil.class"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    :goto_2
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 86
    :cond_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 87
    const-string v0, "Debug_DB_EncryptSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newVerSion3to4  time= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v7, v5

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    return-void
.end method

.method private static statEncryptSwitchFun(Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;)V
    .locals 6
    .param p0    # Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 116
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchName()Ljava/lang/String;

    move-result-object v1

    .line 117
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchmContext()Landroid/content/Context;

    move-result-object v2

    .line 118
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 119
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchEncryptKey()Ljava/lang/String;

    move-result-object v4

    .line 120
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchDesEncrypt()Ljava/lang/String;

    move-result-object v5

    .line 121
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 122
    new-instance p1, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;

    invoke-direct {p1, v2, v3, v4, v5}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    :cond_0
    invoke-virtual {p1, v1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->encryptSwitch(Ljava/lang/String;)V

    .line 125
    return-void
.end method
