.class public abstract Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;
.super Lcom/ibotta/android/api/critical/AbstractCriticalDependency;
.source "FrontDoorMonitoringCriticalDependency.java"


# instance fields
.field private isCheckCache:Z

.field private isFrontDoorEntered:Z


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/api/critical/AbstractCriticalDependency;-><init>(Lcom/ibotta/android/appcache/AppCache;)V

    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;->isCheckCache:Z

    return-void
.end method

.method public static synthetic lambda$isCacheStale$0(Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;Lcom/ibotta/android/service/api/job/SingleApiJob;)Z
    .locals 1

    .line 76
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    .line 78
    instance-of v0, p1, Lcom/ibotta/api/CacheableApiCall;

    if-eqz v0, :cond_0

    .line 79
    check-cast p1, Lcom/ibotta/api/CacheableApiCall;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;->isCacheStale(Lcom/ibotta/api/CacheableApiCall;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1
.end method


# virtual methods
.method protected isCacheStale()Z
    .locals 2

    .line 70
    iget-boolean v0, p0, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;->isCheckCache:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 74
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;->getApiJobs()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/api/critical/-$$Lambda$FrontDoorMonitoringCriticalDependency$Kqds9KBonPNyAqyXjRxVmnEaV-M;

    invoke-direct {v1, p0}, Lcom/ibotta/android/api/critical/-$$Lambda$FrontDoorMonitoringCriticalDependency$Kqds9KBonPNyAqyXjRxVmnEaV-M;-><init>(Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;)V

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->anyMatch(Ljava9/util/function/Predicate;)Z

    move-result v0

    return v0
.end method

.method public isLoadNeeded()Z
    .locals 7

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;->isCacheStale()Z

    move-result v0

    .line 58
    iget-boolean v1, p0, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;->isFrontDoorEntered:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    const-string v4, "isLoadNeeded: %1$b, isFrontDoorEntered=%2$b, isCacheStale=%3$b"

    const/4 v5, 0x3

    .line 60
    new-array v5, v5, [Ljava/lang/Object;

    .line 62
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v2

    iget-boolean v2, p0, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;->isFrontDoorEntered:Z

    .line 63
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v5, v3

    const/4 v2, 0x2

    .line 64
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v5, v2

    .line 60
    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method

.method public onAppLaunched(ZZ)V
    .locals 5

    .line 35
    iget-boolean v0, p0, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;->isFrontDoorEntered:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 41
    :goto_0
    iput-boolean v2, p0, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;->isFrontDoorEntered:Z

    const-string v2, "isFrontDoorEntered: %1$b, isColdStart=%2$b, isFrontDoorActivity=%3$b"

    const/4 v3, 0x3

    .line 43
    new-array v3, v3, [Ljava/lang/Object;

    iget-boolean v4, p0, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;->isFrontDoorEntered:Z

    .line 45
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v3, v1

    .line 46
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    aput-object p1, v3, v0

    const/4 p1, 0x2

    .line 47
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    aput-object p2, v3, p1

    .line 43
    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onJobQueued()V
    .locals 1

    const/4 v0, 0x0

    .line 52
    iput-boolean v0, p0, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;->isFrontDoorEntered:Z

    return-void
.end method

.method protected setCheckCache(Z)V
    .locals 0

    .line 30
    iput-boolean p1, p0, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;->isCheckCache:Z

    return-void
.end method
