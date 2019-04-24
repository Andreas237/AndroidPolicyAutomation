.class public Lcom/ibotta/android/api/critical/AggregateCriticalDependency;
.super Lcom/ibotta/android/api/critical/AbstractCriticalDependency;
.source "AggregateCriticalDependency.java"


# instance fields
.field private final criticalDependencies:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/appcache/AppCache;",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/api/critical/AbstractCriticalDependency;-><init>(Lcom/ibotta/android/appcache/AppCache;)V

    .line 16
    iput-object p2, p0, Lcom/ibotta/android/api/critical/AggregateCriticalDependency;->criticalDependencies:Ljava/util/Set;

    return-void
.end method

.method static synthetic lambda$isLoadNeeded$2(Lcom/ibotta/android/api/critical/CriticalDependency;)Z
    .locals 0

    .line 35
    invoke-interface {p0}, Lcom/ibotta/android/api/critical/CriticalDependency;->isLoadNeeded()Z

    move-result p0

    return p0
.end method

.method static synthetic lambda$onAppLaunched$0(ZZLcom/ibotta/android/api/critical/CriticalDependency;)V
    .locals 0

    .line 23
    invoke-interface {p2, p0, p1}, Lcom/ibotta/android/api/critical/CriticalDependency;->onAppLaunched(ZZ)V

    return-void
.end method

.method static synthetic lambda$onJobQueued$1(Lcom/ibotta/android/api/critical/CriticalDependency;)V
    .locals 0

    .line 28
    invoke-interface {p0}, Lcom/ibotta/android/api/critical/CriticalDependency;->onJobQueued()V

    return-void
.end method


# virtual methods
.method public getApiJobs()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ">;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/api/critical/AggregateCriticalDependency;->criticalDependencies:Ljava/util/Set;

    .line 41
    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/api/critical/-$$Lambda$xHYa7kv0F_ACL6l5uMfELddbqeg;->INSTANCE:Lcom/ibotta/android/api/critical/-$$Lambda$xHYa7kv0F_ACL6l5uMfELddbqeg;

    .line 42
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/api/critical/-$$Lambda$oHK31L17LS6kB2L70enwqINSMFE;->INSTANCE:Lcom/ibotta/android/api/critical/-$$Lambda$oHK31L17LS6kB2L70enwqINSMFE;

    .line 43
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->flatMap(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 44
    invoke-static {}, Ljava9/util/stream/Collectors;->toSet()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public isLoadNeeded()Z
    .locals 2

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/api/critical/AggregateCriticalDependency;->criticalDependencies:Ljava/util/Set;

    .line 34
    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/api/critical/-$$Lambda$AggregateCriticalDependency$5oDiZR6Ytb367iQMyso6JqpQNg0;->INSTANCE:Lcom/ibotta/android/api/critical/-$$Lambda$AggregateCriticalDependency$5oDiZR6Ytb367iQMyso6JqpQNg0;

    .line 35
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->anyMatch(Ljava9/util/function/Predicate;)Z

    move-result v0

    return v0
.end method

.method public onAppLaunched(ZZ)V
    .locals 2

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/api/critical/AggregateCriticalDependency;->criticalDependencies:Ljava/util/Set;

    .line 22
    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/api/critical/-$$Lambda$AggregateCriticalDependency$BMiQ1MSBOlmWTvU1kItTuAIKLZo;

    invoke-direct {v1, p1, p2}, Lcom/ibotta/android/api/critical/-$$Lambda$AggregateCriticalDependency$BMiQ1MSBOlmWTvU1kItTuAIKLZo;-><init>(ZZ)V

    .line 23
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    return-void
.end method

.method public onJobQueued()V
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/api/critical/AggregateCriticalDependency;->criticalDependencies:Ljava/util/Set;

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/api/critical/-$$Lambda$AggregateCriticalDependency$6-PHeYyJS6BiXap7AkjtOPl7iaU;->INSTANCE:Lcom/ibotta/android/api/critical/-$$Lambda$AggregateCriticalDependency$6-PHeYyJS6BiXap7AkjtOPl7iaU;

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    return-void
.end method
