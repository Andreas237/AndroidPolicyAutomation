.class public Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;
.super Ljava/lang/Object;
.source "GraphQLCallFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/graphql/GraphQLCallFactory;


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

.field private final mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

.field private final modulesSaltInterceptor:Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 58
    iput-object p2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 59
    iput-object p3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    .line 60
    iput-object p4, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->modulesSaltInterceptor:Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    return-void
.end method


# virtual methods
.method public createAlsoBoughtCall()Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;
    .locals 4

    .line 65
    new-instance v0, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createAlsoViewedCall()Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;
    .locals 4

    .line 70
    new-instance v0, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createBonusCall(I)Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;
    .locals 4

    .line 75
    new-instance v0, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;I)V

    return-object v0
.end method

.method public createBonusesCall()Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;
    .locals 4

    .line 80
    new-instance v0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createBuyableGiftCardByRetailerIdGraphQLCall(I)Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;
    .locals 4

    .line 173
    new-instance v0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public createBuyableGiftCardRetailersGraphQLCall()Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;
    .locals 4

    .line 183
    new-instance v0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createBuyableGiftCardsGraphQLCall()Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;
    .locals 4

    .line 178
    new-instance v0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createCategoryCall()Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;
    .locals 4

    .line 85
    new-instance v0, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createContentByIdCall(Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
    .locals 4

    .line 200
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIdType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 202
    new-instance v0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-object v0

    .line 206
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid ContentId Type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIdType()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public createCurrentSocialBonusesCall()Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;
    .locals 4

    .line 90
    new-instance v0, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createDealCall(Ljava/lang/String;)Lcom/ibotta/android/graphql/deal/DealGraphQlCall;
    .locals 4

    .line 95
    new-instance v0, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/ibotta/android/graphql/deal/DealGraphQlCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Ljava/lang/String;)V

    return-object v0
.end method

.method public createEngagementsGraphQlCall()Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;
    .locals 4

    .line 188
    new-instance v0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createMobileOffersByCategoriesCall()Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;
    .locals 4

    .line 100
    new-instance v0, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createModuleCall(I)Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;
    .locals 7

    .line 105
    new-instance v6, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    .line 106
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->modulesSaltInterceptor:Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Ljava/lang/String;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;)V

    return-object v6
.end method

.method public createModulesCall()Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;
    .locals 5

    .line 111
    new-instance v0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    iget-object v4, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->modulesSaltInterceptor:Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;)V

    return-object v0
.end method

.method public createOfferCall()Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;
    .locals 4

    .line 116
    new-instance v0, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createOfferCategoriesContainerCall()Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;
    .locals 4

    .line 131
    new-instance v0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createOfferTagSearchCall(Ljava/lang/String;)Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;
    .locals 4

    .line 151
    new-instance v0, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Ljava/lang/String;)V

    return-object v0
.end method

.method public createOffersByCategoriesCall()Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;
    .locals 4

    .line 126
    new-instance v0, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createOffersCall()Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;
    .locals 4

    .line 121
    new-instance v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createProductCall()Lcom/ibotta/android/graphql/product/ProductGraphQLCall;
    .locals 4

    .line 136
    new-instance v0, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createRecentlyViewedRetailersGraphQLCall()Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;
    .locals 4

    .line 219
    new-instance v0, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createRetailerCategoriesGraphQLCall(I)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;
    .locals 4

    .line 229
    new-instance v0, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public createRetailerCategoryGraphQLCall(II)Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;
    .locals 7

    .line 224
    new-instance v6, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v6
.end method

.method public createRetailersCall(Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;)Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;
    .locals 4

    .line 141
    new-instance v0, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getRetailerMapper()Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;)V

    return-object v0
.end method

.method public createSearchCall(Lcom/ibotta/android/graphql/search/SearchGraphQLParams;)Lcom/ibotta/android/graphql/search/SearchGraphQLCall;
    .locals 4

    .line 146
    new-instance v0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Lcom/ibotta/android/graphql/search/SearchGraphQLParams;)V

    return-object v0
.end method

.method public createTypeAheadSuggestionGraphQLCall(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava9/util/Optional<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;"
        }
    .end annotation

    .line 168
    new-instance v0, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public createUnlockedOfferCategoriesCall()Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;
    .locals 4

    .line 156
    new-instance v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createUnlockedOffersCall()Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;
    .locals 4

    .line 161
    new-instance v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createViewedOfferCall()Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;
    .locals 4

    .line 193
    new-instance v0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V

    return-object v0
.end method

.method public createViewedRetailerGraphQLCall(I)Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;
    .locals 4

    .line 214
    new-instance v0, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;

    iget-object v1, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v2, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    iget-object v3, p0, Lcom/ibotta/android/graphql/GraphQLCallFactoryImpl;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;I)V

    return-object v0
.end method
