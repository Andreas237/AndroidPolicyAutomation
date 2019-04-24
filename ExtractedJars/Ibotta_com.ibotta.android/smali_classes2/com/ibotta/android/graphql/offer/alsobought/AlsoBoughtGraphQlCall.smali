.class public Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "AlsoBoughtGraphQlCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;",
        "Lcom/ibotta/android/graphql/AlsoBoughtQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private limit:Ljava/lang/Integer;

.field private final limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

.field private offerId:Ljava/lang/Integer;

.field private final offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;

.field private retailerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 23
    sget-object p1, Lcom/ibotta/android/graphql/type/LimitStrategy;->Even:Lcom/ibotta/android/graphql/type/LimitStrategy;

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    const/4 p1, -0x1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->offerId:Ljava/lang/Integer;

    const p1, 0x7fffffff

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->limit:Ljava/lang/Integer;

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 32
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought;)Lcom/ibotta/api/model/content/OfferContent;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought;->fragments()Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferFragment;)Lcom/ibotta/api/model/content/OfferContent;

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
            "Lcom/ibotta/android/graphql/AlsoBoughtQuery$Data;",
            ">;"
        }
    .end annotation

    .line 67
    invoke-static {}, Lcom/ibotta/android/graphql/AlsoBoughtQuery;->builder()Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;

    move-result-object v0

    .line 69
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->offerId:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;->id(Ljava/lang/String;)Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;

    .line 70
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->limit:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;->limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;

    .line 71
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;->limitStrategy(Lcom/ibotta/android/graphql/type/LimitStrategy;)Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;

    .line 72
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;

    .line 73
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;

    .line 75
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 76
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;->retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;

    .line 79
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/AlsoBoughtQuery$Builder;->build()Lcom/ibotta/android/graphql/AlsoBoughtQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/also_bought"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->offerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->limit:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/type/LimitStrategy;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    :cond_0
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLimit()Ljava/lang/Integer;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public getOfferId()Ljava/lang/Integer;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->offerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "alsoBought"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 57
    const-class v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/AlsoBoughtQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;"
        }
    .end annotation

    .line 89
    new-instance v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;-><init>()V

    .line 92
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/offer/alsobought/-$$Lambda$zuFPJK0f1Jsft8JK7rNnr60OGzo;->INSTANCE:Lcom/ibotta/android/graphql/offer/alsobought/-$$Lambda$zuFPJK0f1Jsft8JK7rNnr60OGzo;

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->getListSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/graphql/offer/alsobought/-$$Lambda$AlsoBoughtGraphQlCall$o7dhr6iIImmZW1eZJ_iCzXeLHmU;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/offer/alsobought/-$$Lambda$AlsoBoughtGraphQlCall$o7dhr6iIImmZW1eZJ_iCzXeLHmU;-><init>(Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;)V

    .line 91
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->translateList(Ljava/util/List;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->setOffers(Ljava/util/List;)V

    return-object v0
.end method

.method public setLimit(Ljava/lang/Integer;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->limit:Ljava/lang/Integer;

    return-void
.end method

.method public setOfferId(Ljava/lang/Integer;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->offerId:Ljava/lang/Integer;

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;->retailerId:Ljava/lang/Integer;

    return-void
.end method
