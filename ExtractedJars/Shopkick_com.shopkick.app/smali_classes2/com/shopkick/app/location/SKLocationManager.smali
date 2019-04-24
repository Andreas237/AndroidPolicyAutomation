.class public Lcom/shopkick/app/location/SKLocationManager;
.super Ljava/lang/Object;
.source "SKLocationManager.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/location/SKLocationManager$RemoveGeofencesResultCallback;,
        Lcom/shopkick/app/location/SKLocationManager$AddGeofencesResultCallback;,
        Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;,
        Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;
    }
.end annotation


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "SKLocationManager"


# instance fields
.field private addGeofencesResultCallback:Lcom/shopkick/app/location/SKLocationManager$AddGeofencesResultCallback;

.field private connectionInProgress:Z

.field private connectionRequestType:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

.field private context:Landroid/content/Context;

.field private fusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

.field private geofencingApi:Lcom/google/android/gms/location/GeofencingApi;

.field private googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private isProcessingGeofences:Z

.field private locationClientListenersToRemove:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/gms/location/LocationListener;",
            ">;"
        }
    .end annotation
.end field

.field private locationManager:Landroid/location/LocationManager;

.field private locationUpdateRequests:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/google/android/gms/location/LocationListener;",
            "Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;",
            ">;"
        }
    .end annotation
.end field

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private mGeofenceList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/location/Geofence;",
            ">;"
        }
    .end annotation
.end field

.field private removeGeofencesResultCallback:Lcom/shopkick/app/location/SKLocationManager$RemoveGeofencesResultCallback;

.field private final workExecutor:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/SKLogger;)V
    .locals 1

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 73
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->workExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 81
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->context:Landroid/content/Context;

    const/4 v0, 0x0

    .line 82
    iput-boolean v0, p0, Lcom/shopkick/app/location/SKLocationManager;->isProcessingGeofences:Z

    .line 83
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object p1, Lcom/google/android/gms/location/LocationServices;->API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p1

    .line 84
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p1

    .line 85
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p1

    .line 86
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 87
    sget-object p1, Lcom/google/android/gms/location/LocationServices;->FusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->fusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    .line 88
    sget-object p1, Lcom/google/android/gms/location/LocationServices;->GeofencingApi:Lcom/google/android/gms/location/GeofencingApi;

    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->geofencingApi:Lcom/google/android/gms/location/GeofencingApi;

    .line 89
    invoke-direct {p0, p2, p3, p4}, Lcom/shopkick/app/location/SKLocationManager;->setUpSKLocationManager(Landroid/location/LocationManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/SKLogger;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/location/LocationManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/google/android/gms/location/FusedLocationProviderApi;Lcom/google/android/gms/location/GeofencingApi;)V
    .locals 1

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 73
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->workExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 98
    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    .line 101
    iput-object p4, p0, Lcom/shopkick/app/location/SKLocationManager;->fusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    .line 102
    iput-object p5, p0, Lcom/shopkick/app/location/SKLocationManager;->geofencingApi:Lcom/google/android/gms/location/GeofencingApi;

    const/4 p1, 0x0

    .line 103
    iput-boolean p1, p0, Lcom/shopkick/app/location/SKLocationManager;->isProcessingGeofences:Z

    .line 104
    iput-boolean p1, p0, Lcom/shopkick/app/location/SKLocationManager;->connectionInProgress:Z

    const/4 p1, 0x0

    .line 105
    invoke-direct {p0, p2, p3, p1}, Lcom/shopkick/app/location/SKLocationManager;->setUpSKLocationManager(Landroid/location/LocationManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/SKLogger;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/location/SKLocationManager;)Ljava/util/HashMap;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/location/SKLocationManager;->locationUpdateRequests:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/location/SKLocationManager;)Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/location/SKLocationManager;)Lcom/google/android/gms/location/FusedLocationProviderApi;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/location/SKLocationManager;->fusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/location/SKLocationManager;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/shopkick/app/location/SKLocationManager;->logLocationManagerIllegalStateException()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/location/SKLocationManager;)Ljava/util/ArrayList;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/location/SKLocationManager;->locationClientListenersToRemove:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/location/SKLocationManager;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/shopkick/app/location/SKLocationManager;->logLocationManagerSecurityException()V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/app/location/SKLocationManager;JFILcom/google/android/gms/location/LocationListener;)V
    .locals 0

    .line 44
    invoke-direct/range {p0 .. p5}, Lcom/shopkick/app/location/SKLocationManager;->addRequestToLocationClient(JFILcom/google/android/gms/location/LocationListener;)V

    return-void
.end method

.method private addGeofences()V
    .locals 4

    .line 277
    iget-boolean v0, p0, Lcom/shopkick/app/location/SKLocationManager;->isProcessingGeofences:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 279
    :try_start_0
    iput-boolean v0, p0, Lcom/shopkick/app/location/SKLocationManager;->isProcessingGeofences:Z

    .line 280
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->geofencingApi:Lcom/google/android/gms/location/GeofencingApi;

    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-direct {p0}, Lcom/shopkick/app/location/SKLocationManager;->getGeofencingRequest()Lcom/google/android/gms/location/GeofencingRequest;

    move-result-object v2

    invoke-direct {p0}, Lcom/shopkick/app/location/SKLocationManager;->getGeofenceIntent()Landroid/app/PendingIntent;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/location/GeofencingApi;->addGeofences(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager;->addGeofencesResultCallback:Lcom/shopkick/app/location/SKLocationManager$AddGeofencesResultCallback;

    .line 281
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 283
    iput-boolean v0, p0, Lcom/shopkick/app/location/SKLocationManager;->isProcessingGeofences:Z

    .line 284
    invoke-direct {p0}, Lcom/shopkick/app/location/SKLocationManager;->logLocationManagerIllegalStateException()V

    :cond_0
    :goto_0
    return-void
.end method

.method private addRequestToLocationClient(JFILcom/google/android/gms/location/LocationListener;)V
    .locals 9

    .line 209
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->workExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v8, Lcom/shopkick/app/location/SKLocationManager$2;

    move-object v1, v8

    move-object v2, p0

    move-wide v3, p1

    move v5, p3

    move v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/location/SKLocationManager$2;-><init>(Lcom/shopkick/app/location/SKLocationManager;JFILcom/google/android/gms/location/LocationListener;)V

    invoke-interface {v0, v8}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private connectAndAddGeofences(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/location/Geofence;",
            ">;)V"
        }
    .end annotation

    .line 262
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/utilities/GooglePlayServicesUtility;->isGooglePlayServicesAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 265
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->mGeofenceList:Ljava/util/List;

    .line 266
    iget-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 267
    invoke-direct {p0}, Lcom/shopkick/app/location/SKLocationManager;->addGeofences()V

    goto :goto_0

    .line 268
    :cond_1
    iget-boolean p1, p0, Lcom/shopkick/app/location/SKLocationManager;->connectionInProgress:Z

    if-nez p1, :cond_2

    const/4 p1, 0x1

    .line 269
    iput-boolean p1, p0, Lcom/shopkick/app/location/SKLocationManager;->connectionInProgress:Z

    .line 270
    sget-object p1, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->ADD_GEOFENCES:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->connectionRequestType:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    .line 271
    iget-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    :cond_2
    :goto_0
    return-void
.end method

.method private getGeofenceIntent()Landroid/app/PendingIntent;
    .locals 4

    .line 257
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager;->context:Landroid/content/Context;

    const-class v2, Lcom/shopkick/app/geofencing/GeofenceBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 258
    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager;->context:Landroid/content/Context;

    const/4 v2, 0x0

    const/high16 v3, 0x8000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method private getGeofencingRequest()Lcom/google/android/gms/location/GeofencingRequest;
    .locals 2

    .line 250
    new-instance v0, Lcom/google/android/gms/location/GeofencingRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/location/GeofencingRequest$Builder;-><init>()V

    const/4 v1, 0x1

    .line 251
    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/GeofencingRequest$Builder;->setInitialTrigger(I)Lcom/google/android/gms/location/GeofencingRequest$Builder;

    .line 252
    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager;->mGeofenceList:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/GeofencingRequest$Builder;->addGeofences(Ljava/util/List;)Lcom/google/android/gms/location/GeofencingRequest$Builder;

    .line 253
    invoke-virtual {v0}, Lcom/google/android/gms/location/GeofencingRequest$Builder;->build()Lcom/google/android/gms/location/GeofencingRequest;

    move-result-object v0

    return-object v0
.end method

.method private logLocationManagerIllegalStateException()V
    .locals 3

    .line 181
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->logger:Lcom/shopkick/app/application/SKLogger;

    if-eqz v0, :cond_0

    .line 182
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x470b8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 183
    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 185
    :cond_0
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    const-string v1, "SKLocationManager"

    const-string v2, "Location Manager Illegal State Exception!"

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private logLocationManagerSecurityException()V
    .locals 3

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->logger:Lcom/shopkick/app/application/SKLogger;

    if-eqz v0, :cond_0

    .line 193
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x470ba

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 194
    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 196
    :cond_0
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    const-string v1, "SKLocationManager"

    const-string v2, "Location Manager Security Exception!"

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private registerLocationRequests()V
    .locals 2

    .line 230
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->workExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/shopkick/app/location/SKLocationManager$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/location/SKLocationManager$3;-><init>(Lcom/shopkick/app/location/SKLocationManager;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private resetGeofences()V
    .locals 3

    .line 305
    iget-boolean v0, p0, Lcom/shopkick/app/location/SKLocationManager;->isProcessingGeofences:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 307
    :try_start_0
    iput-boolean v0, p0, Lcom/shopkick/app/location/SKLocationManager;->isProcessingGeofences:Z

    .line 308
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->geofencingApi:Lcom/google/android/gms/location/GeofencingApi;

    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-direct {p0}, Lcom/shopkick/app/location/SKLocationManager;->getGeofenceIntent()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/location/GeofencingApi;->removeGeofences(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager;->removeGeofencesResultCallback:Lcom/shopkick/app/location/SKLocationManager$RemoveGeofencesResultCallback;

    .line 309
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 311
    iput-boolean v0, p0, Lcom/shopkick/app/location/SKLocationManager;->isProcessingGeofences:Z

    .line 312
    invoke-direct {p0}, Lcom/shopkick/app/location/SKLocationManager;->logLocationManagerIllegalStateException()V

    :cond_0
    :goto_0
    return-void
.end method

.method private setUpSKLocationManager(Landroid/location/LocationManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/SKLogger;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->locationManager:Landroid/location/LocationManager;

    .line 112
    iput-object p3, p0, Lcom/shopkick/app/location/SKLocationManager;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 114
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->locationUpdateRequests:Ljava/util/HashMap;

    .line 115
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->locationClientListenersToRemove:Ljava/util/ArrayList;

    .line 116
    new-instance p1, Lcom/shopkick/app/location/SKLocationManager$AddGeofencesResultCallback;

    invoke-direct {p1, p0}, Lcom/shopkick/app/location/SKLocationManager$AddGeofencesResultCallback;-><init>(Lcom/shopkick/app/location/SKLocationManager;)V

    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->addGeofencesResultCallback:Lcom/shopkick/app/location/SKLocationManager$AddGeofencesResultCallback;

    .line 117
    new-instance p1, Lcom/shopkick/app/location/SKLocationManager$RemoveGeofencesResultCallback;

    invoke-direct {p1, p0}, Lcom/shopkick/app/location/SKLocationManager$RemoveGeofencesResultCallback;-><init>(Lcom/shopkick/app/location/SKLocationManager;)V

    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->removeGeofencesResultCallback:Lcom/shopkick/app/location/SKLocationManager$RemoveGeofencesResultCallback;

    const-string p1, "AppActivityManagerSessionStartEvent"

    .line 119
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 122
    iget-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method


# virtual methods
.method public connectAndResetGeofences(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/location/Geofence;",
            ">;)V"
        }
    .end annotation

    .line 291
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/utilities/GooglePlayServicesUtility;->isGooglePlayServicesAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 294
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->mGeofenceList:Ljava/util/List;

    .line 295
    iget-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 296
    invoke-direct {p0}, Lcom/shopkick/app/location/SKLocationManager;->resetGeofences()V

    goto :goto_0

    .line 297
    :cond_1
    iget-boolean p1, p0, Lcom/shopkick/app/location/SKLocationManager;->connectionInProgress:Z

    if-nez p1, :cond_2

    const/4 p1, 0x1

    .line 298
    iput-boolean p1, p0, Lcom/shopkick/app/location/SKLocationManager;->connectionInProgress:Z

    .line 299
    sget-object p1, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->RESET_GEOFENCES:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->connectionRequestType:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    .line 300
    iget-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    :cond_2
    :goto_0
    return-void
.end method

.method public getLastKnownLocation()Landroid/location/Location;
    .locals 3

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 160
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v2, 0x470b9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 161
    iget-object v2, p0, Lcom/shopkick/app/location/SKLocationManager;->logger:Lcom/shopkick/app/application/SKLogger;

    if-eqz v2, :cond_0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_0
    return-object v1

    .line 167
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->fusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    iget-object v2, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v2}, Lcom/google/android/gms/location/FusedLocationProviderApi;->getLastLocation(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/location/Location;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 170
    :catch_0
    invoke-direct {p0}, Lcom/shopkick/app/location/SKLocationManager;->logLocationManagerIllegalStateException()V

    return-object v1
.end method

.method public getLocationClientListenersToRemove()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/gms/location/LocationListener;",
            ">;"
        }
    .end annotation

    .line 429
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->locationClientListenersToRemove:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getLocationUpdateRequests()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Lcom/google/android/gms/location/LocationListener;",
            "Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;",
            ">;"
        }
    .end annotation

    .line 433
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->locationUpdateRequests:Ljava/util/HashMap;

    return-object v0
.end method

.method public isProviderEnabled(Ljava/lang/String;)Z
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->locationManager:Landroid/location/LocationManager;

    invoke-virtual {v0, p1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public onAddGeofencesResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    const/4 p1, 0x0

    .line 413
    iput-boolean p1, p0, Lcom/shopkick/app/location/SKLocationManager;->isProcessingGeofences:Z

    return-void
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 1

    .line 320
    iget-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->connectionRequestType:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    if-eqz p1, :cond_0

    .line 321
    sget-object p1, Lcom/shopkick/app/location/SKLocationManager$4;->$SwitchMap$com$shopkick$app$location$SKLocationManager$CONNECTION_REQUEST_TYPE:[I

    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->connectionRequestType:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    invoke-virtual {v0}, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->ordinal()I

    move-result v0

    aget p1, p1, v0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 326
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/location/SKLocationManager;->resetGeofences()V

    goto :goto_0

    .line 323
    :pswitch_1
    invoke-direct {p0}, Lcom/shopkick/app/location/SKLocationManager;->addGeofences()V

    goto :goto_0

    .line 332
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/location/SKLocationManager;->registerLocationRequests()V

    :goto_0
    const/4 p1, 0x0

    .line 334
    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->connectionRequestType:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    const/4 p1, 0x0

    .line 335
    iput-boolean p1, p0, Lcom/shopkick/app/location/SKLocationManager;->connectionInProgress:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    const/4 p1, 0x0

    .line 350
    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->connectionRequestType:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    const/4 p1, 0x0

    .line 351
    iput-boolean p1, p0, Lcom/shopkick/app/location/SKLocationManager;->connectionInProgress:Z

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

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

    const-string p2, "AppActivityManagerSessionStartEvent"

    .line 358
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 360
    iget-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result p1

    if-nez p1, :cond_0

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    :cond_0
    return-void
.end method

.method public onRemoveGeofencesResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 1

    const/4 v0, 0x0

    .line 418
    iput-boolean v0, p0, Lcom/shopkick/app/location/SKLocationManager;->isProcessingGeofences:Z

    .line 419
    invoke-interface {p1}, Lcom/google/android/gms/common/api/Result;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result p1

    if-nez p1, :cond_0

    .line 420
    iget-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->mGeofenceList:Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    .line 421
    iget-object p1, p0, Lcom/shopkick/app/location/SKLocationManager;->mGeofenceList:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/shopkick/app/location/SKLocationManager;->connectAndAddGeofences(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public removeUpdates(Lcom/google/android/gms/location/LocationListener;)V
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->workExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/shopkick/app/location/SKLocationManager$1;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/location/SKLocationManager$1;-><init>(Lcom/shopkick/app/location/SKLocationManager;Lcom/google/android/gms/location/LocationListener;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public requestLocationUpdates(JFILcom/google/android/gms/location/LocationListener;)V
    .locals 8

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->locationUpdateRequests:Ljava/util/HashMap;

    new-instance v7, Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;

    move-object v1, v7

    move-object v2, p0

    move-wide v3, p1

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;-><init>(Lcom/shopkick/app/location/SKLocationManager;JFI)V

    invoke-virtual {v0, p5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    invoke-direct/range {p0 .. p5}, Lcom/shopkick/app/location/SKLocationManager;->addRequestToLocationClient(JFILcom/google/android/gms/location/LocationListener;)V

    :cond_0
    return-void
.end method
