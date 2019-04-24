.class public Lcom/ibotta/android/graphql/product/ProductGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "ProductGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;",
        "Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

.field private productId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    return-void
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 53
    invoke-static {}, Lcom/ibotta/android/graphql/ProductGraphQLQuery;->builder()Lcom/ibotta/android/graphql/ProductGraphQLQuery$Builder;

    move-result-object v0

    .line 55
    iget-object v1, p0, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;->productId:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 56
    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Builder;->productId(Ljava/lang/String;)Lcom/ibotta/android/graphql/ProductGraphQLQuery$Builder;

    .line 59
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/ProductGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/product"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDirectives()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 69
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "product"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 43
    const-class v0, Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/mapper/Mappers;->getProductMapper()Lcom/ibotta/android/graphql/mapper/ProductMapper;

    move-result-object v0

    .line 76
    new-instance v1, Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;

    invoke-direct {v1}, Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;-><init>()V

    .line 77
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Data;->product()Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product;->fragments()Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/ProductGraphQLQuery$Product$Fragments;->productFragment()Lcom/ibotta/android/graphql/fragment/ProductFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/ProductMapper;->map(Lcom/ibotta/android/graphql/fragment/ProductFragment;)Lcom/ibotta/api/model/content/ProductContent;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;->setProduct(Lcom/ibotta/api/model/content/ProductContent;)V

    return-object v1
.end method

.method public setProductId(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;->productId:Ljava/lang/String;

    return-void
.end method
