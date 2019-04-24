.class public Lcom/shopkick/app/tracking/TrackingUrlManager;
.super Ljava/lang/Object;
.source "TrackingUrlManager.java"

# interfaces
.implements Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;,
        Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;,
        Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;
    }
.end annotation


# static fields
.field private static final DEFAULT_MAX_CONCURRENT_TRACKING_URL_REQUESTS:I = 0x5

.field private static final MILLIS_CONNECTION_TIMEOUT:I = 0x1388

.field private static final MILLIS_SOCKET_TIMEOUT:I = 0x7530

.field private static final QUEUE_FILE_NAME:Ljava/lang/String; = "TrackingUrlQueue.dat"


# instance fields
.field private asyncPersistentStringQueue:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private connectivityManager:Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

.field private defaultPixelUrlAdvertisingIdStrings:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private defaultPixelUrlRandomNumberStrings:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private numRequestsInProgress:I


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/fetchers/network/SKConnectivityManager;Landroid/content/Context;Lcom/shopkick/app/application/DeviceInfo;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 57
    iput-object p2, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 58
    iput-object p3, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 59
    iput-object p4, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->connectivityManager:Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    .line 60
    iput-object p6, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    const-string p1, "AppActivityManagerAppForegroundedEvent"

    .line 62
    invoke-virtual {p3, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 64
    new-instance p1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    const-string p2, "TrackingUrlQueue.dat"

    invoke-direct {p1, p5, p2, p0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallback;)V

    iput-object p1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->asyncPersistentStringQueue:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    .line 66
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->defaultPixelUrlRandomNumberStrings:Ljava/util/ArrayList;

    .line 67
    iget-object p1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->defaultPixelUrlRandomNumberStrings:Ljava/util/ArrayList;

    const-string p2, "[timestamp]"

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    iget-object p1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->defaultPixelUrlRandomNumberStrings:Ljava/util/ArrayList;

    const-string p2, "%REPLACE-TIMESTAMP-MACRO%"

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->defaultPixelUrlAdvertisingIdStrings:Ljava/util/ArrayList;

    .line 70
    iget-object p1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->defaultPixelUrlAdvertisingIdStrings:Ljava/util/ArrayList;

    const-string p2, "%REPLACE-DEVICE-ID-MACRO%"

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static synthetic access$010(Lcom/shopkick/app/tracking/TrackingUrlManager;)I
    .locals 2

    .line 31
    iget v0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->numRequestsInProgress:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->numRequestsInProgress:I

    return v0
.end method

.method static synthetic access$100(Lcom/shopkick/app/tracking/TrackingUrlManager;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/shopkick/app/tracking/TrackingUrlManager;->maybeHandleNextTrackingUrl()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/tracking/TrackingUrlManager;Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;)I
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/shopkick/app/tracking/TrackingUrlManager;->getTrackingUrlFailureReason(Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;)I

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/tracking/TrackingUrlManager;)Lcom/shopkick/app/application/SKLogger;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->logger:Lcom/shopkick/app/application/SKLogger;

    return-object p0
.end method

.method private formatUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pixelUrlRandomNumberStrings:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pixelUrlRandomNumberStrings:Ljava/util/List;

    .line 103
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pixelUrlRandomNumberStrings:Ljava/util/List;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->defaultPixelUrlRandomNumberStrings:Ljava/util/ArrayList;

    .line 106
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pixelUrlAdvertisingIdStrings:Ljava/util/List;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pixelUrlAdvertisingIdStrings:Ljava/util/List;

    .line 108
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pixelUrlAdvertisingIdStrings:Ljava/util/List;

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->defaultPixelUrlAdvertisingIdStrings:Ljava/util/ArrayList;

    .line 112
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 113
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    .line 116
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/DeviceInfo;->isAdvertisingInfoReady()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/DeviceInfo;->getAdvertisingInfo()Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->encryptedAdvertisingId:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 117
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 118
    iget-object v2, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->getAdvertisingInfo()Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    move-result-object v2

    iget-object v2, v2, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->encryptedAdvertisingId:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_3
    return-object p1
.end method

.method private getDefaultMaxConcurrentTrackingUrlRequests()I
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxConcurrentTrackingUrlRequests:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 79
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x5

    :goto_0
    return v0
.end method

.method private getTrackingUrlFailureReason(Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;)I
    .locals 1

    .line 235
    sget-object v0, Lcom/shopkick/app/tracking/TrackingUrlManager$1;->$SwitchMap$com$shopkick$app$tracking$TrackingUrlManager$TrackingUrlTaskResultType:[I

    invoke-virtual {p1}, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x4

    return p1

    :pswitch_0
    const/4 p1, 0x3

    return p1

    :pswitch_1
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private maybeHandleNextTrackingUrl()V
    .locals 3

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->connectivityManager:Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;->isNetworkConnected()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 128
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/tracking/TrackingUrlManager;->getDefaultMaxConcurrentTrackingUrlRequests()I

    move-result v0

    .line 129
    :goto_0
    iget v1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->numRequestsInProgress:I

    if-ge v1, v0, :cond_1

    .line 130
    iget-object v1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->asyncPersistentStringQueue:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-virtual {v1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->popString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 132
    iget v2, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->numRequestsInProgress:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->numRequestsInProgress:I

    .line 133
    new-instance v2, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;

    invoke-direct {v2, p0, v1}, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;-><init>(Lcom/shopkick/app/tracking/TrackingUrlManager;Ljava/lang/String;)V

    .line 134
    invoke-static {v2}, Lcom/shopkick/app/util/AsyncTaskUtils;->executeTask(Landroid/os/AsyncTask;)Ljava/lang/Void;

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

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

    .line 263
    invoke-direct {p0}, Lcom/shopkick/app/tracking/TrackingUrlManager;->maybeHandleNextTrackingUrl()V

    return-void
.end method

.method public queueUpdatedFromDisk()V
    .locals 0

    .line 272
    invoke-direct {p0}, Lcom/shopkick/app/tracking/TrackingUrlManager;->maybeHandleNextTrackingUrl()V

    return-void
.end method

.method public sendTrackingUrl(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 89
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/tracking/TrackingUrlManager;->formatUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 90
    invoke-direct {p0}, Lcom/shopkick/app/tracking/TrackingUrlManager;->getDefaultMaxConcurrentTrackingUrlRequests()I

    move-result v0

    .line 91
    iget-object v1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->connectivityManager:Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;->isNetworkConnected()Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->numRequestsInProgress:I

    if-lt v1, v0, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 94
    iput v1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->numRequestsInProgress:I

    .line 95
    new-instance v0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;-><init>(Lcom/shopkick/app/tracking/TrackingUrlManager;Ljava/lang/String;)V

    .line 96
    invoke-static {v0}, Lcom/shopkick/app/util/AsyncTaskUtils;->executeTask(Landroid/os/AsyncTask;)Ljava/lang/Void;

    goto :goto_1

    .line 92
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager;->asyncPersistentStringQueue:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->addString(Ljava/lang/String;)V

    :goto_1
    return-void
.end method
