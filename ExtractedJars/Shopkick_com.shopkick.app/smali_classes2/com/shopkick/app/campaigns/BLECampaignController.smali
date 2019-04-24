.class public Lcom/shopkick/app/campaigns/BLECampaignController;
.super Ljava/lang/Object;
.source "BLECampaignController.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;
    }
.end annotation


# static fields
.field public static final MAX_WALKIN_AGE_MILLISECONDS:J = 0x927c0L

.field private static final mainHandler:Landroid/os/Handler;

.field private static final maxResponseWaitTime:Ljava/lang/Integer;

.field private static final maxValidCampaignsTime:Ljava/lang/Long;

.field private static final maxValidResponseTime:Ljava/lang/Long;


# instance fields
.field private final apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

.field private final appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private final campaignssUpdateLock:Ljava/lang/Object;

.field private final clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private final context:Landroid/content/Context;

.field private final enteredZones:Ljava/util/concurrent/ConcurrentSkipListSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Lcom/shopkick/sdk/zone/Zone;",
            ">;"
        }
    .end annotation
.end field

.field private volatile epochOfLastCampaignsUpdate:Ljava/lang/Long;

.field private final epochTimeToEnteredCampaign:Ljava/util/concurrent/ConcurrentSkipListMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListMap<",
            "Ljava/lang/Long;",
            "Lcom/shopkick/app/fetchers/api/skapi/Campaign;",
            ">;"
        }
    .end annotation
.end field

.field private final firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private final logger:Lcom/shopkick/app/application/SKLogger;

.field private final messagingManager:Lcom/shopkick/app/campaigns/MessagingManager;

.field private final notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private final registeredZoneProximityListeners:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;",
            ">;"
        }
    .end annotation
.end field

.field private final sensorEventsListener:Lcom/shopkick/sdk/sensor/SensorEventsListener;

.field private final walkinBackgroundNotificationMessage:Ljava/lang/String;

.field private final walkinBackgroundNotificationTitle:Ljava/lang/String;

.field private final walkinController:Lcom/shopkick/app/presence/WalkinController;

.field private final workExecutor:Ljava/util/concurrent/Executor;

.field private final zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

.field private final zoneIdToEnteredZone:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/sdk/zone/ZoneReading;",
            ">;"
        }
    .end annotation
.end field

.field private zonesCheckResults:Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 84
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/shopkick/app/campaigns/BLECampaignController;->mainHandler:Landroid/os/Handler;

    const-wide/32 v0, 0x493e0

    .line 874
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/campaigns/BLECampaignController;->maxValidResponseTime:Ljava/lang/Long;

    const/16 v0, 0xbb8

    .line 875
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/campaigns/BLECampaignController;->maxResponseWaitTime:Ljava/lang/Integer;

    const-wide/32 v0, 0x1b7740

    .line 876
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/campaigns/BLECampaignController;->maxValidCampaignsTime:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/util/Clock;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/presence/WalkinController;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/launch/FirstUseControllerV2;Lcom/shopkick/app/application/SKLogger;)V
    .locals 10
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/shopkick/app/util/Clock;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/shopkick/app/account/UserAccount;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/shopkick/fetchers/api/APIManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/shopkick/app/application/ClientFlagsManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/shopkick/app/application/AppPreferences;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/shopkick/app/presence/WalkinController;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/shopkick/app/application/AppActivityManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Lcom/shopkick/app/util/NotificationCenter;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Lcom/shopkick/app/launch/FirstUseControllerV2;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p11    # Lcom/shopkick/app/application/SKLogger;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    move-object v0, p0

    move-object v1, p4

    move-object v5, p5

    move-object/from16 v7, p7

    move-object/from16 v2, p8

    move-object/from16 v3, p9

    move-object/from16 v4, p10

    move-object/from16 v8, p11

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v6, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->zoneIdToEnteredZone:Ljava/util/concurrent/ConcurrentHashMap;

    .line 95
    new-instance v6, Ljava/util/LinkedList;

    invoke-direct {v6}, Ljava/util/LinkedList;-><init>()V

    iput-object v6, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->registeredZoneProximityListeners:Ljava/util/LinkedList;

    .line 96
    new-instance v6, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v6, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->enteredZones:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 102
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    iput-object v6, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->workExecutor:Ljava/util/concurrent/Executor;

    .line 671
    new-instance v6, Lcom/shopkick/app/campaigns/BLECampaignController$2;

    invoke-direct {v6, p0}, Lcom/shopkick/app/campaigns/BLECampaignController$2;-><init>(Lcom/shopkick/app/campaigns/BLECampaignController;)V

    iput-object v6, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 684
    new-instance v6, Lcom/shopkick/app/campaigns/BLECampaignController$3;

    invoke-direct {v6, p0}, Lcom/shopkick/app/campaigns/BLECampaignController$3;-><init>(Lcom/shopkick/app/campaigns/BLECampaignController;)V

    iput-object v6, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    .line 811
    new-instance v6, Lcom/shopkick/app/campaigns/BLECampaignController$4;

    invoke-direct {v6, p0}, Lcom/shopkick/app/campaigns/BLECampaignController$4;-><init>(Lcom/shopkick/app/campaigns/BLECampaignController;)V

    iput-object v6, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->sensorEventsListener:Lcom/shopkick/sdk/sensor/SensorEventsListener;

    .line 866
    new-instance v6, Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentSkipListMap;-><init>()V

    iput-object v6, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->epochTimeToEnteredCampaign:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 869
    new-instance v6, Ljava/lang/Object;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-object v6, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->campaignssUpdateLock:Ljava/lang/Object;

    const/4 v6, 0x0

    .line 872
    iput-object v6, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->epochOfLastCampaignsUpdate:Ljava/lang/Long;

    .line 878
    new-instance v6, Lcom/shopkick/app/campaigns/BLECampaignController$5;

    invoke-direct {v6, p0}, Lcom/shopkick/app/campaigns/BLECampaignController$5;-><init>(Lcom/shopkick/app/campaigns/BLECampaignController;)V

    iput-object v6, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->zonesCheckResults:Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;

    if-eqz p1, :cond_a

    if-eqz p2, :cond_9

    if-eqz p3, :cond_8

    if-eqz v1, :cond_7

    if-eqz v5, :cond_6

    if-eqz p6, :cond_5

    if-eqz v7, :cond_4

    if-eqz v2, :cond_3

    if-eqz v3, :cond_2

    if-eqz v4, :cond_1

    if-eqz v8, :cond_0

    .line 151
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    iput-object v6, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->context:Landroid/content/Context;

    .line 152
    iput-object v1, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    .line 153
    iput-object v5, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 154
    iput-object v2, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 155
    iput-object v3, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 156
    iput-object v4, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    .line 157
    iput-object v8, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 158
    iput-object v7, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    .line 161
    iget-object v1, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-static {v1, v2}, Lcom/shopkick/app/util/ShopkickAppStateProvider;->initialize(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;)V

    .line 163
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/SDKClient;->getZoneManager()Lcom/shopkick/sdk/zone/ZoneManager;

    move-result-object v1

    iget-object v2, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    invoke-virtual {v1, v2}, Lcom/shopkick/sdk/zone/ZoneManager;->addZoneEventsListener(Lcom/shopkick/sdk/zone/ZoneEventsListener;)V

    .line 166
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/SDKClient;->getSensorManager()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v1

    iget-object v2, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->sensorEventsListener:Lcom/shopkick/sdk/sensor/SensorEventsListener;

    invoke-virtual {v1, v2}, Lcom/shopkick/sdk/sensor/SensorManager;->addSensorEventsListener(Lcom/shopkick/sdk/sensor/SensorEventsListener;)V

    .line 168
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v1

    iget-object v2, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v1, v2}, Lcom/shopkick/sdk/presence/LocationManager;->addLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 170
    new-instance v9, Lcom/shopkick/app/campaigns/MessagingManager;

    iget-object v2, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->context:Landroid/content/Context;

    move-object v1, v9

    move-object v3, p2

    move-object v4, p3

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p11

    invoke-direct/range {v1 .. v8}, Lcom/shopkick/app/campaigns/MessagingManager;-><init>(Landroid/content/Context;Lcom/shopkick/app/util/Clock;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/presence/WalkinController;Lcom/shopkick/app/application/SKLogger;)V

    iput-object v9, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->messagingManager:Lcom/shopkick/app/campaigns/MessagingManager;

    .line 177
    iget-object v1, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "AppActivityManagerAppForegroundedEvent"

    const/4 v3, 0x1

    invoke-virtual {v1, p0, v2, v3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 178
    iget-object v1, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "AppActivityManagerAppBackgroundedEvent"

    invoke-virtual {v1, p0, v2, v3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 179
    iget-object v1, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "UserAccountIdChangedEvent"

    invoke-virtual {v1, p0, v2, v3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 181
    iget-object v1, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->context:Landroid/content/Context;

    const v2, 0x7f11076b

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->walkinBackgroundNotificationTitle:Ljava/lang/String;

    .line 182
    iget-object v1, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->context:Landroid/content/Context;

    const v2, 0x7f11076a

    .line 183
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/campaigns/BLECampaignController;->walkinBackgroundNotificationMessage:Ljava/lang/String;

    return-void

    .line 149
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'logger\' cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 148
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'firstUseController\' cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 147
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'notificationCenter\' cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 146
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'appActivityManager\' cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 145
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'walkinController\' cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 144
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'appPrefs\' cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 143
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'clientFlagsManager\' cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 142
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'apiManagerV2\' cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 141
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'userAccount\' cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 140
    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'clock\' cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 139
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'context\' cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method static synthetic access$000(Lcom/shopkick/app/campaigns/BLECampaignController;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 77
    invoke-direct {p0, p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->handleCampaignsResponse(Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->workExecutor:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static synthetic access$1200()Landroid/os/Handler;
    .locals 1

    .line 77
    sget-object v0, Lcom/shopkick/app/campaigns/BLECampaignController;->mainHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1300(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/SKLogger;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->logger:Lcom/shopkick/app/application/SKLogger;

    return-object p0
.end method

.method static synthetic access$1400(Landroid/location/Location;)Landroid/location/Location;
    .locals 0

    .line 77
    invoke-static {p0}, Lcom/shopkick/app/campaigns/BLECampaignController;->roundLocationForCaching(Landroid/location/Location;)Landroid/location/Location;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1500(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/fetchers/api/APIManager;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    return-object p0
.end method

.method static synthetic access$1600(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/lang/Object;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->campaignssUpdateLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$1700()Ljava/lang/Integer;
    .locals 1

    .line 77
    sget-object v0, Lcom/shopkick/app/campaigns/BLECampaignController;->maxResponseWaitTime:Ljava/lang/Integer;

    return-object v0
.end method

.method static synthetic access$1800(Lcom/shopkick/app/campaigns/BLECampaignController;ZLjava/lang/String;I)V
    .locals 0

    .line 77
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/campaigns/BLECampaignController;->makeWalkinCallback(ZLjava/lang/String;I)V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/AppActivityManager;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/util/concurrent/ConcurrentSkipListSet;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->enteredZones:Ljava/util/concurrent/ConcurrentSkipListSet;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/campaigns/BLECampaignController;Lcom/shopkick/app/fetchers/api/skapi/Campaign;)Z
    .locals 0

    .line 77
    invoke-direct {p0, p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->isActiveCampaign(Lcom/shopkick/app/fetchers/api/skapi/Campaign;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->zoneIdToEnteredZone:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/campaigns/MessagingManager;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->messagingManager:Lcom/shopkick/app/campaigns/MessagingManager;

    return-object p0
.end method

.method static synthetic access$800(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/lang/String;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->walkinBackgroundNotificationTitle:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$900(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/lang/String;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->walkinBackgroundNotificationMessage:Ljava/lang/String;

    return-object p0
.end method

.method private addEnteredCampaignToHistory(Lcom/shopkick/app/fetchers/api/skapi/Campaign;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1007
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->epochTimeToEnteredCampaign:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/ConcurrentSkipListMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private fetchLocationBasedCampaigns(Landroid/location/Location;Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 15

    .line 253
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 254
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 255
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "BLECampaignController.fetchLocationBasedCampaigns(lat:%1$f lon:%2$f)"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    .line 257
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 258
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v4, v6

    .line 255
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 261
    new-instance v9, Lcom/shopkick/app/fetchers/api/skapi/NearbyCampaignsRequest;

    invoke-direct {v9}, Lcom/shopkick/app/fetchers/api/skapi/NearbyCampaignsRequest;-><init>()V

    .line 262
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, v9, Lcom/shopkick/app/fetchers/api/skapi/NearbyCampaignsRequest;->latitude:Ljava/lang/Double;

    .line 263
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, v9, Lcom/shopkick/app/fetchers/api/skapi/NearbyCampaignsRequest;->longitude:Ljava/lang/Double;

    .line 266
    sget-object v8, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    new-instance v10, Lcom/shopkick/app/campaigns/BLECampaignController$1;

    move-object v0, p0

    invoke-direct {v10, p0}, Lcom/shopkick/app/campaigns/BLECampaignController$1;-><init>(Lcom/shopkick/app/campaigns/BLECampaignController;)V

    sget-object v12, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v13, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v14, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v11, 0x1

    move-object/from16 v7, p2

    invoke-virtual/range {v7 .. v14}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private handleCampaignsResponse(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 9

    if-eqz p1, :cond_3

    const/4 v0, 0x0

    .line 307
    :try_start_0
    iget-object v1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v1, v1, Lcom/shopkick/app/fetchers/api/skapi/NearbyCampaignsResponse;

    if-eqz v1, :cond_3

    .line 308
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 309
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 310
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "CHECKIN: BLECampaignController: nearby campaigns response received"

    new-array v5, v0, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 312
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyCampaignsResponse;

    .line 313
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyCampaignsResponse;->campaigns:Ljava/util/List;

    if-eqz v1, :cond_3

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyCampaignsResponse;->campaigns:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_3

    .line 315
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyCampaignsResponse;->campaigns:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    .line 318
    invoke-direct {p0, v1}, Lcom/shopkick/app/campaigns/BLECampaignController;->isActiveCampaign(Lcom/shopkick/app/fetchers/api/skapi/Campaign;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 319
    invoke-direct {p0, v1}, Lcom/shopkick/app/campaigns/BLECampaignController;->addEnteredCampaignToHistory(Lcom/shopkick/app/fetchers/api/skapi/Campaign;)V

    .line 321
    new-instance v2, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;

    invoke-direct {v2, p0, v1}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;-><init>(Lcom/shopkick/app/campaigns/BLECampaignController;Lcom/shopkick/app/fetchers/api/skapi/Campaign;)V

    .line 322
    iget-object v3, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->registeredZoneProximityListeners:Ljava/util/LinkedList;

    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 323
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v3

    .line 324
    invoke-virtual {v3}, Lcom/shopkick/sdk/SDKClient;->getZoneManager()Lcom/shopkick/sdk/zone/ZoneManager;

    move-result-object v3

    iget-object v4, v1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->detectionThreshold:Ljava/lang/Integer;

    .line 326
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, v1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->zoneQuery:Ljava/lang/String;

    .line 325
    invoke-virtual {v3, v2, v4, v5}, Lcom/shopkick/sdk/zone/ZoneManager;->addProximityListener(Lcom/shopkick/sdk/zone/ZoneProximityListener;ILjava/lang/String;)V

    .line 328
    iget-object v3, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->registeredZoneProximityListeners:Ljava/util/LinkedList;

    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 331
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    .line 332
    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 333
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "BLECampaignController: ProximityListener added [start:%1$d end:%2$d threshold:%3$d zoneQuery:%4$s]"

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    iget-object v7, v1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->start:Ljava/lang/Long;

    aput-object v7, v6, v0

    const/4 v7, 0x1

    iget-object v8, v1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->end:Ljava/lang/Long;

    aput-object v8, v6, v7

    const/4 v7, 0x2

    iget-object v8, v1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->detectionThreshold:Ljava/lang/Integer;

    aput-object v8, v6, v7

    const/4 v7, 0x3

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->zoneQuery:Ljava/lang/String;

    aput-object v1, v6, v7

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 341
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/campaigns/BLECampaignController;->purgeOldCampaignEntries()V

    .line 343
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->epochOfLastCampaignsUpdate:Ljava/lang/Long;

    .line 344
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->campaignssUpdateLock:Ljava/lang/Object;

    monitor-enter p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 345
    :try_start_1
    iget-object v1, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->campaignssUpdateLock:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 346
    monitor-exit p1

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    move-object v4, p1

    .line 351
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 352
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object p1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 353
    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object p1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v2, v5

    const-string v5, "BLECampaignController.handleCampaignsResponse() failed"

    new-array v6, v0, [Ljava/lang/Object;

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method

.method private isActiveCampaign(Lcom/shopkick/app/fetchers/api/skapi/Campaign;)Z
    .locals 7

    .line 194
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 195
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->start:Ljava/lang/Long;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_0

    .line 196
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 197
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 198
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v5, "Campaign has no start date: %s"

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v4

    invoke-virtual {v0, v1, v2, v5, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return v4

    .line 201
    :cond_0
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->start:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v2, v0, v5

    if-lez v2, :cond_1

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->end:Ljava/lang/Long;

    if-eqz v2, :cond_2

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->end:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long p1, v0, v5

    if-gez p1, :cond_1

    goto :goto_0

    :cond_1
    move v3, v4

    :cond_2
    :goto_0
    return v3
.end method

.method private makeWalkinCallback(ZLjava/lang/String;I)V
    .locals 1

    .line 1031
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    invoke-virtual {v0, p1, p2, p3}, Lcom/shopkick/app/presence/WalkinController;->makeWalkinCallback(ZLjava/lang/String;I)V

    return-void
.end method

.method private purgeOldCampaignEntries()V
    .locals 8

    .line 1012
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->epochTimeToEnteredCampaign:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;->keySet()Ljava/util/NavigableSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    .line 1013
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-object v6, Lcom/shopkick/app/campaigns/BLECampaignController;->maxValidCampaignsTime:Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    sub-long/2addr v4, v6

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    .line 1014
    iget-object v2, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->epochTimeToEnteredCampaign:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentSkipListMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static roundLocationForCaching(Landroid/location/Location;)Landroid/location/Location;
    .locals 2

    if-eqz p0, :cond_0

    const-wide v0, 0x40bf6eb851eb851fL    # 8046.72

    .line 365
    invoke-static {p0, v0, v1}, Lcom/shopkick/utilities/GeoUtilities;->roundLatLonForBucketedCaching(Landroid/location/Location;D)V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public cancelBleNotification()V
    .locals 3

    .line 209
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->messagingManager:Lcom/shopkick/app/campaigns/MessagingManager;

    iget-object v1, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->context:Landroid/content/Context;

    const v2, 0x7f11076a

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/campaigns/MessagingManager;->cancelBleMessageSystemNotification(Ljava/lang/String;)V

    return-void
.end method

.method public doCampaignsUpdate(Landroid/location/Location;)V
    .locals 8

    .line 980
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->epochOfLastCampaignsUpdate:Ljava/lang/Long;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->epochOfLastCampaignsUpdate:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-object v0, Lcom/shopkick/app/campaigns/BLECampaignController;->maxValidResponseTime:Ljava/lang/Long;

    .line 981
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    sub-long/2addr v4, v6

    cmp-long v0, v2, v4

    if-ltz v0, :cond_0

    .line 982
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 983
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 984
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v0, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v0, "CHECKIN: BLECampaignController: nearby campaigns already updated in past 5 minutes"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 990
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 991
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 992
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "CHECKIN: BLECampaignController: sending nearby campaigns request"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v1}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 994
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->fetchLocationBasedCampaigns(Landroid/location/Location;Lcom/shopkick/fetchers/api/APIManager;)V

    return-void
.end method

.method public forceBLEWalkin()V
    .locals 6

    .line 958
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    .line 960
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 961
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 962
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "CHECKIN: BLECampaignController: forceBLEWalkin() doCampaignsUpdate with location "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 966
    invoke-virtual {p0, v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->doCampaignsUpdate(Landroid/location/Location;)V

    .line 969
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->zonesCheckResults:Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/SDKClient;->doZonesCheck(Lcom/shopkick/sdk/SDKClient$ZonesCheckResults;)V

    return-void
.end method

.method public getRecentlyEnteredCampaigns()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/shopkick/app/fetchers/api/skapi/Campaign;",
            ">;"
        }
    .end annotation

    .line 1027
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->epochTimeToEnteredCampaign:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "AppActivityManagerAppForegroundedEvent"

    if-ne p2, p1, :cond_2

    .line 377
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {p1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result p1

    if-nez p1, :cond_2

    .line 380
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/BLECampaignController;->cancelBleNotification()V

    .line 383
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->zoneIdToEnteredZone:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 384
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->zoneIdToEnteredZone:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/zone/ZoneReading;

    if-eqz v0, :cond_0

    .line 389
    iget-object v1, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->zoneIdToEnteredZone:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    invoke-interface {v0}, Lcom/shopkick/sdk/zone/ZoneReading;->getEnteredTimestamp()J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-wide/32 v5, 0x927c0

    sub-long/2addr v3, v5

    cmp-long p2, v1, v3

    if-ltz p2, :cond_0

    .line 394
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    .line 395
    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 396
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "BLECampaignController: App is now foreground, submitting queued walkin [zoneId:%1$s]"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    .line 398
    invoke-interface {v0}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v7

    invoke-interface {v7}, Lcom/shopkick/sdk/zone/Zone;->getZoneId()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    .line 396
    invoke-virtual {p2, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 399
    iget-object p2, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->messagingManager:Lcom/shopkick/app/campaigns/MessagingManager;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/shopkick/app/campaigns/MessagingManager;->doWalkin(Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)Z

    goto :goto_0

    .line 405
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/BLECampaignController;->updatedLocation()V

    :cond_2
    return-void
.end method

.method public updatedLocation()V
    .locals 5

    .line 231
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 232
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 233
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "BLECampaignController.updatedLocation()"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 238
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->updatedLocation(Landroid/location/Location;)V

    .line 243
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->initiateLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    return-void
.end method

.method public updatedLocation(Landroid/location/Location;)V
    .locals 5

    .line 217
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 218
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 219
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "BLECampaignController.updatedLocation(Location)"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 221
    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->roundLocationForCaching(Landroid/location/Location;)Landroid/location/Location;

    if-eqz p1, :cond_0

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->fetchLocationBasedCampaigns(Landroid/location/Location;Lcom/shopkick/fetchers/api/APIManager;)V

    :cond_0
    return-void
.end method
