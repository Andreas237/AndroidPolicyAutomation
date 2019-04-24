.class public Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "EngagementsGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;",
        "Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final engagementMapper:Lcom/ibotta/android/graphql/mapper/EngagementMapper;

.field private rewardIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 25
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->rewardIds:Ljava/util/Set;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 30
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getEngagementMapper()Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->engagementMapper:Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement;)Lcom/ibotta/api/model/content/EngagementContent;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->engagementMapper:Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement;->fragments()Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Engagement$Fragments;->engagementFragment()Lcom/ibotta/android/graphql/fragment/EngagementFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/EngagementMapper;->map(Lcom/ibotta/android/graphql/fragment/EngagementFragment;)Lcom/ibotta/api/model/content/EngagementContent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 62
    invoke-static {}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;->builder()Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;

    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->rewardIds:Ljava/util/Set;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 65
    iget-object v1, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->rewardIds:Ljava/util/Set;

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->asLongList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;->rewardIds(Ljava/util/List;)Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;

    .line 68
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/engagements"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 3

    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    iget-object v1, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->rewardIds:Ljava/util/Set;

    if-eqz v1, :cond_0

    .line 95
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 96
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 100
    :cond_0
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "engagements"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 52
    const-class v0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;

    return-object v0
.end method

.method public getRewardIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->rewardIds:Ljava/util/Set;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;"
        }
    .end annotation

    .line 78
    new-instance v0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;-><init>()V

    .line 81
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/engagement/-$$Lambda$LrzgYteFSXUgJ32txVfS9CrZ978;->INSTANCE:Lcom/ibotta/android/graphql/engagement/-$$Lambda$LrzgYteFSXUgJ32txVfS9CrZ978;

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->getListSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/graphql/engagement/-$$Lambda$EngagementsGraphQLCall$J-YLaySSC19_Iim-ZX6urybHtdg;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/engagement/-$$Lambda$EngagementsGraphQLCall$J-YLaySSC19_Iim-ZX6urybHtdg;-><init>(Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;)V

    .line 80
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->translateList(Ljava/util/List;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;->setEngagements(Ljava/util/List;)V

    return-object v0
.end method

.method public setRewardIds(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->rewardIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->rewardIds:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public setRewardIds([Ljava/lang/Integer;)V
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->rewardIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    if-eqz p1, :cond_0

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->rewardIds:Ljava/util/Set;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method
