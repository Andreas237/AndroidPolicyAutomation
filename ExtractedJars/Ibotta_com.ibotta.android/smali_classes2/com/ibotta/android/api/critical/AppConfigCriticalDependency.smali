.class public Lcom/ibotta/android/api/critical/AppConfigCriticalDependency;
.super Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;
.source "AppConfigCriticalDependency.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# instance fields
.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;-><init>(Lcom/ibotta/android/appcache/AppCache;)V

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/api/critical/AppConfigCriticalDependency;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 26
    iput-object p3, p0, Lcom/ibotta/android/api/critical/AppConfigCriticalDependency;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

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

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/api/critical/AppConfigCriticalDependency;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createConfigApiJob()Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    .line 32
    invoke-virtual {v0, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 34
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 35
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 47
    invoke-interface {p1, p0}, Lcom/ibotta/android/service/api/job/ApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 49
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/config/ConfigResponse;

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/api/critical/AppConfigCriticalDependency;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-virtual {p1}, Lcom/ibotta/api/call/config/ConfigResponse;->getConfig()Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/app/config/AppConfig;->setAppConfig(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    return-void
.end method
