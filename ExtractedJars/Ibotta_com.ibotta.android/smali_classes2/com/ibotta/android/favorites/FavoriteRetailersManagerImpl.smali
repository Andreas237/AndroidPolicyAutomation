.class Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;
.super Ljava/lang/Object;
.source "FavoriteRetailersManagerImpl.java"

# interfaces
.implements Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;


# static fields
.field private static final BRAZE_RETAILER_FAVORITE:Ljava/lang/String; = "retailer_favorite"


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final appboy:Lcom/appboy/Appboy;

.field private final cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

.field private final favoriteRetailerNotifier:Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;

.field private final favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

.field private localSettings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            ">;"
        }
    .end annotation
.end field

.field private serverSettings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;Lcom/appboy/Appboy;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->serverSettings:Ljava/util/Map;

    .line 43
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->localSettings:Ljava/util/Map;

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 53
    iput-object p2, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->appboy:Lcom/appboy/Appboy;

    .line 54
    iput-object p3, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    .line 55
    iput-object p4, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->favoriteRetailerNotifier:Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;

    .line 56
    iput-object p5, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    .line 57
    iput-object p6, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    return-void
.end method

.method private invalidateDependents()V
    .locals 2

    .line 266
    iget-object v0, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v1, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;

    invoke-direct {v1}, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;-><init>()V

    invoke-interface {v0, v1}, Lcom/ibotta/android/appcache/AppCache;->invalidate(Lcom/ibotta/api/CacheableApiCall;)V

    .line 267
    iget-object v0, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v1, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->cacheKeyMatcherFactory:Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forModules()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V

    return-void
.end method


# virtual methods
.method protected closeDatabase(Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;)V
    .locals 3

    const-string v0, "closeDatabase"

    const/4 v1, 0x0

    .line 248
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    return-void

    .line 255
    :cond_0
    :try_start_0
    invoke-interface {p1}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->release()V
    :try_end_0
    .catch Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to release favorite settings database."

    .line 258
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public deleteAllRecords()V
    .locals 4

    const/4 v0, 0x0

    .line 205
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->openDatabase()Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;

    move-result-object v0

    .line 207
    invoke-interface {v0}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->deleteEverything()V

    .line 208
    iget-object v1, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->localSettings:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 209
    invoke-direct {p0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->invalidateDependents()V

    .line 212
    iget-object v1, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    invoke-virtual {v1}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->schedule()V
    :try_end_0
    .catch Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "Failed to delete all favorite retailer settings."

    const/4 v3, 0x0

    .line 214
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    sget-object v2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 218
    :goto_0
    invoke-virtual {p0, v0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->closeDatabase(Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;)V

    return-void

    :goto_1
    invoke-virtual {p0, v0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->closeDatabase(Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;)V

    throw v1
.end method

.method public favorite(I)V
    .locals 5

    const/4 v0, 0x0

    .line 154
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->openDatabase()Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;

    move-result-object v0

    .line 156
    new-instance v1, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    invoke-direct {v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;-><init>()V

    const/4 v2, 0x1

    .line 157
    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->setFavorited(Z)V

    .line 158
    invoke-virtual {v1, p1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->setRetailerId(I)V

    .line 159
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v3}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->setFavoritedDate(Ljava/util/Date;)V

    .line 161
    invoke-interface {v0, v1}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->saveFavoriteRetailerSetting(Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;)Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    move-result-object v1

    .line 163
    iget-object v3, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->localSettings:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    invoke-direct {p0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->invalidateDependents()V

    .line 167
    iget-object v1, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    invoke-virtual {v1}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->schedule()V

    .line 169
    iget-object v1, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->appboy:Lcom/appboy/Appboy;

    const-string v3, "retailer_favorite"

    invoke-virtual {v1, v3}, Lcom/appboy/Appboy;->logCustomEvent(Ljava/lang/String;)V

    .line 171
    iget-object v1, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->favoriteRetailerNotifier:Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;

    invoke-virtual {v1, v2, p1}, Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;->notifyFavoriteRetailerChanged(ZI)V
    :try_end_0
    .catch Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    const-string v1, "Failed to save favorite retailer setting."

    const/4 v2, 0x0

    .line 173
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 177
    :goto_0
    invoke-virtual {p0, v0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->closeDatabase(Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;)V

    return-void

    :goto_1
    invoke-virtual {p0, v0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->closeDatabase(Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;)V

    throw p1
.end method

.method public getFavoriteRetailerIds()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 183
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 185
    invoke-virtual {p0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->getFavoriteRetailerSettings()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 186
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 188
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    invoke-virtual {v2}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->isFavorited()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 189
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getFavoriteRetailerSettings()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            ">;"
        }
    .end annotation

    .line 198
    new-instance v0, Ljava/util/LinkedHashMap;

    iget-object v1, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->localSettings:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public isFavorited(I)Z
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->localSettings:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->localSettings:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    invoke-virtual {p1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->isFavorited()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public load()V
    .locals 5

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->localSettings:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    .line 85
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->openDatabase()Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;

    move-result-object v0

    .line 88
    invoke-interface {v0}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->findFavoriteRetailerSettings()Ljava/util/List;

    move-result-object v1

    .line 89
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    .line 90
    iget-object v3, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->localSettings:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->getRetailerId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 95
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->serverSettings:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    .line 96
    iget-object v3, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->localSettings:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->getRetailerId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 98
    invoke-interface {v0, v2}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->saveFavoriteRetailerSetting(Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;)Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    move-result-object v2

    .line 99
    iget-object v3, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->localSettings:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->getRetailerId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "Failed to query for favorite retailer settings."

    const/4 v3, 0x0

    .line 103
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    sget-object v2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    :cond_2
    invoke-virtual {p0, v0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->closeDatabase(Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;)V

    return-void

    :goto_2
    invoke-virtual {p0, v0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->closeDatabase(Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;)V

    throw v1
.end method

.method protected openDatabase()Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;
    .locals 3

    const-string v0, "openDatabase"

    const/4 v1, 0x0

    .line 228
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    :try_start_0
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->open(Landroid/content/Context;)Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;

    move-result-object v0
    :try_end_0
    .catch Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Failed to open favorite retailer settings database."

    .line 234
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public setRetailersFromServer(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->serverSettings:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 67
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/RetailerModel;

    if-eqz v0, :cond_0

    .line 68
    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getFavorite()Lcom/ibotta/api/model/customer/FavoriteRetailer;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 69
    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getFavorite()Lcom/ibotta/api/model/customer/FavoriteRetailer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->isFavoritedState()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 74
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->serverSettings:Ljava/util/Map;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 75
    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getFavorite()Lcom/ibotta/api/model/customer/FavoriteRetailer;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->fromFavoriteRetailer(Lcom/ibotta/api/model/customer/FavoriteRetailer;)Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    move-result-object v0

    .line 74
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public unfavorite(I)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 126
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->openDatabase()Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;

    move-result-object v1

    .line 128
    new-instance v2, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    invoke-direct {v2}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;-><init>()V

    .line 129
    invoke-virtual {v2, v0}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->setFavorited(Z)V

    .line 130
    invoke-virtual {v2, p1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->setRetailerId(I)V

    .line 132
    invoke-interface {v1, v2}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;->saveFavoriteRetailerSetting(Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;)Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    move-result-object v2

    .line 134
    iget-object v3, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->localSettings:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    invoke-direct {p0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->invalidateDependents()V

    .line 138
    iget-object v2, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    invoke-virtual {v2}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->schedule()V

    .line 140
    iget-object v2, p0, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->favoriteRetailerNotifier:Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;

    invoke-virtual {v2, v0, p1}, Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;->notifyFavoriteRetailerChanged(ZI)V
    :try_end_0
    .catch Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    const-string v2, "Failed to save favorite retailer setting."

    .line 142
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 146
    :goto_0
    invoke-virtual {p0, v1}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->closeDatabase(Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;)V

    return-void

    :goto_1
    invoke-virtual {p0, v1}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerImpl;->closeDatabase(Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;)V

    throw p1
.end method
