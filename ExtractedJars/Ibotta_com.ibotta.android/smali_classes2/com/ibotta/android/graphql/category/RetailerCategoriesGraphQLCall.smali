.class public Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "RetailerCategoriesGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;",
        "Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;",
        ">;"
    }
.end annotation


# static fields
.field private static final CATEGORY_RETAILERS_LIMIT:J = 0x1L

.field private static final INCLUDE_FULL_RESPONSE:Z = false


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final customerId:Ljava/lang/Integer;

.field private final customerNodeMapper:Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

.field private final retailerCategoryNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Ljava/lang/Integer;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 38
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getCustomerNodeMapper()Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;->customerNodeMapper:Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    .line 39
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getRetailerCategoryNodeMapper()Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;->retailerCategoryNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;

    .line 40
    iput-object p4, p0, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;->customerId:Ljava/lang/Integer;

    return-void
.end method

.method static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;)Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;
    .locals 0

    .line 50
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;->fragments()Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode$Fragments;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode$Fragments;->customerNodeFragment()Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$mapResponse$1(Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;Lcom/ibotta/android/graphql/RetailerCategoriesQuery$RetailerCategoryNode;)Lcom/ibotta/api/model/content/RetailerCategoryNode;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;->retailerCategoryNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;

    .line 62
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$RetailerCategoryNode;->fragments()Lcom/ibotta/android/graphql/RetailerCategoriesQuery$RetailerCategoryNode$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$RetailerCategoryNode$Fragments;->retailerCategoryNodeFragment()Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;)Lcom/ibotta/api/model/content/RetailerCategoryNode;

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
            "Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;",
            ">;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 71
    invoke-static {}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery;->builder()Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;->customerId:Ljava/lang/Integer;

    .line 72
    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Builder;->customerId(Ljava/lang/String;)Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Builder;

    move-result-object v1

    .line 73
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Builder;->build()Lcom/ibotta/android/graphql/RetailerCategoriesQuery;

    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/RetailerCategories"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 3

    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;->customerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-wide/16 v1, 0x1

    .line 98
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 100
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "retailerCategoryNodes"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;",
            ">;"
        }
    .end annotation

    .line 83
    const-class v0, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;"
        }
    .end annotation

    .line 45
    invoke-static {}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;->builder()Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;

    move-result-object v0

    .line 47
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;

    .line 49
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->customerNode()Lcom/ibotta/android/graphql/RetailerCategoriesQuery$CustomerNode;

    move-result-object v1

    invoke-static {v1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/graphql/category/-$$Lambda$RetailerCategoriesGraphQLCall$jnEms-i6pTbc3-4-uXXXnrvCuYk;->INSTANCE:Lcom/ibotta/android/graphql/category/-$$Lambda$RetailerCategoriesGraphQLCall$jnEms-i6pTbc3-4-uXXXnrvCuYk;

    .line 50
    invoke-virtual {v1, v2}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;

    .line 52
    iget-object v2, p0, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;->customerNodeMapper:Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;)Lcom/ibotta/api/model/content/CustomerNode;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 54
    invoke-virtual {v1}, Lcom/ibotta/api/model/content/CustomerNode;->getFavoriteRetailers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;->favoriteRetailers(Ljava/util/List;)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;

    .line 58
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/RetailerCategoriesQuery$Data;->retailerCategoryNodes()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 60
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/graphql/category/-$$Lambda$RetailerCategoriesGraphQLCall$1TljhNbVvmmEEN2RxPjaF7aBNkA;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/category/-$$Lambda$RetailerCategoriesGraphQLCall$1TljhNbVvmmEEN2RxPjaF7aBNkA;-><init>(Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;)V

    .line 61
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 63
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 60
    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;->retailerCategoryNodes(Ljava/util/List;)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;

    .line 65
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;->build()Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    move-result-object p1

    return-object p1
.end method
