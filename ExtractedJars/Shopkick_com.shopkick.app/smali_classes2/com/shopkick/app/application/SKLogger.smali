.class public Lcom/shopkick/app/application/SKLogger;
.super Ljava/lang/Object;
.source "SKLogger.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;,
        Lcom/shopkick/app/application/SKLogger$NetworkManagerFieldListener;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field public static final LOG_EVENT_KEY:Ljava/lang/String; = "LOG_EVENT_KEY"

.field private static final LOG_TAG:Ljava/lang/String; = "SKLogger"

.field private static MAX_REPORTED_DURATION:J = 0x493e0L

.field private static final NUMBER_OF_LOGS_IN_MEMORY_BEFORE_SAVE_IS_INITIATED:I = 0x96

.field public static final SKLOGGER_EVENT_RECEIVED_EVENT:Ljava/lang/String; = "SKLOGGER_EVENT_RECEIVED_EVENT"


# instance fields
.field appInfo:Lcom/shopkick/app/application/AppInfo;

.field private configurationProvider:Lcom/shopkick/logging/ConfigurationProvider;

.field private disableHTTPS:Z

.field handler:Landroid/os/Handler;

.field private logsInMemory:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private netMgr:Lcom/shopkick/app/fetchers/network/NetworkManager;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field prefs:Lcom/shopkick/app/application/LibPreferences;

.field public printClientLogs:Z

.field private saveLogsToDiskTask:Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;

.field public sessionCount:I

.field skDiskLogger:Lcom/shopkick/app/application/SKDiskLogger;

.field timestampsByEventType:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private uploadLogsRunnable:Ljava/lang/Runnable;

.field private userAccount:Lcom/shopkick/app/application/Account;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 363
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Lcom/shopkick/app/application/SKLogger;->saveLogsToDiskTask:Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;

    .line 50
    iput-object v0, p0, Lcom/shopkick/app/application/SKLogger;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ZLcom/shopkick/app/fetchers/network/NetworkManager;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/LibPreferences;Ljava/lang/String;Lcom/shopkick/app/application/Account;ZLcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/logging/ConfigurationProvider;)V
    .locals 10

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p10

    .line 88
    invoke-direct/range {v0 .. v9}, Lcom/shopkick/app/application/SKLogger;-><init>(Landroid/content/Context;ZLcom/shopkick/app/fetchers/network/NetworkManager;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/LibPreferences;Ljava/lang/String;Lcom/shopkick/app/application/Account;ZLcom/shopkick/logging/ConfigurationProvider;)V

    move-object/from16 v1, p9

    .line 89
    iput-object v1, v0, Lcom/shopkick/app/application/SKLogger;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ZLcom/shopkick/app/fetchers/network/NetworkManager;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/LibPreferences;Ljava/lang/String;Lcom/shopkick/app/application/Account;ZLcom/shopkick/logging/ConfigurationProvider;)V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Lcom/shopkick/app/application/SKLogger;->saveLogsToDiskTask:Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;

    .line 50
    iput-object v0, p0, Lcom/shopkick/app/application/SKLogger;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 62
    iput-object p7, p0, Lcom/shopkick/app/application/SKLogger;->userAccount:Lcom/shopkick/app/application/Account;

    .line 63
    iput-boolean p2, p0, Lcom/shopkick/app/application/SKLogger;->printClientLogs:Z

    .line 64
    iput-object p4, p0, Lcom/shopkick/app/application/SKLogger;->appInfo:Lcom/shopkick/app/application/AppInfo;

    .line 65
    iput-object p5, p0, Lcom/shopkick/app/application/SKLogger;->prefs:Lcom/shopkick/app/application/LibPreferences;

    .line 66
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/application/SKLogger;->handler:Landroid/os/Handler;

    .line 67
    iput-object v0, p0, Lcom/shopkick/app/application/SKLogger;->uploadLogsRunnable:Ljava/lang/Runnable;

    .line 68
    iput-object p3, p0, Lcom/shopkick/app/application/SKLogger;->netMgr:Lcom/shopkick/app/fetchers/network/NetworkManager;

    .line 69
    iput-boolean p8, p0, Lcom/shopkick/app/application/SKLogger;->disableHTTPS:Z

    .line 70
    iput-object p9, p0, Lcom/shopkick/app/application/SKLogger;->configurationProvider:Lcom/shopkick/logging/ConfigurationProvider;

    .line 71
    new-instance p2, Lcom/shopkick/app/application/SKDiskLogger;

    invoke-direct {p2, p1, p3, p6, p8}, Lcom/shopkick/app/application/SKDiskLogger;-><init>(Landroid/content/Context;Lcom/shopkick/app/fetchers/network/NetworkManager;Ljava/lang/String;Z)V

    iput-object p2, p0, Lcom/shopkick/app/application/SKLogger;->skDiskLogger:Lcom/shopkick/app/application/SKDiskLogger;

    .line 72
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/application/SKLogger;->timestampsByEventType:Ljava/util/HashMap;

    .line 73
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/application/SKLogger;->logsInMemory:Ljava/util/ArrayList;

    .line 75
    iget-object p1, p0, Lcom/shopkick/app/application/SKLogger;->netMgr:Lcom/shopkick/app/fetchers/network/NetworkManager;

    const-string p2, "isFetching"

    new-instance p3, Lcom/shopkick/app/application/SKLogger$NetworkManagerFieldListener;

    invoke-direct {p3, p0}, Lcom/shopkick/app/application/SKLogger$NetworkManagerFieldListener;-><init>(Lcom/shopkick/app/application/SKLogger;)V

    invoke-virtual {p1, p2, p3}, Lcom/shopkick/app/fetchers/network/NetworkManager;->addPropertyChangeListener(Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/application/SKLogger;)Lcom/shopkick/app/fetchers/network/NetworkManager;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/shopkick/app/application/SKLogger;->netMgr:Lcom/shopkick/app/fetchers/network/NetworkManager;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/application/SKLogger;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/application/SKLogger;->uploadLogs()V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/application/SKLogger;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/application/SKLogger;->saveLogsToDisk()V

    return-void
.end method

.method static synthetic access$402(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;)Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/shopkick/app/application/SKLogger;->saveLogsToDiskTask:Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;

    return-object p1
.end method

.method private declared-synchronized addLogToMemory(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 276
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->logsInMemory:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 277
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/application/SKLogger;->logsInMemory:Ljava/util/ArrayList;

    .line 280
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->logsInMemory:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    invoke-direct {p0}, Lcom/shopkick/app/application/SKLogger;->shouldFlushInMemoryLogs()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 283
    new-instance p1, Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;-><init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/SKLogger$1;)V

    iput-object p1, p0, Lcom/shopkick/app/application/SKLogger;->saveLogsToDiskTask:Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;

    .line 284
    iget-object p1, p0, Lcom/shopkick/app/application/SKLogger;->saveLogsToDiskTask:Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;

    check-cast v0, [Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized getSnapshotOfLogsInMemory()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    monitor-enter p0

    .line 296
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->logsInMemory:Ljava/util/ArrayList;

    const/4 v1, 0x0

    .line 297
    iput-object v1, p0, Lcom/shopkick/app/application/SKLogger;->logsInMemory:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 298
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private saveLogsToDisk()V
    .locals 4

    .line 306
    invoke-direct {p0}, Lcom/shopkick/app/application/SKLogger;->getSnapshotOfLogsInMemory()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 308
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 312
    iget-object v2, p0, Lcom/shopkick/app/application/SKLogger;->skDiskLogger:Lcom/shopkick/app/application/SKDiskLogger;

    const-string/jumbo v3, "sklogs"

    invoke-virtual {v2, v3, v1}, Lcom/shopkick/app/application/SKDiskLogger;->saveToDisk(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private shouldFlushInMemoryLogs()Z
    .locals 3

    .line 250
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->saveLogsToDiskTask:Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 255
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->logsInMemory:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    return v1

    .line 260
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v2, 0x96

    if-ge v0, v2, :cond_2

    return v1

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private timestampLog(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "user_id"

    .line 234
    iget-object v1, p0, Lcom/shopkick/app/application/SKLogger;->userAccount:Lcom/shopkick/app/application/Account;

    invoke-virtual {v1}, Lcom/shopkick/app/application/Account;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "app_install_ts"

    .line 235
    iget-object v1, p0, Lcom/shopkick/app/application/SKLogger;->prefs:Lcom/shopkick/app/application/LibPreferences;

    invoke-virtual {v1}, Lcom/shopkick/app/application/LibPreferences;->getAppInstalledTimestamp()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "app_launch_ts"

    .line 236
    iget-object v1, p0, Lcom/shopkick/app/application/SKLogger;->appInfo:Lcom/shopkick/app/application/AppInfo;

    iget-wide v1, v1, Lcom/shopkick/app/application/AppInfo;->appLaunchedTimestamp:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "client_event_micros"

    .line 237
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private uploadLogs()V
    .locals 3

    .line 318
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->skDiskLogger:Lcom/shopkick/app/application/SKDiskLogger;

    const-string/jumbo v1, "sklogs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/SKDiskLogger;->uploadLogs(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public cancelTimer()V
    .locals 2

    .line 344
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->uploadLogsRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 345
    iget-object v1, p0, Lcom/shopkick/app/application/SKLogger;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public endSession()V
    .locals 2

    .line 322
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->saveLogsToDiskTask:Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 323
    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;->cancel(Z)Z

    const/4 v0, 0x0

    .line 324
    iput-object v0, p0, Lcom/shopkick/app/application/SKLogger;->saveLogsToDiskTask:Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;

    goto :goto_0

    .line 326
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/application/SKLogger;->saveLogsToDisk()V

    .line 329
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/application/SKLogger;->uploadLogs()V

    return-void
.end method

.method public getDuration(I)Ljava/lang/Long;
    .locals 4

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->timestampsByEventType:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 226
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 227
    sget-wide v2, Lcom/shopkick/app/application/SKLogger;->MAX_REPORTED_DURATION:J

    cmp-long p1, v0, v2

    if-lez p1, :cond_1

    move-wide v0, v2

    .line 230
    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public logPersistentEvent(Ljava/util/Map;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_7

    .line 130
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 135
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "event_type"

    .line 136
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v0, "event_type"

    .line 137
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 139
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v1

    sget-object v0, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->userAccount:Lcom/shopkick/app/application/Account;

    .line 140
    invoke-virtual {v0}, Lcom/shopkick/app/application/Account;->getUserId()Ljava/lang/String;

    move-result-object v4

    const-string v0, "event_type"

    .line 141
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    move-object v6, p1

    .line 139
    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/EventLogger;->log(JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V

    :cond_1
    const-string v0, "screen"

    .line 143
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "element"

    .line 144
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "action"

    .line 145
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    :cond_2
    const-string v0, "screen"

    .line 151
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const-string v0, "screen"

    .line 152
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    move-object v6, v0

    goto :goto_0

    :cond_3
    move-object v6, v1

    :goto_0
    const-string v0, "element"

    .line 154
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    const-string v0, "element"

    .line 155
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    move-object v7, v0

    goto :goto_1

    :cond_4
    move-object v7, v1

    :goto_1
    const-string v0, "action"

    .line 157
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-eqz v0, :cond_5

    const-string v0, "action"

    .line 158
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Integer;

    move-object v8, v1

    goto :goto_2

    :cond_5
    move-object v8, v1

    .line 161
    :goto_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v2

    sget-object v0, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->userAccount:Lcom/shopkick/app/application/Account;

    .line 162
    invoke-virtual {v0}, Lcom/shopkick/app/application/Account;->getUserId()Ljava/lang/String;

    move-result-object v5

    move-object v9, p1

    .line 161
    invoke-virtual/range {v2 .. v9}, Lcom/shopkick/logging/EventLogger;->log(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V

    .line 165
    :cond_6
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent2(Ljava/util/Map;)V

    return-void

    :cond_7
    :goto_3
    return-void
.end method

.method public logPersistentEvent2(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 169
    invoke-direct {p0, p1}, Lcom/shopkick/app/application/SKLogger;->timestampLog(Ljava/util/Map;)V

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->userAccount:Lcom/shopkick/app/application/Account;

    invoke-virtual {v0}, Lcom/shopkick/app/application/Account;->getUserId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->userAccount:Lcom/shopkick/app/application/Account;

    invoke-virtual {v0}, Lcom/shopkick/app/application/Account;->getUserId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v1, "record_id"

    .line 172
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    iget-boolean v0, p0, Lcom/shopkick/app/application/SKLogger;->printClientLogs:Z

    if-eqz v0, :cond_1

    .line 174
    const-class v0, Lcom/shopkick/app/application/SKLogger;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Client Log: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    if-eqz v0, :cond_2

    .line 177
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "LOG_EVENT_KEY"

    .line 178
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    iget-object v1, p0, Lcom/shopkick/app/application/SKLogger;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "SKLOGGER_EVENT_RECEIVED_EVENT"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 181
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->configurationProvider:Lcom/shopkick/logging/ConfigurationProvider;

    invoke-interface {v0}, Lcom/shopkick/logging/ConfigurationProvider;->isSKLoggerOnlyDevloggingDisabled()Z

    move-result v0

    if-nez v0, :cond_3

    .line 182
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/SKLogger;->logThroughDevLogging(Ljava/util/Map;)V

    goto :goto_1

    .line 183
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->configurationProvider:Lcom/shopkick/logging/ConfigurationProvider;

    invoke-interface {v0}, Lcom/shopkick/logging/ConfigurationProvider;->isSKLoggerDevloggingDisabled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 184
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/SKLogger;->logThroughDevLogging(Ljava/util/Map;)V

    .line 185
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/SKLogger;->logThroughSKLogger(Ljava/util/Map;)V

    goto :goto_1

    .line 187
    :cond_4
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/SKLogger;->logThroughSKLogger(Ljava/util/Map;)V

    :goto_1
    return-void
.end method

.method logThroughDevLogging(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-string v0, "event_type"

    .line 197
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "event_type"

    .line 198
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 199
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->ANALYTIC:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lcom/shopkick/logging/DiagnosticLogger;->i(JI)V

    goto :goto_0

    .line 201
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->ANALYTIC:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SKLogger log record has no event type: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v4, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method logThroughSKLogger(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 192
    invoke-direct {p0, p1}, Lcom/shopkick/app/application/SKLogger;->addLogToMemory(Ljava/util/Map;)V

    return-void
.end method

.method public onEndSession(Landroid/content/Context;)V
    .locals 0

    .line 110
    iget p1, p0, Lcom/shopkick/app/application/SKLogger;->sessionCount:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/shopkick/app/application/SKLogger;->sessionCount:I

    return-void
.end method

.method public onEvent(Ljava/lang/String;)V
    .locals 3

    .line 114
    iget v0, p0, Lcom/shopkick/app/application/SKLogger;->sessionCount:I

    if-gtz v0, :cond_0

    .line 115
    const-class v0, Lcom/shopkick/app/application/SKLogger;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No session for event: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 118
    :cond_0
    const-class v0, Lcom/shopkick/app/application/SKLogger;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " (no params)"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 122
    iget v0, p0, Lcom/shopkick/app/application/SKLogger;->sessionCount:I

    if-gtz v0, :cond_0

    .line 123
    const-class p2, Lcom/shopkick/app/application/SKLogger;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No session for event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 126
    :cond_0
    const-class v0, Lcom/shopkick/app/application/SKLogger;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onStartSession(Landroid/content/Context;)V
    .locals 0

    .line 106
    iget p1, p0, Lcom/shopkick/app/application/SKLogger;->sessionCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/shopkick/app/application/SKLogger;->sessionCount:I

    return-void
.end method

.method public removeEventTypeTimestamp(I)V
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->timestampsByEventType:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public startTimedLogEvent(I)V
    .locals 2

    .line 208
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/application/SKLogger;->startTimedLogEvent(ILjava/lang/Long;)V

    return-void
.end method

.method public startTimedLogEvent(ILjava/lang/Long;)V
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->timestampsByEventType:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public startTimer(J)V
    .locals 2

    .line 333
    new-instance v0, Lcom/shopkick/app/application/SKLogger$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/app/application/SKLogger$1;-><init>(Lcom/shopkick/app/application/SKLogger;J)V

    iput-object v0, p0, Lcom/shopkick/app/application/SKLogger;->uploadLogsRunnable:Ljava/lang/Runnable;

    .line 340
    iget-object v0, p0, Lcom/shopkick/app/application/SKLogger;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/application/SKLogger;->uploadLogsRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
