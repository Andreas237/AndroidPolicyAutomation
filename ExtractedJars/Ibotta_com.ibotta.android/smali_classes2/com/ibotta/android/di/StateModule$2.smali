.class Lcom/ibotta/android/di/StateModule$2;
.super Ljava/lang/Object;
.source "StateModule.java"

# interfaces
.implements Lcom/ibotta/android/state/app/UserStateAppCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/di/StateModule;->provideUserStateAppCallback(Lcom/ibotta/android/state/app/AppCacheCallback;Landroid/content/Context;Lcom/ibotta/android/state/app/email/EmailState;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/state/app/UserStateAppCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$appCacheCallback:Lcom/ibotta/android/state/app/AppCacheCallback;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$emailState:Lcom/ibotta/android/state/app/email/EmailState;

.field final synthetic val$tracker:Lcom/ibotta/android/tracking/Tracker;


# direct methods
.method constructor <init>(Lcom/ibotta/android/state/app/AppCacheCallback;Lcom/ibotta/android/state/app/email/EmailState;Lcom/ibotta/android/tracking/Tracker;Landroid/content/Context;)V
    .locals 0

    .line 239
    iput-object p1, p0, Lcom/ibotta/android/di/StateModule$2;->val$appCacheCallback:Lcom/ibotta/android/state/app/AppCacheCallback;

    iput-object p2, p0, Lcom/ibotta/android/di/StateModule$2;->val$emailState:Lcom/ibotta/android/state/app/email/EmailState;

    iput-object p3, p0, Lcom/ibotta/android/di/StateModule$2;->val$tracker:Lcom/ibotta/android/tracking/Tracker;

    iput-object p4, p0, Lcom/ibotta/android/di/StateModule$2;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public addListener(Lcom/ibotta/api/AppCacheListener;)V
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule$2;->val$appCacheCallback:Lcom/ibotta/android/state/app/AppCacheCallback;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/app/AppCacheCallback;->addListener(Lcom/ibotta/api/AppCacheListener;)V

    return-void
.end method

.method public cacheClearCustomerFriends()V
    .locals 1

    .line 282
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomerFriends()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public clearAllFavoriteRetailerSettings()V
    .locals 3

    .line 288
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule$2;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->clearAll(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to delete favorite retailer settings database."

    const/4 v2, 0x0

    .line 291
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public geofenceCoordinatorOnLogIn()V
    .locals 1

    .line 257
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGeofenceCoordinator()Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;->onLogIn()V

    return-void
.end method

.method public geofenceCoordinatorOnSettingChange()V
    .locals 1

    .line 262
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGeofenceCoordinator()Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;->onSettingChange()V

    return-void
.end method

.method public getMemIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .locals 1

    .line 247
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule$2;->val$appCacheCallback:Lcom/ibotta/android/state/app/AppCacheCallback;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/app/AppCacheCallback;->getMemIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object p1

    return-object p1
.end method

.method public setLastEmailUsed(Ljava/lang/String;)V
    .locals 1

    .line 252
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule$2;->val$emailState:Lcom/ibotta/android/state/app/email/EmailState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/app/email/EmailState;->setLastEmailUsed(Ljava/lang/String;)V

    return-void
.end method

.method public setUserIdForTracker(Ljava/lang/String;)V
    .locals 1

    .line 267
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule$2;->val$tracker:Lcom/ibotta/android/tracking/Tracker;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/Tracker;->setUserId(Ljava/lang/String;)V

    return-void
.end method

.method public trackEvent(Ljava/lang/String;)V
    .locals 1

    .line 272
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule$2;->val$tracker:Lcom/ibotta/android/tracking/Tracker;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;)V

    return-void
.end method

.method public trackEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule$2;->val$tracker:Lcom/ibotta/android/tracking/Tracker;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
