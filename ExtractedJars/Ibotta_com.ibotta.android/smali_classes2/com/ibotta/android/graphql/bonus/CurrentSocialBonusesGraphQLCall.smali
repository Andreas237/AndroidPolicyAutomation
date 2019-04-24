.class public Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "CurrentSocialBonusesGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLResponse;",
        "Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 25
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getBonusMapper()Lcom/ibotta/android/graphql/mapper/BonusMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;->bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$CurrentSocialBonuse;)Lcom/ibotta/api/model/BonusModel;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;->bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$CurrentSocialBonuse;->fragments()Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$CurrentSocialBonuse$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$CurrentSocialBonuse$Fragments;->bonusFragment()Lcom/ibotta/android/graphql/fragment/BonusFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->map(Lcom/ibotta/android/graphql/fragment/BonusFragment;)Lcom/ibotta/api/model/content/BonusContent;

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
            "Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-static {}, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery;->builder()Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/current_social_bonuses"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "bonuses"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 30
    const-class v0, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/CurrentSocialBonusesGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLResponse;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLResponse;-><init>()V

    .line 53
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/bonus/-$$Lambda$_lBiLTTQ2mt8uidN9r5M_G_XRF0;->INSTANCE:Lcom/ibotta/android/graphql/bonus/-$$Lambda$_lBiLTTQ2mt8uidN9r5M_G_XRF0;

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;->getListSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/graphql/bonus/-$$Lambda$CurrentSocialBonusesGraphQLCall$-A5NosP31DdDFcc8U45YfVzgoeQ;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/bonus/-$$Lambda$CurrentSocialBonusesGraphQLCall$-A5NosP31DdDFcc8U45YfVzgoeQ;-><init>(Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;)V

    .line 52
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;->translateList(Ljava/util/List;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLResponse;->setBonuses(Ljava/util/List;)V

    return-object v0
.end method
