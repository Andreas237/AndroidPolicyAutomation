.class public Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final Column_appId:Ljava/lang/String; = "appId"

.field private static final Column_authorization:Ljava/lang/String; = "authorization"

.field private static final Column_cloudUserAppCode:Ljava/lang/String; = "cloudUserAppCode"

.field private static final Column_createTime:Ljava/lang/String; = "createTime"

.field private static final Column_lastModifyVersion:Ljava/lang/String; = "lastModifyVersion"

.field private static final Column_localUserAppCode:Ljava/lang/String; = "localUserAppCode"

.field private static final Column_localUserCode:Ljava/lang/String; = "localUserCode"

.field private static final Column_priority:Ljava/lang/String; = "priority"

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_EncryptSwitchAppInfoSixToSeven"

.field private static final TABLE_NAME:Ljava/lang/String; = "user_app_info"

.field private static final columns:[Ljava/lang/String;

.field public static final count:I = 0x14


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 36
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "localUserAppCode"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "cloudUserAppCode"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "localUserCode"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "appId"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "authorization"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "priority"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "createTime"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "lastModifyVersion"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->columns:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static addKey(Landroid/database/sqlite/SQLiteDatabase;)J
    .locals 8

    .line 61
    new-instance v4, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    invoke-direct {v4}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;-><init>()V

    .line 62
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/RootKeyUtil_6_7;->genRandBytes(I)[B

    move-result-object v5

    .line 63
    const/4 v0, 0x0

    invoke-static {v5, v0}, Lcom/huawei/hihealthservice/old/util/HEX;->encode([BI)Ljava/lang/String;

    move-result-object v6

    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setCreateTime(J)V

    .line 65
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setData(Ljava/lang/String;)V

    .line 66
    const-string v0, "AES_CBC"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setKey(Ljava/lang/String;)V

    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setLastModifyTime(J)V

    .line 68
    const-string v0, "Debug_DB_EncryptSwitchAppInfoSixToSeven"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addKey systemPropertyDataTable is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;

    move-result-object v7

    .line 70
    const-string v0, "system_property_data"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v7}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static desEncrypt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 157
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 159
    const/4 v0, 0x0

    return-object v0

    .line 161
    :cond_0
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->initSecretKeyS(Landroid/content/Context;)V

    .line 162
    invoke-static {p1, p2}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static encrypt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 147
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 149
    const/4 v0, 0x0

    return-object v0

    .line 151
    :cond_0
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->initSecretKeyS(Landroid/content/Context;)V

    .line 152
    invoke-static {p1, p2}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static encryptSwitch(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 12

    .line 41
    const-string v0, "AES_CBC"

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->getKey(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 43
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 44
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->addKey(Landroid/database/sqlite/SQLiteDatabase;)J

    .line 45
    const-string v0, "AES_CBC"

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->getKey(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 48
    :cond_0
    const-wide/16 v7, 0x0

    .line 49
    move-object v0, p0

    move-object v1, p1

    move-wide v2, v7

    move-object v5, v6

    const-wide/16 v2, 0x0

    const/16 v4, 0x14

    invoke-static/range {v0 .. v5}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->getMore(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;JILjava/lang/String;)Ljava/util/List;

    move-result-object v9

    .line 50
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 51
    const/4 v10, 0x0

    :goto_1
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_1

    .line 52
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;

    .line 53
    invoke-static {p0, p1, v11, v6}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->update(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;Ljava/lang/String;)I

    .line 51
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 55
    :cond_1
    const-wide/16 v0, 0x14

    add-long/2addr v7, v0

    .line 56
    move-object v0, p0

    move-object v1, p1

    move-wide v2, v7

    move-object v5, v6

    const/16 v4, 0x14

    invoke-static/range {v0 .. v5}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->getMore(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;JILjava/lang/String;)Ljava/util/List;

    move-result-object v9

    goto :goto_0

    .line 58
    :cond_2
    return-void
.end method

.method private static getContentValues(Landroid/content/Context;Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;Ljava/lang/String;)Landroid/content/ContentValues;
    .locals 4

    .line 134
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x7

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 135
    const-string v0, "appId"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->getAppId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 136
    const-string v0, "authorization"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->getAuthority()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, p2}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->encrypt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v0, "cloudUserAppCode"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->getCloudUserAppCode()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 138
    const-string v0, "createTime"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 139
    const-string v0, "lastModifyVersion"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->getLastModifyVersion()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 140
    const-string v0, "localUserCode"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->getLocalUserCode()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 141
    const-string v0, "priority"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->getPriority()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 142
    return-object v3
.end method

.method private static getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;
    .locals 4

    .line 75
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x4

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 76
    const-string v0, "key"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const-string v0, "data"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    const-string v0, "createTime"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 79
    const-string v0, "lastModifyTime"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getLastModifyTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 80
    return-object v3
.end method

.method public static getKey(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 167
    const-string v0, "Debug_DB_EncryptSwitchAppInfoSixToSeven"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getKey(String key)  key= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    const-string v8, "key=?"

    .line 169
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v9, v0

    .line 170
    const/4 v0, 0x1

    new-array v10, v0, [Ljava/lang/String;

    const-string v0, "data"

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 171
    move-object v0, p0

    const-string v1, "system_property_data"

    move-object v2, v10

    move-object v3, v8

    move-object v4, v9

    .line 172
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 173
    const/4 v0, 0x0

    if-ne v0, v11, :cond_0

    .line 175
    const-string v0, "Debug_DB_EncryptSwitchAppInfoSixToSeven"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    const/4 v0, 0x0

    return-object v0

    .line 178
    :cond_0
    const/4 v12, 0x0

    .line 179
    :goto_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 181
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_0

    .line 183
    :cond_1
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 184
    return-object v12
.end method

.method private static getMore(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;JILjava/lang/String;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;JILjava/lang/String;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;>;"
        }
    .end annotation

    .line 85
    const-string v0, "Debug_DB_EncryptSwitchAppInfoSixToSeven"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getMore(long startIndex ,int count) count = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 87
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",startIndex="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 89
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 85
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "localUserAppCode  limit "

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

    .line 91
    const-string v0, "Debug_DB_EncryptSwitchAppInfoSixToSeven"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " orderBy = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    move-object v0, p1

    const-string v1, "user_app_info"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->columns:[Ljava/lang/String;

    move-object v7, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 93
    invoke-static {p0, v9, p5}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->getUserAppInfoTables(Landroid/content/Context;Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static getUserAppInfoTables(Landroid/content/Context;Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;>;"
        }
    .end annotation

    .line 108
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 110
    const-string v0, "Debug_DB_EncryptSwitchAppInfoSixToSeven"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    const/4 v0, 0x0

    return-object v0

    .line 113
    :cond_0
    const-string v0, "Debug_DB_EncryptSwitchAppInfoSixToSeven"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query.getCount()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 115
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 116
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;-><init>()V

    .line 117
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->setLocalUserAppCode(I)V

    .line 118
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->setCloudUserAppCode(J)V

    .line 119
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->setLocalUserCode(J)V

    .line 120
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->setAppId(I)V

    .line 121
    new-instance v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven$1;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v6

    .line 122
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p2}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->desEncrypt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lo/cnj;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/HashMap;

    .line 123
    invoke-virtual {v5, v7}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->setAuthority(Ljava/util/HashMap;)V

    .line 124
    const/4 v0, 0x5

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->setPriority(I)V

    .line 125
    const/4 v0, 0x6

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->setCreateTime(J)V

    .line 126
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->setLastModifyVersion(J)V

    .line 127
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    goto/16 :goto_0

    .line 129
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 130
    return-object v4
.end method

.method private static update(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;Ljava/lang/String;)I
    .locals 7

    .line 99
    const-string v0, "Debug_DB_EncryptSwitchAppInfoSixToSeven"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update(UserAppInfoTable t)  userAppInfoTable= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    invoke-static {p0, p2, p3}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->getContentValues(Landroid/content/Context;Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v4

    .line 101
    const-string v5, "localUserAppCode=?"

    .line 102
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->getLocalUserAppCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 103
    const-string v0, "user_app_info"

    invoke-virtual {p1, v0, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method
