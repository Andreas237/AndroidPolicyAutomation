.class public Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private Column_cloudUserDeviceCode:Ljava/lang/String;

.field private Column_createTime:Ljava/lang/String;

.field private Column_deviceId:Ljava/lang/String;

.field private Column_deviceName:Ljava/lang/String;

.field private Column_deviceTypes:Ljava/lang/String;

.field private Column_deviceVersion:Ljava/lang/String;

.field private Column_lastModifyVersion:Ljava/lang/String;

.field private Column_localUserCode:Ljava/lang/String;

.field private Column_localUserDeviceCode:Ljava/lang/String;

.field private Column_productId:Ljava/lang/String;

.field private TABLE_NAME:Ljava/lang/String;

.field private columns:[Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private writableDatabase:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const-string v0, "user_device_info"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->TABLE_NAME:Ljava/lang/String;

    .line 39
    const-string v0, "localUserDeviceCode"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_localUserDeviceCode:Ljava/lang/String;

    .line 43
    const-string v0, "cloudUserDeviceCode"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_cloudUserDeviceCode:Ljava/lang/String;

    .line 47
    const-string v0, "localUserCode "

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_localUserCode:Ljava/lang/String;

    .line 51
    const-string v0, "deviceName"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_deviceName:Ljava/lang/String;

    .line 55
    const-string v0, "deviceId"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_deviceId:Ljava/lang/String;

    .line 59
    const-string v0, "productId"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_productId:Ljava/lang/String;

    .line 63
    const-string v0, "deviceTypes"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_deviceTypes:Ljava/lang/String;

    .line 67
    const-string v0, "deviceVersion"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_deviceVersion:Ljava/lang/String;

    .line 71
    const-string v0, "createTime"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_createTime:Ljava/lang/String;

    .line 75
    const-string v0, "lastModifyVersion"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_lastModifyVersion:Ljava/lang/String;

    .line 77
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_localUserDeviceCode:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_cloudUserDeviceCode:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_localUserCode:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_deviceId:Ljava/lang/String;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_deviceTypes:Ljava/lang/String;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_deviceName:Ljava/lang/String;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_deviceVersion:Ljava/lang/String;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_createTime:Ljava/lang/String;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_lastModifyVersion:Ljava/lang/String;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_productId:Ljava/lang/String;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->columns:[Ljava/lang/String;

    .line 88
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->mContext:Landroid/content/Context;

    .line 89
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 90
    return-void
.end method

.method private desEncrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->getKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getInfoDeviceTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;>;"
        }
    .end annotation

    .line 107
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 109
    const/4 v0, 0x0

    return-object v0

    .line 111
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 112
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    new-instance v3, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;

    invoke-direct {v3}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;-><init>()V

    .line 115
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setLocalUserDeviceCode(I)V

    .line 116
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setCloudUserDeviceCode(J)V

    .line 119
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setLocalUserCode(J)V

    .line 120
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setDeviceId(Ljava/lang/String;)V

    .line 121
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setDeviceTypes(Ljava/lang/String;)V

    .line 122
    const/4 v0, 0x5

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setDeviceName(Ljava/lang/String;)V

    .line 123
    const/4 v0, 0x6

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setDeviceVersion(Ljava/lang/String;)V

    .line 124
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setCreateTime(J)V

    .line 125
    const/16 v0, 0x8

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setLastModifyVersion(J)V

    .line 126
    const/16 v0, 0x9

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->setProductId(I)V

    .line 127
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    goto/16 :goto_0

    .line 129
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 130
    return-object v2
.end method

.method private static toDeviceInfo(Landroid/content/Context;Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;)Lcom/huawei/hihealthservice/old/model/DeviceInfo;
    .locals 4

    .line 151
    const/4 v3, 0x0

    .line 152
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 154
    new-instance v3, Lcom/huawei/hihealthservice/old/model/DeviceInfo;

    invoke-direct {v3}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;-><init>()V

    .line 155
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getCloudUserDeviceCode()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setCloudUserDeviceCode(J)V

    .line 156
    new-instance v0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;

    invoke-direct {v0, p0}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getLocalUserCode()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getHuid(J)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setHuid(J)V

    .line 157
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setDeviceId(Ljava/lang/String;)V

    .line 158
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getProductId()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setProductId(I)V

    .line 159
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getDeviceVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setVersion(Ljava/lang/String;)V

    .line 160
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getDeviceTypes()Ljava/lang/String;

    move-result-object v0

    const-class v1, [I

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setProductTypes([I)V

    .line 161
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getLocalUserDeviceCode()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setLocalUserDeviceCode(I)V

    .line 162
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setProductName(Ljava/lang/String;)V

    .line 164
    :cond_0
    return-object v3
.end method

.method private static toDeviceInfo(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;>;)Ljava/util/List<Lcom/huawei/hihealthservice/old/model/DeviceInfo;>;"
        }
    .end annotation

    .line 169
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 171
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 172
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 173
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 175
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;

    .line 176
    invoke-static {p0, v4}, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->toDeviceInfo(Landroid/content/Context;Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;)Lcom/huawei/hihealthservice/old/model/DeviceInfo;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 178
    :cond_0
    return-object v2

    .line 180
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public get(J)Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;
    .locals 12

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_localUserDeviceCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 95
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 96
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->TABLE_NAME:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->columns:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 97
    invoke-direct {p0, v10}, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->getInfoDeviceTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v11

    .line 98
    const/4 v0, 0x0

    if-eq v0, v11, :cond_0

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 100
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 102
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;

    return-object v0
.end method

.method public getHuid(J)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/List<Lcom/huawei/hihealthservice/old/model/DeviceInfo;>;"
        }
    .end annotation

    .line 135
    new-instance v0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;-><init>(Landroid/content/Context;)V

    move-wide v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getInfoUserCode(J)I

    move-result v0

    int-to-long v8, v0

    .line 136
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_localUserCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 137
    const/4 v0, 0x1

    new-array v11, v0, [Ljava/lang/String;

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v11, v1

    .line 139
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->TABLE_NAME:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->columns:[Ljava/lang/String;

    move-object v3, v10

    move-object v4, v11

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v12

    .line 141
    invoke-direct {p0, v12}, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->getInfoDeviceTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v13

    .line 142
    const/4 v0, 0x0

    if-eq v0, v13, :cond_0

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 144
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 146
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->mContext:Landroid/content/Context;

    invoke-static {v0, v13}, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->toDeviceInfo(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getLocalUserDeviceCode(Landroid/database/sqlite/SQLiteDatabase;J)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/sqlite/SQLiteDatabase;J)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_localUserCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 192
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    invoke-static/range {p2 .. p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 193
    const/4 v0, 0x1

    new-array v10, v0, [Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->Column_localUserDeviceCode:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 194
    move-object v0, p1

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->TABLE_NAME:Ljava/lang/String;

    move-object v2, v10

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 196
    const/4 v0, 0x0

    if-ne v0, v11, :cond_0

    .line 198
    const/4 v0, 0x0

    return-object v0

    .line 200
    :cond_0
    invoke-interface {v11}, Landroid/database/Cursor;->getCount()I

    move-result v12

    .line 201
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 202
    :goto_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 204
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 206
    :cond_1
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 208
    return-object v13
.end method
