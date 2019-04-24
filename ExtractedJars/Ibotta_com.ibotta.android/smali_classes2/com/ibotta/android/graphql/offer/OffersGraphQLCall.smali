.class public Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "OffersGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;",
        "Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private limit:Ljava/lang/Integer;

.field private final mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

.field private offerIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private retailerIds:Ljava/util/Set;
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

    .line 35
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 30
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->retailerIds:Ljava/util/Set;

    .line 31
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->offerIds:Ljava/util/Set;

    const p1, 0x7fffffff

    .line 32
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->limit:Ljava/lang/Integer;

    .line 36
    iput-object p2, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 37
    iput-object p3, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    return-void
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 94
    invoke-static {}, Lcom/ibotta/android/graphql/OffersGraphQLQuery;->builder()Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;

    move-result-object v0

    .line 96
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->retailerIds:Ljava/util/Set;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 97
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->retailerIds:Ljava/util/Set;

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->asLongList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->retailerIds(Ljava/util/List;)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;

    .line 100
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->offerIds:Ljava/util/Set;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 101
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->offerIds:Ljava/util/Set;

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->asLongList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->offerIds(Ljava/util/List;)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;

    .line 104
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->limit:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 105
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;

    .line 108
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;

    .line 109
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;

    .line 111
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/OffersGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/offers_by_retailer_ids"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 3

    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->retailerIds:Ljava/util/Set;

    if-eqz v1, :cond_0

    .line 143
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 144
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 148
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->offerIds:Ljava/util/Set;

    if-eqz v1, :cond_1

    .line 149
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 150
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 154
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->limit:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 156
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 158
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLimit()Ljava/lang/Integer;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public getOfferIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->offerIds:Ljava/util/Set;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "offers"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 84
    const-class v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    return-object v0
.end method

.method public getRetailerIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->retailerIds:Ljava/util/Set;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 26
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;"
        }
    .end annotation

    .line 121
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 123
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-result-object v1

    .line 125
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Data;->offers()Ljava/util/List;

    move-result-object p1

    .line 126
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Offer;

    .line 127
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Offer;->fragments()Lcom/ibotta/android/graphql/OffersGraphQLQuery$Offer$Fragments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/OffersGraphQLQuery$Offer$Fragments;->offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferFragment;)Lcom/ibotta/api/model/content/OfferContent;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 130
    :cond_0
    new-instance p1, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    invoke-direct {p1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;-><init>()V

    .line 131
    invoke-virtual {p1, v0}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->setOffers(Ljava/util/List;)V

    return-object p1
.end method

.method public setLimit(Ljava/lang/Integer;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->limit:Ljava/lang/Integer;

    return-void
.end method

.method public setOfferIds(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->offerIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->offerIds:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public setOfferIds([Ljava/lang/Integer;)V
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->offerIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    if-eqz p1, :cond_0

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->offerIds:Ljava/util/Set;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method

.method public setRetailerIds(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->retailerIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->retailerIds:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public setRetailerIds([Ljava/lang/Integer;)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->retailerIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    if-eqz p1, :cond_0

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->retailerIds:Ljava/util/Set;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method
