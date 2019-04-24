.class public Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;
.super Ljava/lang/Object;
.source "SimpleInvalidationCriteria.java"

# interfaces
.implements Lcom/ibotta/android/appcache/InvalidationCriteria;


# instance fields
.field private cacheKeys:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private families:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final invalidateable:Lcom/ibotta/api/CacheableApiCall;

.field private scopes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/api/CacheableApiCall;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/api/CacheableApiCall;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->invalidateable:Lcom/ibotta/api/CacheableApiCall;

    return-void
.end method


# virtual methods
.method public addCacheKey(Ljava/lang/String;)V
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->cacheKeys:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 37
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->cacheKeys:Ljava/util/Set;

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->cacheKeys:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addFamily(Ljava/lang/String;)V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->families:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 30
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->families:Ljava/util/Set;

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->families:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addScope(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/api/CacheableApiCall;",
            ">;)V"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->scopes:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 23
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->scopes:Ljava/util/Set;

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->scopes:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public cleanUp()V
    .locals 0

    return-void
.end method

.method public getCacheableScopes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/api/CacheableApiCall;",
            ">;>;"
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->scopes:Ljava/util/Set;

    return-object v0
.end method

.method public getInvalidateable()Lcom/ibotta/api/CacheableApiCall;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->invalidateable:Lcom/ibotta/api/CacheableApiCall;

    return-object v0
.end method

.method public isInvalidatedBy(Lcom/ibotta/api/CacheableApiCall;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 58
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->isInvalidatesCacheFamily()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->families:Ljava/util/Set;

    if-eqz v1, :cond_1

    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    .line 62
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/appcache/SimpleInvalidationCriteria;->cacheKeys:Ljava/util/Set;

    if-eqz v1, :cond_2

    invoke-interface {p1}, Lcom/ibotta/api/CacheableApiCall;->getCacheKey()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method
