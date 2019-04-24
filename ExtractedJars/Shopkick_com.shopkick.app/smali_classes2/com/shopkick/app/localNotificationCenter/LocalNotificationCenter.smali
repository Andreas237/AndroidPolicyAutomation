.class public Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;
.super Ljava/lang/Object;
.source "LocalNotificationCenter.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field private static final DEBUG:Z = false

.field private static final LOG_TAG:Ljava/lang/String; = "LocalNotificationCenter"

.field private static final ONE_MIN_MS:F = 60000.0f

.field private static final PULL_NOTIFICATION_PREFIX:Ljava/lang/String; = "pull_notification-"

.field public static final SHOPKICK_GEOFENCE_NOTIFICATION_CHANNEL_ID:Ljava/lang/String; = "shopkick_notif_channel_geofence"

.field public static final SHOPKICK_NOTIFICATION_CHANNEL_ID:Ljava/lang/String; = "shopkick_notif_channel_main"


# instance fields
.field private alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private context:Landroid/content/Context;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private pullNotificationRequest:Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/util/AlarmScheduler;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/fetchers/api/APIManager;Landroid/content/Context;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    .line 60
    iput-object p3, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 61
    iput-object p2, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 62
    iput-object p4, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 63
    iput-object p5, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->context:Landroid/content/Context;

    .line 65
    iget-object p1, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 66
    invoke-direct {p0}, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->createNotificationChannels()V

    return-void
.end method

.method private createNotificationChannel(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 98
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->context:Landroid/content/Context;

    const-string v1, "notification"

    .line 100
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    const/4 v1, 0x4

    if-eqz p3, :cond_0

    move p3, v1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 104
    :goto_0
    new-instance v2, Landroid/app/NotificationChannel;

    invoke-direct {v2, p1, p2, p3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const/4 p1, 0x1

    .line 106
    invoke-virtual {v2, p1}, Landroid/app/NotificationChannel;->enableLights(Z)V

    .line 107
    invoke-virtual {v2, p1}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    .line 108
    invoke-virtual {v2, p1}, Landroid/app/NotificationChannel;->setLockscreenVisibility(I)V

    .line 109
    invoke-virtual {v2, p1}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    .line 110
    new-instance p1, Landroid/media/AudioAttributes$Builder;

    invoke-direct {p1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 p2, 0x5

    .line 112
    invoke-virtual {p1, p2}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    .line 113
    invoke-virtual {p1, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p1

    const-string p2, "android.resource://com.shopkick.app/2131755013"

    .line 115
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v2, p2, p1}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 117
    invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_1
    return-void
.end method

.method private createNotificationChannels()V
    .locals 3

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f110660

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 87
    iget-object v1, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->isGeofencingNotificationEnabled()Z

    move-result v1

    const-string/jumbo v2, "shopkick_notif_channel_geofence"

    .line 88
    invoke-direct {p0, v2, v0, v1}, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->createNotificationChannel(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    const-string/jumbo v1, "shopkick_notif_channel_main"

    .line 93
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-direct {p0, v1, v0, v2}, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->createNotificationChannel(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method private schedulePullNotification(Lcom/shopkick/app/fetchers/api/skapi/PullNotification;)V
    .locals 10

    .line 178
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/PullNotification;->notificationIdentifier:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "pull_notification-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/PullNotification;->notificationIdentifier:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 180
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/PullNotification;->displayTimestamp:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v0, v4

    long-to-float v0, v0

    const v1, 0x476a6000    # 60000.0f

    div-float/2addr v0, v1

    float-to-int v4, v0

    if-lez v4, :cond_0

    .line 182
    iget-object v2, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->context:Landroid/content/Context;

    const v1, 0x7f1103c6

    .line 184
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p1, Lcom/shopkick/app/fetchers/api/skapi/PullNotification;->message:Ljava/lang/String;

    iget-object v7, p1, Lcom/shopkick/app/fetchers/api/skapi/PullNotification;->skUrl:Ljava/lang/String;

    iget-object v8, p1, Lcom/shopkick/app/fetchers/api/skapi/PullNotification;->message:Ljava/lang/String;

    const/4 v9, 0x1

    .line 182
    invoke-virtual/range {v2 .. v9}, Lcom/shopkick/app/util/AlarmScheduler;->scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public cancelAllPullNotifications()V
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->pullNotificationRequest:Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;

    if-eqz v0, :cond_0

    .line 135
    iget-object v1, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 136
    iput-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->pullNotificationRequest:Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;

    .line 138
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string v1, "pull_notification-"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/AlarmScheduler;->cancelByPrefix(Ljava/lang/String;)V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 4

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->areNotificationsEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->pullNotificationRequest:Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;

    if-ne p1, v0, :cond_1

    .line 163
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 164
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsResponse;

    .line 165
    iget-object p2, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppPreferences;->getPullNotificationVersionKey()J

    move-result-wide v0

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsResponse;->version:Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p2, v0, v2

    if-eqz p2, :cond_0

    .line 166
    invoke-virtual {p0}, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->cancelAllPullNotifications()V

    .line 167
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsResponse;->notifications:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/PullNotification;

    .line 168
    invoke-direct {p0, v0}, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->schedulePullNotification(Lcom/shopkick/app/fetchers/api/skapi/PullNotification;)V

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsResponse;->version:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/AppPreferences;->setPullNotificationVersionKey(J)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 173
    iput-object p1, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->pullNotificationRequest:Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;

    :cond_1
    return-void
.end method

.method public destroy()V
    .locals 3

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->pullNotificationRequest:Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 71
    iget-object v2, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 72
    iput-object v1, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->pullNotificationRequest:Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;

    .line 74
    :cond_0
    iput-object v1, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

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

    const-string p2, "UserAccountIdChangedEvent"

    if-ne p1, p2, :cond_0

    .line 124
    iget-object p1, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    invoke-virtual {p1}, Lcom/shopkick/app/util/AlarmScheduler;->cancelAllNotifications()V

    .line 125
    invoke-virtual {p0}, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->reloadPullNotifications()V

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public reloadPullNotifications()V
    .locals 10

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->pullNotificationRequest:Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->areNotificationsEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 146
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->pullNotificationRequest:Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->pullNotificationRequest:Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;->clientTimestamp:Ljava/lang/Long;

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->pullNotificationRequest:Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;

    iget-object v1, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->getPullNotificationVersionKey()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;->currentVersion:Ljava/lang/Long;

    .line 149
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 150
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v0

    div-int/lit16 v0, v0, 0x3e8

    .line 151
    iget-object v1, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->pullNotificationRequest:Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;->timezoneInSecondsFromUtc:Ljava/lang/Integer;

    .line 152
    iget-object v2, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v3, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v4, p0, Lcom/shopkick/app/localNotificationCenter/LocalNotificationCenter;->pullNotificationRequest:Lcom/shopkick/app/fetchers/api/skapi/PullNotificationsRequest;

    const/4 v6, 0x0

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v5, p0

    invoke-virtual/range {v2 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void

    :cond_1
    :goto_0
    return-void
.end method
