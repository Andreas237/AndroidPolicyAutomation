.class public Lcom/ibotta/android/graphql/deal/DealGraphQlCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "DealGraphQlCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/deal/DealGraphQlResponse;",
        "Lcom/ibotta/android/graphql/DealGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final dealId:Ljava/lang/String;

.field private final dealMapper:Lcom/ibotta/android/graphql/mapper/DealMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Ljava/lang/String;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 24
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getDealMapper()Lcom/ibotta/android/graphql/mapper/DealMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;->dealMapper:Lcom/ibotta/android/graphql/mapper/DealMapper;

    .line 25
    iput-object p4, p0, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;->dealId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/deal/DealGraphQlCall;Lcom/ibotta/android/graphql/DealGraphQLQuery$Deal;)Lcom/ibotta/api/model/content/DealContent;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;->dealMapper:Lcom/ibotta/android/graphql/mapper/DealMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/DealGraphQLQuery$Deal;->fragments()Lcom/ibotta/android/graphql/DealGraphQLQuery$Deal$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/DealGraphQLQuery$Deal$Fragments;->dealFragment()Lcom/ibotta/android/graphql/fragment/DealFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/DealMapper;->map(Lcom/ibotta/android/graphql/fragment/DealFragment;)Lcom/ibotta/api/model/content/DealContent;

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
            "Lcom/ibotta/android/graphql/DealGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 44
    invoke-static {}, Lcom/ibotta/android/graphql/DealGraphQLQuery;->builder()Lcom/ibotta/android/graphql/DealGraphQLQuery$Builder;

    move-result-object v0

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;->getDealId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/DealGraphQLQuery$Builder;->id(Ljava/lang/String;)Lcom/ibotta/android/graphql/DealGraphQLQuery$Builder;

    .line 48
    iget-object v1, p0, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/DealGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/DealGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/deal"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    iget-object v1, p0, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;->dealId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDealId()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;->dealId:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "deal"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/graphql/deal/DealGraphQlResponse;",
            ">;"
        }
    .end annotation

    .line 34
    const-class v0, Lcom/ibotta/android/graphql/deal/DealGraphQlResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/deal/DealGraphQlResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/deal/DealGraphQlResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/DealGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/deal/DealGraphQlResponse;"
        }
    .end annotation

    .line 59
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/deal/-$$Lambda$0oZRKjdJkEhKOgMiyOoHJtG2yyY;->INSTANCE:Lcom/ibotta/android/graphql/deal/-$$Lambda$0oZRKjdJkEhKOgMiyOoHJtG2yyY;

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;->getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/DealGraphQLQuery$Deal;

    new-instance v0, Lcom/ibotta/android/graphql/deal/-$$Lambda$DealGraphQlCall$iZ8Uj3P0IuOf8_NxI2trSU-xwq8;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/deal/-$$Lambda$DealGraphQlCall$iZ8Uj3P0IuOf8_NxI2trSU-xwq8;-><init>(Lcom/ibotta/android/graphql/deal/DealGraphQlCall;)V

    .line 58
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;->getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/DealModel;

    invoke-static {p1}, Lcom/ibotta/android/graphql/deal/DealGraphQlResponse;->create(Lcom/ibotta/api/model/DealModel;)Lcom/ibotta/android/graphql/deal/DealGraphQlResponse;

    move-result-object p1

    return-object p1
.end method
