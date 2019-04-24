.class public Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "UnlockedOfferCategoriesGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;",
        "Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private contentMax:Ljava/lang/Integer;

.field private contentMin:Ljava/lang/Integer;

.field private limit:Ljava/lang/Integer;

.field private final mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

.field private retailerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    const p1, 0x7fffffff

    .line 31
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    .line 36
    iput-object p2, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 37
    iput-object p3, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    return-void
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 84
    invoke-static {}, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery;->builder()Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;

    move-result-object v0

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 87
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;

    .line 89
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->limit:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 90
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;

    .line 92
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->contentMin:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 93
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->contentMin(Ljava/lang/Long;)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;

    .line 95
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    .line 96
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->contentMax(Ljava/lang/Long;)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;

    .line 99
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;

    .line 100
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;

    .line 102
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiCallParams()Ljava/lang/String;
    .locals 6

    const-string v0, ""

    .line 146
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " retailerId: %s"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->retailerId:Ljava/lang/Integer;

    if-nez v4, :cond_0

    const-string v4, "null"

    :cond_0
    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 147
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", limit: %s"

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->limit:Ljava/lang/Integer;

    if-nez v4, :cond_1

    const-string v4, "null"

    :cond_1
    aput-object v4, v3, v5

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 148
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", contentMin: %s"

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->contentMin:Ljava/lang/Integer;

    if-nez v4, :cond_2

    const-string v4, "null"

    :cond_2
    aput-object v4, v3, v5

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 149
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", contentMax: %s"

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    if-nez v3, :cond_3

    const-string v3, "null"

    :cond_3
    aput-object v3, v2, v5

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/unlocked_offer_categories"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->limit:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->contentMin:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContentMax()Ljava/lang/Integer;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    return-object v0
.end method

.method public getContentMin()Ljava/lang/Integer;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->contentMin:Ljava/lang/Integer;

    return-object v0
.end method

.method public getLimit()Ljava/lang/Integer;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "unlockedOfferCategories"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 74
    const-class v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;"
        }
    .end annotation

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 114
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferCategoryMapper()Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    move-result-object v1

    .line 116
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$Data;->unlockedOfferCategories()Ljava/util/List;

    move-result-object p1

    .line 117
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$UnlockedOfferCategory;

    .line 119
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$UnlockedOfferCategory;->fragments()Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$UnlockedOfferCategory$Fragments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/UnlockedOfferCategoriesGraphQLQuery$UnlockedOfferCategory$Fragments;->categoryFragment()Lcom/ibotta/android/graphql/fragment/CategoryFragment;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;->map(Lcom/ibotta/android/graphql/fragment/CategoryFragment;)Lcom/ibotta/api/model/content/OfferCategoryContent;

    move-result-object v2

    .line 118
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 122
    :cond_0
    new-instance p1, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;

    invoke-direct {p1}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;-><init>()V

    .line 123
    invoke-virtual {p1, v0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;->setOfferCategoryContents(Ljava/util/List;)V

    return-object p1
.end method

.method public setContentMax(Ljava/lang/Integer;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->contentMax:Ljava/lang/Integer;

    return-void
.end method

.method public setContentMin(Ljava/lang/Integer;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->contentMin:Ljava/lang/Integer;

    return-void
.end method

.method public setLimit(Ljava/lang/Integer;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->limit:Ljava/lang/Integer;

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->retailerId:Ljava/lang/Integer;

    return-void
.end method
