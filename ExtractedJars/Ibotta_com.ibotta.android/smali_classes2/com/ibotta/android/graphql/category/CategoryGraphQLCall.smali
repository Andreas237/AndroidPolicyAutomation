.class public Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "CategoryGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;",
        "Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private categoryId:Ljava/lang/Integer;

.field private contentMax:Ljava/lang/Integer;

.field private final offerCategoryMapper:Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 28
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferCategoryMapper()Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->offerCategoryMapper:Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;)Lcom/ibotta/api/model/content/OfferCategoryContent;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->offerCategoryMapper:Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;->fragments()Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category$Fragments;->categoryFragment()Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;->map(Lcom/ibotta/android/graphql/fragment/CategoryFragment;)Lcom/ibotta/api/model/content/OfferCategoryContent;

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
            "Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 59
    invoke-static {}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery;->builder()Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;

    move-result-object v0

    .line 61
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->categoryId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 62
    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->categoryId(Ljava/lang/String;)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;

    .line 65
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->contentMax:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 66
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->contentMax(Ljava/lang/Long;)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;

    .line 69
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;

    .line 70
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;

    .line 72
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/CategoryGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/category"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->categoryId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->contentMax:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCategoryId()Ljava/lang/Integer;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->categoryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getContentMax()Ljava/lang/Integer;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->contentMax:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "category"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 49
    const-class v0, Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;"
        }
    .end annotation

    .line 82
    new-instance v0, Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;-><init>()V

    .line 85
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/category/-$$Lambda$5Uw_K3TFnopmoUyEe2KP9eFH-P0;->INSTANCE:Lcom/ibotta/android/graphql/category/-$$Lambda$5Uw_K3TFnopmoUyEe2KP9eFH-P0;

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/CategoryGraphQLQuery$Category;

    new-instance v1, Lcom/ibotta/android/graphql/category/-$$Lambda$CategoryGraphQLCall$oTmvl9jmSQMM3ERYAiJDh8u5abo;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/category/-$$Lambda$CategoryGraphQLCall$oTmvl9jmSQMM3ERYAiJDh8u5abo;-><init>(Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;)V

    .line 84
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/content/OfferCategoryContent;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;->setCategory(Lcom/ibotta/api/model/content/OfferCategoryContent;)V

    return-object v0
.end method

.method public setCategoryId(Ljava/lang/Integer;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->categoryId:Ljava/lang/Integer;

    return-void
.end method

.method public setContentMax(Ljava/lang/Integer;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->contentMax:Ljava/lang/Integer;

    return-void
.end method
