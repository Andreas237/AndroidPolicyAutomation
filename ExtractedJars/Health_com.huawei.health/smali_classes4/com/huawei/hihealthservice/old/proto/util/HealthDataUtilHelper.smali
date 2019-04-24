.class public Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtilHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static convertProtoAppInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/model/AppInfo;
    .locals 1

    .line 85
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtilHelper;->convertProtoAppInfoSync(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/model/AppInfo;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized convertProtoAppInfoSync(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/model/AppInfo;
    .locals 10

    const-class v9, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtilHelper;

    monitor-enter v9

    .line 96
    const/4 v2, 0x0

    .line 98
    const/4 v0, 0x0

    if-eq v0, p0, :cond_3

    .line 100
    :try_start_0
    new-instance v2, Lcom/huawei/hihealthservice/old/model/AppInfo;

    invoke-direct {v2}, Lcom/huawei/hihealthservice/old/model/AppInfo;-><init>()V

    .line 101
    invoke-static {p0, v2}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtilHelper;->convertProtoAppInfoSyncPart1(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Lcom/huawei/hihealthservice/old/model/AppInfo;)Lcom/huawei/hihealthservice/old/model/AppInfo;

    move-result-object v2

    .line 102
    invoke-static {p0, v2}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtilHelper;->convertProtoAppInfoSyncPart2(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Lcom/huawei/hihealthservice/old/model/AppInfo;)Lcom/huawei/hihealthservice/old/model/AppInfo;

    move-result-object v2

    .line 104
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getAuthorizationListList()Ljava/util/List;

    move-result-object v3

    .line 105
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 107
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    .line 109
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 111
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_0

    .line 113
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    .line 114
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getItemId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getAuthorization()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 117
    :cond_0
    invoke-virtual {v2, v5}, Lcom/huawei/hihealthservice/old/model/AppInfo;->setAuthorization(Ljava/util/HashMap;)V

    .line 120
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getNameBundleListList()Ljava/util/List;

    move-result-object v4

    .line 121
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 123
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 125
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 127
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v5, :cond_2

    .line 129
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    .line 130
    invoke-virtual {v8}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getLang()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 133
    :cond_2
    invoke-virtual {v2, v6}, Lcom/huawei/hihealthservice/old/model/AppInfo;->setNameBundle(Ljava/util/HashMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    :cond_3
    monitor-exit v9

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v9

    throw p0
.end method

.method private static convertProtoAppInfoSyncPart1(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Lcom/huawei/hihealthservice/old/model/AppInfo;)Lcom/huawei/hihealthservice/old/model/AppInfo;
    .locals 2

    .line 141
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasAppId()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getAppId()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/AppInfo;->setAppId(I)V

    .line 144
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasLocalUserAppCode()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 145
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getLocalUserAppCode()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/AppInfo;->setLocalUserAppCode(I)V

    .line 147
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasCloudUserAppCode()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 148
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getCloudUserAppCode()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->setCloudUserAppCode(J)V

    .line 150
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasHuid()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 151
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getHuid()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/hihealthservice/old/model/AppInfo;->setHuid(J)V

    .line 153
    :cond_3
    return-object p1
.end method

.method private static convertProtoAppInfoSyncPart2(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Lcom/huawei/hihealthservice/old/model/AppInfo;)Lcom/huawei/hihealthservice/old/model/AppInfo;
    .locals 1

    .line 157
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasType()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getType()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/AppInfo;->setType(I)V

    .line 160
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasSystemRating()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 161
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getSystemRating()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/AppInfo;->setSystemRating(I)V

    .line 163
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasPackageName()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 164
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/AppInfo;->setPackageName(Ljava/lang/String;)V

    .line 166
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasVersion()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 167
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/AppInfo;->setVersion(Ljava/lang/String;)V

    .line 169
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasIconUrl()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 170
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/AppInfo;->setIconUrl(Ljava/lang/String;)V

    .line 172
    :cond_4
    return-object p1
.end method

.method public static convertProtoDeviceInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/model/DeviceInfo;
    .locals 1

    .line 15
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtilHelper;->convertProtoDeviceInfoSync(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/model/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized convertProtoDeviceInfoSync(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/model/DeviceInfo;
    .locals 9

    const-class v8, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtilHelper;

    monitor-enter v8

    .line 20
    const/4 v2, 0x0

    .line 22
    const/4 v0, 0x0

    if-eq v0, p0, :cond_7

    .line 24
    :try_start_0
    new-instance v2, Lcom/huawei/hihealthservice/old/model/DeviceInfo;

    invoke-direct {v2}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;-><init>()V

    .line 25
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->hasLocalUserDeviceCode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getLocalUserDeviceCode()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setLocalUserDeviceCode(I)V

    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->hasCloudUserDeviceCode()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 32
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getCloudUserDeviceCode()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setCloudUserDeviceCode(J)V

    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->hasHuid()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 36
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getHuid()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setHuid(J)V

    .line 38
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->hasProductId()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 40
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getProductId()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setProductId(I)V

    .line 45
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->hasDeviceId()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 47
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDeviceId()Ljava/lang/String;

    move-result-object v3

    .line 48
    const/4 v0, 0x0

    if-eq v0, v3, :cond_4

    .line 50
    invoke-virtual {v2, v3}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setDeviceId(Ljava/lang/String;)V

    .line 54
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->hasProductName()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 56
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getProductName()Ljava/lang/String;

    move-result-object v3

    .line 57
    const/4 v0, 0x0

    if-eq v0, v3, :cond_5

    .line 59
    invoke-virtual {v2, v3}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setProductName(Ljava/lang/String;)V

    .line 63
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getProductTypesList()Ljava/util/List;

    move-result-object v4

    .line 65
    const/4 v0, 0x0

    if-eq v0, v4, :cond_7

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 67
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 69
    new-array v6, v5, [I

    .line 71
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_6

    .line 73
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v6, v7

    .line 71
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 76
    :cond_6
    invoke-virtual {v2, v6}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->setProductTypes([I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    :cond_7
    monitor-exit v8

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v8

    throw p0
.end method

.method public static convertProtoLocation(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/model/Location;
    .locals 1

    .line 176
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtilHelper;->convertProtoLocationSync(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/model/Location;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized convertProtoLocationSync(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/model/Location;
    .locals 5

    const-class v4, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtilHelper;

    monitor-enter v4

    .line 187
    const/4 v2, 0x0

    .line 189
    const/4 v0, 0x0

    if-eq v0, p0, :cond_3

    .line 191
    :try_start_0
    new-instance v2, Lcom/huawei/hihealthservice/old/model/Location;

    invoke-direct {v2}, Lcom/huawei/hihealthservice/old/model/Location;-><init>()V

    .line 192
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->hasAltitude()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 194
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getAltitude()D

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/model/Location;->setAltitude(D)V

    .line 196
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->hasLatitude()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 198
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/model/Location;->setLatitude(D)V

    .line 200
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->hasLongitude()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 202
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getLongitude()D

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/model/Location;->setLongitude(D)V

    .line 204
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->hasName()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 206
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getName()Ljava/lang/String;

    move-result-object v3

    .line 207
    const/4 v0, 0x0

    if-eq v0, v3, :cond_3

    .line 209
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/model/Location;->setName(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    :cond_3
    monitor-exit v4

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v4

    throw p0
.end method
