.class public abstract Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchUtilFourToFive;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_EncryptSwitchUtilFourToFive"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static dataEncryptSwitchFun(Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;)V
    .locals 9
    .param p0    # Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 110
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchName()Ljava/lang/String;

    move-result-object v4

    .line 111
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchmContext()Landroid/content/Context;

    move-result-object v5

    .line 112
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    .line 113
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchEncryptKey()Ljava/lang/String;

    move-result-object v7

    .line 114
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchDesEncrypt()Ljava/lang/String;

    move-result-object v8

    .line 115
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchUtilFourToFive;->isdataEncryptSwitch(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 116
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 117
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataEncryptSwitchFun  dataEncryptSwitch is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    new-instance p1, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;

    invoke-direct {p1, v5, v6, v7, v8}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    :cond_0
    invoke-virtual {p1, v4}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;->encryptSwitch(Ljava/lang/String;)V

    .line 122
    :cond_1
    return-void
.end method

.method private static getKey(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 159
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getKey(String key)  key is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    const-string v8, "key=?"

    .line 161
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v9, v0

    .line 162
    const/4 v0, 0x1

    new-array v10, v0, [Ljava/lang/String;

    const-string v0, "data"

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 163
    move-object v0, p0

    const-string v1, "system_property_data"

    move-object v2, v10

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 164
    const/4 v0, 0x0

    if-ne v0, v11, :cond_0

    .line 165
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    const/4 v0, 0x0

    return-object v0

    .line 168
    :cond_0
    const/4 v12, 0x0

    .line 169
    :goto_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 171
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_0

    .line 173
    :cond_1
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 174
    return-object v12
.end method

.method private static isNameNotEqualmetadataAndSequence(Ljava/lang/String;)Z
    .locals 1

    .line 102
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

    .line 125
    const-string v0, "_data"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "user_preference_data"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "system_property_data"

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

    :goto_0
    return v0
.end method

.method private static islogBinBaseEncryptSwitch(Ljava/lang/String;)Z
    .locals 1

    .line 155
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

    .line 106
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
    .locals 9
    .param p0    # Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 142
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchName()Ljava/lang/String;

    move-result-object v4

    .line 143
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchmContext()Landroid/content/Context;

    move-result-object v5

    .line 144
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    .line 145
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchEncryptKey()Ljava/lang/String;

    move-result-object v7

    .line 146
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchDesEncrypt()Ljava/lang/String;

    move-result-object v8

    .line 147
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 148
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "logBinBaseEncryptSwitchFun  logBinBaseEncryptSwitch is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    new-instance p1, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;

    invoke-direct {p1, v5, v6, v7, v8}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    :cond_0
    invoke-virtual {p1, v4}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;->encryptSwitch(Ljava/lang/String;)V

    .line 152
    return-void
.end method

.method public static newVerSion4to5(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/util/List;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 28
    invoke-static/range {p2 .. p2}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchUtilFourToFive;->issqliteTablesHasTable(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 39
    const-string v0, "AES_CBC"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchUtilFourToFive;->getKey(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 40
    const/4 v0, 0x0

    if-ne v0, v10, :cond_0

    .line 42
    return-void

    .line 44
    :cond_0
    move-object v11, v10

    .line 46
    const/4 v12, 0x0

    :goto_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_9

    .line 48
    sget-boolean v0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->is5000:Z

    if-eqz v0, :cond_1

    .line 50
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EncryptSwitchFourToFive.is5000"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    return-void

    .line 54
    :cond_1
    move-object/from16 v0, p2

    :try_start_0
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/String;

    .line 55
    new-instance v0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;-><init>()V

    move-object v14, v0

    .line 56
    move-object/from16 v0, p1

    invoke-virtual {v14, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->configDatabase(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 57
    invoke-virtual {v14, v11}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->configDesEncrypt(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v14, v10}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->configEncryptKey(Ljava/lang/String;)V

    .line 59
    move-object/from16 v0, p0

    invoke-virtual {v14, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->configmContext(Landroid/content/Context;)V

    .line 60
    invoke-virtual {v14, v13}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->configName(Ljava/lang/String;)V

    .line 61
    invoke-static {v13}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchUtilFourToFive;->isNameNotEqualmetadataAndSequence(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 62
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start name is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    const/4 v0, 0x0

    if-ne v0, v13, :cond_2

    .line 64
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " newVerSion4to5 name is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    goto/16 :goto_2

    .line 67
    :cond_2
    :try_start_1
    invoke-static {v13}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchUtilFourToFive;->isdataEncryptSwitch(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 68
    invoke-static {v14, v8}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchUtilFourToFive;->dataEncryptSwitchFun(Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/DataEncryptSwitch;)V

    goto/16 :goto_1

    .line 70
    :cond_3
    const-string v0, "_stat"

    invoke-virtual {v13, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 71
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " newVerSion4to5 name end with _stat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    invoke-static {v14, v9}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchUtilFourToFive;->statEncryptSwitchFun(Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;)V

    goto/16 :goto_1

    .line 74
    :cond_4
    invoke-static {v13}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchUtilFourToFive;->islogBinBaseEncryptSwitch(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 75
    invoke-static {v14, v7}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchUtilFourToFive;->logBinBaseEncryptSwitchFun(Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/LogBinBaseEncryptSwitch;)V

    goto :goto_1

    .line 77
    :cond_5
    const-string v0, "system_property_data"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 78
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " newVerSion4to5 name is system_property_data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    new-instance v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v10

    move-object v4, v11

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    .line 80
    invoke-virtual {v15}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/SystemPropertyDataEncryptSwitch;->encryptSwitchAccount()V

    .line 81
    goto :goto_1

    .line 82
    :cond_6
    const-string v0, "user_preference_data"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 83
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " newVerSion4to5 name is user_preference_data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    new-instance v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v10

    move-object v4, v11

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    .line 85
    invoke-virtual {v15}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/UserPreferenceDataEncryptSwitch;->encryptSwitch()V

    .line 86
    goto :goto_1

    .line 88
    :cond_7
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newVerSion4to5 name is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    :goto_1
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end name = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 94
    :cond_8
    goto :goto_2

    .line 92
    :catch_0
    move-exception v13

    .line 93
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " newVerSion4to5 exception is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v13}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    :goto_2
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 97
    :cond_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 98
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " newVerSion4to5  time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v7, v5

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-void
.end method

.method private static statEncryptSwitchFun(Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;)V
    .locals 9
    .param p0    # Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 129
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchName()Ljava/lang/String;

    move-result-object v4

    .line 130
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchmContext()Landroid/content/Context;

    move-result-object v5

    .line 131
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchEncryptKey()Ljava/lang/String;

    move-result-object v6

    .line 132
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v7

    .line 133
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->fetchDesEncrypt()Ljava/lang/String;

    move-result-object v8

    .line 134
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 135
    const-string v0, "Debug_DB_EncryptSwitchUtilFourToFive"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statEncryptSwitchFun  statEncryptSwitch is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    new-instance p1, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;

    invoke-direct {p1, v5, v7, v6, v8}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    :cond_0
    invoke-virtual {p1, v4}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/StatEncryptSwitch;->encryptSwitch(Ljava/lang/String;)V

    .line 139
    return-void
.end method
