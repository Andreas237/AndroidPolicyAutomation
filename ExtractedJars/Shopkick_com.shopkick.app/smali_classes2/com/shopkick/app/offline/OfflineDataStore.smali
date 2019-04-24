.class public Lcom/shopkick/app/offline/OfflineDataStore;
.super Ljava/lang/Object;
.source "OfflineDataStore.java"

# interfaces
.implements Lcom/shopkick/app/offline/IRetryHandlerCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;,
        Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;,
        Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;,
        Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final NUM_THREADS_FOR_DISK_OPS:I = 0x3

.field public static final OFFLINE_DIRECTORY_NAME:Ljava/lang/String; = "OfflineDataStore"


# instance fields
.field private final apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private final cache:Landroid/support/v4/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LruCache<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final cacheDirPath:Ljava/lang/String;

.field private final clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private final dataCategoriesToLastSyncTime:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final dataCategoriesToSyncCallbacks:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final dataFetchHandlersByDataRequest:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;",
            "Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;",
            ">;"
        }
    .end annotation
.end field

.field private final forceSyncronousFileAccess:Z

.field private final imageUrlFieldsByInfoFields:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final lockByEntityDirPath:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final rootDirPath:Ljava/lang/String;

.field private final skLogger:Lcom/shopkick/app/application/SKLogger;

.field private final supportedDataCategories:[I

.field private final threadpool:Ljava/util/concurrent/ExecutorService;

.field private final versionsFetchHandlersByVersionRequest:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;",
            "Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;",
            ">;"
        }
    .end annotation
.end field

.field private final versionsRequestsByDataCategories:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;",
            ">;"
        }
    .end annotation
.end field

.field private final writeToDiskTasks:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/ClientFlagsManager;Ljava/util/HashMap;Lcom/shopkick/app/application/SKLogger;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/shopkick/fetchers/api/APIManager;",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;",
            "Lcom/shopkick/app/application/SKLogger;",
            ")V"
        }
    .end annotation

    .line 84
    new-instance v6, Landroid/support/v4/util/LruCache;

    if-eqz p3, :cond_0

    iget-object v0, p3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz v0, :cond_0

    iget-object v0, p3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreMemoryCacheSize:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreMemoryCacheSize:Ljava/lang/Integer;

    .line 92
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/16 v0, 0xa

    :goto_0
    invoke-direct {v6, v0}, Landroid/support/v4/util/LruCache;-><init>(I)V

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 84
    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/offline/OfflineDataStore;-><init>(Landroid/content/Context;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/ClientFlagsManager;Ljava/util/HashMap;Lcom/shopkick/app/application/SKLogger;Landroid/support/v4/util/LruCache;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/ClientFlagsManager;Ljava/util/HashMap;Lcom/shopkick/app/application/SKLogger;Landroid/support/v4/util/LruCache;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/shopkick/fetchers/api/APIManager;",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;",
            "Lcom/shopkick/app/application/SKLogger;",
            "Landroid/support/v4/util/LruCache<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
            ">;Z)V"
        }
    .end annotation

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 105
    iput-object p3, p0, Lcom/shopkick/app/offline/OfflineDataStore;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 106
    iput-object p4, p0, Lcom/shopkick/app/offline/OfflineDataStore;->imageUrlFieldsByInfoFields:Ljava/util/HashMap;

    .line 107
    iput-object p5, p0, Lcom/shopkick/app/offline/OfflineDataStore;->skLogger:Lcom/shopkick/app/application/SKLogger;

    .line 108
    iput-object p6, p0, Lcom/shopkick/app/offline/OfflineDataStore;->cache:Landroid/support/v4/util/LruCache;

    .line 109
    iput-boolean p7, p0, Lcom/shopkick/app/offline/OfflineDataStore;->forceSyncronousFileAccess:Z

    const/4 p2, 0x3

    .line 110
    invoke-static {p2}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->threadpool:Ljava/util/concurrent/ExecutorService;

    .line 111
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->versionsRequestsByDataCategories:Ljava/util/HashMap;

    .line 112
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->versionsFetchHandlersByVersionRequest:Ljava/util/HashMap;

    .line 113
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataFetchHandlersByDataRequest:Ljava/util/HashMap;

    .line 114
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->writeToDiskTasks:Ljava/util/ArrayList;

    .line 115
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToSyncCallbacks:Ljava/util/HashMap;

    .line 116
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToLastSyncTime:Ljava/util/HashMap;

    .line 117
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->lockByEntityDirPath:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 p2, 0x5

    .line 119
    new-array p2, p2, [I

    fill-array-data p2, :array_0

    iput-object p2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->supportedDataCategories:[I

    .line 123
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object p3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "OfflineDataStore"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->rootDirPath:Ljava/lang/String;

    .line 124
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->cacheDirPath:Ljava/lang/String;

    .line 125
    invoke-direct {p0}, Lcom/shopkick/app/offline/OfflineDataStore;->setupDirsOnDisk()V

    return-void

    nop

    :array_0
    .array-data 4
        0x2
        0x3
        0x4
        0x5
        0x6
    .end array-data
.end method

.method static synthetic access$100(Lcom/shopkick/app/offline/OfflineDataStore;Ljava/lang/String;I)Ljava/lang/String;
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntityDirPath(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/offline/OfflineDataStore;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->readEntityFromDisk(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/offline/OfflineDataStore;)Landroid/support/v4/util/LruCache;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->cache:Landroid/support/v4/util/LruCache;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)Z
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->writeEntityToDisk(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/offline/OfflineDataStore;->didWriteEntityToDisk(Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/offline/OfflineDataStore;->didFailWriteToDisk(Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    return-void
.end method

.method static synthetic access$700(Lcom/shopkick/app/offline/OfflineDataStore;Ljava/lang/String;)Z
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->deleteEntityFromDisk(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private categoryHasResyncLimit(Ljava/lang/Integer;)Z
    .locals 2

    .line 385
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 386
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method private clearCategoryFromDisk(I)Z
    .locals 7

    .line 582
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->rootDirPath:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 583
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 587
    :cond_0
    array-length v2, v0

    const/4 v3, 0x1

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v4, v0, v1

    .line 588
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lcom/shopkick/app/offline/OfflineDataStore;->rootDirPath:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 589
    invoke-direct {p0, v4}, Lcom/shopkick/app/offline/OfflineDataStore;->deleteEntityFromDisk(Ljava/lang/String;)Z

    move-result v4

    and-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v3
.end method

.method private deleteEntityFromDisk(Ljava/lang/String;)Z
    .locals 6

    .line 749
    invoke-direct {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->getOrCreateLock(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 751
    monitor-enter v0

    .line 752
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 753
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    .line 755
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 757
    array-length v2, p1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, p1, v4

    .line 758
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v5

    if-nez v5, :cond_1

    monitor-exit v0

    return v3

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 762
    :cond_2
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 763
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private didFailWriteToDisk(Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->writeToDiskTasks:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 222
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->dataCategory:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/offline/OfflineDataStore;->notifySyncFinished(IZ)V

    return-void
.end method

.method private didWriteEntityToDisk(Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->writeToDiskTasks:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 217
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->dataCategory:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/offline/OfflineDataStore;->notifySyncFinished(IZ)V

    return-void
.end method

.method private entityExistsOnDisk(Ljava/lang/String;)Z
    .locals 2

    .line 598
    invoke-direct {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->getOrCreateLock(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 600
    monitor-enter v0

    .line 601
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 602
    invoke-virtual {v1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 603
    array-length p1, p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 604
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private getCategoriesAndKeysOnDisk()Ljava/util/HashMap;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 546
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 547
    iget-object v1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->supportedDataCategories:[I

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_6

    aget v5, v1, v4

    .line 548
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 549
    new-instance v7, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, p0, Lcom/shopkick/app/offline/OfflineDataStore;->rootDirPath:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v9, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 550
    invoke-virtual {v7}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_0

    goto :goto_4

    .line 553
    :cond_0
    array-length v8, v7

    move v9, v3

    :goto_1
    if-ge v9, v8, :cond_4

    aget-object v10, v7, v9

    .line 554
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, p0, Lcom/shopkick/app/offline/OfflineDataStore;->rootDirPath:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v12, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget-object v12, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 555
    invoke-direct {p0, v10}, Lcom/shopkick/app/offline/OfflineDataStore;->getOrCreateLock(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    .line 557
    monitor-enter v11

    .line 558
    :try_start_0
    new-instance v12, Ljava/io/File;

    invoke-direct {v12, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 559
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    move-result v10

    if-nez v10, :cond_1

    monitor-exit v11

    goto :goto_3

    .line 561
    :cond_1
    invoke-virtual {v12}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_3

    .line 562
    array-length v13, v10

    const/4 v14, 0x1

    if-ge v13, v14, :cond_2

    goto :goto_2

    .line 568
    :cond_2
    aget-object v10, v10, v3

    .line 569
    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 570
    monitor-exit v11

    goto :goto_3

    .line 563
    :cond_3
    :goto_2
    monitor-exit v11

    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 570
    monitor-exit v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 572
    :cond_4
    invoke-virtual {v6}, Ljava/util/HashMap;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_6
    return-object v0
.end method

.method private getEntityDirPath(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 767
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->rootDirPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getOrCreateLock(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 618
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->lockByEntityDirPath:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 620
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 621
    iget-object v1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->lockByEntityDirPath:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :cond_1
    :goto_0
    return-object v0
.end method

.method private imageUrlsForEntity(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)Ljava/util/HashSet;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
            ")",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 226
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 227
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->toJsonTree()Lcom/google/gson/JsonObject;

    move-result-object p1

    .line 228
    iget-object v1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->imageUrlFieldsByInfoFields:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 229
    invoke-virtual {p1, v2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v3

    .line 230
    instance-of v4, v3, Lcom/google/gson/JsonObject;

    if-eqz v4, :cond_0

    .line 231
    iget-object v4, p0, Lcom/shopkick/app/offline/OfflineDataStore;->imageUrlFieldsByInfoFields:Ljava/util/HashMap;

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    .line 232
    array-length v4, v2

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v2, v5

    .line 233
    move-object v7, v3

    check-cast v7, Lcom/google/gson/JsonObject;

    invoke-static {v7, v6}, Lcom/shopkick/app/util/GsonUtils;->getAsString(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 235
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private logFailure(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 2

    .line 519
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x61a80

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 520
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineDataStoreFailureReason(Ljava/lang/Integer;)V

    .line 521
    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineDataEntityVersion(Ljava/lang/String;)V

    .line 522
    invoke-virtual {v0, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineDataEntityKey(Ljava/lang/String;)V

    .line 523
    invoke-virtual {v0, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineDataCategory(Ljava/lang/Integer;)V

    .line 524
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logSyncFinishedForDataCategory(Ljava/lang/Integer;)V
    .locals 2

    .line 513
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x61a83

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 514
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineDataCategory(Ljava/lang/Integer;)V

    .line 515
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logSyncStartedForDataCategory(Ljava/lang/Integer;Landroid/location/Location;Ljava/lang/Integer;)V
    .locals 3

    .line 501
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x61a82

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 502
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineDataCategory(Ljava/lang/Integer;)V

    .line 503
    invoke-virtual {v0, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineDataStoreSyncTrigger(Ljava/lang/Integer;)V

    .line 504
    iget-object p3, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToLastSyncTime:Ljava/util/HashMap;

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineDataStoreLastSyncTs(Ljava/lang/Long;)V

    if-eqz p2, :cond_0

    .line 506
    invoke-virtual {p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 507
    invoke-virtual {p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 509
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private maybeRecordLatestSync(Ljava/lang/Integer;)V
    .locals 3

    .line 379
    invoke-direct {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->categoryHasResyncLimit(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 380
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToLastSyncTime:Ljava/util/HashMap;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private notifySyncFailed(I)V
    .locals 2

    .line 485
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToSyncCallbacks:Ljava/util/HashMap;

    .line 486
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 485
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 488
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 489
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;

    if-eqz v1, :cond_0

    .line 491
    invoke-interface {v1, p1}, Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;->onSyncFailed(I)V

    goto :goto_0

    .line 494
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToSyncCallbacks:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method private notifySyncFinished(IZ)V
    .locals 3

    .line 449
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->versionsRequestsByDataCategories:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 450
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 456
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataFetchHandlersByDataRequest:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;

    .line 457
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;->dataCategory:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_2

    return-void

    .line 463
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->writeToDiskTasks:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;

    .line 464
    invoke-static {v1}, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->access$000(Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->dataCategory:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_4

    return-void

    .line 470
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToSyncCallbacks:Ljava/util/HashMap;

    .line 471
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 470
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_8

    .line 473
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 474
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;

    if-eqz v1, :cond_6

    .line 476
    invoke-interface {v1, p1, p2}, Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;->onSyncFinished(IZ)V

    goto :goto_0

    .line 479
    :cond_7
    iget-object p2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToSyncCallbacks:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    :cond_8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->logSyncFinishedForDataCategory(Ljava/lang/Integer;)V

    return-void
.end method

.method private readEntityFromDisk(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;
    .locals 8

    .line 632
    invoke-direct {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->getOrCreateLock(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 635
    monitor-enter v0

    .line 636
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 637
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    monitor-exit v0

    return-object v2

    .line 639
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 640
    array-length v3, p1

    const/4 v4, 0x1

    if-ge v3, v4, :cond_1

    goto/16 :goto_5

    :cond_1
    const/4 v3, 0x0

    .line 648
    aget-object v4, p1, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 652
    :try_start_1
    new-instance v5, Ljava/io/DataInputStream;

    new-instance v6, Ljava/io/FileInputStream;

    invoke-direct {v6, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v5, v6}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 653
    :try_start_2
    invoke-virtual {v5}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 657
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_2

    .line 658
    invoke-static {v4, v3}, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v4
    :try_end_2
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :cond_2
    move-object v4, v2

    .line 668
    :goto_0
    :try_start_3
    invoke-virtual {v5}, Ljava/io/DataInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object v2, v4

    goto :goto_3

    :catchall_0
    move-exception v4

    move-object v5, v2

    goto :goto_2

    :catch_0
    move-object v5, v2

    .line 665
    :catch_1
    :try_start_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v6, "Read error: File not found"

    invoke-static {v4, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v5, :cond_4

    .line 668
    :goto_1
    :try_start_5
    invoke-virtual {v5}, Ljava/io/DataInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catch_2
    move-object v5, v2

    .line 661
    :catch_3
    :try_start_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Read error: Corrupted JSON in OfflineDataStore key="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 661
    invoke-static {v4, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v5, :cond_4

    goto :goto_1

    :catchall_1
    move-exception v4

    :goto_2
    if-eqz v5, :cond_3

    .line 668
    :try_start_7
    invoke-virtual {v5}, Ljava/io/DataInputStream;->close()V

    :cond_3
    throw v4
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catch_4
    move-exception v4

    .line 671
    :try_start_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_3
    if-nez v2, :cond_6

    .line 677
    array-length v4, p1

    :goto_4
    if-ge v3, v4, :cond_5

    aget-object v5, p1, v3

    .line 678
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 680
    :cond_5
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 682
    :cond_6
    monitor-exit v0

    return-object v2

    .line 642
    :cond_7
    :goto_5
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 643
    monitor-exit v0

    return-object v2

    :catchall_2
    move-exception p1

    .line 682
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw p1
.end method

.method private setupDirsOnDisk()V
    .locals 7

    .line 534
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->rootDirPath:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 535
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 536
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->supportedDataCategories:[I

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget v3, v0, v2

    .line 537
    new-instance v4, Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lcom/shopkick/app/offline/OfflineDataStore;->rootDirPath:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 538
    invoke-virtual {v4}, Ljava/io/File;->mkdir()Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private shouldSync(Ljava/lang/Integer;)Z
    .locals 8

    .line 368
    invoke-direct {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->categoryHasResyncLimit(Ljava/lang/Integer;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 369
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToLastSyncTime:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-nez p1, :cond_0

    return v1

    .line 371
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    .line 372
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-double v2, v2

    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreMinSecondsBetweenResyncs:Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    mul-double/2addr v4, v6

    cmpl-double p1, v2, v4

    if-ltz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_2
    return v1
.end method

.method private syncResponseDetails(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsResponseDetails;",
            ">;)V"
        }
    .end annotation

    .line 390
    invoke-direct {p0}, Lcom/shopkick/app/offline/OfflineDataStore;->getCategoriesAndKeysOnDisk()Ljava/util/HashMap;

    move-result-object v0

    .line 392
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsResponseDetails;

    .line 393
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsResponseDetails;->dataCategory:Ljava/lang/Integer;

    .line 394
    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v3

    .line 396
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 398
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_4

    .line 399
    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/HashMap;

    .line 401
    iget-object v5, v1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsResponseDetails;->entityVersionsByKey:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 402
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 404
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 405
    :cond_0
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    iget-object v9, v1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsResponseDetails;->entityVersionsByKey:Ljava/util/Map;

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    .line 407
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 414
    :cond_1
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 420
    :cond_2
    new-instance v5, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;

    .line 421
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-direct {v5, p0, p0, v3, v2}, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;-><init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/OfflineDataStore;Ljava/util/Set;Ljava/lang/Integer;)V

    .line 423
    iget-boolean v2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->forceSyncronousFileAccess:Z

    if-eqz v2, :cond_3

    .line 424
    new-array v2, v6, [Ljava/lang/Void;

    invoke-virtual {v5, v2}, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    const/4 v2, 0x0

    .line 425
    invoke-virtual {v5, v2}, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->onPostExecute(Ljava/lang/Void;)V

    goto :goto_2

    .line 427
    :cond_3
    iget-object v2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->threadpool:Ljava/util/concurrent/ExecutorService;

    new-array v3, v6, [Ljava/lang/Void;

    invoke-virtual {v5, v2, v3}, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_2

    .line 431
    :cond_4
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsResponseDetails;->entityVersionsByKey:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 433
    :goto_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    .line 434
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;-><init>()V

    .line 435
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsResponseDetails;->dataCategory:Ljava/lang/Integer;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;->dataCategory:Ljava/lang/Integer;

    .line 436
    iput-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;->entityKeysToFetch:Ljava/util/List;

    .line 437
    new-instance v1, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;

    iget-object v3, p0, Lcom/shopkick/app/offline/OfflineDataStore;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-direct {v1, v3, v2, p0}, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/offline/IRetryHandlerCallback;)V

    .line 438
    iget-object v3, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataFetchHandlersByDataRequest:Ljava/util/HashMap;

    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    iget-object v2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreRetryLimit:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/shopkick/app/offline/OfflineDataStore;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, v3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineRetryIntervalSeconds:Ljava/lang/Integer;

    .line 440
    invoke-virtual {v3}, Ljava/lang/Integer;->longValue()J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    .line 439
    invoke-virtual {v1, v2, v3, v4}, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->fetchWithRetryLimitAndInterval(IJ)V

    goto/16 :goto_0

    .line 443
    :cond_5
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsResponseDetails;->dataCategory:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v1, v6}, Lcom/shopkick/app/offline/OfflineDataStore;->notifySyncFinished(IZ)V

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method private writeEntityToDisk(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)Z
    .locals 10

    .line 691
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityKey:Ljava/lang/String;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->dataCategory:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntityDirPath(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .line 692
    invoke-direct {p0, v0}, Lcom/shopkick/app/offline/OfflineDataStore;->getOrCreateLock(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 703
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "sk_ods_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityVersion:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/io/File;

    iget-object v6, p0, Lcom/shopkick/app/offline/OfflineDataStore;->cacheDirPath:Ljava/lang/String;

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v3, v5}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 707
    :try_start_1
    new-instance v5, Ljava/io/DataOutputStream;

    new-instance v6, Ljava/io/FileOutputStream;

    invoke-direct {v6, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v5, v6}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 708
    :try_start_2
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 709
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->flush()V

    .line 711
    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 712
    :try_start_3
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 713
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->mkdir()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 715
    :cond_0
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 717
    array-length v7, v6

    move v8, v2

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 718
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 722
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityVersion:Ljava/lang/String;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 723
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 726
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 729
    :cond_2
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 731
    :try_start_4
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-eqz v4, :cond_4

    .line 737
    :goto_1
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    goto :goto_3

    :catchall_0
    move-exception p1

    .line 729
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception p1

    move-object v3, v5

    goto :goto_2

    :catchall_2
    move-exception p1

    goto :goto_2

    :catchall_3
    move-exception p1

    move-object v4, v3

    :goto_2
    if-eqz v3, :cond_3

    .line 731
    :try_start_7
    invoke-virtual {v3}, Ljava/io/DataOutputStream;->close()V

    :cond_3
    throw p1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :catchall_4
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    .line 734
    :try_start_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    :goto_3
    return v2

    :goto_4
    if-eqz v4, :cond_5

    .line 737
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    :cond_5
    throw p1
.end method


# virtual methods
.method public clear()V
    .locals 4

    .line 296
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToSyncCallbacks:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 297
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToLastSyncTime:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 298
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->cache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->evictAll()V

    .line 299
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->supportedDataCategories:[I

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget v3, v0, v2

    .line 300
    invoke-direct {p0, v3}, Lcom/shopkick/app/offline/OfflineDataStore;->clearCategoryFromDisk(I)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public clearCategory(I)V
    .locals 2

    .line 305
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToSyncCallbacks:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToLastSyncTime:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->cache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->evictAll()V

    .line 308
    invoke-direct {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->clearCategoryFromDisk(I)Z

    .line 309
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x61a81

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 310
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineDataCategory(Ljava/lang/Integer;)V

    .line 311
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method public didFailReadFromDisk(Ljava/lang/String;I)V
    .locals 2

    const/4 v0, 0x1

    .line 160
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/shopkick/app/offline/OfflineDataStore;->logFailure(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public getEntitiesForOfflineDataCategory(ILcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;)V
    .locals 1

    .line 166
    new-instance v0, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;

    invoke-direct {v0, p0, p0, p2, p1}, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;-><init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;I)V

    .line 167
    iget-boolean p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->forceSyncronousFileAccess:Z

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 168
    new-array p1, p2, [Ljava/lang/Void;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->doInBackground([Ljava/lang/Void;)Ljava/util/ArrayList;

    move-result-object p1

    .line 169
    invoke-virtual {v0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->onPostExecute(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 171
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->threadpool:Ljava/util/concurrent/ExecutorService;

    new-array p2, p2, [Ljava/lang/Void;

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method public getEntityForOfflineDataCategory(Ljava/lang/String;ILcom/shopkick/app/offline/IReadOfflineDataEntityFromDiskCallback;)V
    .locals 7

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->cache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    if-eqz v0, :cond_0

    .line 146
    invoke-interface {p3, v0}, Lcom/shopkick/app/offline/IReadOfflineDataEntityFromDiskCallback;->onOfflineDataEntityReadFromDisk(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    return-void

    .line 150
    :cond_0
    new-instance v0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p0

    move-object v4, p3

    move-object v5, p1

    move v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;-><init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/IReadOfflineDataEntityFromDiskCallback;Ljava/lang/String;I)V

    .line 151
    iget-boolean p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->forceSyncronousFileAccess:Z

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    .line 152
    new-array p1, p2, [Ljava/lang/Void;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->doInBackground([Ljava/lang/Void;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object p1

    .line 153
    invoke-virtual {v0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->onPostExecute(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    goto :goto_0

    .line 155
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->threadpool:Ljava/util/concurrent/ExecutorService;

    new-array p2, p2, [Ljava/lang/Void;

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method public getEntityKeyForId(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreKeyPrefixesByCategory:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreKeyPrefixesByCategory:Ljava/util/Map;

    .line 133
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    .line 132
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 135
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, p3

    :goto_1
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getEntityKeysForDataCategory(I)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 178
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->rootDirPath:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 179
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 181
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 182
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    .line 183
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getOfflineDataVersionsRequest(Ljava/util/ArrayList;)Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;"
        }
    .end annotation

    .line 948
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->versionsRequestsByDataCategories:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;

    return-object p1
.end method

.method public onReceivedResponseSuccess(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 316
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;

    if-eqz v0, :cond_0

    .line 317
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;

    .line 318
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;->dataCategories:Ljava/util/List;

    .line 319
    iget-object v1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->versionsRequestsByDataCategories:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    iget-object v1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->versionsFetchHandlersByVersionRequest:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsResponse;

    .line 322
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsResponse;->responseDetails:Ljava/util/List;

    invoke-direct {p0, p2}, Lcom/shopkick/app/offline/OfflineDataStore;->syncResponseDetails(Ljava/util/List;)V

    .line 323
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsResponse;->responseDetails:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_2

    .line 324
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    const/4 v0, 0x4

    .line 325
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, v1, p2}, Lcom/shopkick/app/offline/OfflineDataStore;->logFailure(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_0

    .line 328
    :cond_0
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;

    if-eqz v0, :cond_2

    .line 329
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataFetchHandlersByDataRequest:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataResponse;

    .line 333
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataResponse;->entities:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    .line 334
    invoke-virtual {p0, v1}, Lcom/shopkick/app/offline/OfflineDataStore;->setEntity(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    goto :goto_1

    .line 336
    :cond_1
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataResponse;->entities:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 337
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;->dataCategory:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/offline/OfflineDataStore;->notifySyncFinished(IZ)V

    :cond_2
    return-void
.end method

.method public onRetriesFailed(Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 3

    .line 343
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    .line 344
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;->dataCategory:Ljava/lang/Integer;

    invoke-direct {p0, v0, v1, v1, v2}, Lcom/shopkick/app/offline/OfflineDataStore;->logFailure(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 348
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataRequest;->dataCategory:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->notifySyncFailed(I)V

    goto :goto_1

    .line 350
    :cond_0
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;

    if-eqz v0, :cond_1

    .line 351
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;

    .line 352
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;->dataCategories:Ljava/util/List;

    .line 353
    iget-object v2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->versionsRequestsByDataCategories:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    iget-object v2, p0, Lcom/shopkick/app/offline/OfflineDataStore;->versionsFetchHandlersByVersionRequest:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const/4 v2, 0x4

    .line 356
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0, v2, v1, v1, v0}, Lcom/shopkick/app/offline/OfflineDataStore;->logFailure(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 357
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/offline/OfflineDataStore;->notifySyncFailed(I)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public receivedResponse(Ljava/lang/String;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public setEntity(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V
    .locals 2

    .line 199
    invoke-direct {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->imageUrlsForEntity(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)Ljava/util/HashSet;

    .line 201
    new-instance v0, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;

    invoke-direct {v0, p0, p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;-><init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    .line 202
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->writeToDiskTasks:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    iget-boolean p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->forceSyncronousFileAccess:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 207
    new-array p1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 208
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->onPostExecute(Ljava/lang/Boolean;)V

    goto :goto_0

    .line 210
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->threadpool:Ljava/util/concurrent/ExecutorService;

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, p1, v1}, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method public syncOfflineDataCategories(Ljava/util/List;Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;Ljava/lang/Integer;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 248
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 249
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 250
    invoke-direct {p0, v1}, Lcom/shopkick/app/offline/OfflineDataStore;->shouldSync(Ljava/lang/Integer;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 253
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 256
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->versionsRequestsByDataCategories:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    return-void

    .line 257
    :cond_2
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;-><init>()V

    .line 258
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 260
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;->lat:Ljava/lang/Double;

    .line 261
    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;->lng:Ljava/lang/Double;

    .line 264
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 266
    iget-object v4, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToSyncCallbacks:Ljava/util/HashMap;

    .line 267
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-nez v4, :cond_4

    .line 268
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 269
    :cond_4
    new-instance v5, Ljava/lang/ref/WeakReference;

    invoke-direct {v5, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    iget-object v5, p0, Lcom/shopkick/app/offline/OfflineDataStore;->dataCategoriesToSyncCallbacks:Ljava/util/HashMap;

    invoke-virtual {v5, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    invoke-direct {p0, v3, v1, p3}, Lcom/shopkick/app/offline/OfflineDataStore;->logSyncStartedForDataCategory(Ljava/lang/Integer;Landroid/location/Location;Ljava/lang/Integer;)V

    .line 273
    invoke-direct {p0, v3}, Lcom/shopkick/app/offline/OfflineDataStore;->maybeRecordLatestSync(Ljava/lang/Integer;)V

    goto :goto_1

    .line 276
    :cond_5
    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfflineDataVersionsRequest;->dataCategories:Ljava/util/List;

    .line 278
    new-instance p2, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;

    iget-object p3, p0, Lcom/shopkick/app/offline/OfflineDataStore;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-direct {p2, p3, p1, p0}, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/offline/IRetryHandlerCallback;)V

    .line 281
    iget-object p3, p0, Lcom/shopkick/app/offline/OfflineDataStore;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p3, p3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreRetryLimit:Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    .line 282
    iget-object v1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreRetryIntervalSeconds:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-nez v1, :cond_6

    const/4 p3, 0x0

    .line 285
    :cond_6
    iget-object v1, p0, Lcom/shopkick/app/offline/OfflineDataStore;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineDataStoreRetryIntervalSeconds:Ljava/lang/Double;

    .line 286
    invoke-virtual {v1}, Ljava/lang/Double;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    .line 285
    invoke-virtual {p2, p3, v1, v2}, Lcom/shopkick/app/offline/APIManagerFetchRetryHandler;->fetchWithRetryLimitAndInterval(IJ)V

    .line 288
    iget-object p3, p0, Lcom/shopkick/app/offline/OfflineDataStore;->versionsRequestsByDataCategories:Ljava/util/HashMap;

    invoke-virtual {p3, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    iget-object p3, p0, Lcom/shopkick/app/offline/OfflineDataStore;->versionsFetchHandlersByVersionRequest:Ljava/util/HashMap;

    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
