.class public Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "UnlockedOffersGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;",
        "Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private limit:Ljava/lang/Integer;

.field private final mappers:Lcom/ibotta/android/graphql/mapper/Mappers;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 32
    iput-object p3, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    return-void
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 55
    invoke-static {}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery;->builder()Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;

    move-result-object v0

    .line 57
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->limit:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 58
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;->limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;

    .line 61
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;

    .line 62
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;

    .line 64
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/unlocked"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->limit:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLimit()Ljava/lang/Integer;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "unlockedOfferPages"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 45
    const-class v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-result-object v0

    .line 75
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Data;->unlockedOfferPages()Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$UnlockedOfferPages;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$UnlockedOfferPages;->content()Ljava/util/List;

    move-result-object p1

    .line 77
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 78
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;

    .line 79
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content;->fragments()Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/UnlockedOffersGraphQLQuery$Content$Fragments;->offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferFragment;)Lcom/ibotta/api/model/content/OfferContent;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 82
    :cond_0
    new-instance p1, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;

    invoke-direct {p1}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;-><init>()V

    .line 83
    invoke-virtual {p1, v1}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;->setOffers(Ljava/util/List;)V

    return-object p1
.end method

.method public setLimit(Ljava/lang/Integer;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->limit:Ljava/lang/Integer;

    return-void
.end method
