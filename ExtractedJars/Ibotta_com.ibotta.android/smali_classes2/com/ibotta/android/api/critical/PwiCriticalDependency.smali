.class public Lcom/ibotta/android/api/critical/PwiCriticalDependency;
.super Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;
.source "PwiCriticalDependency.java"


# instance fields
.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private final pwiRetailersHolder:Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;-><init>(Lcom/ibotta/android/appcache/AppCache;)V

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/api/critical/PwiCriticalDependency;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/api/critical/PwiCriticalDependency;->pwiRetailersHolder:Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    .line 30
    iput-object p4, p0, Lcom/ibotta/android/api/critical/PwiCriticalDependency;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    return-void
.end method


# virtual methods
.method public getApiJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ">;"
        }
    .end annotation

    .line 35
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 37
    iget-object v1, p0, Lcom/ibotta/android/api/critical/PwiCriticalDependency;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 38
    new-instance v1, Lcom/ibotta/android/api/pwi/BgcRetailersJob;

    iget-object v2, p0, Lcom/ibotta/android/api/critical/PwiCriticalDependency;->pwiRetailersHolder:Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    iget-object v3, p0, Lcom/ibotta/android/api/critical/PwiCriticalDependency;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/api/pwi/BgcRetailersJob;-><init>(Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method
