.class public Lcom/shopkick/app/location/SKActivityRecognitionManager;
.super Ljava/lang/Object;
.source "SKActivityRecognitionManager.java"


# instance fields
.field private final activityDetectionBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field private final callbackMapLock:Ljava/lang/Object;

.field private callbackToUpdateIntervalMap:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/app/location/IActivityRecognitionCallback;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private context:Landroid/content/Context;

.field private currentUpdateInterval:I

.field private googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    .line 26
    iput v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->currentUpdateInterval:I

    .line 36
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->callbackMapLock:Ljava/lang/Object;

    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->context:Landroid/content/Context;

    .line 40
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/google/android/gms/location/ActivityRecognition;->API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 41
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->callbackToUpdateIntervalMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    new-instance v0, Lcom/shopkick/app/location/SKActivityRecognitionManager$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/location/SKActivityRecognitionManager$1;-><init>(Lcom/shopkick/app/location/SKActivityRecognitionManager;)V

    iput-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->activityDetectionBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 55
    invoke-static {p1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->activityDetectionBroadcastReceiver:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string/jumbo v2, "shopkick.ActivityDetection"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 56
    invoke-virtual {p1, v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/location/SKActivityRecognitionManager;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->callbackToUpdateIntervalMap:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/location/SKActivityRecognitionManager;I)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->startActivityCallbacks(I)V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/location/SKActivityRecognitionManager;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->stopActivityCallbacks()V

    return-void
.end method

.method private connectAndStartActivityCallbacks(I)V
    .locals 3

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/utilities/GooglePlayServicesUtility;->isGooglePlayServicesAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    invoke-direct {p0, p1}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->startActivityCallbacks(I)V

    goto :goto_0

    .line 84
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    new-instance v1, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;

    new-instance v2, Lcom/shopkick/app/location/SKActivityRecognitionManager$2;

    invoke-direct {v2, p0, p1}, Lcom/shopkick/app/location/SKActivityRecognitionManager$2;-><init>(Lcom/shopkick/app/location/SKActivityRecognitionManager;I)V

    invoke-direct {v1, v0, v2}, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 91
    iget-object p1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    :goto_0
    return-void
.end method

.method private connectAndStopActivityCallbacks()V
    .locals 3

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/utilities/GooglePlayServicesUtility;->isGooglePlayServicesAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    invoke-direct {p0}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->stopActivityCallbacks()V

    goto :goto_0

    .line 103
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    new-instance v1, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;

    new-instance v2, Lcom/shopkick/app/location/SKActivityRecognitionManager$3;

    invoke-direct {v2, p0}, Lcom/shopkick/app/location/SKActivityRecognitionManager$3;-><init>(Lcom/shopkick/app/location/SKActivityRecognitionManager;)V

    invoke-direct {v1, v0, v2}, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    :goto_0
    return-void
.end method

.method private getActivityRecognitionIntent()Landroid/app/PendingIntent;
    .locals 4

    .line 69
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->context:Landroid/content/Context;

    const-class v2, Lcom/shopkick/app/location/ActivityDetectionBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 70
    iget-object v1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->context:Landroid/content/Context;

    .line 71
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget v2, v2, Landroid/content/pm/ApplicationInfo;->uid:I

    const/high16 v3, 0x10000000

    .line 70
    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method private startActivityCallbacks(I)V
    .locals 4

    .line 115
    iput p1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->currentUpdateInterval:I

    .line 116
    sget-object p1, Lcom/google/android/gms/location/ActivityRecognition;->ActivityRecognitionApi:Lcom/google/android/gms/location/ActivityRecognitionApi;

    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget v1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->currentUpdateInterval:I

    int-to-long v1, v1

    .line 118
    invoke-direct {p0}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->getActivityRecognitionIntent()Landroid/app/PendingIntent;

    move-result-object v3

    .line 116
    invoke-interface {p1, v0, v1, v2, v3}, Lcom/google/android/gms/location/ActivityRecognitionApi;->requestActivityUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;JLandroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;

    return-void
.end method

.method private stopActivityCallbacks()V
    .locals 3

    .line 122
    sget-object v0, Lcom/google/android/gms/location/ActivityRecognition;->ActivityRecognitionApi:Lcom/google/android/gms/location/ActivityRecognitionApi;

    iget-object v1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 123
    invoke-direct {p0}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->getActivityRecognitionIntent()Landroid/app/PendingIntent;

    move-result-object v2

    .line 122
    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/location/ActivityRecognitionApi;->removeActivityUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 2

    .line 61
    invoke-direct {p0}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->connectAndStopActivityCallbacks()V

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->activityDetectionBroadcastReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public registerCallback(Lcom/shopkick/app/location/IActivityRecognitionCallback;I)V
    .locals 3

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->callbackMapLock:Ljava/lang/Object;

    monitor-enter v0

    .line 128
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->callbackToUpdateIntervalMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 129
    iget-object v1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->callbackToUpdateIntervalMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    :cond_0
    iget p1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->currentUpdateInterval:I

    if-ge p2, p1, :cond_1

    .line 134
    invoke-direct {p0}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->connectAndStopActivityCallbacks()V

    .line 135
    invoke-direct {p0, p2}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->connectAndStartActivityCallbacks(I)V

    .line 137
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public unregisterCallback(Lcom/shopkick/app/location/IActivityRecognitionCallback;)V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->callbackMapLock:Ljava/lang/Object;

    monitor-enter v0

    .line 142
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->callbackToUpdateIntervalMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    iget-object p1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->callbackToUpdateIntervalMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 144
    invoke-direct {p0}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->connectAndStopActivityCallbacks()V

    goto :goto_0

    .line 147
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->callbackToUpdateIntervalMap:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 148
    iget v1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager;->currentUpdateInterval:I

    if-le p1, v1, :cond_1

    .line 149
    invoke-direct {p0}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->connectAndStopActivityCallbacks()V

    .line 150
    invoke-direct {p0, p1}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->connectAndStartActivityCallbacks(I)V

    .line 153
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
