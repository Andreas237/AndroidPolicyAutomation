.class public Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static declared-synchronized convertAppInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;Lcom/huawei/hihealthservice/old/model/AppInfo;)V
    .locals 10

    const-class v9, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;

    monitor-enter v9

    .line 82
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 84
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 87
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getAppId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setAppId(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    .line 88
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getLocalUserAppCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setLocalUserAppCode(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    .line 89
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getCloudUserAppCode()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setCloudUserAppCode(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    .line 90
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getHuid()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setHuid(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    .line 91
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getType()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setType(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    .line 92
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getSystemRating()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setSystemRating(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 94
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getIconUrl()Ljava/lang/String;

    move-result-object v3

    .line 95
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 97
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setIconUrl(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 100
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 101
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 103
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setPackageName(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 106
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getVersion()Ljava/lang/String;

    move-result-object v3

    .line 107
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 109
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setVersion(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 112
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getAuthorization()Ljava/util/HashMap;

    move-result-object v4

    .line 113
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 115
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    .line 116
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 118
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    .line 119
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->setItemId(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    .line 120
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->setAuthorization(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v0

    .line 118
    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->addAuthorizationList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 121
    goto :goto_0

    .line 124
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->getNameBundle()Ljava/util/HashMap;

    move-result-object v5

    .line 125
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 127
    invoke-virtual {v5}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v6

    .line 128
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 130
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    .line 131
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->setLang(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    .line 132
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->setName(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    move-result-object v0

    .line 130
    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->addNameBundleList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    goto :goto_1

    .line 137
    :cond_4
    monitor-exit v9

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v9

    throw p0
.end method

.method private static declared-synchronized convertDeviceInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;Lcom/huawei/hihealthservice/old/model/DeviceInfo;)V
    .locals 8

    const-class v7, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;

    monitor-enter v7

    .line 31
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    .line 33
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 36
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->getLocalUserDeviceCode()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->setLocalUserDeviceCode(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    .line 37
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->getCloudUserDeviceCode()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->setCloudUserDeviceCode(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    .line 38
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->getHuid()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->setHuid(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    .line 39
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->setDeviceId(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    .line 40
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->getProductId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->setProductId(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    .line 42
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->getProductName()Ljava/lang/String;

    move-result-object v3

    .line 43
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 45
    invoke-virtual {p0, v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->setProductName(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    .line 48
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->getVersion()Ljava/lang/String;

    move-result-object v3

    .line 49
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 51
    invoke-virtual {p0, v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->setVersion(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    .line 54
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->getProductTypes()[I

    move-result-object v4

    .line 56
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 58
    array-length v5, v4

    .line 59
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    .line 61
    aget v0, v4, v6

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->addProductTypes(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 67
    :cond_2
    monitor-exit v7

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v7

    throw p0
.end method

.method public static convertHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;Lcom/huawei/hihealthservice/old/model/HealthData;)V
    .locals 0

    .line 224
    invoke-static {p0, p1}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertHealthDataSync(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;Lcom/huawei/hihealthservice/old/model/HealthData;)V

    .line 225
    return-void
.end method

.method private static declared-synchronized convertHealthDataSync(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;Lcom/huawei/hihealthservice/old/model/HealthData;)V
    .locals 5

    const-class v4, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;

    monitor-enter v4

    .line 229
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 231
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 234
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/HealthData;->getHuid()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->setHuid(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    .line 235
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/HealthData;->getType()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->setType(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    .line 236
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/HealthData;->getSubType()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->setSubType(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    .line 237
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/HealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->setStartTime(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    .line 238
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/HealthData;->getEndTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->setEndTime(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 240
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/HealthData;->getRecordId()Ljava/lang/String;

    move-result-object v3

    .line 241
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 243
    invoke-virtual {p0, v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->setRecordId(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 246
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/HealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v3

    .line 247
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 249
    invoke-virtual {p0, v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->setTimeZone(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 252
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/HealthData;->getDevice()Lcom/huawei/hihealthservice/old/model/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 254
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getDeviceBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/HealthData;->getDevice()Lcom/huawei/hihealthservice/old/model/DeviceInfo;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertDeviceInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;Lcom/huawei/hihealthservice/old/model/DeviceInfo;)V

    .line 256
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/HealthData;->getApp()Lcom/huawei/hihealthservice/old/model/AppInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 258
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getAppBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/HealthData;->getApp()Lcom/huawei/hihealthservice/old/model/AppInfo;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertAppInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;Lcom/huawei/hihealthservice/old/model/AppInfo;)V

    .line 260
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/HealthData;->getLocation()Lcom/huawei/hihealthservice/old/model/Location;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 262
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->getLocationBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/HealthData;->getLocation()Lcom/huawei/hihealthservice/old/model/Location;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertLocation(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;Lcom/huawei/hihealthservice/old/model/Location;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 266
    :cond_4
    monitor-exit v4

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v4

    throw p0
.end method

.method private static declared-synchronized convertLocation(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;Lcom/huawei/hihealthservice/old/model/Location;)V
    .locals 5

    const-class v4, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;

    monitor-enter v4

    .line 150
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    .line 152
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 154
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/Location;->getAltitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->setAltitude(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    .line 155
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->setLatitude(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    move-result-object v0

    .line 156
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/Location;->getLongitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->setLongitude(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;

    .line 158
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/Location;->getName()Ljava/lang/String;

    move-result-object v3

    .line 159
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 161
    invoke-virtual {p0, v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;->setName(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location$Builder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    :cond_0
    monitor-exit v4

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v4

    throw p0
.end method

.method public static convertProtoAppInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/model/AppInfo;
    .locals 1

    .line 70
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtilHelper;->convertProtoAppInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/model/AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public static convertProtoDeviceInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/model/DeviceInfo;
    .locals 1

    .line 17
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtilHelper;->convertProtoDeviceInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/model/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public static convertProtoHealthData(Lcom/huawei/hihealthservice/old/model/HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)V
    .locals 0

    .line 169
    invoke-static {p0, p1}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertProtoHealthDataSync(Lcom/huawei/hihealthservice/old/model/HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)V

    .line 170
    return-void
.end method

.method private static declared-synchronized convertProtoHealthDataSync(Lcom/huawei/hihealthservice/old/model/HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)V
    .locals 3

    const-class v2, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;

    monitor-enter v2

    .line 176
    const/4 v0, 0x0

    if-eq v0, p0, :cond_9

    const/4 v0, 0x0

    if-eq v0, p1, :cond_9

    .line 178
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasHuid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getHuid()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/model/HealthData;->setHuid(J)V

    .line 182
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasType()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 184
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getType()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/model/HealthData;->setType(I)V

    .line 187
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasSubType()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 189
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getSubType()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/model/HealthData;->setSubType(I)V

    .line 191
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasStartTime()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 193
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/model/HealthData;->setStartTime(J)V

    .line 195
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasEndTime()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 197
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/model/HealthData;->setEndTime(J)V

    .line 199
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasRecordId()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 201
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getRecordId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/model/HealthData;->setRecordId(Ljava/lang/String;)V

    .line 203
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasTimeZone()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 205
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/model/HealthData;->setTimeZone(Ljava/lang/String;)V

    .line 207
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasDevice()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 209
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDevice()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertProtoDeviceInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/model/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/model/HealthData;->setDevice(Lcom/huawei/hihealthservice/old/model/DeviceInfo;)V

    .line 211
    :cond_7
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasApp()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 213
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getApp()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertProtoAppInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/model/AppInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/model/HealthData;->setApp(Lcom/huawei/hihealthservice/old/model/AppInfo;)V

    .line 215
    :cond_8
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasLocation()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 217
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getLocation()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertProtoLocation(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/model/Location;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/model/HealthData;->setLocation(Lcom/huawei/hihealthservice/old/model/Location;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    :cond_9
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static convertProtoLocation(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/model/Location;
    .locals 1

    .line 140
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtilHelper;->convertProtoLocation(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/model/Location;

    move-result-object v0

    return-object v0
.end method
