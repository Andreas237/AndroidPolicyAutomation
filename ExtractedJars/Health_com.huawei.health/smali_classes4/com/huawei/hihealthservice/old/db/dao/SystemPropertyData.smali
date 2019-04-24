.class public Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final Column_createTime:Ljava/lang/String; = "createTime"

.field public static final Column_data:Ljava/lang/String; = "data"

.field public static final Column_key:Ljava/lang/String; = "key"

.field public static final Column_lastModifyTime:Ljava/lang/String; = "lastModifyTime"

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_SystemPropertyData"

.field public static final TABLE_NAME:Ljava/lang/String; = "system_property_data"

.field private static final columns:[Ljava/lang/String;


# instance fields
.field private writableDatabase:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 67
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

    sput-object v0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->columns:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 74
    return-void
.end method

.method private add(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)J
    .locals 5

    .line 149
    const-string v0, "Debug_DB_SystemPropertyData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "add(SystemPropertyDataTable t)  t= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;

    move-result-object v4

    .line 151
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "system_property_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method private declared-synchronized deleteSync(Ljava/lang/String;)I
    .locals 6

    monitor-enter p0

    .line 92
    const-string v0, "Debug_DB_SystemPropertyData"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete(String key)  key= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    const-string v4, "key=?"

    .line 94
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v5, v0

    .line 95
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "system_property_data"

    invoke-virtual {v0, v1, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
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

.method public static getAesCbcKey(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/String;
    .locals 13

    .line 175
    const-string v8, "key=?"

    .line 176
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "AES_CBC"

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 177
    const/4 v0, 0x1

    new-array v10, v0, [Ljava/lang/String;

    const-string v0, "data"

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 178
    move-object v0, p0

    const-string v1, "system_property_data"

    move-object v2, v10

    move-object v3, v8

    move-object v4, v9

    .line 179
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 181
    const/4 v0, 0x0

    if-ne v0, v11, :cond_0

    .line 183
    const-string v0, "Debug_DB_SystemPropertyData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAesCbcKey() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    const/4 v0, 0x0

    return-object v0

    .line 186
    :cond_0
    const/4 v12, 0x0

    .line 187
    :goto_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_0

    .line 191
    :cond_1
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 192
    return-object v12
.end method

.method public static getAndroidId(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 208
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getBluetoothMACAddress()Ljava/lang/String;
    .locals 3

    .line 310
    const/4 v1, 0x0

    .line 311
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v2

    .line 312
    if-eqz v2, :cond_0

    .line 314
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothAdapter;->getAddress()Ljava/lang/String;

    move-result-object v1

    .line 316
    :cond_0
    return-object v1
.end method

.method public static getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;
    .locals 4

    .line 165
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x4

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 166
    const-string v0, "key"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const-string v0, "data"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    const-string v0, "createTime"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 169
    const-string v0, "lastModifyTime"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getLastModifyTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 170
    return-object v3
.end method

.method public static getInItAnroidIdTable(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;
    .locals 6

    .line 253
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getAndroidId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 254
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 256
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/util/RootKeyUtil;->sha256(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 257
    const-string v0, "v5"

    invoke-static {v0, v5}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getInitSysProData(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 263
    :cond_0
    goto :goto_0

    .line 260
    :catch_0
    move-exception v4

    .line 262
    const-string v0, "Debug_DB_SystemPropertyData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    const-string v2, "getInItAnroidIdTable NoSuchAlgorithmException"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getInItBluetoothMACAddressTable()Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;
    .locals 6

    .line 271
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getBluetoothMACAddress()Ljava/lang/String;

    move-result-object v4

    .line 272
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 274
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/util/RootKeyUtil;->sha256(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 275
    const-string v0, "v3"

    invoke-static {v0, v5}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getInitSysProData(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 281
    :cond_0
    goto :goto_0

    .line 278
    :catch_0
    move-exception v4

    .line 280
    const-string v0, "Debug_DB_SystemPropertyData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    const-string v2, "getInItBluetoothMACAddressTable NoSuchAlgorithmException"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getInItPhoneMacAddressTable(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;
    .locals 6

    .line 323
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getPhoneMacAddress(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 324
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 326
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/util/RootKeyUtil;->sha256(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 327
    const-string v0, "v2"

    invoke-static {v0, v5}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getInitSysProData(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 333
    :cond_0
    goto :goto_0

    .line 330
    :catch_0
    move-exception v4

    .line 332
    const-string v0, "Debug_DB_SystemPropertyData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    const-string v2, "getInItPhoneMacAddressTable NoSuchAlgorithmException"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getInitSysProData(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;
    .locals 3

    .line 197
    new-instance v2, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    invoke-direct {v2}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;-><init>()V

    .line 198
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setCreateTime(J)V

    .line 199
    invoke-virtual {v2, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setData(Ljava/lang/String;)V

    .line 200
    invoke-virtual {v2, p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setKey(Ljava/lang/String;)V

    .line 202
    return-object v2
.end method

.method private getLeft(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;
    .locals 12

    .line 100
    const-string v0, "Debug_DB_SystemPropertyData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLeft(String key)  key= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const-string v8, "key=?"

    .line 102
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v9, v0

    .line 103
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "system_property_data"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->columns:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 104
    invoke-direct {p0, v10}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getSystemPropertyDataTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v11

    .line 105
    const/4 v0, 0x0

    if-eq v0, v11, :cond_0

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 108
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    return-object v0
.end method

.method public static getPhoneMacAddress(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 288
    const/4 v3, 0x0

    .line 291
    const-string v0, "wifi"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/wifi/WifiManager;

    .line 292
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v5

    .line 293
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 295
    invoke-virtual {v5}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 296
    invoke-virtual {v5}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v0

    const-string v1, ":"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    goto :goto_1

    .line 298
    :cond_1
    return-object v3

    .line 304
    :cond_2
    :goto_1
    goto :goto_2

    .line 301
    :catch_0
    move-exception v4

    .line 303
    return-object v3

    .line 305
    :goto_2
    return-object v3
.end method

.method private declared-synchronized getSync(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;
    .locals 4

    monitor-enter p0

    .line 82
    const-string v0, "Debug_DB_SystemPropertyData"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get(String key)  key= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getLeft(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
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

    .line 114
    const-string v0, "Debug_DB_SystemPropertyData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    const/4 v0, 0x0

    return-object v0

    .line 117
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 118
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 119
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;-><init>()V

    .line 120
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setKey(Ljava/lang/String;)V

    .line 121
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setData(Ljava/lang/String;)V

    .line 122
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setCreateTime(J)V

    .line 123
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setLastModifyTime(J)V

    .line 124
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    goto :goto_0

    .line 126
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 127
    return-object v4
.end method

.method public static initVerify(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 8

    .line 213
    new-instance v4, Ljava/util/ArrayList;

    const/4 v0, 0x3

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 217
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getInItPhoneMacAddressTable(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    move-result-object v5

    .line 218
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 220
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    :cond_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getInItBluetoothMACAddressTable()Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    move-result-object v6

    .line 224
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 226
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    :cond_1
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getInItAnroidIdTable(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    move-result-object v7

    .line 230
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 232
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 239
    :cond_2
    goto :goto_0

    .line 236
    :catch_0
    move-exception v5

    .line 238
    const-string v0, "Debug_DB_SystemPropertyData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    const-string v2, "initVerify Exception"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    :goto_0
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 243
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    .line 244
    invoke-static {v6}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;

    move-result-object v7

    .line 245
    const-string v0, "system_property_data"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v7}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 241
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 248
    :cond_3
    return-void
.end method

.method private declared-synchronized saveSync(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)V
    .locals 3

    monitor-enter p0

    .line 136
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getLeft(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    move-result-object v2

    .line 137
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 139
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->add(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)J

    goto :goto_0

    .line 143
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->update(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private update(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)I
    .locals 7

    .line 156
    const-string v0, "Debug_DB_SystemPropertyData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update(SystemPropertyDataTable t)  t= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;

    move-result-object v4

    .line 158
    const-string v5, "key=?"

    .line 159
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getKey()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 160
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "system_property_data"

    invoke-virtual {v0, v1, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method


# virtual methods
.method public delete(Ljava/lang/String;)I
    .locals 1

    .line 87
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->deleteSync(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public get(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;
    .locals 1

    .line 77
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getSync(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    move-result-object v0

    return-object v0
.end method

.method public save(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)V
    .locals 0

    .line 131
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->saveSync(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)V

    .line 132
    return-void
.end method
