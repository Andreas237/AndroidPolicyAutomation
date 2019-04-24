.class public Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "BonusGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/bonus/BonusGraphQLResponse;",
        "Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final bonusId:I

.field private final bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 26
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getBonusMapper()Lcom/ibotta/android/graphql/mapper/BonusMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;->bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

    .line 27
    iput p4, p0, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;->bonusId:I

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus;)Lcom/ibotta/api/model/content/BonusContent;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;->bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus;->fragments()Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus$Fragments;->bonusFragment()Lcom/ibotta/android/graphql/fragment/BonusFragment;

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
            "Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 46
    invoke-static {}, Lcom/ibotta/android/graphql/BonusGraphQLQuery;->builder()Lcom/ibotta/android/graphql/BonusGraphQLQuery$Builder;

    move-result-object v0

    .line 48
    iget v1, p0, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;->bonusId:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Builder;->id(Ljava/lang/String;)Lcom/ibotta/android/graphql/BonusGraphQLQuery$Builder;

    .line 50
    iget-object v1, p0, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/BonusGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/bonus"

    return-object v0
.end method

.method public getBonusId()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;->bonusId:I

    return v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    iget v1, p0, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;->bonusId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "bonus"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 36
    const-class v0, Lcom/ibotta/android/graphql/bonus/BonusGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/bonus/BonusGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/bonus/BonusGraphQLResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/BonusGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/bonus/BonusGraphQLResponse;"
        }
    .end annotation

    .line 60
    new-instance v0, Lcom/ibotta/android/graphql/bonus/BonusGraphQLResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/bonus/BonusGraphQLResponse;-><init>()V

    .line 63
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/bonus/-$$Lambda$VtEporrhaKqUSGnwrBsR7PjkKo0;->INSTANCE:Lcom/ibotta/android/graphql/bonus/-$$Lambda$VtEporrhaKqUSGnwrBsR7PjkKo0;

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;->getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus;

    new-instance v1, Lcom/ibotta/android/graphql/bonus/-$$Lambda$BonusGraphQLCall$Z8Ak4V8iFhTuZCfXScPXjLTtoIs;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/bonus/-$$Lambda$BonusGraphQLCall$Z8Ak4V8iFhTuZCfXScPXjLTtoIs;-><init>(Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;)V

    .line 62
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;->getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/BonusModel;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/bonus/BonusGraphQLResponse;->setBonus(Lcom/ibotta/api/model/BonusModel;)V

    return-object v0
.end method
