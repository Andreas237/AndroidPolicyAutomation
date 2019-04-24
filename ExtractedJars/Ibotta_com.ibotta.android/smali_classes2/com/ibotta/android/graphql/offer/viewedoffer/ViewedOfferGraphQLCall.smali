.class public Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "ViewedOfferGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;",
        "Lcom/ibotta/android/graphql/ViewedOfferMutation$Data;",
        ">;"
    }
.end annotation


# static fields
.field private static final LIMIT_STRATEGY:Lcom/ibotta/android/graphql/type/LimitStrategy;


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private limit:J

.field private final mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

.field private offerGroupId:Ljava/lang/Integer;

.field private offerId:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    sget-object v0, Lcom/ibotta/android/graphql/type/LimitStrategy;->All:Lcom/ibotta/android/graphql/type/LimitStrategy;

    sput-object v0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->LIMIT_STRATEGY:Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 2

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    const-wide/16 v0, 0x15

    .line 29
    iput-wide v0, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->limit:J

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    return-void
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/ViewedOfferMutation$Data;",
            ">;"
        }
    .end annotation

    .line 65
    invoke-static {}, Lcom/ibotta/android/graphql/ViewedOfferMutation;->builder()Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;

    move-result-object v0

    .line 68
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->offerGroupId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 69
    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->offerGroupId(Ljava/lang/String;)Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;

    goto :goto_0

    .line 70
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->offerId:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->offerId(Ljava/lang/String;)Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;

    .line 74
    :cond_1
    :goto_0
    iget-wide v1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->limit:J

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->limit(J)Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;

    .line 75
    sget-object v1, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->LIMIT_STRATEGY:Lcom/ibotta/android/graphql/type/LimitStrategy;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->limitStrategy(Lcom/ibotta/android/graphql/type/LimitStrategy;)Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;

    .line 76
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;

    .line 78
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->build()Lcom/ibotta/android/graphql/ViewedOfferMutation;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->mutate(Lcom/apollographql/apollo/api/Mutation;)Lcom/apollographql/apollo/ApolloMutationCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/viewed_offer"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 3

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->offerGroupId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->offerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    iget-wide v1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->limit:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 116
    sget-object v1, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->LIMIT_STRATEGY:Lcom/ibotta/android/graphql/type/LimitStrategy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOfferId()Ljava/lang/Integer;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->offerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "viewedOffer"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 55
    const-class v0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/ViewedOfferMutation$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferResponse;"
        }
    .end annotation

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 90
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-result-object v1

    .line 92
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 93
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/ViewedOfferMutation$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/ViewedOfferMutation$Data;->viewedOffer()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 95
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 96
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/ViewedOfferMutation$ViewedOffer;

    .line 97
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/ViewedOfferMutation$ViewedOffer;->fragments()Lcom/ibotta/android/graphql/ViewedOfferMutation$ViewedOffer$Fragments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/ViewedOfferMutation$ViewedOffer$Fragments;->offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferFragment;)Lcom/ibotta/api/model/content/OfferContent;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 102
    :cond_0
    new-instance p1, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferResponse;

    invoke-direct {p1}, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferResponse;-><init>()V

    .line 103
    invoke-virtual {p1, v0}, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferResponse;->setOffers(Ljava/util/List;)V

    return-object p1
.end method

.method public setLimit(J)V
    .locals 0

    .line 50
    iput-wide p1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->limit:J

    return-void
.end method

.method public setOfferGroupId(Ljava/lang/Integer;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->offerGroupId:Ljava/lang/Integer;

    return-void
.end method

.method public setOfferId(I)V
    .locals 0

    .line 42
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->offerId:Ljava/lang/Integer;

    return-void
.end method
