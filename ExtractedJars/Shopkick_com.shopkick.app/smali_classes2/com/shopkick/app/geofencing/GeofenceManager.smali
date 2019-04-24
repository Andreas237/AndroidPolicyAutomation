.class public Lcom/shopkick/app/geofencing/GeofenceManager;
.super Ljava/lang/Object;
.source "GeofenceManager.java"

# interfaces
.implements Lcom/google/android/gms/location/LocationListener;
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/location/IActivityRecognitionCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;,
        Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;
    }
.end annotation


# static fields
.field public static final CONFIDENCE_THRESHOLD_FOR_STOPPING_GEOFENCING:I = 0x50

.field private static final DEFAULT_GEOFENCE_RADIUS_METERS:I = 0x64

.field private static final DELTA_TO_SET_NEW_GEOFENCES_METERS:I = 0x3e8

.field private static final GEOFENCING_MAX_HOUR:I = 0x16

.field private static final GEOFENCING_MIN_HOUR:I = 0x8

.field private static final LOCATION_UPDATE_INTERVAL_MS:I = 0x1b7740

.field private static final MIN_LOCATION_ACCURACY_FOR_GEOFENCE_METERS:I = 0xc8

.field private static final NEARBY_STORE_AWARDS_ALARM_ID:Ljava/lang/String; = "NEARBY_STORE_AWARDS_ALARM_ID"

.field private static final STORED_GEOFENCES_FILE_NAME:Ljava/lang/String; = "shopkick_geofences.json"

.field private static final TEST_DELTA_TO_SET_NEW_GEOFENCES_METERS:I = 0x0

.field private static final TEST_LOCATION_UPDATE_INTERVAL_MS:I = 0x4e20


# instance fields
.field private MAX_ALARMS_PER_DAY:I

.field private alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private final context:Landroid/content/Context;

.field private debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

.field private debugMode:Z

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private geoFenceSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensor;

.field private geofencingDynamicRequest:Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;

.field private geofencingStateIdsNotified:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private geofencingUserData:Lcom/shopkick/app/geofencing/GeofencingUserData;

.field private isGeofencingOn:Z

.field private lastGeofencingDynamicResponse:Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;

.field private lastKnownActivity:I

.field private lastKnownActivityConfidenceLevel:I

.field private lastLocation:Landroid/location/Location;

.field private lastLocationForGeofenceReset:Landroid/location/Location;

.field lastNotificationFormattedDate:Ljava/lang/String;

.field private final monitoredGeoFencesList:Ljava/util/concurrent/ConcurrentSkipListSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation
.end field

.field private notificationAlarmCount:I

.field private final readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

.field private skActivityRecognitionManager:Lcom/shopkick/app/location/SKActivityRecognitionManager;

.field private skLocationManager:Lcom/shopkick/app/location/SKLocationManager;

.field private final userAccount:Lcom/shopkick/app/account/UserAccount;

.field public final walkinController:Lcom/shopkick/app/presence/WalkinController;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Boolean;Lcom/shopkick/app/util/AlarmScheduler;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/debug/DebugLogManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/location/SKActivityRecognitionManager;Lcom/shopkick/app/location/SKLocationManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/presence/WalkinController;)V
    .locals 1

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 87
    iput v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->MAX_ALARMS_PER_DAY:I

    .line 112
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->monitoredGeoFencesList:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 321
    new-instance v0, Lcom/shopkick/app/geofencing/GeofenceManager$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/geofencing/GeofenceManager$1;-><init>(Lcom/shopkick/app/geofencing/GeofenceManager;)V

    iput-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    if-eqz p13, :cond_0

    .line 133
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->context:Landroid/content/Context;

    .line 134
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iput-boolean p2, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->debugMode:Z

    .line 135
    iput-object p3, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    .line 136
    iput-object p5, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 137
    iput-object p6, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 138
    iput-object p7, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 139
    iput-object p8, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    .line 140
    iput-object p9, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 141
    iput-object p10, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->skActivityRecognitionManager:Lcom/shopkick/app/location/SKActivityRecognitionManager;

    .line 142
    iput-object p11, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->skLocationManager:Lcom/shopkick/app/location/SKLocationManager;

    .line 143
    iput-object p4, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 144
    iput-object p14, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    .line 146
    new-instance p2, Lcom/shopkick/app/geofencing/GeofencingUserData;

    invoke-direct {p2, p1}, Lcom/shopkick/app/geofencing/GeofencingUserData;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingUserData:Lcom/shopkick/app/geofencing/GeofencingUserData;

    .line 148
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingUserData:Lcom/shopkick/app/geofencing/GeofencingUserData;

    invoke-virtual {p1}, Lcom/shopkick/app/geofencing/GeofencingUserData;->getNotificationCount()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->notificationAlarmCount:I

    .line 149
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingUserData:Lcom/shopkick/app/geofencing/GeofencingUserData;

    invoke-virtual {p1}, Lcom/shopkick/app/geofencing/GeofencingUserData;->getLastNotificationFormattedDate()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastNotificationFormattedDate:Ljava/lang/String;

    .line 150
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingUserData:Lcom/shopkick/app/geofencing/GeofencingUserData;

    invoke-virtual {p1}, Lcom/shopkick/app/geofencing/GeofencingUserData;->getGeofencingStateIdsNotified()Ljava/util/HashSet;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingStateIdsNotified:Ljava/util/HashSet;

    const/4 p1, 0x0

    .line 151
    iput-boolean p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->isGeofencingOn:Z

    const/4 p2, 0x4

    .line 152
    iput p2, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastKnownActivity:I

    .line 153
    iput p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastKnownActivityConfidenceLevel:I

    .line 155
    iget-object p1, p7, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresPnsDailyLimit:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->MAX_ALARMS_PER_DAY:I

    const-string p1, "ClientFlagsUpdated"

    .line 156
    invoke-virtual {p12, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 157
    iput-object p13, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    return-void

    .line 130
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "userAccount is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/shopkick/app/geofencing/GeofenceManager;)Landroid/content/Context;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/geofencing/GeofenceManager;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->createGeofences(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/geofencing/GeofenceManager;)Ljava/util/concurrent/ConcurrentSkipListSet;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->monitoredGeoFencesList:Ljava/util/concurrent/ConcurrentSkipListSet;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/geofencing/GeofenceManager;)Lcom/shopkick/sdk/sensor/GeoFenceSensor;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geoFenceSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/geofencing/GeofenceManager;)Landroid/location/Location;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastLocation:Landroid/location/Location;

    return-object p0
.end method

.method private createGeofenceFromLocationInfo(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;)Lcom/shopkick/sdk/sensor/GeoFence;
    .locals 6

    .line 524
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->fencingRadius:Ljava/lang/Integer;

    if-eqz p1, :cond_0

    .line 525
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->fencingRadius:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    move v5, p1

    goto :goto_0

    :cond_0
    const/16 p1, 0x64

    move v5, p1

    .line 527
    :goto_0
    new-instance p1, Lcom/shopkick/sdk/sensor/GeoFence;

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->latitude:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->longitude:Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/sdk/sensor/GeoFence;-><init>(DDI)V

    return-object p1
.end method

.method private createGeofences(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation

    .line 511
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 512
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 513
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;

    .line 514
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3, v2}, Lcom/shopkick/app/geofencing/GeofenceManager;->createGeofenceFromLocationInfo(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;)Lcom/shopkick/sdk/sensor/GeoFence;

    move-result-object v2

    .line 515
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private startGeofencing()V
    .locals 7

    .line 197
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geoFenceSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    if-nez v0, :cond_0

    return-void

    .line 198
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->isGeofencingOn:Z

    if-nez v0, :cond_2

    .line 199
    invoke-virtual {p0}, Lcom/shopkick/app/geofencing/GeofenceManager;->shouldGeofencingBeOn()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "activity triggered geofencing start"

    .line 200
    invoke-virtual {p0, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 201
    iput-boolean v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->isGeofencingOn:Z

    .line 202
    iget-object v1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->skLocationManager:Lcom/shopkick/app/location/SKLocationManager;

    const-wide/32 v2, 0x1b7740

    const/high16 v4, 0x447a0000    # 1000.0f

    const/16 v5, 0x66

    move-object v6, p0

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/app/location/SKLocationManager;->requestLocationUpdates(JFILcom/google/android/gms/location/LocationListener;)V

    const-string v0, "geofencing notification enabled and geofencingUseExperimentalGeofencingAlgorithm"

    .line 206
    invoke-virtual {p0, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "geofencing notification disabled or !geofencingUseExperimentalGeofencingAlgorithm"

    .line 208
    invoke-virtual {p0, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private stopGeofencing()V
    .locals 1

    .line 214
    iget-boolean v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->isGeofencingOn:Z

    if-eqz v0, :cond_0

    const-string v0, "activity triggered geofencing stop"

    .line 215
    invoke-virtual {p0, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    .line 216
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->skLocationManager:Lcom/shopkick/app/location/SKLocationManager;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/location/SKLocationManager;->removeUpdates(Lcom/google/android/gms/location/LocationListener;)V

    const/4 v0, 0x0

    .line 217
    iput-boolean v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->isGeofencingOn:Z

    :cond_0
    return-void
.end method

.method private updateLastNotificationFormattedDate(Ljava/lang/String;)V
    .locals 1

    .line 496
    iput-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastNotificationFormattedDate:Ljava/lang/String;

    .line 497
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingUserData:Lcom/shopkick/app/geofencing/GeofencingUserData;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/geofencing/GeofencingUserData;->setLastNotificationFormattedDate(Ljava/lang/String;)V

    return-void
.end method

.method private updateNotificationCount(I)V
    .locals 1

    .line 491
    iput p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->notificationAlarmCount:I

    .line 492
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingUserData:Lcom/shopkick/app/geofencing/GeofencingUserData;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/geofencing/GeofencingUserData;->setNotificationCount(I)V

    return-void
.end method

.method public static userDistanceTo(Landroid/location/Location;Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;)Ljava/lang/Float;
    .locals 4

    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    .line 501
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->latitude:Ljava/lang/Double;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->longitude:Ljava/lang/Double;

    if-nez v0, :cond_0

    goto :goto_0

    .line 505
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->latitude:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->longitude:Ljava/lang/Double;

    .line 506
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    .line 505
    invoke-static {v0, v1, v2, v3}, Lcom/shopkick/app/location/LocationNotifier;->locationFromCoordinates(DD)Landroid/location/Location;

    move-result-object p1

    .line 507
    invoke-virtual {p0, p1}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const-string v0, "GEOFENCE2"

    .line 502
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Got bad Location/NearbyLocationInfo "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " | "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 563
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingDynamicRequest:Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;

    if-eq p1, v0, :cond_0

    return-void

    .line 566
    :cond_0
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_1

    .line 567
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;

    .line 569
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;->nearbyLocationInfoList:Ljava/util/List;

    if-eqz p2, :cond_1

    .line 570
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;->nearbyLocationInfoList:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    .line 571
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Got "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " dynamic fences from server."

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    .line 572
    iput-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastGeofencingDynamicResponse:Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;

    .line 573
    new-instance p2, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;

    invoke-direct {p2, p0, v0}, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;-><init>(Lcom/shopkick/app/geofencing/GeofenceManager;Lcom/shopkick/app/geofencing/GeofenceManager$1;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p2, v1}, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 577
    :cond_1
    iput-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingDynamicRequest:Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;

    return-void
.end method

.method public fetchNewGeofences(Landroid/location/Location;)V
    .locals 3

    .line 236
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingDynamicRequest:Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;

    if-eqz v0, :cond_0

    return-void

    .line 240
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingDynamicRequest:Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingDynamicRequest:Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;->latitude:Ljava/lang/Double;

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingDynamicRequest:Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;->longitude:Ljava/lang/Double;

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingDynamicRequest:Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;->accuracy:Ljava/lang/Double;

    .line 244
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingDynamicRequest:Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 246
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "geofenceRequest: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    return-void
.end method

.method public geofenceLog(Ljava/lang/String;)V
    .locals 2

    .line 551
    iget-boolean v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->debugMode:Z

    if-eqz v0, :cond_0

    .line 552
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    const-string v1, "GEOFENCE2"

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/debug/DebugLogManager;->logWithTimeStamp(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onActivityDetected(Lcom/google/android/gms/location/DetectedActivity;)V
    .locals 1

    .line 255
    invoke-virtual {p1}, Lcom/google/android/gms/location/DetectedActivity;->getType()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/location/DetectedActivity;->getConfidence()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->updateActivity(II)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
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

    const-string p2, "ClientFlagsUpdated"

    .line 616
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 617
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofenceNearbyStoresPnsDailyLimit:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->MAX_ALARMS_PER_DAY:I

    .line 618
    invoke-virtual {p0}, Lcom/shopkick/app/geofencing/GeofenceManager;->shouldGeofencingBeOn()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 619
    invoke-direct {p0}, Lcom/shopkick/app/geofencing/GeofenceManager;->startGeofencing()V

    goto :goto_0

    .line 621
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/geofencing/GeofenceManager;->stopGeofencing()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 5

    .line 583
    iput-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastLocation:Landroid/location/Location;

    .line 585
    invoke-virtual {p1}, Landroid/location/Location;->hasAccuracy()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 586
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 588
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 590
    :goto_0
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    .line 591
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    .line 592
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onLocationChanged:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " Acc:"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 593
    invoke-virtual {p0, v1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    .line 596
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x43480000    # 200.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    return-void

    .line 601
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastLocationForGeofenceReset:Landroid/location/Location;

    if-eqz v0, :cond_2

    .line 602
    invoke-virtual {p1, v0}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    return-void

    .line 606
    :cond_2
    iput-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastLocationForGeofenceReset:Landroid/location/Location;

    .line 607
    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->fetchNewGeofences(Landroid/location/Location;)V

    return-void
.end method

.method public queueLoadGeofencesAndSendMessageTask()V
    .locals 4

    .line 537
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableGeofencingWhenWifiIsDisabled:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/DeviceInfo;->isWifiEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 542
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->skLocationManager:Lcom/shopkick/app/location/SKLocationManager;

    invoke-virtual {v0}, Lcom/shopkick/app/location/SKLocationManager;->getLastKnownLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 544
    iput-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastLocation:Landroid/location/Location;

    .line 546
    :cond_1
    new-instance v0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;-><init>(Lcom/shopkick/app/geofencing/GeofenceManager;Lcom/shopkick/app/geofencing/GeofenceManager$1;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastGeofencingDynamicResponse:Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public sessionEnded()V
    .locals 2

    const-string v0, "geofencing start on background (activity)"

    .line 188
    invoke-virtual {p0, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    .line 189
    invoke-direct {p0}, Lcom/shopkick/app/geofencing/GeofenceManager;->startGeofencing()V

    .line 190
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingMeasureVelocity:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->skActivityRecognitionManager:Lcom/shopkick/app/location/SKActivityRecognitionManager;

    const/16 v1, 0x7530

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->registerCallback(Lcom/shopkick/app/location/IActivityRecognitionCallback;I)V

    :cond_0
    return-void
.end method

.method public sessionStarted()V
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->skActivityRecognitionManager:Lcom/shopkick/app/location/SKActivityRecognitionManager;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->unregisterCallback(Lcom/shopkick/app/location/IActivityRecognitionCallback;)V

    const-string v0, "geofencing stop on foreground (activity)"

    .line 182
    invoke-virtual {p0, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    .line 183
    invoke-direct {p0}, Lcom/shopkick/app/geofencing/GeofenceManager;->stopGeofencing()V

    return-void
.end method

.method public setupGeoFenceSensor()V
    .locals 4

    .line 161
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    .line 162
    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getSensorManager()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v0

    const-class v1, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    iget-object v2, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    const/4 v3, 0x0

    .line 163
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/sdk/sensor/SensorManager;->open(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    iput-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geoFenceSensor:Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    return-void
.end method

.method public shouldGeofencingBeOn()Z
    .locals 3

    .line 168
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 170
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/utilities/GooglePlayServicesUtility;->isGooglePlayServicesAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 172
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v2, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0, v2}, Lcom/shopkick/app/util/FeatureFlagHelper;->isNearOrInStoreNotificationEnabled(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    .line 176
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->geofencingUseExperimentalGeofencingAlgorithm:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public updateActivity(II)V
    .locals 1

    .line 222
    iput p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastKnownActivity:I

    .line 223
    iput p2, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastKnownActivityConfidenceLevel:I

    if-eqz p1, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    if-ne p1, p2, :cond_2

    .line 230
    invoke-direct {p0}, Lcom/shopkick/app/geofencing/GeofenceManager;->startGeofencing()V

    goto :goto_1

    :cond_1
    :goto_0
    const/16 p1, 0x50

    if-lt p2, p1, :cond_2

    .line 227
    invoke-direct {p0}, Lcom/shopkick/app/geofencing/GeofenceManager;->stopGeofencing()V

    :cond_2
    :goto_1
    return-void
.end method

.method public validateAndSendMessage(Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;)V
    .locals 8

    .line 425
    iget-object v6, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->message:Ljava/lang/String;

    .line 426
    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->summary:Ljava/lang/String;

    .line 427
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->title:Ljava/lang/String;

    .line 428
    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->redirectSklink:Ljava/lang/String;

    .line 429
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "consider message()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    .line 431
    iget v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastKnownActivity:I

    if-nez v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastKnownActivityConfidenceLevel:I

    const/16 v1, 0x50

    if-lt v0, v1, :cond_0

    const-string p1, "NOT GONA NOTIFY YOU WHILE DRIVING SON"

    .line 433
    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    return-void

    .line 437
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->chainId:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/presence/WalkinController;->hasWalkedinSameChainRecently(Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "No geofen since user has walkedin recently(1 day) for this chain"

    .line 438
    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    return-void

    .line 442
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isNearOrInStoreNotificationEnabled(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 443
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 444
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "HH"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 445
    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x8

    if-lt v1, v2, :cond_8

    const/16 v2, 0x16

    if-lt v1, v2, :cond_2

    goto/16 :goto_1

    .line 450
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v7, 0x3a

    if-ne v1, v7, :cond_3

    .line 451
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    const/4 v7, 0x7

    invoke-virtual {v1, v7}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v1, v2, :cond_3

    const-string p1, "NO GEO-FENCING FOR GERMAN USERS ON SUNDAY."

    .line 452
    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    return-void

    .line 455
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result v1

    if-nez v1, :cond_4

    const-string p1, "APP IS ALREADY IN FOREGROUND SON"

    .line 456
    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    return-void

    .line 459
    :cond_4
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v7, "ddMMyy"

    invoke-direct {v1, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 460
    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 461
    iget-object v1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->lastNotificationFormattedDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 462
    iget v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->notificationAlarmCount:I

    iget v1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->MAX_ALARMS_PER_DAY:I

    if-lt v0, v1, :cond_5

    .line 463
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "YOU CAPPED AT "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->MAX_ALARMS_PER_DAY:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " NOTIFICATIONS TODAY SON"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    return-void

    .line 466
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingStateIdsNotified:Ljava/util/HashSet;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->geofencingStateId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 467
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NOTIFIED LOCATION ID:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->geofencingStateId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " TODAY ALREADY SON"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    return-void

    .line 470
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "THIS BE NOTIFICATION NUMBER "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->notificationAlarmCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " TODAY SON"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    .line 471
    iget v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->notificationAlarmCount:I

    add-int/2addr v0, v2

    invoke-direct {p0, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->updateNotificationCount(I)V

    .line 472
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingStateIdsNotified:Ljava/util/HashSet;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->geofencingStateId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 473
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingUserData:Lcom/shopkick/app/geofencing/GeofencingUserData;

    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingStateIdsNotified:Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofencingUserData;->setGeofencingStateIdsNotified(Ljava/util/HashSet;)V

    goto :goto_0

    .line 475
    :cond_7
    invoke-direct {p0, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->updateLastNotificationFormattedDate(Ljava/lang/String;)V

    const-string v0, "FIRST NOTIFICATION OF THE DAY SON"

    .line 476
    invoke-virtual {p0, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    .line 477
    invoke-direct {p0, v2}, Lcom/shopkick/app/geofencing/GeofenceManager;->updateNotificationCount(I)V

    .line 478
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingStateIdsNotified:Ljava/util/HashSet;

    .line 479
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingStateIdsNotified:Ljava/util/HashSet;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->geofencingStateId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 480
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingUserData:Lcom/shopkick/app/geofencing/GeofencingUserData;

    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->geofencingStateIdsNotified:Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofencingUserData;->setGeofencingStateIdsNotified(Ljava/util/HashSet;)V

    .line 483
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "NEARBY_STORE_AWARDS_ALARM_ID"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->notificationAlarmCount:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 484
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const/4 v2, 0x0

    const/4 v7, 0x4

    invoke-virtual/range {v0 .. v7}, Lcom/shopkick/app/util/AlarmScheduler;->scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z

    goto :goto_2

    :cond_8
    :goto_1
    const-string p1, "CURRENT TIME IS NOT SHOPPING HOURS (0800-2200) SON"

    .line 447
    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    return-void

    :cond_9
    const-string p1, "geofencing notification disabled"

    .line 486
    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    :goto_2
    return-void
.end method
