.class public Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "OfferGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;",
        "Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private ignoreTargeting:Ljava/lang/Boolean;

.field private final mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

.field private offerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 28
    iput-object p3, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    return-void
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 59
    invoke-static {}, Lcom/ibotta/android/graphql/OfferGraphQLQuery;->builder()Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;

    move-result-object v0

    .line 61
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->offerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 62
    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->offerId(Ljava/lang/String;)Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;

    .line 64
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->ignoreTargeting:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    .line 65
    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->ignoreTargeting(Ljava/lang/Boolean;)Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;

    .line 68
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;

    .line 69
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;

    .line 71
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/OfferGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/offer"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->offerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->ignoreTargeting:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIgnoreTargeting()Ljava/lang/Boolean;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->ignoreTargeting:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getOfferId()Ljava/lang/Integer;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->offerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "offer"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 49
    const-class v0, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;"
        }
    .end annotation

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-result-object v0

    .line 83
    new-instance v1, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;

    invoke-direct {v1}, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;-><init>()V

    .line 84
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Data;->offer()Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer;->fragments()Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/OfferGraphQLQuery$Offer$Fragments;->offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferFragment;)Lcom/ibotta/api/model/content/OfferContent;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;->setOffer(Lcom/ibotta/api/model/content/OfferContent;)V

    return-object v1
.end method

.method public setIgnoreTargeting(Ljava/lang/Boolean;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->ignoreTargeting:Ljava/lang/Boolean;

    return-void
.end method

.method public setOfferId(Ljava/lang/Integer;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->offerId:Ljava/lang/Integer;

    return-void
.end method
