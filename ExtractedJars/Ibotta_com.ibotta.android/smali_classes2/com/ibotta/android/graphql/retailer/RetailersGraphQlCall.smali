.class public Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "RetailersGraphQlCall.java"

# interfaces
.implements Lcom/ibotta/api/call/location/LocationCall;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;",
        "Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Data;",
        ">;",
        "Lcom/ibotta/api/call/location/LocationCall;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private nearLat:D

.field private nearLong:D

.field private nearZip:Ljava/lang/String;

.field private final params:Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;

.field private final retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    const-string p1, ""

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->nearZip:Ljava/lang/String;

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 38
    iput-object p3, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    .line 39
    iput-object p4, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->params:Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;

    return-void
.end method

.method static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Retailer;)Lcom/ibotta/android/graphql/fragment/RetailerFragment;
    .locals 0

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Retailer;->fragments()Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Retailer$Fragments;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Retailer$Fragments;->retailerFragment()Lcom/ibotta/android/graphql/fragment/RetailerFragment;

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
            "Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-static {}, Lcom/ibotta/android/graphql/RetailersGraphQLQuery;->builder()Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->params:Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;

    .line 65
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;->getRetailerIds()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;->retailerIds(Ljava/util/List;)Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->params:Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;

    .line 66
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;->isNearbyOnly()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;->nearbyOnly(Ljava/lang/Boolean;)Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;

    move-result-object v1

    .line 67
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/RetailersGraphQLQuery;

    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/retailers"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 3

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    iget-wide v1, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->nearLat:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 91
    iget-wide v1, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->nearLong:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 92
    iget-object v1, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->nearZip:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNearLat()Ljava/lang/Double;
    .locals 2

    .line 116
    iget-wide v0, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->nearLat:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public getNearLong()Ljava/lang/Double;
    .locals 2

    .line 121
    iget-wide v0, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->nearLong:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public getNearZip()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->nearZip:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "retailers"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;",
            ">;"
        }
    .end annotation

    .line 77
    const-class v0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;"
        }
    .end annotation

    .line 46
    new-instance v0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;-><init>()V

    .line 48
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    return-object v0

    .line 52
    :cond_0
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/RetailersGraphQLQuery$Data;->retailers()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/util/AppHelper$-CC;->getStreamOf(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/retailer/-$$Lambda$RetailersGraphQlCall$4dDcTbISrA9z6VM_RWcihS5Wx_o;->INSTANCE:Lcom/ibotta/android/graphql/retailer/-$$Lambda$RetailersGraphQlCall$4dDcTbISrA9z6VM_RWcihS5Wx_o;

    .line 53
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    iget-object v1, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/graphql/retailer/-$$Lambda$u78HpCbPJm_n1Mg0jwky9lKtQ8I;

    invoke-direct {v2, v1}, Lcom/ibotta/android/graphql/retailer/-$$Lambda$u78HpCbPJm_n1Mg0jwky9lKtQ8I;-><init>(Lcom/ibotta/android/graphql/mapper/RetailerMapper;)V

    .line 54
    invoke-interface {p1, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 55
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 57
    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;->addRetailers(Ljava/util/Collection;)V

    return-object v0
.end method

.method public setNearLat(Ljava/lang/Double;)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 101
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->nearLat:D

    return-void
.end method

.method public setNearLong(Ljava/lang/Double;)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 106
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->nearLong:D

    return-void
.end method

.method public setNearZip(Ljava/lang/String;)V
    .locals 1

    const-string v0, ""

    .line 111
    invoke-static {p1, v0}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;->nearZip:Ljava/lang/String;

    return-void
.end method
