.class public Lcom/launchdarkly/android/PollingUpdater;
.super Landroid/content/BroadcastReceiver;
.source "PollingUpdater.java"


# static fields
.field static backgroundPollingIntervalMillis:I = 0x36ee80


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private static getAlarmIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 82
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/launchdarkly/android/PollingUpdater;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method private static getAlarmManager(Landroid/content/Context;)Landroid/app/AlarmManager;
    .locals 1

    const-string v0, "alarm"

    .line 90
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AlarmManager;

    return-object p0
.end method

.method private static getPendingIntent(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 2

    .line 86
    invoke-static {p0}, Lcom/launchdarkly/android/PollingUpdater;->getAlarmIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method static declared-synchronized startBackgroundPolling(Landroid/content/Context;)V
    .locals 3

    const-class v0, Lcom/launchdarkly/android/PollingUpdater;

    monitor-enter v0

    :try_start_0
    const-string v1, "Starting background polling"

    const/4 v2, 0x0

    .line 56
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    sget v1, Lcom/launchdarkly/android/PollingUpdater;->backgroundPollingIntervalMillis:I

    sget v2, Lcom/launchdarkly/android/PollingUpdater;->backgroundPollingIntervalMillis:I

    invoke-static {p0, v1, v2}, Lcom/launchdarkly/android/PollingUpdater;->startPolling(Landroid/content/Context;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method static declared-synchronized startPolling(Landroid/content/Context;II)V
    .locals 12

    const-class v0, Lcom/launchdarkly/android/PollingUpdater;

    monitor-enter v0

    .line 61
    :try_start_0
    invoke-static {p0}, Lcom/launchdarkly/android/PollingUpdater;->stop(Landroid/content/Context;)V

    const-string v1, "startPolling with initialDelayMillis: %d and intervalMillis: %d"

    const/4 v2, 0x2

    .line 62
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    invoke-static {p0}, Lcom/launchdarkly/android/PollingUpdater;->getPendingIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v11

    .line 64
    invoke-static {p0}, Lcom/launchdarkly/android/PollingUpdater;->getAlarmManager(Landroid/content/Context;)Landroid/app/AlarmManager;

    move-result-object v5

    const/4 v6, 0x3

    .line 68
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    int-to-long p0, p1

    add-long v7, v1, p0

    int-to-long v9, p2

    .line 66
    invoke-virtual/range {v5 .. v11}, Landroid/app/AlarmManager;->setInexactRepeating(IJJLandroid/app/PendingIntent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method static declared-synchronized stop(Landroid/content/Context;)V
    .locals 3

    const-class v0, Lcom/launchdarkly/android/PollingUpdater;

    monitor-enter v0

    :try_start_0
    const-string v1, "Stopping pollingUpdater"

    const/4 v2, 0x0

    .line 74
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    invoke-static {p0}, Lcom/launchdarkly/android/PollingUpdater;->getPendingIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    .line 76
    invoke-static {p0}, Lcom/launchdarkly/android/PollingUpdater;->getAlarmManager(Landroid/content/Context;)Landroid/app/AlarmManager;

    move-result-object p0

    .line 78
    invoke-virtual {p0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    const/4 p2, 0x0

    .line 28
    :try_start_0
    invoke-static {p1}, Lcom/launchdarkly/android/Util;->isInternetConnected(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "onReceive connected to the internet!"

    .line 29
    new-array v1, p2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    invoke-static {}, Lcom/launchdarkly/android/LDClient;->getEnvironmentNames()Ljava/util/Set;

    move-result-object v0

    .line 31
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 32
    invoke-static {p1, v1}, Lcom/launchdarkly/android/Util;->isClientConnected(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "Skipping offline environment: %s"

    const/4 v3, 0x1

    .line 33
    new-array v3, v3, [Ljava/lang/Object;

    aput-object v1, v3, p2

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v1}, Lcom/launchdarkly/android/LDClient;->getForMobileKey(Ljava/lang/String;)Lcom/launchdarkly/android/LDClient;

    move-result-object v1

    invoke-virtual {v1}, Lcom/launchdarkly/android/LDClient;->getUserManager()Lcom/launchdarkly/android/UserManager;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "UserManager singleton was accessed before it was initialized! doing nothing"

    .line 38
    new-array v2, p2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v1}, Lcom/launchdarkly/android/UserManager;->updateCurrentUser()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    const-wide/16 v2, 0xf

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4}, Lcom/google/common/util/concurrent/ListenableFuture;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    const-string p1, "onReceive with no internet connection! Skipping fetch."

    .line 44
    new-array v0, p2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/launchdarkly/android/LaunchDarklyException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string v0, "Exception when getting client"

    .line 51
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, v0, p2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :catch_1
    move-exception p1

    const-string v0, "Feature Flag update timed out"

    .line 49
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, v0, p2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :catch_2
    move-exception p1

    goto :goto_1

    :catch_3
    move-exception p1

    :goto_1
    const-string v0, "Exception caught when awaiting update"

    .line 47
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, v0, p2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_2
    return-void
.end method
