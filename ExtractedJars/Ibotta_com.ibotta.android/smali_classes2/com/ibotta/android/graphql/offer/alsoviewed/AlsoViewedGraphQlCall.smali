.class public Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "AlsoViewedGraphQlCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;",
        "Lcom/ibotta/android/graphql/AlsoViewedQuery$Data;",
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

    .line 33
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 23
    sget-object p1, Lcom/ibotta/android/graphql/type/LimitStrategy;->Even:Lcom/ibotta/android/graphql/type/LimitStrategy;

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    const/4 p1, -0x1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->offerId:Ljava/lang/Integer;

    const p1, 0x7fffffff

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->limit:Ljava/lang/Integer;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 35
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;Lcom/ibotta/android/graphql/AlsoViewedQuery$AlsoViewed;)Lcom/ibotta/api/model/content/OfferContent;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/AlsoViewedQuery$AlsoViewed;->fragments()Lcom/ibotta/android/graphql/AlsoViewedQuery$AlsoViewed$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/AlsoViewedQuery$AlsoViewed$Fragments;->offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;

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
            "Lcom/ibotta/android/graphql/AlsoViewedQuery$Data;",
            ">;"
        }
    .end annotation

    .line 70
    invoke-static {}, Lcom/ibotta/android/graphql/AlsoViewedQuery;->builder()Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;

    move-result-object v0

    .line 72
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->offerId:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->id(Ljava/lang/String;)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;

    .line 73
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->limit:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;

    .line 74
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->limitStrategy(Lcom/ibotta/android/graphql/type/LimitStrategy;)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;

    .line 75
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;

    .line 76
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;

    .line 78
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 79
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;

    .line 82
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->build()Lcom/ibotta/android/graphql/AlsoViewedQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/also_viewed"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->offerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->limit:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/type/LimitStrategy;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    :cond_0
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLimit()Ljava/lang/Integer;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public getOfferId()Ljava/lang/Integer;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->offerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "alsoViewed"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 60
    const-class v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/AlsoViewedQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;"
        }
    .end annotation

    .line 92
    new-instance v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;-><init>()V

    .line 95
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/offer/alsoviewed/-$$Lambda$Zdn9vdXh5SoQT7apVQAV_mcczY8;->INSTANCE:Lcom/ibotta/android/graphql/offer/alsoviewed/-$$Lambda$Zdn9vdXh5SoQT7apVQAV_mcczY8;

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->getListSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/graphql/offer/alsoviewed/-$$Lambda$AlsoViewedGraphQlCall$_lhmAO_Y_mn2ialBnaE_bX5Df8A;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/offer/alsoviewed/-$$Lambda$AlsoViewedGraphQlCall$_lhmAO_Y_mn2ialBnaE_bX5Df8A;-><init>(Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;)V

    .line 94
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->translateList(Ljava/util/List;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->setOffers(Ljava/util/List;)V

    return-object v0
.end method

.method public setLimit(Ljava/lang/Integer;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->limit:Ljava/lang/Integer;

    return-void
.end method

.method public setOfferId(Ljava/lang/Integer;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->offerId:Ljava/lang/Integer;

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->retailerId:Ljava/lang/Integer;

    return-void
.end method
