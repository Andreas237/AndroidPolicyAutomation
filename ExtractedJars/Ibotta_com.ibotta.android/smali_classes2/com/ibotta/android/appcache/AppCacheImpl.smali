.class public Lcom/ibotta/android/appcache/AppCacheImpl;
.super Ljava/lang/Object;
.source "AppCacheImpl.java"

# interfaces
.implements Lcom/ibotta/android/appcache/AppCache;
.implements Lcom/ibotta/android/state/app/upgrade/AppUpgradeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;,
        Lcom/ibotta/android/appcache/AppCacheImpl$ApiCallFilenameFilter;,
        Lcom/ibotta/android/appcache/AppCacheImpl$Item;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/appcache/AppCache<",
        "Lcom/ibotta/api/CacheableApiCall;",
        "Lcom/ibotta/api/CacheableApiResponse;",
        ">;",
        "Lcom/ibotta/android/state/app/upgrade/AppUpgradeListener;"
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field public static final CACHE_DIR:Ljava/lang/String; = "api_cache"

.field private static final FAMILY_LOCK_DEFAULT:Ljava/lang/String; = "family_lock_default"

.field private static final MAX_SIZE_HEAVY_CACHE:I = 0x4

.field private static final MAX_SIZE_LIGHT_CACHE:I = 0x14

.field public static final WORK_DIR:Ljava/lang/String; = "api_work"

.field private static final batchLock:Ljava/util/concurrent/locks/Lock;

.field private static final cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field private static final diskLock:Ljava/util/concurrent/locks/Lock;

.field private static final familyLocks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/locks/Lock;",
            ">;"
        }
    .end annotation
.end field

.field private static final familyMapLock:Ljava/util/concurrent/locks/Lock;

.field private static final pendingDiskWritesLock:Ljava/util/concurrent/locks/Lock;


# instance fields
.field private final appCacheDir:Ljava/io/File;

.field private final appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

.field private final cachePolicies:Lcom/ibotta/android/appcache/policy/CachePolicies;

.field private final cacheTimes:Landroid/content/SharedPreferences;

.field private diskWriteService:Ljava/util/concurrent/ExecutorService;

.field private final handler:Landroid/os/Handler;

.field private final heavyCache:Landroid/support/v4/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LruCache<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/appcache/AppCacheImpl$Item;",
            ">;"
        }
    .end annotation
.end field

.field private json:Lcom/ibotta/android/json/IbottaJson;

.field private final lightCache:Landroid/support/v4/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LruCache<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/appcache/AppCacheImpl$Item;",
            ">;"
        }
    .end annotation
.end field

.field private final listeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/api/AppCacheListener;",
            ">;"
        }
    .end annotation
.end field

.field private final pendingDiskWrites:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/CacheableApiCall;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 66
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>(Z)V

    sput-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->batchLock:Ljava/util/concurrent/locks/Lock;

    .line 68
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0, v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>(Z)V

    sput-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->diskLock:Ljava/util/concurrent/locks/Lock;

    .line 70
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWritesLock:Ljava/util/concurrent/locks/Lock;

    .line 72
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0, v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>(Z)V

    sput-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->familyMapLock:Ljava/util/concurrent/locks/Lock;

    .line 74
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->familyLocks:Ljava/util/Map;

    .line 76
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0, v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>(Z)V

    sput-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;Ljava/io/File;Lcom/ibotta/android/appcache/policy/CachePolicies;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Landroid/os/Handler;)V
    .locals 2

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    new-instance v0, Landroid/support/v4/util/LruCache;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Landroid/support/v4/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->lightCache:Landroid/support/v4/util/LruCache;

    .line 87
    new-instance v0, Landroid/support/v4/util/LruCache;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Landroid/support/v4/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->heavyCache:Landroid/support/v4/util/LruCache;

    .line 88
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->listeners:Ljava/util/Set;

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWrites:Ljava/util/List;

    .line 100
    iput-object p1, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheTimes:Landroid/content/SharedPreferences;

    .line 101
    iput-object p2, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->appCacheDir:Ljava/io/File;

    .line 102
    iput-object p3, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cachePolicies:Lcom/ibotta/android/appcache/policy/CachePolicies;

    .line 103
    iput-object p4, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    .line 104
    iput-object p5, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/appcache/AppCacheImpl;)Ljava/util/Set;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->listeners:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/ibotta/android/appcache/AppCacheImpl;)Ljava/util/List;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWrites:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$200()Ljava/util/concurrent/locks/Lock;
    .locals 1

    .line 59
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->batchLock:Ljava/util/concurrent/locks/Lock;

    return-object v0
.end method

.method static synthetic access$300(Lcom/ibotta/android/appcache/AppCacheImpl;Lcom/ibotta/api/CacheableApiCall;)Ljava/util/concurrent/locks/Lock;
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getFamilyLock(Lcom/ibotta/api/CacheableApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/appcache/AppCacheImpl;Ljava/lang/String;)Ljava/io/File;
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$500(Lcom/ibotta/android/appcache/AppCacheImpl;)Lcom/ibotta/android/json/IbottaJson;
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/ibotta/android/appcache/AppCacheImpl;->getJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$600(Lcom/ibotta/android/appcache/AppCacheImpl;)Lcom/ibotta/android/tracking/timing/AppTimingTracker;
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    return-object p0
.end method

.method static synthetic access$700(Lcom/ibotta/android/appcache/AppCacheImpl;Lcom/ibotta/api/CacheableApiCall;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->writeCacheTime(Lcom/ibotta/api/CacheableApiCall;)V

    return-void
.end method

.method static synthetic access$800(Lcom/ibotta/android/appcache/AppCacheImpl;Lcom/ibotta/api/CacheableApiCall;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->checkCacheLimits(Lcom/ibotta/api/CacheableApiCall;)V

    return-void
.end method

.method static synthetic access$900()Ljava/util/concurrent/locks/Lock;
    .locals 1

    .line 59
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWritesLock:Ljava/util/concurrent/locks/Lock;

    return-object v0
.end method

.method private checkCacheLimits(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 7

    .line 555
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;

    move-result-object v0

    .line 556
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->isInvalidatesCacheFamily()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ibotta/api/CachePolicy;->getKeepAtMost()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 557
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object p1

    .line 558
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheTimes(Ljava/lang/String;)Ljava/util/TreeMap;

    move-result-object v1

    .line 559
    :goto_0
    invoke-virtual {v1}, Ljava/util/TreeMap;->size()I

    move-result v2

    invoke-interface {v0}, Lcom/ibotta/api/CachePolicy;->getKeepAtMost()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-le v2, v3, :cond_0

    .line 560
    invoke-virtual {v1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    .line 561
    invoke-virtual {v1, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 562
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 564
    invoke-direct {p0, p1, v4}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeDiskByName(Ljava/lang/String;Ljava/lang/String;)V

    .line 565
    invoke-direct {p0, v4}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeMemByName(Ljava/lang/String;)V

    .line 566
    invoke-direct {p0, v3}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeCacheTime(Ljava/lang/String;)V

    .line 568
    invoke-virtual {v1, v2}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "Removed oldest cache file to stay within the count limit: limit=%1$d, %2$s, %3$s"

    const/4 v3, 0x3

    .line 570
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 572
    invoke-interface {v0}, Lcom/ibotta/api/CachePolicy;->getKeepAtMost()Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v5

    const/4 v5, 0x1

    aput-object p1, v3, v5

    const/4 v5, 0x2

    aput-object v4, v3, v5

    .line 570
    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private get(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .locals 1

    .line 469
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getMem(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v0

    if-nez v0, :cond_0

    .line 472
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getDisk(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private getCacheDir(Ljava/lang/String;)Ljava/io/File;
    .locals 4

    .line 785
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->appCacheDir:Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "api_cache/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 786
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    .line 787
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    return-object v0
.end method

.method private getDisk(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .locals 1

    const/4 v0, 0x1

    .line 479
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/appcache/AppCacheImpl;->getDisk(Lcom/ibotta/api/CacheableApiCall;Z)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object p1

    return-object p1
.end method

.method private getDisk(Lcom/ibotta/api/CacheableApiCall;Z)Lcom/ibotta/api/CacheableApiResponse;
    .locals 9

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 483
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->isExpired(Lcom/ibotta/api/CacheableApiCall;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-object v0

    .line 487
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->buildCacheName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object p2

    .line 490
    new-instance v1, Ljava/io/File;

    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 491
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    .line 493
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 494
    invoke-direct {p0}, Lcom/ibotta/android/appcache/AppCacheImpl;->getJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v2

    new-instance v7, Ljava/io/FileInputStream;

    invoke-direct {v7, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-interface {p1, v2, v7}, Lcom/ibotta/api/CacheableApiCall;->restoreFromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v0

    .line 495
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v5

    const-string v2, "Disk read took: %1$dms"

    .line 497
    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-static {v2, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    iget-object v2, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    .line 499
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    .line 498
    invoke-interface {v2, p1, v7, v8}, Lcom/ibotta/android/tracking/timing/AppTimingTracker;->trackTimeToReadDiskCache(Ljava/lang/String;J)V

    if-eqz v0, :cond_1

    const-string p1, "HIT - Disk cache: %1$s"

    .line 502
    new-array v2, v4, [Ljava/lang/Object;

    aput-object p2, v2, v3

    invoke-static {p1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 503
    invoke-virtual {v0, v4}, Lcom/ibotta/api/CacheableApiResponse;->setFromCache(Z)V

    goto :goto_0

    :cond_1
    const-string p1, "MISS - Disk cache: %1$s"

    .line 505
    new-array v2, v4, [Ljava/lang/Object;

    aput-object p2, v2, v3

    invoke-static {p1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Failed to read cache file: %1$s"

    .line 508
    new-array v2, v4, [Ljava/lang/Object;

    aput-object v1, v2, v3

    invoke-static {p1, p2, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    instance-of p2, p1, Lcom/ibotta/android/json/IbottaJsonException;

    if-nez p2, :cond_3

    .line 510
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    const-string p1, "MISS - Disk cache: %1$s"

    .line 514
    new-array v1, v4, [Ljava/lang/Object;

    aput-object p2, v1, v3

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-object v0
.end method

.method private getFamilyLock(Lcom/ibotta/api/CacheableApiCall;)Ljava/util/concurrent/locks/Lock;
    .locals 3

    const-string v0, "getFamilyLock: lock wait"

    const/4 v1, 0x0

    .line 451
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->familyMapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v0, "getFamilyLock: lock acquired"

    .line 453
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    .line 455
    :try_start_0
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "family_lock_default"

    .line 456
    :goto_0
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->familyLocks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/locks/Lock;

    if-nez v0, :cond_1

    .line 458
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>(Z)V

    .line 459
    sget-object v2, Lcom/ibotta/android/appcache/AppCacheImpl;->familyLocks:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 462
    :cond_1
    sget-object p1, Lcom/ibotta/android/appcache/AppCacheImpl;->familyMapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string p1, "getFamilyLock: lock released"

    .line 463
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :catchall_0
    move-exception p1

    .line 462
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->familyMapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 463
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "getFamilyLock: lock released"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method private getJson()Lcom/ibotta/android/json/IbottaJson;
    .locals 2

    .line 1015
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->json:Lcom/ibotta/android/json/IbottaJson;

    if-nez v0, :cond_0

    .line 1016
    sget-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v1}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->json:Lcom/ibotta/android/json/IbottaJson;

    .line 1019
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->json:Lcom/ibotta/android/json/IbottaJson;

    return-object v0
.end method

.method private getMem(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .locals 1

    const/4 v0, 0x1

    .line 763
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/appcache/AppCacheImpl;->getMem(Lcom/ibotta/api/CacheableApiCall;Z)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object p1

    return-object p1
.end method

.method private getMem(Lcom/ibotta/api/CacheableApiCall;Z)Lcom/ibotta/api/CacheableApiResponse;
    .locals 4

    .line 767
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->buildCacheName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object v0

    .line 768
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getMemCache(Lcom/ibotta/api/CacheableApiCall;)Landroid/support/v4/util/LruCache;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/appcache/AppCacheImpl$Item;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-nez p2, :cond_0

    .line 771
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->isExpired(Lcom/ibotta/api/CacheableApiCall;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, "HIT - Mem cache: %1$s"

    .line 772
    new-array p2, v3, [Ljava/lang/Object;

    aput-object v0, p2, v2

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    iget-object p1, v1, Lcom/ibotta/android/appcache/AppCacheImpl$Item;->response:Lcom/ibotta/api/CacheableApiResponse;

    .line 776
    invoke-virtual {p1, v3}, Lcom/ibotta/api/CacheableApiResponse;->setFromCache(Z)V

    goto :goto_0

    :cond_1
    const-string p1, "MISS - Mem cache: %1$s"

    .line 778
    new-array p2, v3, [Ljava/lang/Object;

    aput-object v0, p2, v2

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private getMemCache(Lcom/ibotta/api/CacheableApiCall;)Landroid/support/v4/util/LruCache;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/CacheableApiCall;",
            ")",
            "Landroid/support/v4/util/LruCache<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/appcache/AppCacheImpl$Item;",
            ">;"
        }
    .end annotation

    .line 1023
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;

    move-result-object p1

    .line 1025
    invoke-interface {p1}, Lcom/ibotta/api/CachePolicy;->isHeavyCache()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1026
    iget-object p1, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->heavyCache:Landroid/support/v4/util/LruCache;

    goto :goto_0

    .line 1028
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->lightCache:Landroid/support/v4/util/LruCache;

    :goto_0
    return-object p1
.end method

.method private hasNewer(Lcom/ibotta/api/CacheableApiCall;J)Z
    .locals 4

    .line 714
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->buildCacheName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object v0

    .line 715
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getMemCache(Lcom/ibotta/api/CacheableApiCall;)Landroid/support/v4/util/LruCache;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/appcache/AppCacheImpl$Item;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 717
    iget-wide v2, v0, Lcom/ibotta/android/appcache/AppCacheImpl$Item;->saved:J

    cmp-long v0, v2, p2

    if-gez v0, :cond_0

    goto :goto_0

    .line 720
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheTime(Lcom/ibotta/api/CacheableApiCall;)J

    move-result-wide v2

    cmp-long p1, v2, p2

    if-lez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1
.end method

.method private invalidateCacheTime(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 0

    .line 962
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheTimeName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->invalidateCacheTime(Ljava/lang/String;)V

    return-void
.end method

.method private invalidateCacheTime(Ljava/lang/String;)V
    .locals 3

    const-string v0, "Invalidate cache time: %1$s"

    const/4 v1, 0x1

    .line 966
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 967
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheTimes:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 968
    invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 969
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method private invalidateFamilyCacheTime(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 6

    .line 973
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheTimes:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 974
    iget-object v1, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheTimes:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 975
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 976
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "Invalidate cache time: %1$s"

    const/4 v4, 0x1

    .line 977
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-wide/16 v3, 0x0

    .line 978
    invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 981
    :cond_1
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method private invalidatePrivate(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 4

    .line 1005
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->isInvalidatesCacheFamily()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const-string v0, "Invalidating cache family: %1$s"

    .line 1006
    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1007
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->invalidateFamilyCacheTime(Lcom/ibotta/api/CacheableApiCall;)V

    goto :goto_0

    :cond_0
    const-string v0, "Invalidating cache files with name: %1$s"

    .line 1009
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->buildCacheName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1010
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->invalidateCacheTime(Lcom/ibotta/api/CacheableApiCall;)V

    :goto_0
    return-void
.end method

.method private isExpired(Lcom/ibotta/api/CacheableApiCall;)Z
    .locals 12

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 675
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    .line 681
    :cond_1
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 683
    invoke-interface {v1}, Lcom/ibotta/api/CachePolicy;->getAgeLimit()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-lez v1, :cond_5

    .line 686
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->buildCacheName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object v1

    .line 687
    new-instance v5, Ljava/io/File;

    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, v6}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    invoke-direct {v5, v6, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 688
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long v3, v6, v3

    .line 690
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheTime(Lcom/ibotta/api/CacheableApiCall;)J

    move-result-wide v8

    const-string v10, "Checking expiration: %1$s, %2$d"

    const/4 v11, 0x2

    .line 692
    new-array v11, v11, [Ljava/lang/Object;

    aput-object v1, v11, v2

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v11, v0

    invoke-static {v10, v11}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    cmp-long v1, v8, v3

    if-gez v1, :cond_2

    const-string p1, "Cache file is expired."

    .line 695
    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    cmp-long v1, v8, v6

    if-lez v1, :cond_3

    const-string p1, "Cache file timestamp is in the future! Treating it as expired."

    .line 698
    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 699
    :cond_3
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getMem(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object p1

    if-nez p1, :cond_4

    const-string p1, "Cache file not on disk, and not in memory. Implicitly expired."

    .line 701
    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    const-string p1, "Cache file is still good."

    .line 704
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    :cond_5
    :goto_0
    return v0
.end method

.method private notifyCachedResponseSaved(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;Z)V
    .locals 1

    .line 862
    new-instance v0, Lcom/ibotta/android/appcache/AppCacheImpl$1;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/appcache/AppCacheImpl$1;-><init>(Lcom/ibotta/android/appcache/AppCacheImpl;Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;Z)V

    .line 879
    iget-object p1, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->handler:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private putEverywhere(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;Z)V
    .locals 1

    const/4 v0, 0x1

    .line 526
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/appcache/AppCacheImpl;->putEverywhere(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;ZZ)V

    return-void
.end method

.method private putEverywhere(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;ZZ)V
    .locals 11

    if-eqz p4, :cond_0

    .line 531
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->isInvalidatesCacheFamilyOnWrite()Z

    move-result p4

    if-eqz p4, :cond_0

    .line 532
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->remove(Lcom/ibotta/api/CacheableApiCall;)V

    .line 535
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;

    move-result-object p4

    if-nez p4, :cond_1

    return-void

    .line 541
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/appcache/AppCacheImpl;->putMem(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)Lcom/ibotta/android/appcache/AppCacheImpl$Item;

    move-result-object v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_2

    .line 544
    iget-wide v3, v0, Lcom/ibotta/android/appcache/AppCacheImpl$Item;->saved:J

    goto :goto_0

    :cond_2
    move-wide v3, v1

    .line 545
    :goto_0
    invoke-interface {p4}, Lcom/ibotta/api/CachePolicy;->isMemcache()Z

    move-result p4

    if-nez p4, :cond_3

    cmp-long p4, v3, v1

    if-nez p4, :cond_3

    .line 546
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 547
    invoke-direct {p0, p1, v3, v4}, Lcom/ibotta/android/appcache/AppCacheImpl;->writeCacheTime(Lcom/ibotta/api/CacheableApiCall;J)V

    move-wide v9, v3

    goto :goto_1

    :cond_3
    move-wide v9, v3

    .line 550
    :goto_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/appcache/AppCacheImpl;->notifyCachedResponseSaved(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;Z)V

    .line 551
    new-instance p3, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;

    move-object v5, p3

    move-object v6, p0

    move-object v7, p1

    move-object v8, p2

    invoke-direct/range {v5 .. v10}, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;-><init>(Lcom/ibotta/android/appcache/AppCacheImpl;Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;J)V

    invoke-direct {p0, p3}, Lcom/ibotta/android/appcache/AppCacheImpl;->queueDiskWrite(Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;)V

    return-void
.end method

.method private putMem(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)Lcom/ibotta/android/appcache/AppCacheImpl$Item;
    .locals 6

    .line 738
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cachePolicies:Lcom/ibotta/android/appcache/policy/CachePolicies;

    invoke-interface {v0, p1}, Lcom/ibotta/android/appcache/policy/CachePolicies;->getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_0

    const-string p2, "No cache policy set for: %1$s"

    .line 740
    new-array v0, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v2

    invoke-static {p2, v0}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    .line 743
    :cond_0
    invoke-interface {v0}, Lcom/ibotta/api/CachePolicy;->isMemcache()Z

    move-result v0

    if-nez v0, :cond_1

    const-string p2, "Not memcache enabled: %1$s"

    .line 744
    new-array v0, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v2

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    .line 748
    :cond_1
    new-instance v0, Lcom/ibotta/android/appcache/AppCacheImpl$Item;

    invoke-direct {v0, v1}, Lcom/ibotta/android/appcache/AppCacheImpl$Item;-><init>(Lcom/ibotta/android/appcache/AppCacheImpl$1;)V

    .line 749
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/appcache/AppCacheImpl$Item;->family:Ljava/lang/String;

    .line 750
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, v0, Lcom/ibotta/android/appcache/AppCacheImpl$Item;->saved:J

    .line 751
    iput-object p2, v0, Lcom/ibotta/android/appcache/AppCacheImpl$Item;->response:Lcom/ibotta/api/CacheableApiResponse;

    .line 753
    iget-wide v4, v0, Lcom/ibotta/android/appcache/AppCacheImpl$Item;->saved:J

    invoke-direct {p0, p1, v4, v5}, Lcom/ibotta/android/appcache/AppCacheImpl;->writeCacheTime(Lcom/ibotta/api/CacheableApiCall;J)V

    .line 756
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->buildCacheName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object p2

    .line 757
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getMemCache(Lcom/ibotta/api/CacheableApiCall;)Landroid/support/v4/util/LruCache;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "SAVED - Mem cache: %1$s"

    .line 758
    new-array v1, v3, [Ljava/lang/Object;

    aput-object p2, v1, v2

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method private queueDiskWrite(Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;)V
    .locals 3

    const-string v0, "queueDiskWrite: disk lock wait"

    const/4 v1, 0x0

    .line 1034
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1035
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->diskLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v0, "queueDiskWrite: disk lock acquired"

    .line 1036
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1038
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->diskWriteService:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    .line 1039
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->diskWriteService:Ljava/util/concurrent/ExecutorService;

    :cond_0
    const-string v0, "queueDiskWrite: pending disk writes lock wait"

    .line 1042
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1043
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWritesLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v0, "queueDiskWrite: pending disk writes  lock acquired"

    .line 1044
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1046
    :try_start_1
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWrites:Ljava/util/List;

    invoke-virtual {p1}, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->getCacheable()Lcom/ibotta/api/CacheableApiCall;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1047
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->diskWriteService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    const-string p1, "Pending disk write count: %1$d"

    const/4 v0, 0x1

    .line 1048
    new-array v0, v0, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWrites:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1050
    :try_start_2
    sget-object p1, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWritesLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string p1, "queueDiskWrite: pending disk writes lock released"

    .line 1051
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1054
    sget-object p1, Lcom/ibotta/android/appcache/AppCacheImpl;->diskLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string p1, "queueDiskWrite: disk lock released"

    .line 1055
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    .line 1050
    :try_start_3
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWritesLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "queueDiskWrite: pending disk writes lock released"

    .line 1051
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 1054
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->diskLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 1055
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "queueDiskWrite: disk lock released"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method private removeCacheTime(Ljava/lang/String;)V
    .locals 3

    const-string v0, "Removing cache time: %1$s"

    const/4 v1, 0x1

    .line 943
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 944
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheTimes:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 945
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 946
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method private removeDiskByFamily(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 4

    const-string v0, "REMOVE - Disk cache: %1$s"

    const/4 v1, 0x1

    .line 580
    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheKey()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 583
    invoke-static {v0}, Lorg/apache/commons/io/FileUtils;->deleteQuietly(Ljava/io/File;)Z

    .line 585
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeFamilyCacheTime(Lcom/ibotta/api/CacheableApiCall;)V

    return-void
.end method

.method private removeDiskByName(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 1

    .line 589
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->buildCacheName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeDiskByName(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private removeDiskByName(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const-string v0, "REMOVE - Disk cache: %1$s"

    const/4 v1, 0x1

    .line 593
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 594
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 596
    new-instance v2, Lcom/ibotta/android/appcache/AppCacheImpl$ApiCallFilenameFilter;

    invoke-direct {v2, p2}, Lcom/ibotta/android/appcache/AppCacheImpl$ApiCallFilenameFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 598
    array-length v4, v2

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v2, v5

    .line 599
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 600
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    move-result v6

    const-string v7, "Destroy cache file: success=%1$b, file=%2$s"

    const/4 v8, 0x2

    .line 601
    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v8, v3

    aput-object p2, v8, v1

    invoke-static {v7, v8}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 605
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheTimeName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeCacheTime(Ljava/lang/String;)V

    return-void
.end method

.method private removeFamilyCacheTime(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 6

    .line 950
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheTimes:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 951
    iget-object v1, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheTimes:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 952
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 953
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "Invalidate cache time: %1$s"

    const/4 v4, 0x1

    .line 954
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 955
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 958
    :cond_1
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method private removeInvalidateables(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 7

    .line 647
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cachePolicies:Lcom/ibotta/android/appcache/policy/CachePolicies;

    invoke-interface {v0, p1}, Lcom/ibotta/android/appcache/policy/CachePolicies;->getCacheInvalidators(Lcom/ibotta/api/CacheableApiCall;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 649
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/appcache/InvalidationCriteria;

    .line 650
    invoke-interface {v1, p1}, Lcom/ibotta/android/appcache/InvalidationCriteria;->isInvalidatedBy(Lcom/ibotta/api/CacheableApiCall;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 651
    invoke-interface {v1}, Lcom/ibotta/android/appcache/InvalidationCriteria;->getInvalidateable()Lcom/ibotta/api/CacheableApiCall;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    const-string v2, "removeInvalidateables: Remove cacheable due to invalidator: invalidateable=%1$s, invalidator=%2$s"

    const/4 v5, 0x2

    .line 653
    new-array v5, v5, [Ljava/lang/Object;

    .line 655
    invoke-interface {v1}, Lcom/ibotta/android/appcache/InvalidationCriteria;->getInvalidateable()Lcom/ibotta/api/CacheableApiCall;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v3

    .line 656
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v5, v4

    .line 653
    invoke-static {v2, v5}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 658
    invoke-interface {v1}, Lcom/ibotta/android/appcache/InvalidationCriteria;->getInvalidateable()Lcom/ibotta/api/CacheableApiCall;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/ibotta/android/appcache/AppCacheImpl;->removePrivate(Lcom/ibotta/api/CacheableApiCall;)V

    goto :goto_1

    :cond_1
    const-string v2, "removeInvalidateables: No invalidateable specified in: %1$s"

    .line 660
    new-array v4, v4, [Ljava/lang/Object;

    .line 662
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v3

    .line 660
    invoke-static {v2, v4}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 664
    :goto_1
    invoke-interface {v1}, Lcom/ibotta/android/appcache/InvalidationCriteria;->cleanUp()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private removeMemByFamily(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 7

    const-string v0, "REMOVE - Mem cache: %1$s"

    const/4 v1, 0x1

    .line 609
    new-array v2, v1, [Ljava/lang/Object;

    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheKey()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 610
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getMemCache(Lcom/ibotta/api/CacheableApiCall;)Landroid/support/v4/util/LruCache;

    move-result-object v0

    .line 611
    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->snapshot()Ljava/util/Map;

    move-result-object v2

    .line 613
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 614
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/appcache/AppCacheImpl$Item;

    iget-object v5, v5, Lcom/ibotta/android/appcache/AppCacheImpl$Item;->family:Ljava/lang/String;

    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 615
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v5}, Landroid/support/v4/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "Destroy mem cache: %1$s"

    .line 616
    new-array v6, v1, [Ljava/lang/Object;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v6, v4

    invoke-static {v5, v6}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private removeMemByName(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 0

    .line 622
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->buildCacheName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object p1

    .line 623
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeMemByName(Ljava/lang/String;)V

    return-void
.end method

.method private removeMemByName(Ljava/lang/String;)V
    .locals 5

    const-string v0, "REMOVE - Mem cache: %1$s"

    const/4 v1, 0x1

    .line 627
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 629
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->lightCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->snapshot()Ljava/util/Map;

    move-result-object v0

    .line 630
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 631
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 632
    iget-object v4, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->lightCache:Landroid/support/v4/util/LruCache;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v4, v2}, Landroid/support/v4/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "Destroy mem cache: %1$s"

    .line 633
    new-array v4, v1, [Ljava/lang/Object;

    aput-object p1, v4, v3

    invoke-static {v2, v4}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 637
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->heavyCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->snapshot()Ljava/util/Map;

    move-result-object v0

    .line 638
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 639
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 640
    iget-object v4, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->heavyCache:Landroid/support/v4/util/LruCache;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v4, v2}, Landroid/support/v4/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "Destroy mem cache: %1$s"

    .line 641
    new-array v4, v1, [Ljava/lang/Object;

    aput-object p1, v4, v3

    invoke-static {v2, v4}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method private removePrivate(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 2

    .line 986
    :try_start_0
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->isInvalidatesCacheFamily()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 987
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeDiskByFamily(Lcom/ibotta/api/CacheableApiCall;)V

    goto :goto_0

    .line 989
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeDiskByName(Lcom/ibotta/api/CacheableApiCall;)V

    .line 992
    :goto_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->checkCacheLimits(Lcom/ibotta/api/CacheableApiCall;)V

    .line 994
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeInvalidateables(Lcom/ibotta/api/CacheableApiCall;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 996
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->isInvalidatesCacheFamily()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 997
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeMemByFamily(Lcom/ibotta/api/CacheableApiCall;)V

    goto :goto_1

    .line 999
    :cond_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeMemByName(Lcom/ibotta/api/CacheableApiCall;)V

    :goto_1
    return-void

    :catchall_0
    move-exception v0

    .line 996
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->isInvalidatesCacheFamily()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 997
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeMemByFamily(Lcom/ibotta/api/CacheableApiCall;)V

    goto :goto_2

    .line 999
    :cond_2
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeMemByName(Lcom/ibotta/api/CacheableApiCall;)V

    :goto_2
    throw v0
.end method

.method private replace(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;Z)V
    .locals 1

    const/4 v0, 0x1

    .line 521
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/ibotta/android/appcache/AppCacheImpl;->putEverywhere(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;ZZ)V

    return-void
.end method

.method private writeCacheTime(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 2

    .line 931
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, p1, v0, v1}, Lcom/ibotta/android/appcache/AppCacheImpl;->writeCacheTime(Lcom/ibotta/api/CacheableApiCall;J)V

    return-void
.end method

.method private writeCacheTime(Lcom/ibotta/api/CacheableApiCall;J)V
    .locals 5

    .line 935
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheTimes:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 936
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheTimeName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Writing cache time: %1$s=%2$d"

    const/4 v2, 0x2

    .line 937
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 938
    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 939
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method


# virtual methods
.method public addListener(Lcom/ibotta/api/AppCacheListener;)V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public buildCacheName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;
    .locals 2

    .line 443
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheKey()Ljava/lang/String;

    move-result-object v0

    .line 444
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "/"

    const-string v1, "_"

    .line 445
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public extendExpiration(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .locals 4

    const-string v0, "extendExpiration: write lock wait"

    const/4 v1, 0x0

    .line 316
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    const-string v0, "extendExpiration: write lock acquired"

    .line 318
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getFamilyLock(Lcom/ibotta/api/CacheableApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    const-string v2, "extendExpiration: family lock wait"

    .line 321
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v2, "extendExpiration: family lock acquired"

    .line 323
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    const-string v2, "extendExpiration: pending disk writes lock wait"

    .line 326
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    sget-object v2, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWritesLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v2, "extendExpiration: pending disk writes lock acquired"

    .line 328
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 330
    :try_start_2
    iget-object v2, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWrites:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 331
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v2, :cond_0

    const/4 p1, 0x0

    .line 343
    :try_start_3
    sget-object v2, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWritesLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v2, "extendExpiration: pending disk writes lock released"

    .line 344
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 347
    :try_start_4
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "extendExpiration: family lock released"

    .line 348
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 351
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    const-string v0, "extendExpiration: write lock released"

    .line 352
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1

    .line 336
    :cond_0
    :try_start_5
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->writeCacheTime(Lcom/ibotta/api/CacheableApiCall;)V

    goto :goto_0

    :cond_1
    const-string v2, "A disk write is pending. Not extending expiration: %1$s"

    const/4 v3, 0x1

    .line 338
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v1

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    :goto_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->get(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 343
    :try_start_6
    sget-object v2, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWritesLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v2, "extendExpiration: pending disk writes lock released"

    .line 344
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 347
    :try_start_7
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "extendExpiration: family lock released"

    .line 348
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 351
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    const-string v0, "extendExpiration: write lock released"

    .line 352
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    .line 343
    :try_start_8
    sget-object v2, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWritesLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v2, "extendExpiration: pending disk writes lock released"

    .line 344
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catchall_1
    move-exception p1

    .line 347
    :try_start_9
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "extendExpiration: family lock released"

    .line 348
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception p1

    .line 351
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 352
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "extendExpiration: write lock released"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public getBatchLock()Ljava/util/concurrent/locks/Lock;
    .locals 1

    .line 117
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->batchLock:Ljava/util/concurrent/locks/Lock;

    return-object v0
.end method

.method public getCacheDir()Ljava/io/File;
    .locals 3

    .line 794
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->appCacheDir:Ljava/io/File;

    const-string v2, "api_cache"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;
    .locals 4

    .line 728
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cachePolicies:Lcom/ibotta/android/appcache/policy/CachePolicies;

    invoke-interface {v0, p1}, Lcom/ibotta/android/appcache/policy/CachePolicies;->getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v1, "No cache policy set for: %1$s"

    const/4 v2, 0x1

    .line 731
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method protected getCacheTime(Lcom/ibotta/api/CacheableApiCall;)J
    .locals 2

    .line 899
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheTimeName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheTime(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method protected getCacheTime(Ljava/lang/String;)J
    .locals 3

    .line 903
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheTimes:Landroid/content/SharedPreferences;

    const-wide/16 v1, -0x1

    invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getCacheTimeName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;
    .locals 1

    .line 923
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->buildCacheName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheTimeName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getCacheTimeName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "%1$s.%2$s"

    const/4 v1, 0x2

    .line 927
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getCacheTimes(Ljava/lang/String;)Ljava/util/TreeMap;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/TreeMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 907
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheTimes:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    .line 908
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 910
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 911
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 912
    iget-object v3, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheTimes:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-wide/16 v5, -0x1

    invoke-interface {v3, v4, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long v7, v3, v5

    if-lez v7, :cond_0

    .line 914
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public getDiskIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .locals 4

    const-string v0, "getDiskIfNotExpired: cache write lock wait"

    const/4 v1, 0x0

    .line 121
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    const-string v0, "getDiskIfNotExpired: cache write lock acquired"

    .line 123
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getFamilyLock(Lcom/ibotta/api/CacheableApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    const-string v2, "getDiskIfNotExpired: family lock wait"

    .line 127
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v2, "getDiskIfNotExpired: family lock acquired"

    .line 129
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 131
    :try_start_1
    invoke-direct {p0, p1, v1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getDisk(Lcom/ibotta/api/CacheableApiCall;Z)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 133
    invoke-direct {p0, p1, v2}, Lcom/ibotta/android/appcache/AppCacheImpl;->putMem(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)Lcom/ibotta/android/appcache/AppCacheImpl$Item;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    :cond_0
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string p1, "getDiskIfNotExpired: family lock released"

    .line 137
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    sget-object p1, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    const-string p1, "getDiskIfNotExpired: write cache lock released"

    .line 141
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :catchall_0
    move-exception p1

    .line 136
    :try_start_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "getDiskIfNotExpired: family lock released"

    .line 137
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 140
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 141
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "getDiskIfNotExpired: write cache lock released"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public getIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .locals 4

    const-string v0, "getIfNotExpired: read lock wait"

    const/4 v1, 0x0

    .line 149
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    const-string v0, "getIfNotExpired: read lock acquired"

    .line 151
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    :try_start_0
    invoke-direct {p0, p1, v1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getMem(Lcom/ibotta/api/CacheableApiCall;Z)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v0

    if-nez v0, :cond_1

    .line 156
    invoke-direct {p0, p1, v1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getDisk(Lcom/ibotta/api/CacheableApiCall;Z)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 161
    sget-object v2, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    const-string v2, "getIfNotExpired: cache read lock released"

    .line 162
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v2, "getIfNotExpired: cache write lock wait"

    .line 163
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    sget-object v2, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    const-string v2, "getIfNotExpired: cache write lock acquired"

    .line 165
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 167
    :try_start_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->isExpired(Lcom/ibotta/api/CacheableApiCall;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 168
    invoke-direct {p0, p1, v1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getMem(Lcom/ibotta/api/CacheableApiCall;Z)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v2

    if-nez v2, :cond_0

    .line 170
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/appcache/AppCacheImpl;->putMem(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)Lcom/ibotta/android/appcache/AppCacheImpl$Item;

    :cond_0
    const-string p1, "getIfNotExpired: cache read lock wait"

    .line 174
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    sget-object p1, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    const-string p1, "getIfNotExpired: cache read lock acquired"

    .line 176
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    :try_start_2
    sget-object p1, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    const-string p1, "getIfNotExpired: cache write lock released"

    .line 179
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 178
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    const-string v0, "getIfNotExpired: cache write lock released"

    .line 179
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 184
    :cond_1
    :goto_0
    sget-object p1, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    const-string p1, "getIfNotExpired: read lock released"

    .line 185
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :catchall_1
    move-exception p1

    .line 184
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 185
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "getIfNotExpired: read lock released"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public getLastModified(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;
    .locals 3

    const-string v0, "getLastModified: read lock wait"

    const/4 v1, 0x0

    .line 297
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    const-string v0, "getLastModified: read lock acquired"

    .line 299
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->get(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 303
    invoke-virtual {p1}, Lcom/ibotta/api/CacheableApiResponse;->getLastModified()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 306
    :goto_0
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    const-string v0, "getLastModified: read lock released"

    .line 307
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    .line 306
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 307
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "getLastModified: read lock released"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public getMemIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;
    .locals 3

    const-string v0, "getMemIfNotExpired: read lock wait"

    const/4 v1, 0x0

    .line 194
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    const-string v0, "getMemIfNotExpired: read lock acquired"

    .line 196
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    :try_start_0
    invoke-direct {p0, p1, v1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getMem(Lcom/ibotta/api/CacheableApiCall;Z)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 200
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    const-string v0, "getMemIfNotExpired: read lock released"

    .line 201
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    .line 200
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 201
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "getMemIfNotExpired: read lock released"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public getWorkDir()Ljava/io/File;
    .locals 3

    .line 799
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->appCacheDir:Ljava/io/File;

    const-string v2, "api_work"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public invalidate(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 4

    const-string v0, "invalidate: write lock wait"

    const/4 v1, 0x0

    .line 274
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    const-string v0, "invalidate: write lock acquired"

    .line 276
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getFamilyLock(Lcom/ibotta/api/CacheableApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    const-string v2, "invalidate: family lock wait"

    .line 279
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v2, "invalidate: family lock acquired"

    .line 281
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 283
    :try_start_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->invalidatePrivate(Lcom/ibotta/api/CacheableApiCall;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 285
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string p1, "invalidate: family lock released"

    .line 286
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 289
    sget-object p1, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    const-string p1, "invalidate: write lock released"

    .line 290
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    .line 285
    :try_start_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "invalidate: family lock released"

    .line 286
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 289
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 290
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "invalidate: write lock released"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public isExpiredOrHasNewer(Lcom/ibotta/api/CacheableApiCall;J)Z
    .locals 3

    const-string v0, "isExpiredOrHasNewer: read lock wait"

    const/4 v1, 0x0

    .line 423
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    const-string v0, "isExpiredOrHasNewer: read lock acquired"

    .line 425
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->isExpired(Lcom/ibotta/api/CacheableApiCall;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 432
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/appcache/AppCacheImpl;->hasNewer(Lcom/ibotta/api/CacheableApiCall;J)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 436
    :cond_0
    sget-object p1, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    const-string p1, "isExpiredOrHasNewer: read lock released"

    .line 437
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :catchall_0
    move-exception p1

    .line 436
    sget-object p2, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 437
    new-array p2, v1, [Ljava/lang/Object;

    const-string p3, "isExpiredOrHasNewer: read lock released"

    invoke-static {p3, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public onAppUpgraded(Lcom/ibotta/android/state/app/pojo/UpgradeInfo;)V
    .locals 0

    .line 884
    invoke-virtual {p0}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeAll()V

    return-void
.end method

.method public onLogOut(Z)V
    .locals 0

    .line 889
    invoke-virtual {p0}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeAll()V

    return-void
.end method

.method public put(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 4

    const-string v0, "put: write lock wait"

    const/4 v1, 0x0

    .line 208
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    const-string v0, "put: write lock acquired"

    .line 210
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getFamilyLock(Lcom/ibotta/api/CacheableApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    const-string v2, "put: family lock wait"

    .line 213
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v2, "put: family lock acquired"

    .line 215
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 217
    :try_start_1
    invoke-direct {p0, p1, p2, v1}, Lcom/ibotta/android/appcache/AppCacheImpl;->putEverywhere(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string p1, "put: family lock released"

    .line 220
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 223
    sget-object p1, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    const-string p1, "put: write lock released"

    .line 224
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    .line 219
    :try_start_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string p2, "put: family lock released"

    .line 220
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 223
    sget-object p2, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 224
    new-array p2, v1, [Ljava/lang/Object;

    const-string v0, "put: write lock released"

    invoke-static {v0, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public remove(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 4

    const-string v0, "remove: write lock wait"

    const/4 v1, 0x0

    .line 252
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    const-string v0, "remove: write lock acquired"

    .line 254
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getFamilyLock(Lcom/ibotta/api/CacheableApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    const-string v2, "remove: family lock wait"

    .line 257
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v2, "remove: family lock acquired"

    .line 259
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 261
    :try_start_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->removePrivate(Lcom/ibotta/api/CacheableApiCall;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 263
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string p1, "remove: family lock released"

    .line 264
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 267
    sget-object p1, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    const-string p1, "remove: write lock released"

    .line 268
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    .line 263
    :try_start_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "remove: family lock released"

    .line 264
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 267
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 268
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "remove: write lock released"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public removeAll()V
    .locals 4

    const-string v0, "removeAll: write lock wait"

    const/4 v1, 0x0

    .line 360
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    const-string v0, "removeAll: write lock acquired"

    .line 362
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    const-string v0, "removeAll: disk lock wait"

    .line 364
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->diskLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v0, "removeAll: disk lock acquired"

    .line 366
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    const-string v0, "removeAll: pending disk writes lock wait"

    .line 369
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWritesLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v0, "removeAll: pending disk writes lock acquired"

    .line 371
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 373
    :try_start_2
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->diskWriteService:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->diskWriteService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 374
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->diskWriteService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    const/4 v0, 0x0

    .line 375
    iput-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->diskWriteService:Ljava/util/concurrent/ExecutorService;

    .line 377
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWrites:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 379
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheTimes:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 380
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 381
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 384
    :try_start_3
    invoke-virtual {p0}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/io/FileUtils;->deleteDirectory(Ljava/io/File;)V

    .line 385
    invoke-virtual {p0}, Lcom/ibotta/android/appcache/AppCacheImpl;->getWorkDir()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/io/FileUtils;->deleteDirectory(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 390
    :goto_0
    :try_start_4
    invoke-virtual {p0}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeMemAll()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_5
    const-string v2, "Failed to destroy cache directory."

    .line 387
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    sget-object v2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v2, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    .line 393
    :goto_1
    :try_start_6
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWritesLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "removeAll: pending disk writes lock released"

    .line 394
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 397
    :try_start_7
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->diskLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "removeAll: disk lock released"

    .line 398
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 401
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    const-string v0, "removeAll: write lock released"

    .line 402
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 390
    :goto_2
    :try_start_8
    invoke-virtual {p0}, Lcom/ibotta/android/appcache/AppCacheImpl;->removeMemAll()V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catchall_1
    move-exception v0

    .line 393
    :try_start_9
    sget-object v2, Lcom/ibotta/android/appcache/AppCacheImpl;->pendingDiskWritesLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v2, "removeAll: pending disk writes lock released"

    .line 394
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception v0

    .line 397
    :try_start_a
    sget-object v2, Lcom/ibotta/android/appcache/AppCacheImpl;->diskLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v2, "removeAll: disk lock released"

    .line 398
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :catchall_3
    move-exception v0

    .line 401
    sget-object v2, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 402
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeAll: write lock released"

    invoke-static {v2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
.end method

.method public removeListener(Lcom/ibotta/api/AppCacheListener;)V
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeMemAll()V
    .locals 3

    const-string v0, "removeMemAll: write lock wait"

    const/4 v1, 0x0

    .line 408
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    const-string v0, "removeMemAll: write lock acquired"

    .line 410
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->lightCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->evictAll()V

    .line 413
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl;->heavyCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->evictAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 415
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    const-string v0, "removeMemAll: write lock released"

    .line 416
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    .line 415
    sget-object v2, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 416
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeMemAll: write lock released"

    invoke-static {v2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
.end method

.method public removeOrInvalidate(Lcom/ibotta/api/CacheableApiCall;Z)V
    .locals 1

    .line 842
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 844
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getFamilyLock(Lcom/ibotta/api/CacheableApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    .line 845
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p2, :cond_0

    .line 848
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->remove(Lcom/ibotta/api/CacheableApiCall;)V

    goto :goto_0

    .line 850
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->invalidate(Lcom/ibotta/api/CacheableApiCall;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 853
    :goto_0
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 856
    sget-object p1, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    .line 853
    :try_start_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 856
    sget-object p2, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    throw p1
.end method

.method public replace(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 4

    const-string v0, "replace: write lock wait"

    const/4 v1, 0x0

    .line 230
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    sget-object v0, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    const-string v0, "replace: write lock acquired"

    .line 232
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/appcache/AppCacheImpl;->getFamilyLock(Lcom/ibotta/api/CacheableApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    const-string v2, "replace: family lock wait"

    .line 235
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v2, "replace: family lock acquired"

    .line 237
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x1

    .line 239
    :try_start_1
    invoke-direct {p0, p1, p2, v2}, Lcom/ibotta/android/appcache/AppCacheImpl;->replace(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 241
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string p1, "replace: family lock released"

    .line 242
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 245
    sget-object p1, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    const-string p1, "replace: write lock released"

    .line 246
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    .line 241
    :try_start_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string p2, "replace: family lock released"

    .line 242
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 245
    sget-object p2, Lcom/ibotta/android/appcache/AppCacheImpl;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 246
    new-array p2, v1, [Ljava/lang/Object;

    const-string v0, "replace: write lock released"

    invoke-static {v0, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public replaceOfferProductsUpcs(ILjava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 809
    new-instance v0, Lcom/ibotta/android/api/offer/FilteredOfferProductsCall;

    invoke-direct {v0}, Lcom/ibotta/android/api/offer/FilteredOfferProductsCall;-><init>()V

    .line 811
    invoke-virtual {p0, v0}, Lcom/ibotta/android/appcache/AppCacheImpl;->getIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/offer/OfferProductsResponse;

    if-nez v1, :cond_0

    return-void

    .line 816
    :cond_0
    invoke-virtual {v1}, Lcom/ibotta/api/call/offer/OfferProductsResponse;->getOfferProducts()Ljava/util/Map;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/offer/OfferProducts;

    if-nez p1, :cond_1

    return-void

    .line 821
    :cond_1
    invoke-virtual {p1, p2}, Lcom/ibotta/api/model/offer/OfferProducts;->setProducts(Ljava/util/Set;)V

    .line 822
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/appcache/AppCacheImpl;->put(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)V

    return-void
.end method

.method public updateBgcTransactionById(ILcom/ibotta/api/call/pwi/BgcTransactionResponse;)V
    .locals 2

    .line 837
    new-instance v0, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;

    invoke-virtual {p2}, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;->getBgcTransaction()Lcom/ibotta/api/model/pwi/BgcTransaction;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUuid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/appcache/AppCacheImpl;->replace(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)V

    return-void
.end method

.method public updateCustomer(ILcom/ibotta/api/call/customer/CustomerByIdResponse;)V
    .locals 1

    .line 804
    new-instance v0, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    invoke-direct {v0, p1}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/appcache/AppCacheImpl;->replace(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)V

    return-void
.end method

.method public updateCustomerPaymentAccounts(ILcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;Z)V
    .locals 1

    .line 832
    new-instance v0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;

    invoke-direct {v0, p1, p3}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;-><init>(IZ)V

    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/appcache/AppCacheImpl;->replace(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)V

    return-void
.end method

.method public updateCustomerSettings(ILcom/ibotta/api/call/customer/CustomerSettingsPutResponse;)V
    .locals 1

    .line 827
    new-instance v0, Lcom/ibotta/api/call/customer/CustomerSettingsCall;

    invoke-direct {v0, p1}, Lcom/ibotta/api/call/customer/CustomerSettingsCall;-><init>(I)V

    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/appcache/AppCacheImpl;->replace(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)V

    return-void
.end method
