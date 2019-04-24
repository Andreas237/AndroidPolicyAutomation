.class public Lcom/shopkick/app/SKPersistentCache/APICache;
.super Ljava/lang/Object;
.source "APICache.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;,
        Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;,
        Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;,
        Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;
    }
.end annotation


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private diskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

.field private diskCacheCallbackByRequestStateMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;",
            "Lcom/shopkick/app/fetchers/image/ISKDiskCacheCallback;",
            ">;"
        }
    .end annotation
.end field

.field private lruCache:Landroid/support/v4/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LruCache<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;",
            ">;"
        }
    .end annotation
.end field

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private requestStateByRequestMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            "Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;",
            ">;"
        }
    .end annotation
.end field

.field private requestsByCallbackMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Landroid/support/v4/util/LruCache;Lcom/shopkick/app/fetchers/image/SKDiskCache;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/fetchers/api/APIManager;",
            "Lcom/shopkick/app/util/NotificationCenter;",
            "Landroid/support/v4/util/LruCache<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;",
            ">;",
            "Lcom/shopkick/app/fetchers/image/SKDiskCache;",
            ")V"
        }
    .end annotation

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 67
    iput-object p2, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 68
    iput-object p3, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->lruCache:Landroid/support/v4/util/LruCache;

    .line 69
    iput-object p4, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->diskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    .line 71
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestStateByRequestMap:Ljava/util/HashMap;

    .line 72
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestsByCallbackMap:Ljava/util/HashMap;

    .line 73
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->diskCacheCallbackByRequestStateMap:Ljava/util/HashMap;

    const-string p1, "UserAccountIdChangedEvent"

    .line 75
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "BUY_AND_COLLECT_ENROLL_COMPLETE"

    .line 76
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/image/SKDiskCache;)V
    .locals 1

    .line 55
    new-instance v0, Landroid/support/v4/util/LruCache;

    iget-object p3, p3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->apiMemoryCacheSize:Ljava/lang/Integer;

    .line 57
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-direct {v0, p3}, Landroid/support/v4/util/LruCache;-><init>(I)V

    .line 55
    invoke-direct {p0, p1, p2, v0, p4}, Lcom/shopkick/app/SKPersistentCache/APICache;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Landroid/support/v4/util/LruCache;Lcom/shopkick/app/fetchers/image/SKDiskCache;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/SKPersistentCache/APICache;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/lang/String;Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/SKPersistentCache/APICache;->addToLruCache(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/lang/String;Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/SKPersistentCache/APICache;Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/shopkick/app/SKPersistentCache/APICache;->processRequestStatePostDiskCache(Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;)V

    return-void
.end method

.method private addToCache(Ljava/util/HashMap;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;",
            "Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 152
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 153
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 154
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 156
    new-instance v2, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;

    invoke-direct {v2, v1, v0}, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;-><init>(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    .line 157
    sget-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->CONFIG:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    if-ne p2, v0, :cond_1

    .line 158
    iget-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {p0, v0, v2}, Lcom/shopkick/app/SKPersistentCache/APICache;->addToDiskCache(Ljava/lang/String;Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;)V

    .line 163
    :cond_1
    iget-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-direct {p0, p2, v0, v2}, Lcom/shopkick/app/SKPersistentCache/APICache;->addToLruCache(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/lang/String;Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private addToLruCache(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/lang/String;Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;)V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->lruCache:Landroid/support/v4/util/LruCache;

    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/SKPersistentCache/APICache;->getLruPartitionCacheKey(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p3}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private getKeyApiObjectMapFromTokenWrapperMap(Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            "Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;",
            ">;)",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation

    .line 170
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 171
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 172
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;

    iget-object v1, v1, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->apiObject:Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private getLruPartitionCacheKey(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getWrapperFromLruCache(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;
    .locals 1

    .line 119
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/SKPersistentCache/APICache;->getLruPartitionCacheKey(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->lruCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;

    if-eqz p1, :cond_1

    .line 122
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->entityToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    iget-object v0, p1, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->entityToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    :cond_0
    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private getWrappersFromLruCache(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/util/Collection;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;",
            "Ljava/util/Collection<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            ">;)",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            "Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;",
            ">;"
        }
    .end annotation

    .line 132
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 133
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 134
    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/SKPersistentCache/APICache;->getWrapperFromLruCache(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 136
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private processRequestStatePostDiskCache(Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;)V
    .locals 4

    .line 458
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->diskCacheCallbackByRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    iget-object v0, p1, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;

    if-nez v0, :cond_0

    return-void

    .line 465
    :cond_0
    iget-object v1, p1, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->objInCacheByKey:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 467
    iget-object v1, p1, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->objInCacheByKey:Ljava/util/HashMap;

    invoke-interface {v0, v1}, Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;->receivedObjects(Ljava/util/HashMap;)V

    .line 471
    :cond_1
    iget-object v1, p1, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->tokensNeededToFetch:Ljava/util/Set;

    if-eqz v1, :cond_5

    iget-object v1, p1, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->tokensNeededToFetch:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 475
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 476
    iget-object v2, p1, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->tokensNeededToFetch:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 477
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 481
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, p1, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->partitionType:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    .line 482
    invoke-interface {v0, v2, v1}, Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;->getRequestForCacheKeysAndPartitionType(Ljava/util/ArrayList;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v1

    .line 486
    iget-object v2, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestStateByRequestMap:Ljava/util/HashMap;

    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    iget-object p1, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestsByCallbackMap:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_4

    .line 489
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 490
    iget-object v2, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestsByCallbackMap:Ljava/util/HashMap;

    invoke-virtual {v2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    :cond_4
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 495
    iget-object p1, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void

    :cond_5
    :goto_1
    return-void
.end method

.method private removeFromLruCache(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/lang/String;)V
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->lruCache:Landroid/support/v4/util/LruCache;

    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/SKPersistentCache/APICache;->getLruPartitionCacheKey(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/support/v4/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public addToDiskCache(Ljava/lang/String;Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;)V
    .locals 1

    .line 400
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->diskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    invoke-virtual {p2}, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/fetchers/image/SKDiskCache;->addBytesToCache(Ljava/lang/String;[B)V

    return-void
.end method

.method public cancelRequestsForTarget(Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;)V
    .locals 2

    .line 272
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestsByCallbackMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    .line 274
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 275
    iget-object v1, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 276
    iget-object v1, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestStateByRequestMap:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;

    .line 277
    iget-object v1, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->diskCacheCallbackByRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public clear()V
    .locals 2

    .line 100
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestsByCallbackMap:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 101
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;

    .line 102
    invoke-virtual {p0, v1}, Lcom/shopkick/app/SKPersistentCache/APICache;->cancelRequestsForTarget(Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;)V

    goto :goto_0

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestsByCallbackMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestStateByRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->lruCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->evictAll()V

    return-void
.end method

.method public clearLruCache()V
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->lruCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->evictAll()V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 4

    .line 292
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestStateByRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;

    if-nez v0, :cond_0

    return-void

    .line 297
    :cond_0
    iget-object v1, v0, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;

    if-nez v1, :cond_1

    return-void

    .line 303
    :cond_1
    iget-boolean v2, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v2, :cond_3

    iget-object v2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v2, :cond_3

    .line 304
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    iget-object v2, v0, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->partitionType:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-interface {v1, p2, v2}, Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;->parseResponse(Ljava/lang/Object;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)Ljava/util/HashMap;

    move-result-object p2

    .line 306
    iget-object v0, v0, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->partitionType:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-direct {p0, p2, v0}, Lcom/shopkick/app/SKPersistentCache/APICache;->addToCache(Ljava/util/HashMap;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V

    .line 308
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 309
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 310
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 312
    :cond_2
    invoke-interface {v1, v0}, Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;->receivedObjects(Ljava/util/HashMap;)V

    goto :goto_1

    .line 314
    :cond_3
    iget-object v0, v0, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->partitionType:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-interface {v1, p1, p2, v0}, Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;->fetchFailed(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V

    .line 317
    :goto_1
    iget-object p2, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestsByCallbackMap:Ljava/util/HashMap;

    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 318
    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 319
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 320
    iget-object p1, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestsByCallbackMap:Ljava/util/HashMap;

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void
.end method

.method public destroy()V
    .locals 2

    .line 83
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestsByCallbackMap:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 84
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;

    .line 85
    invoke-virtual {p0, v1}, Lcom/shopkick/app/SKPersistentCache/APICache;->cancelRequestsForTarget(Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;)V

    goto :goto_0

    .line 88
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    if-eqz v0, :cond_1

    .line 89
    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    :cond_1
    const/4 v0, 0x0

    .line 92
    iput-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->lruCache:Landroid/support/v4/util/LruCache;

    .line 94
    iput-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestsByCallbackMap:Ljava/util/HashMap;

    .line 95
    iput-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestStateByRequestMap:Ljava/util/HashMap;

    .line 96
    iput-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->diskCacheCallbackByRequestStateMap:Ljava/util/HashMap;

    return-void
.end method

.method public fetchObjectsForTokensWithPartition(Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;Ljava/util/ArrayList;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            ">;",
            "Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_1

    .line 247
    :cond_0
    invoke-direct {p0, p3, p2}, Lcom/shopkick/app/SKPersistentCache/APICache;->getWrappersFromLruCache(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/util/Collection;)Ljava/util/HashMap;

    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 249
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 250
    invoke-interface {v2, v1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 252
    new-instance p2, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;

    invoke-direct {p2}, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;-><init>()V

    .line 253
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p2, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 254
    iput-object p3, p2, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->partitionType:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    .line 255
    invoke-direct {p0, v0}, Lcom/shopkick/app/SKPersistentCache/APICache;->getKeyApiObjectMapFromTokenWrapperMap(Ljava/util/HashMap;)Ljava/util/HashMap;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->objInCacheByKey:Ljava/util/HashMap;

    .line 257
    sget-object p1, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->CONFIG:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    if-ne p3, p1, :cond_1

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result p1

    if-lez p1, :cond_1

    .line 258
    iput-object v2, p2, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->tokensWaitingFromDiskCache:Ljava/util/Set;

    .line 260
    new-instance p1, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;

    invoke-direct {p1, p0, p2}, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;-><init>(Lcom/shopkick/app/SKPersistentCache/APICache;Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;)V

    .line 261
    iget-object p3, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->diskCacheCallbackByRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {p3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 263
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->diskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {v0, p3, p1}, Lcom/shopkick/app/fetchers/image/SKDiskCache;->getBytesFromCache(Ljava/lang/String;Lcom/shopkick/app/fetchers/image/ISKDiskCacheCallback;)V

    goto :goto_0

    .line 266
    :cond_1
    iput-object v2, p2, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->tokensNeededToFetch:Ljava/util/Set;

    .line 267
    invoke-direct {p0, p2}, Lcom/shopkick/app/SKPersistentCache/APICache;->processRequestStatePostDiskCache(Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;)V

    :cond_2
    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method public fetchObjectsForTokensWithPartitions(Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;Ljava/util/ArrayList;[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            ">;[",
            "Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;",
            ")V"
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    .line 235
    :cond_0
    array-length v0, p3

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p3, v1

    .line 236
    invoke-virtual {p0, p1, p2, v2}, Lcom/shopkick/app/SKPersistentCache/APICache;->fetchObjectsForTokensWithPartition(Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;Ljava/util/ArrayList;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public getDiskCacheCallbackByRequestStateMap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;>;"
        }
    .end annotation

    .line 392
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->diskCacheCallbackByRequestStateMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    return-object v0
.end method

.method public getObjectByEntityTokenAndPartitionType(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    if-eqz p1, :cond_0

    .line 209
    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/SKPersistentCache/APICache;->getWrapperFromLruCache(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 211
    iget-object p1, p1, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->apiObject:Lcom/shopkick/app/fetchers/api/IAPIObject;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getRequestStateByRequestMap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            "Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;",
            ">;"
        }
    .end annotation

    .line 382
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestStateByRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    return-object v0
.end method

.method public getRequestsByCallbackMap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;>;"
        }
    .end annotation

    .line 387
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->requestsByCallbackMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    return-object v0
.end method

.method public invalidate(Ljava/lang/String;)V
    .locals 1

    .line 186
    invoke-static {}, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->values()[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/SKPersistentCache/APICache;->invalidate(Ljava/lang/String;[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V

    return-void
.end method

.method public invalidate(Ljava/lang/String;[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V
    .locals 1

    .line 190
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 191
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 192
    invoke-virtual {p0, v0, p2}, Lcom/shopkick/app/SKPersistentCache/APICache;->invalidate(Ljava/util/Collection;[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V

    return-void
.end method

.method public invalidate(Ljava/util/Collection;[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;[",
            "Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;",
            ")V"
        }
    .end annotation

    .line 196
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p2, v1

    .line 197
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 198
    sget-object v5, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->CONFIG:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    if-ne v2, v5, :cond_0

    .line 199
    iget-object v5, p0, Lcom/shopkick/app/SKPersistentCache/APICache;->diskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    invoke-virtual {v5, v4}, Lcom/shopkick/app/fetchers/image/SKDiskCache;->removeBytesFromCache(Ljava/lang/String;)V

    .line 201
    :cond_0
    invoke-direct {p0, v2, v4}, Lcom/shopkick/app/SKPersistentCache/APICache;->removeFromLruCache(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
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

    .line 370
    invoke-virtual {p0}, Lcom/shopkick/app/SKPersistentCache/APICache;->clear()V

    goto :goto_0

    :cond_0
    const-string p2, "BUY_AND_COLLECT_ENROLL_COMPLETE"

    if-ne p1, p2, :cond_1

    .line 372
    invoke-virtual {p0}, Lcom/shopkick/app/SKPersistentCache/APICache;->clear()V

    :cond_1
    :goto_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public updatePartition(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)V
    .locals 1

    if-eqz p3, :cond_1

    if-eqz p2, :cond_1

    .line 219
    new-instance v0, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;

    invoke-direct {v0, p3, p2}, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;-><init>(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    .line 220
    sget-object p2, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->CONFIG:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    if-ne p1, p2, :cond_0

    .line 222
    iget-object p2, p3, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {p0, p2, v0}, Lcom/shopkick/app/SKPersistentCache/APICache;->addToDiskCache(Ljava/lang/String;Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;)V

    .line 224
    :cond_0
    iget-object p2, p3, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/SKPersistentCache/APICache;->addToLruCache(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/lang/String;Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;)V

    :cond_1
    return-void
.end method
