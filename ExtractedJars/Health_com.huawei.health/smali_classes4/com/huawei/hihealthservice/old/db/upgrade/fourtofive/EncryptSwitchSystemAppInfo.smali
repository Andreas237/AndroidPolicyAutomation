.class public Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final Column_appId:Ljava/lang/String; = "appId"

.field private static final Column_authorization:Ljava/lang/String; = "authorization"

.field private static final Column_createTime:Ljava/lang/String; = "createTime"

.field private static final Column_iconUrl:Ljava/lang/String; = "iconUrl"

.field private static final Column_lastModifyVersion:Ljava/lang/String; = "lastModifyVersion"

.field private static final Column_nameBundle:Ljava/lang/String; = "nameBundle"

.field private static final Column_packageName:Ljava/lang/String; = "packageName"

.field private static final Column_systemRating:Ljava/lang/String; = "systemRating"

.field private static final Column_type:Ljava/lang/String; = "type"

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_EncryptSwitchSystemAppInfo"

.field private static final TABLE_NAME:Ljava/lang/String; = "system_app_info"

.field private static final columns:[Ljava/lang/String;

.field public static final count:I = 0x14


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 48
    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "appId"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "packageName"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "type"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "authorization"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "systemRating"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "createTime"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "lastModifyVersion"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "iconUrl"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "nameBundle"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;->columns:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static addKey(Landroid/database/sqlite/SQLiteDatabase;)J
    .locals 6

    .line 78
    new-instance v2, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    invoke-direct {v2}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;-><init>()V

    .line 79
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/RootKeyUtil_6_7;->genRandBytes(I)[B

    move-result-object v3

    .line 80
    const/4 v0, 0x0

    invoke-static {v3, v0}, Lcom/huawei/hihealthservice/old/util/HEX;->encode([BI)Ljava/lang/String;

    move-result-object v4

    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setCreateTime(J)V

    .line 82
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setData(Ljava/lang/String;)V

    .line 83
    const-string v0, "AES_CBC"

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setKey(Ljava/lang/String;)V

    .line 84
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setLastModifyTime(J)V

    .line 85
    invoke-static {v2}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;

    move-result-object v5

    .line 86
    const-string v0, "system_property_data"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static encrypt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 177
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->initSecretKeyS(Landroid/content/Context;)V

    .line 178
    invoke-static {p1, p2}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static encryptSwitch(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 8

    .line 55
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 56
    const-string v0, "AES_CBC"

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;->getKey(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 57
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 59
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;->addKey(Landroid/database/sqlite/SQLiteDatabase;)J

    .line 60
    const-string v0, "AES_CBC"

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;->getKey(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 62
    :cond_0
    const-wide/16 v3, 0x0

    .line 63
    const/16 v0, 0x14

    invoke-static {p1, v3, v4, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;->getMore(Landroid/database/sqlite/SQLiteDatabase;JI)Ljava/util/List;

    move-result-object v5

    .line 64
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 66
    const/4 v6, 0x0

    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 68
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    .line 69
    invoke-static {p0, p1, v7, v2}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;->update(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;Ljava/lang/String;)I

    .line 66
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 71
    :cond_1
    const-wide/16 v0, 0x14

    add-long/2addr v3, v0

    .line 72
    const/16 v0, 0x14

    invoke-static {p1, v3, v4, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;->getMore(Landroid/database/sqlite/SQLiteDatabase;JI)Ljava/util/List;

    move-result-object v5

    goto :goto_0

    .line 74
    :cond_2
    return-void
.end method

.method private static getContentValues(Landroid/content/Context;Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;Ljava/lang/String;)Landroid/content/ContentValues;
    .locals 4

    .line 127
    new-instance v3, Landroid/content/ContentValues;

    const/16 v0, 0x9

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 128
    const-string v0, "appId"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getAppId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 129
    const-string v0, "authorization"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getAuthority()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, p2}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;->encrypt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    const-string v0, "createTime"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 131
    const-string v0, "lastModifyVersion"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getLastModifyVersion()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 132
    const-string v0, "packageName"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    const-string v0, "systemRating"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getSystemRating()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 134
    const-string v0, "type"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 135
    const-string v0, "iconUrl"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    const-string v0, "nameBundle"

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getNameBundle()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    return-object v3
.end method

.method private static getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;
    .locals 4

    .line 91
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x4

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 92
    const-string v0, "key"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v0, "data"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v0, "createTime"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 95
    const-string v0, "lastModifyTime"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getLastModifyTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 96
    return-object v3
.end method

.method private static getKey(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 183
    const-string v0, "Debug_DB_EncryptSwitchSystemAppInfo"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getKey(String key)  key= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    const-string v8, "key=?"

    .line 185
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v9, v0

    .line 186
    const/4 v0, 0x1

    new-array v10, v0, [Ljava/lang/String;

    const-string v0, "data"

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 187
    move-object v0, p0

    const-string v1, "system_property_data"

    move-object v2, v10

    move-object v3, v8

    move-object v4, v9

    .line 188
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 189
    const/4 v0, 0x0

    if-ne v0, v11, :cond_0

    .line 191
    const-string v0, "Debug_DB_EncryptSwitchSystemAppInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getKey() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    const/4 v0, 0x0

    return-object v0

    .line 194
    :cond_0
    const/4 v12, 0x0

    .line 195
    :goto_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 196
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_0

    .line 198
    :cond_1
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 199
    return-object v12
.end method

.method private static getMore(Landroid/database/sqlite/SQLiteDatabase;JI)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/sqlite/SQLiteDatabase;JI)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;>;"
        }
    .end annotation

    .line 101
    const-string v0, "Debug_DB_EncryptSwitchSystemAppInfo"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getMore(long startIndex ,int count) count = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 103
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",startIndex="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 105
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 101
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "appId  limit "

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

    .line 111
    const-string v0, "Debug_DB_EncryptSwitchSystemAppInfo"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " orderBy = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    move-object v0, p0

    const-string v1, "system_app_info"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;->columns:[Ljava/lang/String;

    move-object v7, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 113
    invoke-static {v9}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;->getSystemAppInfoTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static getSystemAppInfoTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;>;"
        }
    .end annotation

    .line 141
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 142
    const-string v0, "Debug_DB_EncryptSwitchSystemAppInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    const/4 v0, 0x0

    return-object v0

    .line 145
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 146
    :goto_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 149
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;-><init>()V

    .line 150
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setAppId(I)V

    .line 151
    const/4 v0, 0x1

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setPackageName(Ljava/lang/String;)V

    .line 152
    const/4 v0, 0x2

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setType(I)V

    .line 153
    new-instance v0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo$1;-><init>()V

    .line 155
    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v6

    .line 156
    const/4 v0, 0x3

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lo/cnj;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/HashMap;

    .line 157
    invoke-virtual {v5, v7}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setAuthority(Ljava/util/HashMap;)V

    .line 158
    const/4 v0, 0x4

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setSystemRating(I)V

    .line 159
    const/4 v0, 0x5

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setCreateTime(J)V

    .line 160
    const/4 v0, 0x6

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setLastModifyVersion(J)V

    .line 161
    const/4 v0, 0x7

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setIconUrl(Ljava/lang/String;)V

    .line 163
    new-instance v0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo$2;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo$2;-><init>()V

    .line 165
    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo$2;->getType()Ljava/lang/reflect/Type;

    move-result-object v6

    .line 166
    const/16 v0, 0x8

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lo/cnj;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/HashMap;

    .line 167
    invoke-virtual {v5, v8}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setNameBundle(Ljava/util/HashMap;)V

    .line 169
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    goto/16 :goto_0

    .line 171
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 172
    return-object v4
.end method

.method private static update(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;Ljava/lang/String;)I
    .locals 7

    .line 118
    const-string v0, "Debug_DB_EncryptSwitchSystemAppInfo"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update(SystemAppInfoTable t)  t= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    invoke-static {p0, p2, p3}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;->getContentValues(Landroid/content/Context;Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v4

    .line 120
    const-string v5, "appId=?"

    .line 121
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getAppId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 122
    const-string v0, "system_app_info"

    invoke-virtual {p1, v0, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method
