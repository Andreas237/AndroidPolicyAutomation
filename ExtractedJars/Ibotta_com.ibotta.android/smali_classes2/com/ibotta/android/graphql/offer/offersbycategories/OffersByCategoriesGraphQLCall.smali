.class public Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "OffersByCategoriesGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLResponse;",
        "Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private categoryLimit:Ljava/lang/Integer;

.field private contentMax:Ljava/lang/Integer;

.field private final mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

.field private retailerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    const p1, 0x7fffffff

    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->categoryLimit:Ljava/lang/Integer;

    .line 31
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 36
    iput-object p3, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    return-void
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 75
    invoke-static {}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery;->builder()Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Builder;

    move-result-object v0

    .line 77
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 78
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Builder;->retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Builder;

    .line 81
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->categoryLimit:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 82
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Builder;->categoryLimit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Builder;

    .line 85
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 86
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Builder;->contentMax(Ljava/lang/Long;)Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Builder;

    .line 89
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Builder;

    .line 90
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Builder;

    .line 92
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/offers_by_categories"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->categoryLimit:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCategoryLimit()Ljava/lang/Integer;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->categoryLimit:Ljava/lang/Integer;

    return-object v0
.end method

.method public getContentMax()Ljava/lang/Integer;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "offerCategories"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 65
    const-class v0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLResponse;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLResponse;"
        }
    .end annotation

    .line 102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 104
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferCategoryMapper()Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    move-result-object v1

    .line 106
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$Data;->offerCategories()Ljava/util/List;

    move-result-object p1

    .line 107
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory;

    .line 108
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory;->fragments()Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/OffersByCategoryGraphQLQuery$OfferCategory$Fragments;->categoryFragment()Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;->map(Lcom/ibotta/android/graphql/fragment/CategoryFragment;)Lcom/ibotta/api/model/content/OfferCategoryContent;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 111
    :cond_0
    new-instance p1, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLResponse;

    invoke-direct {p1}, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLResponse;-><init>()V

    .line 112
    invoke-virtual {p1, v0}, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLResponse;->setOfferCategoryContents(Ljava/util/List;)V

    return-object p1
.end method

.method public setCategoryLimit(Ljava/lang/Integer;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->categoryLimit:Ljava/lang/Integer;

    return-void
.end method

.method public setContentMax(Ljava/lang/Integer;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;->retailerId:Ljava/lang/Integer;

    return-void
.end method
