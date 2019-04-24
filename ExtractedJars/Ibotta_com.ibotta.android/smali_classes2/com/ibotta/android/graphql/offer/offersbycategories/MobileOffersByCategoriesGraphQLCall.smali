.class public Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "MobileOffersByCategoriesGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLResponse;",
        "Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private categoryLimit:Ljava/lang/Integer;

.field private contentMax:Ljava/lang/Integer;

.field private final offerCategoryMapper:Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

.field private retailerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 1

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    const p1, 0x7fffffff

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->categoryLimit:Ljava/lang/Integer;

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 31
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferCategoryMapper()Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->offerCategoryMapper:Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$MobileOfferCategory;)Lcom/ibotta/api/model/content/OfferCategoryContent;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->offerCategoryMapper:Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$MobileOfferCategory;->fragments()Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$MobileOfferCategory$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$MobileOfferCategory$Fragments;->categoryFragment()Lcom/ibotta/android/graphql/fragment/CategoryFragment;

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
            "Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 70
    invoke-static {}, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery;->builder()Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;

    move-result-object v0

    .line 72
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 73
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;

    .line 76
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->categoryLimit:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 77
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->categoryLimit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;

    .line 80
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 81
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->contentMax(Ljava/lang/Long;)Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;

    .line 84
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/mobile_offers_by_categories"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->categoryLimit:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCategoryLimit()Ljava/lang/Integer;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->categoryLimit:Ljava/lang/Integer;

    return-object v0
.end method

.method public getContentMax()Ljava/lang/Integer;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "mobileOfferCategories"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 60
    const-class v0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLResponse;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLResponse;"
        }
    .end annotation

    .line 96
    new-instance v0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLResponse;-><init>()V

    .line 99
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/offer/offersbycategories/-$$Lambda$bB4BQI89p1_sqJKLBOBY-BZUuiU;->INSTANCE:Lcom/ibotta/android/graphql/offer/offersbycategories/-$$Lambda$bB4BQI89p1_sqJKLBOBY-BZUuiU;

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->getListSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/graphql/offer/offersbycategories/-$$Lambda$MobileOffersByCategoriesGraphQLCall$qqIl-P4A5tGmTlRZcfW7rSDK-Fc;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/offer/offersbycategories/-$$Lambda$MobileOffersByCategoriesGraphQLCall$qqIl-P4A5tGmTlRZcfW7rSDK-Fc;-><init>(Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;)V

    .line 98
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->translateList(Ljava/util/List;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLResponse;->setOfferCategoryContents(Ljava/util/List;)V

    return-object v0
.end method

.method public setCategoryLimit(Ljava/lang/Integer;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->categoryLimit:Ljava/lang/Integer;

    return-void
.end method

.method public setContentMax(Ljava/lang/Integer;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->retailerId:Ljava/lang/Integer;

    return-void
.end method
