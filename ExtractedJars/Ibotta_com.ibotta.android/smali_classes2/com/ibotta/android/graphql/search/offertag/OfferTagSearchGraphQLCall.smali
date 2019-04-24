.class public Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "OfferTagSearchGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;",
        "Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

.field private final tagName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Ljava/lang/String;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 38
    iput-object p3, p0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    .line 39
    iput-object p4, p0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->tagName:Ljava/lang/String;

    return-void
.end method

.method static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/OfferTagSearchQuery$Offer;)Z
    .locals 0

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Offer;->__typename()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/android/graphql/mapper/Mappers;->isOfferType(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic lambda$mapResponse$1(Lcom/ibotta/android/graphql/OfferTagSearchQuery$Offer;)Lcom/ibotta/android/graphql/fragment/OfferFragment;
    .locals 0

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Offer;->fragments()Lcom/ibotta/android/graphql/OfferTagSearchQuery$Offer$Fragments;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Offer$Fragments;->offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data;",
            ">;"
        }
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-static {}, Lcom/ibotta/android/graphql/OfferTagSearchQuery;->builder()Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->tagName:Ljava/lang/String;

    .line 68
    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;->name(Ljava/lang/String;)Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->products:Ljava/lang/Boolean;

    .line 69
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    .line 70
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;

    move-result-object v1

    .line 71
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Builder;->build()Lcom/ibotta/android/graphql/OfferTagSearchQuery;

    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "local/graphql/OfferTagSearch"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->tagName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "offerTag"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;",
            ">;"
        }
    .end annotation

    .line 81
    const-class v0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;"
        }
    .end annotation

    .line 48
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Data;

    .line 47
    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/offertag/-$$Lambda$qPmhgzpBs5rDuILgZHC7lclAXH8;->INSTANCE:Lcom/ibotta/android/graphql/search/offertag/-$$Lambda$qPmhgzpBs5rDuILgZHC7lclAXH8;

    .line 49
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/offertag/-$$Lambda$7zYDr9hjesyQjHwjyv3plBUZMhw;->INSTANCE:Lcom/ibotta/android/graphql/search/offertag/-$$Lambda$7zYDr9hjesyQjHwjyv3plBUZMhw;

    .line 50
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    .line 51
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    .line 45
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/offertag/-$$Lambda$OfferTagSearchGraphQLCall$DiROwRNLuFe_xSOlwsiWmDz0HhM;->INSTANCE:Lcom/ibotta/android/graphql/search/offertag/-$$Lambda$OfferTagSearchGraphQLCall$DiROwRNLuFe_xSOlwsiWmDz0HhM;

    .line 53
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/offertag/-$$Lambda$OfferTagSearchGraphQLCall$7OPc7HaK9SpD2Ctde12uMpVHDY4;->INSTANCE:Lcom/ibotta/android/graphql/search/offertag/-$$Lambda$OfferTagSearchGraphQLCall$7OPc7HaK9SpD2Ctde12uMpVHDY4;

    .line 55
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    .line 57
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/graphql/search/offertag/-$$Lambda$8kuRXOCsTJo-VpYFk8kdtFulXlw;

    invoke-direct {v1, v0}, Lcom/ibotta/android/graphql/search/offertag/-$$Lambda$8kuRXOCsTJo-VpYFk8kdtFulXlw;-><init>(Lcom/ibotta/android/graphql/mapper/OfferMapper;)V

    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 59
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;->tagName:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;->create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;

    move-result-object p1

    return-object p1
.end method
