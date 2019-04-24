.class public Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;
.super Ljava/lang/Object;
.source "FavoriteRetailerSettingsFlushWorker.java"

# interfaces
.implements Lcom/ibotta/android/service/work/ScheduledWorker;


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private final context:Landroid/content/Context;

.field private final hardware:Lcom/ibotta/android/hardware/Hardware;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final lock:Ljava/util/concurrent/locks/Lock;

.field private final scheduledWorkManager:Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/receiver/work/ScheduledWorkManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->lock:Ljava/util/concurrent/locks/Lock;

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 66
    iput-object p2, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 67
    iput-object p3, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 68
    iput-object p4, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->context:Landroid/content/Context;

    .line 69
    iput-object p5, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->hardware:Lcom/ibotta/android/hardware/Hardware;

    .line 70
    iput-object p6, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->scheduledWorkManager:Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    .line 71
    iput-object p7, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 72
    iput-object p8, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 73
    iput-object p9, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    return-void
.end method

.method private createScheduledWork()Lcom/ibotta/android/receiver/work/ScheduledWork;
    .locals 8

    .line 117
    new-instance v7, Lcom/ibotta/android/receiver/work/ScheduledWork;

    iget-object v1, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-direct {p0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->getConfig()Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;->getTxInterval()J

    move-result-wide v2

    .line 118
    invoke-virtual {p0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->getId()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const/high16 v4, 0x8000000

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/receiver/work/ScheduledWork;-><init>(Lcom/ibotta/android/util/AppHelper;JILjava/lang/String;Landroid/os/Bundle;)V

    return-object v7
.end method

.method private flush()V
    .locals 3

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "User logged out. Skipping favorite retailer settings flush."

    .line 150
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 153
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->isNetworkConnected()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Network unavailable. Skipping favorite retailer settings flush."

    .line 155
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 160
    :cond_1
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->flushFavoriteRetailerSettings()Z

    const-string v0, "Favorites flushed."

    .line 161
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Failed to flush favorite retailer settings to server."

    .line 163
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private flushFavoriteRetailerSettings()Z
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 180
    :try_start_0
    iget-object v2, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->context:Landroid/content/Context;

    invoke-static {v2}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->open(Landroid/content/Context;)Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;

    move-result-object v1

    .line 181
    iget-object v2, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v2}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v5

    .line 182
    invoke-interface {v1}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->findFavoriteRetailerSettings()Ljava/util/List;

    move-result-object v4

    .line 183
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 186
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    .line 187
    invoke-virtual {v7}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->isFavorited()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 188
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 193
    :cond_1
    invoke-direct {p0, v2}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->putFavoriteRetailerSettings(Ljava/util/List;)Z

    move-result v7

    .line 195
    invoke-direct {p0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->getConfig()Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;->getMaxAttempts()I

    move-result v8

    move-object v3, v1

    invoke-interface/range {v3 .. v8}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->updateAfterFlush(Ljava/util/List;JZI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    .line 205
    :try_start_1
    invoke-interface {v1}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    const-string v3, "Failed to release database."

    .line 208
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v3, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    const/4 v0, 0x1

    goto :goto_2

    :catchall_0
    move-exception v2

    goto :goto_3

    :catch_1
    move-exception v2

    :try_start_2
    const-string v3, "Failed to flush favorite retailer settings to server."

    .line 199
    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    sget-object v3, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v3, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_3

    .line 205
    :try_start_3
    invoke-interface {v1}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->release()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_2

    :catch_2
    move-exception v1

    const-string v2, "Failed to release database."

    .line 208
    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    sget-object v2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    return v0

    :goto_3
    if-eqz v1, :cond_4

    .line 205
    :try_start_4
    invoke-interface {v1}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->release()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_4

    :catch_3
    move-exception v1

    .line 208
    new-array v0, v0, [Ljava/lang/Object;

    const-string v3, "Failed to release database."

    invoke-static {v1, v3, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 210
    :cond_4
    :goto_4
    throw v2
.end method

.method private getConfig()Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getFavoriteRetailerSettingsConfig()Lcom/ibotta/android/state/app/config/favorites/FavoriteRetailerSettingsConfig;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic lambda$schedule$0(Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Z)V
    .locals 5

    .line 105
    invoke-direct {p0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->createScheduledWork()Lcom/ibotta/android/receiver/work/ScheduledWork;

    move-result-object v0

    const-string v1, "Scheduling favorite retailer settings flush work: delay=%1$d"

    const/4 v2, 0x1

    .line 106
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/ibotta/android/receiver/work/ScheduledWork;->getDelay()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_1

    .line 108
    iget-object p1, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->scheduledWorkManager:Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->isScheduled(Lcom/ibotta/android/receiver/work/ScheduledWork;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Favorite retailer settings flush already scheduled."

    .line 111
    new-array v0, v4, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 109
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->scheduledWorkManager:Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->scheduleAlarm(Lcom/ibotta/android/receiver/work/ScheduledWork;)V

    :goto_1
    return-void
.end method

.method private putFavoriteRetailerSettings(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    .line 228
    :try_start_0
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 229
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    .line 230
    invoke-virtual {v2}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->getRetailerId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 233
    :cond_0
    new-instance p1, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;

    iget-object v2, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 234
    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-direct {p1, v2, v1}, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;-><init>(ILjava/util/LinkedHashSet;)V

    .line 235
    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;->execute()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesResponse;

    .line 237
    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;->isSuccess()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 239
    :try_start_1
    invoke-direct {p0, v1}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->updateLocalHomeCategoriesCache(Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesResponse;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    move-object p1, v1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :catch_1
    move-exception p1

    const/4 v1, 0x0

    :goto_1
    const-string v2, "Failed to flush favorite retailer settings."

    .line 244
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move p1, v1

    :goto_2
    return p1
.end method

.method private schedule(Z)V
    .locals 3

    const-string v0, "Schedule favorite retailer settings flush."

    const/4 v1, 0x0

    .line 96
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Ignoring request to schedule. No logged in user."

    .line 99
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    invoke-virtual {p0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->cancel()V

    return-void

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-instance v1, Lcom/ibotta/android/service/work/favorites/-$$Lambda$FavoriteRetailerSettingsFlushWorker$z_DiqgvsbLHUZ_yYVDHfzRe0QfI;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/service/work/favorites/-$$Lambda$FavoriteRetailerSettingsFlushWorker$z_DiqgvsbLHUZ_yYVDHfzRe0QfI;-><init>(Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Z)V

    iget-object p1, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/util/AppHelper;->runWithLock(Ljava/lang/Runnable;Ljava/util/concurrent/locks/Lock;)V

    return-void
.end method

.method private updateLocalHomeCategoriesCache(Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesResponse;)V
    .locals 8

    const-string v0, "updateLocalHomeCategoriesCache"

    const/4 v1, 0x0

    .line 257
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    :try_start_0
    new-instance v0, Lcom/ibotta/api/call/home/HomeCall;

    invoke-direct {v0}, Lcom/ibotta/api/call/home/HomeCall;-><init>()V

    .line 260
    iget-object v2, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-interface {v2, v0}, Lcom/ibotta/android/appcache/AppCache;->getIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/call/home/HomeResponse;

    if-eqz v2, :cond_4

    .line 263
    invoke-virtual {v2}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailers()Ljava/util/List;

    move-result-object v3

    .line 264
    new-instance v4, Ljava/util/HashMap;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/HashMap;-><init>(I)V

    .line 267
    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesResponse;->getFavoriteRetailers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/api/model/customer/FavoriteRetailer;

    .line 268
    invoke-virtual {v5}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->getRetailerId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 274
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/api/model/retailer/Retailer;

    .line 275
    invoke-virtual {v6}, Lcom/ibotta/api/model/retailer/Retailer;->getId()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/api/model/customer/FavoriteRetailer;

    if-eqz v7, :cond_1

    .line 277
    invoke-virtual {v6, v7}, Lcom/ibotta/api/model/retailer/Retailer;->setFavorite(Lcom/ibotta/api/model/customer/FavoriteRetailer;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 280
    :cond_1
    invoke-virtual {v6}, Lcom/ibotta/api/model/retailer/Retailer;->getFavorite()Lcom/ibotta/api/model/customer/FavoriteRetailer;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 282
    invoke-virtual {v6, v1}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->setFavoritedState(Z)V

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 289
    :cond_3
    iget-object p1, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-interface {p1, v0, v2}, Lcom/ibotta/android/appcache/AppCache;->replace(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)V

    const-string p1, "Local cache updated HomeResponse: favorited=%1$d, unfavorited=%2$d"

    const/4 v0, 0x2

    .line 291
    new-array v0, v0, [Ljava/lang/Object;

    .line 293
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 294
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v0, v3

    .line 291
    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    const-string p1, "No local cache found to update."

    .line 296
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string v0, "Failed to update local cache."

    .line 299
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    const-string v0, "Cancel favorite retailer settings flush"

    const/4 v1, 0x0

    .line 123
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->scheduledWorkManager:Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    invoke-direct {p0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->createScheduledWork()Lcom/ibotta/android/receiver/work/ScheduledWork;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->cancelAlarms(Lcom/ibotta/android/receiver/work/ScheduledWork;)V

    return-void
.end method

.method public flushNow()V
    .locals 2

    const-string v0, "Asking for an immediate flush now."

    const/4 v1, 0x0

    .line 144
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 145
    invoke-virtual {p0, v0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->onWork(Landroid/os/Bundle;)V

    return-void
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 78
    const-class v0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isScheduled()Z
    .locals 2

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->scheduledWorkManager:Lcom/ibotta/android/receiver/work/ScheduledWorkManager;

    invoke-direct {p0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->createScheduledWork()Lcom/ibotta/android/receiver/work/ScheduledWork;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->isScheduled(Lcom/ibotta/android/receiver/work/ScheduledWork;)Z

    move-result v0

    return v0
.end method

.method public onWork(Landroid/os/Bundle;)V
    .locals 1

    const-string p1, "Starting work..."

    const/4 v0, 0x0

    .line 133
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    invoke-direct {p0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->flush()V

    return-void
.end method

.method public reset(Z)V
    .locals 0

    return-void
.end method

.method public schedule()V
    .locals 1

    const/4 v0, 0x0

    .line 83
    invoke-direct {p0, v0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->schedule(Z)V

    return-void
.end method
