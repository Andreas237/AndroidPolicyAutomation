.class Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;
.super Ljava/lang/Object;
.source "APICache.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/image/ISKDiskCacheCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/SKPersistentCache/APICache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SKDiskCacheCallback"
.end annotation


# instance fields
.field private apiCacheRequestState:Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;

.field private cacheRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/SKPersistentCache/APICache;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/SKPersistentCache/APICache;Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;)V
    .locals 1

    .line 411
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 412
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;->cacheRef:Ljava/lang/ref/WeakReference;

    .line 413
    iput-object p2, p0, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;->apiCacheRequestState:Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;

    return-void
.end method


# virtual methods
.method public addTokenToFetch(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)V
    .locals 2

    .line 450
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;->apiCacheRequestState:Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;

    iget-object v0, v0, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->tokensNeededToFetch:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 451
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;->apiCacheRequestState:Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, v0, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->tokensNeededToFetch:Ljava/util/Set;

    .line 453
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;->apiCacheRequestState:Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;

    iget-object v0, v0, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->tokensNeededToFetch:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public onBytesReadFromDiskCache(Ljava/lang/String;[B)V
    .locals 5

    .line 418
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;->apiCacheRequestState:Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->removeKey(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    move-result-object v0

    .line 420
    iget-object v1, p0, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;->cacheRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/SKPersistentCache/APICache;

    if-eqz v1, :cond_3

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    .line 424
    :try_start_0
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, p2}, Ljava/lang/String;-><init>([B)V

    invoke-static {v3, v2}, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;

    move-result-object p2

    .line 427
    iget-object v3, p2, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->entityToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    if-eqz v3, :cond_1

    .line 428
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    iget-object v4, p2, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->entityToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    .line 429
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 430
    :cond_0
    iget-object v3, p0, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;->apiCacheRequestState:Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;

    iget-object v3, v3, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->partitionType:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-static {v1, v3, p1, p2}, Lcom/shopkick/app/SKPersistentCache/APICache;->access$000(Lcom/shopkick/app/SKPersistentCache/APICache;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Ljava/lang/String;Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;)V

    .line 431
    iget-object v3, p0, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;->apiCacheRequestState:Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;

    iget-object v3, v3, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->objInCacheByKey:Ljava/util/HashMap;

    iget-object p2, p2, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->apiObject:Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-virtual {v3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    move v2, p1

    :catch_0
    :cond_1
    if-nez v2, :cond_2

    .line 440
    invoke-virtual {p0, v0}, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;->addTokenToFetch(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)V

    .line 443
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;->apiCacheRequestState:Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;

    iget-object p1, p1, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->tokensWaitingFromDiskCache:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 444
    iget-object p1, p0, Lcom/shopkick/app/SKPersistentCache/APICache$SKDiskCacheCallback;->apiCacheRequestState:Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;

    invoke-static {v1, p1}, Lcom/shopkick/app/SKPersistentCache/APICache;->access$100(Lcom/shopkick/app/SKPersistentCache/APICache;Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;)V

    :cond_3
    return-void
.end method
