.class public Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "RecentlyViewedRetailersGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;",
        "Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data;",
        ">;"
    }
.end annotation


# static fields
.field private static final LIMIT:J = 0x14L

.field private static final LIMIT_STRATEGY:Lcom/ibotta/android/graphql/type/LimitStrategy;


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final mappers:Lcom/ibotta/android/graphql/mapper/Mappers;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    sget-object v0, Lcom/ibotta/android/graphql/type/LimitStrategy;->Even:Lcom/ibotta/android/graphql/type/LimitStrategy;

    sput-object v0, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;->LIMIT_STRATEGY:Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 36
    iput-object p2, p0, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 37
    iput-object p3, p0, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    return-void
.end method

.method static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Retailer;)Z
    .locals 0

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Retailer;->__typename()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/android/graphql/mapper/Mappers;->isRetailerType(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$mapResponse$1(Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;Lcom/ibotta/android/graphql/fragment/RetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/mapper/Mappers;->getRetailerMapper()Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data;",
            ">;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-static {}, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;->builder()Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;

    move-result-object v1

    const-wide/16 v2, 0x14

    .line 59
    invoke-virtual {v1, v2, v3}, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;->limit(J)Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;->LIMIT_STRATEGY:Lcom/ibotta/android/graphql/type/LimitStrategy;

    .line 60
    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;->limitStrategy(Lcom/ibotta/android/graphql/type/LimitStrategy;)Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;

    move-result-object v1

    .line 61
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Builder;->build()Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery;

    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/RecentlyViewedRetailers"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 3

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide/16 v1, 0x14

    .line 84
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 85
    sget-object v1, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;->LIMIT_STRATEGY:Lcom/ibotta/android/graphql/type/LimitStrategy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "views.retailers"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;",
            ">;"
        }
    .end annotation

    .line 71
    const-class v0, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;"
        }
    .end annotation

    .line 43
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/RecentlyViewedRetailersQuery$Data;

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/retailer/-$$Lambda$qmJiqgiGWlnwfJwXtQyqzlg40FA;->INSTANCE:Lcom/ibotta/android/graphql/retailer/-$$Lambda$qmJiqgiGWlnwfJwXtQyqzlg40FA;

    .line 44
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/retailer/-$$Lambda$gzlB3atSpowizXCUT9RMn-CVfvM;->INSTANCE:Lcom/ibotta/android/graphql/retailer/-$$Lambda$gzlB3atSpowizXCUT9RMn-CVfvM;

    .line 45
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    .line 46
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 48
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/retailer/-$$Lambda$RecentlyViewedRetailersGraphQLCall$nwTjxqsvr_xFXEPAB5nPkC0eoOo;->INSTANCE:Lcom/ibotta/android/graphql/retailer/-$$Lambda$RecentlyViewedRetailersGraphQLCall$nwTjxqsvr_xFXEPAB5nPkC0eoOo;

    .line 49
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/retailer/-$$Lambda$e-cP-NJQCK0j8Mr6vkl8w3-3YqU;->INSTANCE:Lcom/ibotta/android/graphql/retailer/-$$Lambda$e-cP-NJQCK0j8Mr6vkl8w3-3YqU;

    .line 50
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/retailer/-$$Lambda$Mm2iluhxGI1e-wtX0GZzzs2FGE4;->INSTANCE:Lcom/ibotta/android/graphql/retailer/-$$Lambda$Mm2iluhxGI1e-wtX0GZzzs2FGE4;

    .line 51
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/graphql/retailer/-$$Lambda$RecentlyViewedRetailersGraphQLCall$zkxxZhCFLCqeAfDF1U6SoJ_vRHk;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/retailer/-$$Lambda$RecentlyViewedRetailersGraphQLCall$zkxxZhCFLCqeAfDF1U6SoJ_vRHk;-><init>(Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;)V

    .line 52
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 53
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 48
    invoke-static {p1}, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;->create(Ljava/util/List;)Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;

    move-result-object p1

    return-object p1
.end method
