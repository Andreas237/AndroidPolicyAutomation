.class public Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "BonusesGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;",
        "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private availableLimit:Ljava/lang/Integer;

.field private final bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

.field private completedLimit:Ljava/lang/Integer;

.field private featuredLimit:Ljava/lang/Integer;

.field private retailerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 1

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    const p1, 0x7fffffff

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->availableLimit:Ljava/lang/Integer;

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->completedLimit:Ljava/lang/Integer;

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->featuredLimit:Ljava/lang/Integer;

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 31
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getBonusMapper()Lcom/ibotta/android/graphql/mapper/BonusMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;Lcom/ibotta/android/graphql/BonusesGraphQLQuery$AvailableBonuse;)Lcom/ibotta/api/model/BonusModel;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$AvailableBonuse;->fragments()Lcom/ibotta/android/graphql/BonusesGraphQLQuery$AvailableBonuse$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$AvailableBonuse$Fragments;->bonusFragment()Lcom/ibotta/android/graphql/fragment/BonusFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->map(Lcom/ibotta/android/graphql/fragment/BonusFragment;)Lcom/ibotta/api/model/content/BonusContent;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$mapResponse$1(Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse;)Lcom/ibotta/api/model/BonusModel;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse;->fragments()Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse$Fragments;->bonusFragment()Lcom/ibotta/android/graphql/fragment/BonusFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->map(Lcom/ibotta/android/graphql/fragment/BonusFragment;)Lcom/ibotta/api/model/content/BonusContent;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$mapResponse$2(Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content;)Lcom/ibotta/api/model/BonusModel;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content;->fragments()Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->bonusFragment()Lcom/ibotta/android/graphql/fragment/BonusFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/BonusMapper;->map(Lcom/ibotta/android/graphql/fragment/BonusFragment;)Lcom/ibotta/api/model/content/BonusContent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 78
    invoke-static {}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery;->builder()Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;

    move-result-object v0

    .line 80
    iget-object v1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 81
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->retailerId(Ljava/lang/String;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;

    .line 83
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->availableLimit:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 84
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->availableLimit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;

    .line 86
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->completedLimit:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 87
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->completedLimit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;

    .line 89
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->featuredLimit:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    .line 90
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->featuredLimit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;

    .line 93
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/BonusesGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/bonuses"

    return-object v0
.end method

.method public getAvailableLimit()Ljava/lang/Integer;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->availableLimit:Ljava/lang/Integer;

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    iget-object v1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    iget-object v1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->availableLimit:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    iget-object v1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->completedLimit:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    iget-object v1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->featuredLimit:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCompletedLimit()Ljava/lang/Integer;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->completedLimit:Ljava/lang/Integer;

    return-object v0
.end method

.method public getFeaturedLimit()Ljava/lang/Integer;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->featuredLimit:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "bonuses"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 68
    const-class v0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 19
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;"
        }
    .end annotation

    .line 103
    new-instance v0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;-><init>()V

    .line 105
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 107
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/graphql/bonus/-$$Lambda$geLkVhGKp3-fXuoVJyZDhvVP5RE;->INSTANCE:Lcom/ibotta/android/graphql/bonus/-$$Lambda$geLkVhGKp3-fXuoVJyZDhvVP5RE;

    invoke-virtual {p0, v1, v2}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->getListSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/graphql/bonus/-$$Lambda$BonusesGraphQLCall$iqGBcFXlScIhqus2rrbkqw9Q0KE;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/bonus/-$$Lambda$BonusesGraphQLCall$iqGBcFXlScIhqus2rrbkqw9Q0KE;-><init>(Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;)V

    .line 106
    invoke-virtual {p0, v1, v2}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->translateList(Ljava/util/List;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->setAvailableBonuses(Ljava/util/List;)V

    .line 111
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/graphql/bonus/-$$Lambda$r-VnKlSOKhuL5F3VG9Q26tq3PZQ;->INSTANCE:Lcom/ibotta/android/graphql/bonus/-$$Lambda$r-VnKlSOKhuL5F3VG9Q26tq3PZQ;

    invoke-virtual {p0, v1, v2}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->getListSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/graphql/bonus/-$$Lambda$BonusesGraphQLCall$t4I1kWanp1pcAv7sP5XJtQrSaFQ;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/bonus/-$$Lambda$BonusesGraphQLCall$t4I1kWanp1pcAv7sP5XJtQrSaFQ;-><init>(Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;)V

    .line 110
    invoke-virtual {p0, v1, v2}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->translateList(Ljava/util/List;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->setCompletedBonuses(Ljava/util/List;)V

    .line 115
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Data;->featuredBonusesModule()Lcom/ibotta/android/graphql/BonusesGraphQLQuery$FeaturedBonusesModule;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/bonus/-$$Lambda$d3jq5I_j5sIg7XM6MH7OkuAlARw;->INSTANCE:Lcom/ibotta/android/graphql/bonus/-$$Lambda$d3jq5I_j5sIg7XM6MH7OkuAlARw;

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->getListSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/graphql/bonus/-$$Lambda$BonusesGraphQLCall$W7kjxWuoHFjNUvSWzdmyIKvrv0Q;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/bonus/-$$Lambda$BonusesGraphQLCall$W7kjxWuoHFjNUvSWzdmyIKvrv0Q;-><init>(Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;)V

    .line 114
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->translateList(Ljava/util/List;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->setFeaturedBonuses(Ljava/util/List;)V

    :cond_0
    return-object v0
.end method

.method public setAvailableLimit(Ljava/lang/Integer;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->availableLimit:Ljava/lang/Integer;

    return-void
.end method

.method public setCompletedLimit(Ljava/lang/Integer;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->completedLimit:Ljava/lang/Integer;

    return-void
.end method

.method public setFeaturedLimit(Ljava/lang/Integer;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->featuredLimit:Ljava/lang/Integer;

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->retailerId:Ljava/lang/Integer;

    return-void
.end method
