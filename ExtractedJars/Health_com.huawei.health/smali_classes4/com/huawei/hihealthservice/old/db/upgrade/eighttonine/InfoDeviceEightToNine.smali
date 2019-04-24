.class public Lcom/huawei/hihealthservice/old/db/upgrade/eighttonine/InfoDeviceEightToNine;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final Column_cloudUserDeviceCode:Ljava/lang/String; = "cloudUserDeviceCode"

.field private static final Column_createTime:Ljava/lang/String; = "createTime"

.field private static final Column_deviceId:Ljava/lang/String; = "deviceId"

.field private static final Column_deviceName:Ljava/lang/String; = "deviceName"

.field private static final Column_deviceTypes:Ljava/lang/String; = "deviceTypes"

.field private static final Column_deviceVersion:Ljava/lang/String; = "deviceVersion"

.field private static final Column_lastModifyVersion:Ljava/lang/String; = "lastModifyVersion"

.field private static final Column_localUserCode:Ljava/lang/String; = "localUserCode "

.field private static final Column_localUserDeviceCode:Ljava/lang/String; = "localUserDeviceCode"

.field private static final Column_productId:Ljava/lang/String; = "productId"

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_InfoDeviceEightToNine"

.field private static final TABLE_NAME:Ljava/lang/String; = "user_device_info"

.field private static columns:[Ljava/lang/String; = null

.field public static final count:I = 0x14


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 87
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "localUserDeviceCode"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "cloudUserDeviceCode"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "localUserCode "

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "deviceId"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "deviceTypes"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "deviceName"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "deviceVersion"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "createTime"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "lastModifyVersion"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "productId"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/eighttonine/InfoDeviceEightToNine;->columns:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static encryptSwitch(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 8

    .line 93
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 94
    const-string v0, "AES_CBC"

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->getKey(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 96
    const-wide/16 v3, 0x0

    .line 97
    const/16 v0, 0x14

    invoke-static {p1, v3, v4, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/eighttonine/InfoDeviceEightToNine;->getMore(Landroid/database/sqlite/SQLiteDatabase;JI)Ljava/util/List;

    move-result-object v5

    .line 98
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 100
    const/4 v6, 0x0

    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 102
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;

    .line 103
    .line 104
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    .line 103
    invoke-static {p0, v0, v2}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->encrypt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setDeviceId(Ljava/lang/String;)V

    .line 106
    invoke-static {p1, v7}, Lcom/huawei/hihealthservice/old/db/upgrade/eighttonine/InfoDeviceEightToNine;->update(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;)I

    .line 100
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 108
    :cond_0
    const-wide/16 v0, 0x14

    add-long/2addr v3, v0

    .line 109
    const/16 v0, 0x14

    invoke-static {p1, v3, v4, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/eighttonine/InfoDeviceEightToNine;->getMore(Landroid/database/sqlite/SQLiteDatabase;JI)Ljava/util/List;

    move-result-object v5

    goto :goto_0

    .line 111
    :cond_1
    return-void
.end method

.method private static getContentValues(Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;)Landroid/content/ContentValues;
    .locals 4

    .line 162
    new-instance v3, Landroid/content/ContentValues;

    const/16 v0, 0x9

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 163
    const-string v0, "cloudUserDeviceCode"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getCloudUserDeviceCode()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 164
    const-string v0, "createTime"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 165
    const-string v0, "deviceId"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string v0, "deviceName"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const-string v0, "deviceTypes"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getDeviceTypes()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    const-string v0, "deviceVersion"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getDeviceVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    const-string v0, "localUserCode "

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getLocalUserCode()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 171
    const-string v0, "lastModifyVersion"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getLastModifyVersion()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 172
    const-string v0, "productId"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getProductId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 174
    return-object v3
.end method

.method private static getInfoDeviceTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;>;"
        }
    .end annotation

    .line 134
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 136
    const-string v0, "Debug_DB_InfoDeviceEightToNine"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    const/4 v0, 0x0

    return-object v0

    .line 139
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 140
    :goto_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 142
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;-><init>()V

    .line 143
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setLocalUserDeviceCode(I)V

    .line 144
    const/4 v0, 0x1

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setCloudUserDeviceCode(J)V

    .line 146
    const/4 v0, 0x2

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setLocalUserCode(J)V

    .line 147
    const/4 v0, 0x3

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setDeviceId(Ljava/lang/String;)V

    .line 148
    const/4 v0, 0x4

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setDeviceTypes(Ljava/lang/String;)V

    .line 149
    const/4 v0, 0x5

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setDeviceName(Ljava/lang/String;)V

    .line 150
    const/4 v0, 0x6

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setDeviceVersion(Ljava/lang/String;)V

    .line 151
    const/4 v0, 0x7

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setCreateTime(J)V

    .line 152
    const/16 v0, 0x8

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setLastModifyVersion(J)V

    .line 153
    const/16 v0, 0x9

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setProductId(I)V

    .line 154
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    goto/16 :goto_0

    .line 156
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 157
    return-object v4
.end method

.method private static getMore(Landroid/database/sqlite/SQLiteDatabase;JI)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/sqlite/SQLiteDatabase;JI)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;>;"
        }
    .end annotation

    .line 116
    const-string v0, "Debug_DB_InfoDeviceEightToNine"

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

    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "localUserDeviceCode  limit "

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

    .line 118
    const-string v0, "Debug_DB_InfoDeviceEightToNine"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " orderBy = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    move-object v0, p0

    const-string v1, "user_device_info"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/upgrade/eighttonine/InfoDeviceEightToNine;->columns:[Ljava/lang/String;

    move-object v7, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 120
    invoke-static {v9}, Lcom/huawei/hihealthservice/old/db/upgrade/eighttonine/InfoDeviceEightToNine;->getInfoDeviceTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static update(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;)I
    .locals 7

    .line 125
    const-string v0, "Debug_DB_InfoDeviceEightToNine"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update(InfoDeviceTable t)  t= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/upgrade/eighttonine/InfoDeviceEightToNine;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;)Landroid/content/ContentValues;

    move-result-object v4

    .line 127
    const-string v5, "localUserDeviceCode=?"

    .line 128
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getLocalUserDeviceCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 129
    const-string v0, "user_device_info"

    invoke-virtual {p0, v0, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method
