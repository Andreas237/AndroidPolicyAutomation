.class public Lcom/shopkick/sdk/core/CoreModule;
.super Ljava/lang/Object;
.source "CoreModule.java"


# static fields
.field private static final HISTORY_FILENAME:Ljava/lang/String; = "previously_seen_beacons.obj"

.field private static executorService:Ljava/util/concurrent/ExecutorService;

.field private static instance:Lcom/shopkick/sdk/core/CoreModule;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/shopkick/sdk/core/CoreModule;
    .locals 1

    .line 36
    sget-object v0, Lcom/shopkick/sdk/core/CoreModule;->instance:Lcom/shopkick/sdk/core/CoreModule;

    if-eqz v0, :cond_0

    return-object v0

    .line 39
    :cond_0
    new-instance v0, Lcom/shopkick/sdk/core/CoreModule;

    invoke-direct {v0}, Lcom/shopkick/sdk/core/CoreModule;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/core/CoreModule;->instance:Lcom/shopkick/sdk/core/CoreModule;

    .line 40
    sget-object v0, Lcom/shopkick/sdk/core/CoreModule;->instance:Lcom/shopkick/sdk/core/CoreModule;

    return-object v0
.end method


# virtual methods
.method public provideAccount()Lcom/shopkick/app/application/Account;
    .locals 1

    .line 50
    new-instance v0, Lcom/shopkick/sdk/core/SDKUser;

    invoke-direct {v0}, Lcom/shopkick/sdk/core/SDKUser;-><init>()V

    return-object v0
.end method

.method public provideBeaconHistory(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)Lcom/shopkick/sdk/zone/ble/BeaconHistory;
    .locals 2

    .line 46
    new-instance v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;

    const-string v1, "previously_seen_beacons.obj"

    invoke-direct {v0, p1, v1, p2}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V

    return-object v0
.end method

.method public provideDeviceInfo(Landroid/content/Context;Lcom/shopkick/app/application/LibPreferences;Lcom/shopkick/app/util/NotificationCenter;)Lcom/shopkick/app/application/DeviceInfo;
    .locals 14

    move-object v11, p1

    .line 55
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    const-string v0, "activity"

    .line 57
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/app/ActivityManager;

    const-string v0, "account"

    .line 59
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/accounts/AccountManager;

    const-string v0, "phone"

    .line 61
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/telephony/TelephonyManager;

    .line 63
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    .line 64
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const-string/jumbo v0, "wifi"

    .line 66
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/net/wifi/WifiManager;

    .line 67
    new-instance v13, Lcom/shopkick/app/application/DeviceInfo;

    move-object v0, v13

    move-object/from16 v9, p2

    move-object/from16 v12, p3

    invoke-direct/range {v0 .. v12}, Lcom/shopkick/app/application/DeviceInfo;-><init>(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;Landroid/app/ActivityManager;Landroid/accounts/AccountManager;Landroid/telephony/TelephonyManager;Landroid/content/pm/PackageManager;Landroid/content/ContentResolver;Landroid/content/res/Resources;Lcom/shopkick/app/application/LibPreferences;Landroid/net/wifi/WifiManager;Landroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;)V

    return-object v13
.end method

.method public declared-synchronized provideExecutorService()Ljava/util/concurrent/ExecutorService;
    .locals 1

    monitor-enter p0

    .line 82
    :try_start_0
    sget-object v0, Lcom/shopkick/sdk/core/CoreModule;->executorService:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 83
    sget-object v0, Lcom/shopkick/sdk/core/CoreModule;->executorService:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 85
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/shopkick/sdk/core/CoreModule;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 86
    sget-object v0, Lcom/shopkick/sdk/core/CoreModule;->executorService:Ljava/util/concurrent/ExecutorService;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
