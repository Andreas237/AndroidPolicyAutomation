.class public Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;
.super Ljava/lang/Object;
.source "APICache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/SKPersistentCache/APICache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "APICacheRequestState"
.end annotation


# instance fields
.field public callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;",
            ">;"
        }
    .end annotation
.end field

.field public objInCacheByKey:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation
.end field

.field public partitionType:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

.field public tokensNeededToFetch:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            ">;"
        }
    .end annotation
.end field

.field public tokensWaitingFromDiskCache:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 328
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public removeKey(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/EntityToken;
    .locals 3

    .line 337
    iget-object v0, p0, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->tokensWaitingFromDiskCache:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 338
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 340
    iget-object p1, p0, Lcom/shopkick/app/SKPersistentCache/APICache$APICacheRequestState;->tokensWaitingFromDiskCache:Ljava/util/Set;

    invoke-interface {p1, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
