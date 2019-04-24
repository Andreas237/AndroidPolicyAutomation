.class public abstract Lcom/ibotta/android/api/critical/AbstractCriticalDependency;
.super Ljava/lang/Object;
.source "AbstractCriticalDependency.java"

# interfaces
.implements Lcom/ibotta/android/api/critical/CriticalDependency;


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/ibotta/android/api/critical/AbstractCriticalDependency;->appCache:Lcom/ibotta/android/appcache/AppCache;

    return-void
.end method


# virtual methods
.method protected isCacheStale(Lcom/ibotta/api/CacheableApiCall;)Z
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/api/critical/AbstractCriticalDependency;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-interface {v0, p1}, Lcom/ibotta/android/appcache/AppCache;->getMemIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
