.class public Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;
.super Ljava/lang/Object;
.source "RecentlyViewedRetailersServiceImpl.java"

# interfaces
.implements Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;


# instance fields
.field private final apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

.field private getRecentlyViewedRetailersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private getRecentlyViewedRetailersListener:Lcom/ibotta/android/service/api/job/ApiJobListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

.field private retailerViewedJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final retailerViewedListener:Lcom/ibotta/android/service/api/job/ApiJobListener;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 43
    iput-object p2, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 44
    iput-object p3, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 46
    new-instance p1, Lcom/ibotta/android/search/recentlyviewed/-$$Lambda$RecentlyViewedRetailersServiceImpl$aB-SkaspeywM7FbhPEsOviGhxdo;

    invoke-direct {p1, p0}, Lcom/ibotta/android/search/recentlyviewed/-$$Lambda$RecentlyViewedRetailersServiceImpl$aB-SkaspeywM7FbhPEsOviGhxdo;-><init>(Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;)V

    iput-object p1, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->retailerViewedListener:Lcom/ibotta/android/service/api/job/ApiJobListener;

    return-void
.end method

.method private cancelGetRecentlyViewedRetailersJob()V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->getRecentlyViewedRetailersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->getRecentlyViewedRetailersListener:Lcom/ibotta/android/service/api/job/ApiJobListener;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    :cond_0
    const/4 v0, 0x0

    .line 89
    iput-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->getRecentlyViewedRetailersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method private cancelRetailerViewedJob()V
    .locals 2

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->retailerViewedJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    .line 80
    iget-object v1, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->retailerViewedListener:Lcom/ibotta/android/service/api/job/ApiJobListener;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    :cond_0
    const/4 v0, 0x0

    .line 82
    iput-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->retailerViewedJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public static synthetic lambda$aB-SkaspeywM7FbhPEsOviGhxdo(Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->retailerViewedListenener(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method static synthetic lambda$loadRecentlyViewedRetailers$0(Ljava9/util/function/Consumer;Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 53
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 55
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;

    if-eqz p1, :cond_0

    .line 57
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;->getRetailerModels()Ljava/util/List;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private retailerViewedListenener(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 3

    .line 93
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    iget-object p1, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->updateRecentlyViewedRetailers()V

    goto :goto_0

    .line 96
    :cond_0
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCallException;

    const-string v2, "RetailerViewedGraphQLCall failed"

    .line 97
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->getException()Lcom/ibotta/api/ApiException;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCallException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->cancelRetailerViewedJob()V

    .line 75
    invoke-direct {p0}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->cancelGetRecentlyViewedRetailersJob()V

    return-void
.end method

.method public loadRecentlyViewedRetailers(Ljava9/util/function/Consumer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;>;)V"
        }
    .end annotation

    .line 51
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v1, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createRecentlyViewedRetailersGraphQLCall()Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->getRecentlyViewedRetailersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 52
    new-instance v0, Lcom/ibotta/android/search/recentlyviewed/-$$Lambda$RecentlyViewedRetailersServiceImpl$sBd_bT0ptbyumKrSCGxyKrok8bk;

    invoke-direct {v0, p1}, Lcom/ibotta/android/search/recentlyviewed/-$$Lambda$RecentlyViewedRetailersServiceImpl$sBd_bT0ptbyumKrSCGxyKrok8bk;-><init>(Ljava9/util/function/Consumer;)V

    iput-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->getRecentlyViewedRetailersListener:Lcom/ibotta/android/service/api/job/ApiJobListener;

    .line 61
    iget-object p1, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->getRecentlyViewedRetailersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->getRecentlyViewedRetailersListener:Lcom/ibotta/android/service/api/job/ApiJobListener;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 62
    iget-object p1, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    iget-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->getRecentlyViewedRetailersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {p1, v0}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public markRetailerAsViewed(I)V
    .locals 2

    .line 67
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v1, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1, p1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createViewedRetailerGraphQLCall(I)Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->retailerViewedJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 68
    iget-object p1, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->retailerViewedJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->retailerViewedListener:Lcom/ibotta/android/service/api/job/ApiJobListener;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    iget-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->retailerViewedJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {p1, v0}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method
