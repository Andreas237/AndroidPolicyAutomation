.class public Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;
.super Ljava/lang/Object;
.source "TrackingFlushWorker.java"

# interfaces
.implements Lcom/ibotta/android/service/work/ScheduledWorker;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final context:Landroid/content/Context;

.field private final hardware:Lcom/ibotta/android/hardware/Hardware;

.field private final lock:Ljava/util/concurrent/locks/Lock;

.field private final scheduledWorkManager:Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

.field private final tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/receiver/work/ScheduledWorkManager;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->lock:Ljava/util/concurrent/locks/Lock;

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 58
    iput-object p2, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 59
    iput-object p3, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->context:Landroid/content/Context;

    .line 60
    iput-object p4, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->hardware:Lcom/ibotta/android/hardware/Hardware;

    .line 61
    iput-object p5, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->scheduledWorkManager:Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    .line 62
    iput-object p6, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    return-void
.end method

.method private abstractEventToStringParts(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;I)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            "I)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 217
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->toTrackEvent()Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;

    move-result-object p1

    .line 218
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->validate()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 219
    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->toStringParts(I)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private createScheduledWork()Lcom/ibotta/android/receiver/work/ScheduledWork;
    .locals 8

    .line 100
    new-instance v7, Lcom/ibotta/android/receiver/work/ScheduledWork;

    iget-object v1, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 101
    invoke-direct {p0}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->getConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->getTxInterval()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->getId()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const/high16 v4, 0x8000000

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/receiver/work/ScheduledWork;-><init>(Lcom/ibotta/android/util/AppHelper;JILjava/lang/String;Landroid/os/Bundle;)V

    return-object v7
.end method

.method private eventsMapValuesToStringParts(Ljava/util/Collection;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;>;)",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 209
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$firJi7JVtEK1aya6_Uj0T0YxbWw;

    invoke-direct {v0, p0}, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$firJi7JVtEK1aya6_Uj0T0YxbWw;-><init>(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 210
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->flatMap(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 213
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method private executeTrackingCall(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 194
    new-instance v0, Lcom/ibotta/api/track/TrackPostCall;

    invoke-direct {v0, p1}, Lcom/ibotta/api/track/TrackPostCall;-><init>(Ljava/util/List;)V

    .line 195
    invoke-virtual {v0}, Lcom/ibotta/api/track/TrackPostCall;->execute()Lcom/ibotta/api/ApiResponse;

    .line 197
    invoke-virtual {v0}, Lcom/ibotta/api/track/TrackPostCall;->isSuccess()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "Successfully flushed tracking events to server."

    .line 200
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string v1, "Failed to send tracking events to server."

    .line 202
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return p1
.end method

.method private flush()V
    .locals 8

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->isNetworkConnected()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Network unavailable. Skipping tracking flush."

    .line 140
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 150
    :try_start_0
    iget-object v2, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->context:Landroid/content/Context;

    iget-object v3, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    new-instance v4, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$TCKvY35QPA3XsG-v5gs0M1PJcpw;

    invoke-direct {v4, p0}, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$TCKvY35QPA3XsG-v5gs0M1PJcpw;-><init>(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    new-instance v5, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$2YelVsZ70o4SV6w958Q88flR4Wc;

    invoke-direct {v5, p0}, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$2YelVsZ70o4SV6w958Q88flR4Wc;-><init>(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    new-instance v6, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$gD8F_xnTQx6aKecI9rqZVxyNTVw;

    invoke-direct {v6, p0}, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$gD8F_xnTQx6aKecI9rqZVxyNTVw;-><init>(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v2, v3, v4, v5, v6}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->open(Landroid/content/Context;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;)Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 160
    :try_start_3
    invoke-interface {v2}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;->deleteEverythingInFlight()V

    .line 162
    invoke-direct {p0}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->getConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->getMaxRowsPerTx()I

    move-result v3

    invoke-interface {v2, v3}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;->findEventsToSend(I)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 164
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 167
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->eventsMapValuesToStringParts(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v3

    .line 169
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v3, "No tracking events found to flush to the server."

    .line 170
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 172
    :cond_1
    invoke-direct {p0, v3}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->executeTrackingCall(Ljava/util/List;)Z

    move-result v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v3, 0x0

    :goto_1
    if-eqz v2, :cond_3

    .line 182
    :try_start_4
    invoke-interface {v2, v0, v3}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;->updateEventsSentStatus(Ljava/util/Map;Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v3, "Failed to perform tracking database clean up."

    .line 184
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v3, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 187
    :goto_2
    invoke-interface {v2}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;->release()V

    goto :goto_7

    :catchall_0
    move-exception v3

    goto :goto_8

    :catch_1
    move-exception v3

    move-object v7, v2

    move-object v2, v0

    move-object v0, v7

    goto :goto_5

    :catchall_1
    move-exception v2

    move-object v3, v2

    goto :goto_3

    :catch_2
    move-exception v2

    move-object v3, v2

    goto :goto_4

    :catchall_2
    move-exception v3

    :goto_3
    move-object v2, v0

    goto :goto_8

    :catch_3
    move-exception v3

    :goto_4
    move-object v2, v0

    :goto_5
    :try_start_5
    const-string v4, "Failed to flush tracking events to server."

    .line 177
    new-array v5, v1, [Ljava/lang/Object;

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-eqz v0, :cond_3

    .line 182
    :try_start_6
    invoke-interface {v0, v2, v1}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;->updateEventsSentStatus(Ljava/util/Map;Z)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_6

    :catch_4
    move-exception v2

    const-string v3, "Failed to perform tracking database clean up."

    .line 184
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v3, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 187
    :goto_6
    invoke-interface {v0}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;->release()V

    :cond_3
    :goto_7
    return-void

    :catchall_3
    move-exception v3

    move-object v7, v2

    move-object v2, v0

    move-object v0, v7

    :goto_8
    if-eqz v2, :cond_4

    .line 182
    :try_start_7
    invoke-interface {v2, v0, v1}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;->updateEventsSentStatus(Ljava/util/Map;Z)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_9

    :catch_5
    move-exception v0

    .line 184
    new-array v1, v1, [Ljava/lang/Object;

    const-string v4, "Failed to perform tracking database clean up."

    invoke-static {v0, v4, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 187
    :goto_9
    invoke-interface {v2}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;->release()V

    :cond_4
    throw v3
.end method

.method private getConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getTrackingAppConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic lambda$eventsMapValuesToStringParts$4(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;Ljava/util/List;I)Ljava/util/Map;
    .locals 0

    .line 212
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->abstractEventToStringParts(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;I)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$eventsMapValuesToStringParts$5(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;Ljava/util/List;)Ljava9/util/stream/Stream;
    .locals 2

    .line 211
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava9/util/stream/IntStream$-CC;->range(II)Ljava9/util/stream/IntStream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$9mbc_vWXXmCFGoQb8BY_3gfwi-0;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$9mbc_vWXXmCFGoQb8BY_3gfwi-0;-><init>(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;Ljava/util/List;)V

    .line 212
    invoke-interface {v0, v1}, Ljava9/util/stream/IntStream;->mapToObj(Ljava9/util/function/IntFunction;)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$flush$1(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)Ljava/lang/Long;
    .locals 2

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getTrackingAppConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->getMaxRowAge()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic lambda$flush$2(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)Ljava/lang/Integer;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getTrackingAppConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->getMaxAttempts()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic lambda$flush$3(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)Ljava/lang/Integer;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getTrackingAppConfig()Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/tracking/TrackingAppConfig;->getMaxRowsPerTable()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic lambda$schedule$0(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;Z)V
    .locals 5

    .line 88
    invoke-direct {p0}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->createScheduledWork()Lcom/ibotta/android/receiver/work/ScheduledWork;

    move-result-object v0

    const-string v1, "Scheduling tracking flush work: delay=%1$d"

    const/4 v2, 0x1

    .line 89
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/ibotta/android/receiver/work/ScheduledWork;->getDelay()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_1

    .line 91
    iget-object p1, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->scheduledWorkManager:Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->isScheduled(Lcom/ibotta/android/receiver/work/ScheduledWork;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Tracking flush already scheduled."

    .line 94
    new-array v0, v4, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 92
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->scheduledWorkManager:Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->scheduleAlarm(Lcom/ibotta/android/receiver/work/ScheduledWork;)V

    :goto_1
    return-void
.end method

.method private schedule(Z)V
    .locals 2

    const-string v0, "scheduleTrackingFlush"

    const/4 v1, 0x0

    .line 85
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-instance v1, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$0ds01iG_BHOyVU1PoUnJ2ap-34Y;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$0ds01iG_BHOyVU1PoUnJ2ap-34Y;-><init>(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;Z)V

    iget-object p1, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/util/AppHelper;->runWithLock(Ljava/lang/Runnable;Ljava/util/concurrent/locks/Lock;)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    const-string v0, "cancelTrackingFlush"

    const/4 v1, 0x0

    .line 106
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->scheduledWorkManager:Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    invoke-direct {p0}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->createScheduledWork()Lcom/ibotta/android/receiver/work/ScheduledWork;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->cancelAlarms(Lcom/ibotta/android/receiver/work/ScheduledWork;)V

    return-void
.end method

.method public flushNow()V
    .locals 2

    const-string v0, "Asking for an immediate flush now."

    const/4 v1, 0x0

    .line 133
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 134
    invoke-virtual {p0, v0}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->onWork(Landroid/os/Bundle;)V

    return-void
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 67
    const-class v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isScheduled()Z
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->scheduledWorkManager:Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    invoke-direct {p0}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->createScheduledWork()Lcom/ibotta/android/receiver/work/ScheduledWork;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->isScheduled(Lcom/ibotta/android/receiver/work/ScheduledWork;)Z

    move-result v0

    return v0
.end method

.method public onWork(Landroid/os/Bundle;)V
    .locals 1

    const-string p1, "Starting work..."

    const/4 v0, 0x0

    .line 116
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    invoke-direct {p0}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->flush()V

    .line 119
    invoke-static {}, Lcom/ibotta/android/ActivityLifecycleListener;->isInForeground()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 120
    invoke-direct {p0, p1}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->schedule(Z)V

    goto :goto_0

    .line 122
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->cancel()V

    :goto_0
    return-void
.end method

.method public reset(Z)V
    .locals 0

    return-void
.end method

.method public schedule()V
    .locals 1

    const/4 v0, 0x0

    .line 72
    invoke-direct {p0, v0}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->schedule(Z)V

    return-void
.end method
