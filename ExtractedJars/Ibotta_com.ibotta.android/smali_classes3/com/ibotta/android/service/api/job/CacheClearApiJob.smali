.class public Lcom/ibotta/android/service/api/job/CacheClearApiJob;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "CacheClearApiJob.java"


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final remove:Z


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/CacheableApiCall;Z)V
    .locals 1

    const/high16 v0, -0x80000000

    .line 23
    invoke-direct {p0, p2, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/CacheClearApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 25
    iput-boolean p3, p0, Lcom/ibotta/android/service/api/job/CacheClearApiJob;->remove:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-ne p1, p0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 64
    :cond_1
    instance-of v1, p1, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    if-nez v1, :cond_2

    return v0

    .line 68
    :cond_2
    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    .line 69
    new-instance v1, Lorg/apache/commons/lang3/builder/EqualsBuilder;

    invoke-direct {v1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;-><init>()V

    .line 70
    invoke-super {p0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v1, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->appendSuper(Z)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object p1

    const-class v1, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object p1

    iget-boolean v1, p0, Lcom/ibotta/android/service/api/job/CacheClearApiJob;->remove:Z

    iget-boolean v0, v0, Lcom/ibotta/android/service/api/job/CacheClearApiJob;->remove:Z

    .line 72
    invoke-virtual {p1, v1, v0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(ZZ)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object p1

    .line 73
    invoke-virtual {p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals()Z

    move-result p1

    return p1
.end method

.method public getApiResponse()Lcom/ibotta/api/ApiResponse;
    .locals 1

    .line 30
    new-instance v0, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {v0}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 78
    new-instance v0, Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    const/16 v1, 0x6845

    const v2, 0xc27d

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;-><init>(II)V

    .line 79
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->appendSuper(I)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    const-class v1, Lcom/ibotta/android/service/api/job/CacheClearApiJob;

    .line 80
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ibotta/android/service/api/job/CacheClearApiJob;->remove:Z

    .line 81
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Z)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->toHashCode()I

    move-result v0

    return v0
.end method

.method public isOutOfDate()Z
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/CacheClearApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected onCheckCache()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected onDoWork()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/CacheClearApiJob;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/CacheableApiCall;

    iget-boolean v2, p0, Lcom/ibotta/android/service/api/job/CacheClearApiJob;->remove:Z

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/appcache/AppCache;->removeOrInvalidate(Lcom/ibotta/api/CacheableApiCall;Z)V

    .line 46
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/CacheClearApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    return-void
.end method

.method protected onHandleException(Lcom/ibotta/api/ApiException;)V
    .locals 3

    .line 51
    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/CacheClearApiJob;->setException(Lcom/ibotta/api/ApiException;)V

    .line 52
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->ERROR:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/CacheClearApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    const-string v0, "API call failed: %1$s"

    const/4 v1, 0x1

    .line 53
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
