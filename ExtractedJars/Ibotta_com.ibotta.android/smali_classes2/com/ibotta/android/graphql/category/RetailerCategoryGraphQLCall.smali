.class public Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "RetailerCategoryGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;",
        "Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;",
        ">;"
    }
.end annotation


# static fields
.field private static final CATEGORY_RETAILERS_LIMIT:J = 0x3e8L

.field private static final INCLUDE_FULL_RESPONSE:Z = true


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final categoryId:Ljava/lang/Integer;

.field private final customerId:Ljava/lang/Integer;

.field private final customerNodeMapper:Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

.field private final retailerCategoryNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 43
    iput-object p2, p0, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 44
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getCustomerNodeMapper()Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->customerNodeMapper:Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    .line 45
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getRetailerCategoryNodeMapper()Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->retailerCategoryNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;

    .line 46
    iput-object p4, p0, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->customerId:Ljava/lang/Integer;

    .line 47
    iput-object p5, p0, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->categoryId:Ljava/lang/Integer;

    return-void
.end method

.method static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;)Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;
    .locals 0

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;->fragments()Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode$Fragments;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode$Fragments;->customerNodeFragment()Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$mapResponse$1(Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;Lcom/ibotta/android/graphql/RetailerCategoryQuery$RetailerCategoryNode;)Lcom/ibotta/api/model/content/RetailerCategoryNode;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->retailerCategoryNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;

    .line 68
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$RetailerCategoryNode;->fragments()Lcom/ibotta/android/graphql/RetailerCategoryQuery$RetailerCategoryNode$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$RetailerCategoryNode$Fragments;->retailerCategoryNodeFragment()Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerCategoryNodeFragment;)Lcom/ibotta/api/model/content/RetailerCategoryNode;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;",
            ">;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 77
    invoke-static {}, Lcom/ibotta/android/graphql/RetailerCategoryQuery;->builder()Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->customerId:Ljava/lang/Integer;

    .line 78
    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->customerId(Ljava/lang/String;)Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->categoryId:Ljava/lang/Integer;

    .line 79
    invoke-virtual {v3}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->categoryIds(Ljava/util/List;)Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;

    move-result-object v1

    .line 80
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Builder;->build()Lcom/ibotta/android/graphql/RetailerCategoryQuery;

    move-result-object v1

    .line 76
    invoke-virtual {v0, v1}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/RetailerCategory"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 3

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->customerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->categoryId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-wide/16 v1, 0x3e8

    .line 106
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 108
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

    .line 90
    const-class v0, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;"
        }
    .end annotation

    .line 52
    invoke-static {}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;->builder()Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;

    move-result-object v0

    .line 53
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;

    .line 55
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->customerNode()Lcom/ibotta/android/graphql/RetailerCategoryQuery$CustomerNode;

    move-result-object v1

    invoke-static {v1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/graphql/category/-$$Lambda$RetailerCategoryGraphQLCall$qzvuu7CfZh_5IoHsmtxNpQxU40c;->INSTANCE:Lcom/ibotta/android/graphql/category/-$$Lambda$RetailerCategoryGraphQLCall$qzvuu7CfZh_5IoHsmtxNpQxU40c;

    .line 56
    invoke-virtual {v1, v2}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;

    .line 58
    iget-object v2, p0, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;->customerNodeMapper:Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;->map(Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment;)Lcom/ibotta/api/model/content/CustomerNode;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 60
    invoke-virtual {v1}, Lcom/ibotta/api/model/content/CustomerNode;->getFavoriteRetailers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;->favoriteRetailers(Ljava/util/List;)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;

    .line 64
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/RetailerCategoryQuery$Data;->retailerCategoryNodes()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 66
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/graphql/category/-$$Lambda$RetailerCategoryGraphQLCall$IqnPRehMDRYelbDdVQqICOiLcKE;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/category/-$$Lambda$RetailerCategoryGraphQLCall$IqnPRehMDRYelbDdVQqICOiLcKE;-><init>(Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;)V

    .line 67
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 69
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 66
    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;->retailerCategoryNodes(Ljava/util/List;)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;

    .line 71
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;->build()Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    move-result-object p1

    return-object p1
.end method
