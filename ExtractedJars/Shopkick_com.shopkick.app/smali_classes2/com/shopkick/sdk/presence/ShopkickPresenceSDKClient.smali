.class public Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;
.super Ljava/lang/Object;
.source "ShopkickPresenceSDKClient.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/PresenceSDKClient;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$ShopkickSensorManager;
    }
.end annotation


# static fields
.field private static final IS_LOGGING_ENABLED:Z = false

.field private static bleSupported:Z = true

.field private static instance:Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;


# instance fields
.field private final appStatusManager:Lcom/shopkick/app/application/AppStatusManager;

.field private final bleSensor:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

.field private final geoSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

.field private final googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private final sensorManager:Lcom/shopkick/sdk/presence/SensorManager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;Lcom/shopkick/app/application/AppStatusManager;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    .line 269
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 270
    iput-object p1, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->geoSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    .line 271
    iput-object p2, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->bleSensor:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    .line 272
    iput-object p3, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->appStatusManager:Lcom/shopkick/app/application/AppStatusManager;

    .line 273
    iput-object p4, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 274
    new-instance p1, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$ShopkickSensorManager;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$ShopkickSensorManager;-><init>(Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$1;)V

    iput-object p1, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->sensorManager:Lcom/shopkick/sdk/presence/SensorManager;

    .line 275
    invoke-virtual {p3, p0}, Lcom/shopkick/app/application/AppStatusManager;->addStatusListener(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;)Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->bleSensor:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;)Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->geoSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    return-object p0
.end method

.method public static getInstance()Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 62
    sget-object v0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->instance:Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;

    return-object v0
.end method

.method static getPresenceSDKClient(Landroid/content/Context;Ljava/lang/String;Z)Lcom/shopkick/sdk/presence/PresenceSDKClient;
    .locals 16

    move-object/from16 v0, p0

    .line 66
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v9

    .line 69
    invoke-static {v9}, Lcom/shopkick/sdk/api/Environment;->initialize(Landroid/content/Context;)V

    .line 71
    invoke-static {}, Lcom/shopkick/sdk/core/CoreModule;->getInstance()Lcom/shopkick/sdk/core/CoreModule;

    move-result-object v10

    .line 72
    new-instance v7, Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v7}, Lcom/shopkick/app/util/NotificationCenter;-><init>()V

    const/4 v1, 0x1

    .line 73
    invoke-static {v9, v1}, Lcom/shopkick/app/flags/SKFlags;->init(Landroid/content/Context;Z)V

    .line 74
    new-instance v8, Lcom/shopkick/app/application/LibPreferences;

    invoke-direct {v8, v9}, Lcom/shopkick/app/application/LibPreferences;-><init>(Landroid/content/Context;)V

    .line 75
    new-instance v11, Lcom/shopkick/app/application/AppInfo;

    invoke-static {v9}, Lcom/shopkick/app/util/AppUtils;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 76
    invoke-static {v9}, Lcom/shopkick/app/util/AppUtils;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v1, v11

    move-object/from16 v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/application/AppInfo;-><init>([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-virtual {v10}, Lcom/shopkick/sdk/core/CoreModule;->provideAccount()Lcom/shopkick/app/application/Account;

    move-result-object v12

    .line 78
    invoke-virtual {v10, v9, v8, v7}, Lcom/shopkick/sdk/core/CoreModule;->provideDeviceInfo(Landroid/content/Context;Lcom/shopkick/app/application/LibPreferences;Lcom/shopkick/app/util/NotificationCenter;)Lcom/shopkick/app/application/DeviceInfo;

    move-result-object v13

    .line 82
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_0

    .line 83
    new-instance v1, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$1;

    invoke-direct {v1}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$1;-><init>()V

    .line 141
    invoke-virtual {v12}, Lcom/shopkick/app/application/Account;->getUserId()Ljava/lang/String;

    move-result-object v2

    .line 83
    invoke-static {v1, v0, v2}, Lcom/shopkick/logging/LoggerManager;->initialize(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V

    .line 144
    :cond_0
    invoke-static {}, Lcom/shopkick/sdk/api/APIModule;->getInstance()Lcom/shopkick/sdk/api/APIModule;

    move-result-object v14

    .line 145
    invoke-virtual {v14, v9, v12, v13, v11}, Lcom/shopkick/sdk/api/APIModule;->provideNetworkManager(Landroid/content/Context;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;)Lcom/shopkick/app/fetchers/network/NetworkManager;

    move-result-object v3

    move-object v1, v14

    move-object v2, v9

    move-object v4, v11

    move-object v5, v8

    move-object v6, v12

    .line 147
    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/sdk/api/APIModule;->provideSKLogger(Landroid/content/Context;Lcom/shopkick/app/fetchers/network/NetworkManager;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/LibPreferences;Lcom/shopkick/app/application/Account;)Lcom/shopkick/app/application/SKLogger;

    move-result-object v15

    .line 149
    invoke-static {v9}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->provideGoogleApiClient(Landroid/content/Context;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v6

    .line 150
    new-instance v1, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$2;

    invoke-direct {v1}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$2;-><init>()V

    invoke-virtual {v6, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    .line 158
    sget-object v1, Lcom/google/android/gms/location/LocationServices;->FusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    invoke-static {v0, v6, v1}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->provideNativeGeoManager(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/FusedLocationProviderApi;)Lcom/shopkick/sdk/geo/NativeGeoManager;

    .line 161
    invoke-virtual {v14, v9, v12, v13, v11}, Lcom/shopkick/sdk/api/APIModule;->provideNetworkManagerV2(Landroid/content/Context;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/AppInfo;)Lcom/shopkick/fetchers/network/NetworkManager;

    move-result-object v2

    const/4 v5, 0x0

    move-object v0, v14

    move-object v1, v9

    move-object v3, v12

    move-object v11, v6

    move-object v6, v8

    move-object v8, v15

    .line 163
    invoke-virtual/range {v0 .. v8}, Lcom/shopkick/sdk/api/APIModule;->provideAPIManager(Landroid/content/Context;Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/app/application/Account;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/DeveloperInfo;Lcom/shopkick/app/application/LibPreferences;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/SKLogger;)Lcom/shopkick/fetchers/api/APIManager;

    move-result-object v0

    .line 167
    invoke-static {v9}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->provideAppStatusManager(Landroid/content/Context;)Lcom/shopkick/app/application/AppStatusManager;

    move-result-object v1

    .line 169
    new-instance v2, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$3;

    invoke-direct {v2, v1}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$3;-><init>(Lcom/shopkick/app/application/AppStatusManager;)V

    .line 190
    new-instance v3, Lcom/shopkick/sdk/core/ServerFlags;

    move/from16 v4, p2

    invoke-direct {v3, v0, v4}, Lcom/shopkick/sdk/core/ServerFlags;-><init>(Lcom/shopkick/fetchers/api/APIManager;Z)V

    .line 191
    invoke-static {v9, v2, v3}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->provideGeoSensor(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ServerFlags;)Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    move-result-object v4

    .line 193
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x12

    if-lt v5, v6, :cond_1

    .line 194
    invoke-static {v9, v2, v3}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->provideBleSensor(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ServerFlags;)Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    const/4 v5, 0x0

    .line 197
    sput-boolean v5, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->bleSupported:Z

    .line 200
    :goto_0
    invoke-virtual {v10}, Lcom/shopkick/sdk/core/CoreModule;->provideExecutorService()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    const-string v6, "alarm"

    .line 201
    invoke-virtual {v9, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/app/AlarmManager;

    .line 203
    new-instance v7, Lcom/shopkick/sdk/sensor/BLESensorAlarm;

    invoke-direct {v7, v9, v6, v1, v3}, Lcom/shopkick/sdk/sensor/BLESensorAlarm;-><init>(Landroid/content/Context;Landroid/app/AlarmManager;Lcom/shopkick/app/application/AppStatusManager;Lcom/shopkick/sdk/core/ServerFlags;)V

    .line 205
    sget-boolean v6, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->bleSupported:Z

    if-eqz v6, :cond_2

    .line 206
    invoke-static {v0, v3}, Lcom/shopkick/sdk/core/EventLogger;->getInstance(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/sdk/core/ServerFlags;)Lcom/shopkick/sdk/core/EventLogger;

    move-result-object v6

    .line 207
    invoke-virtual {v10, v9, v5}, Lcom/shopkick/sdk/core/CoreModule;->provideBeaconHistory(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)Lcom/shopkick/sdk/zone/ble/BeaconHistory;

    move-result-object v5

    .line 208
    invoke-static {v6, v5, v1, v3}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->provideShopBeaconProcessor(Lcom/shopkick/sdk/core/EventLogger;Lcom/shopkick/sdk/zone/ble/BeaconHistory;Lcom/shopkick/app/application/AppStatusManager;Lcom/shopkick/sdk/core/ServerFlags;)Lcom/shopkick/sdk/analytics/BeaconProcessor;

    .line 211
    :cond_2
    invoke-static {v3, v0}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->provideAnalyticsLogger(Lcom/shopkick/sdk/core/ServerFlags;Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/sdk/analytics/AnalyticsLogger;

    .line 212
    new-instance v0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;

    invoke-direct {v0, v4, v2, v1, v11}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;-><init>(Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;Lcom/shopkick/app/application/AppStatusManager;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    sput-object v0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->instance:Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;

    .line 213
    sget-object v0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->instance:Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;

    return-object v0
.end method

.method private static provideAnalyticsLogger(Lcom/shopkick/sdk/core/ServerFlags;Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/sdk/analytics/AnalyticsLogger;
    .locals 0

    .line 251
    invoke-static {p0, p1}, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->getInstance(Lcom/shopkick/sdk/core/ServerFlags;Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/sdk/analytics/AnalyticsLogger;

    move-result-object p0

    return-object p0
.end method

.method private static provideAppStatusManager(Landroid/content/Context;)Lcom/shopkick/app/application/AppStatusManager;
    .locals 1

    .line 247
    new-instance v0, Lcom/shopkick/app/application/AppStatusManager;

    invoke-direct {v0, p0}, Lcom/shopkick/app/application/AppStatusManager;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static provideBleSensor(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ServerFlags;)Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    .line 230
    invoke-static {p0, p1, p2}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 231
    invoke-static {}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->getInstance()Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    move-result-object p0

    return-object p0
.end method

.method private static provideGeoSensor(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ServerFlags;)Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;
    .locals 0

    .line 237
    invoke-static {p0, p1, p2}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 238
    invoke-static {}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->getInstance()Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    move-result-object p0

    return-object p0
.end method

.method private static provideGoogleApiClient(Landroid/content/Context;)Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 1

    .line 255
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    invoke-direct {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object p0, Lcom/google/android/gms/location/LocationServices;->API:Lcom/google/android/gms/common/api/Api;

    .line 258
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p0

    .line 259
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p0

    return-object p0
.end method

.method private static provideNativeGeoManager(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/FusedLocationProviderApi;)Lcom/shopkick/sdk/geo/NativeGeoManager;
    .locals 1

    .line 243
    new-instance v0, Lcom/shopkick/sdk/geo/NativeGeoManager;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/sdk/geo/NativeGeoManager;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/FusedLocationProviderApi;)V

    return-object v0
.end method

.method private static provideShopBeaconProcessor(Lcom/shopkick/sdk/core/EventLogger;Lcom/shopkick/sdk/zone/ble/BeaconHistory;Lcom/shopkick/app/application/AppStatusManager;Lcom/shopkick/sdk/core/ServerFlags;)Lcom/shopkick/sdk/analytics/BeaconProcessor;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 219
    :try_start_0
    new-instance v0, Lcom/shopkick/sdk/analytics/BeaconProcessor;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/shopkick/sdk/analytics/BeaconProcessor;-><init>(Lcom/shopkick/sdk/core/EventLogger;Ljava/util/Map;Lcom/shopkick/app/application/AppStatusManager;Lcom/shopkick/sdk/core/ServerFlags;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public getSensorManager()Lcom/shopkick/sdk/presence/SensorManager;
    .locals 1

    .line 291
    iget-object v0, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->sensorManager:Lcom/shopkick/sdk/presence/SensorManager;

    return-object v0
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 301
    iget-object p1, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 316
    iget-object p1, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    return-void
.end method

.method public start()Z
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 281
    iget-object v0, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->geoSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->start()Z

    move-result v0

    return v0
.end method

.method public stop()V
    .locals 1

    .line 286
    iget-object v0, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->geoSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->stop()V

    return-void
.end method
