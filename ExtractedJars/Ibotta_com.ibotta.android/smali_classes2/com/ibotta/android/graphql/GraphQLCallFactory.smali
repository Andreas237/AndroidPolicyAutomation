.class public interface abstract Lcom/ibotta/android/graphql/GraphQLCallFactory;
.super Ljava/lang/Object;
.source "GraphQLCallFactory.java"


# virtual methods
.method public abstract createAlsoBoughtCall()Lcom/ibotta/android/graphql/offer/alsobought/AlsoBoughtGraphQlCall;
.end method

.method public abstract createAlsoViewedCall()Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;
.end method

.method public abstract createBonusCall(I)Lcom/ibotta/android/graphql/bonus/BonusGraphQLCall;
.end method

.method public abstract createBonusesCall()Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;
.end method

.method public abstract createBuyableGiftCardByRetailerIdGraphQLCall(I)Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;
.end method

.method public abstract createBuyableGiftCardRetailersGraphQLCall()Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;
.end method

.method public abstract createBuyableGiftCardsGraphQLCall()Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;
.end method

.method public abstract createCategoryCall()Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;
.end method

.method public abstract createContentByIdCall(Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.end method

.method public abstract createCurrentSocialBonusesCall()Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;
.end method

.method public abstract createDealCall(Ljava/lang/String;)Lcom/ibotta/android/graphql/deal/DealGraphQlCall;
.end method

.method public abstract createEngagementsGraphQlCall()Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;
.end method

.method public abstract createMobileOffersByCategoriesCall()Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;
.end method

.method public abstract createModuleCall(I)Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;
.end method

.method public abstract createModulesCall()Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;
.end method

.method public abstract createOfferCall()Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;
.end method

.method public abstract createOfferCategoriesContainerCall()Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;
.end method

.method public abstract createOfferTagSearchCall(Ljava/lang/String;)Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;
.end method

.method public abstract createOffersByCategoriesCall()Lcom/ibotta/android/graphql/offer/offersbycategories/OffersByCategoriesGraphQLCall;
.end method

.method public abstract createOffersCall()Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;
.end method

.method public abstract createProductCall()Lcom/ibotta/android/graphql/product/ProductGraphQLCall;
.end method

.method public abstract createRecentlyViewedRetailersGraphQLCall()Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLCall;
.end method

.method public abstract createRetailerCategoriesGraphQLCall(I)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLCall;
.end method

.method public abstract createRetailerCategoryGraphQLCall(II)Lcom/ibotta/android/graphql/category/RetailerCategoryGraphQLCall;
.end method

.method public abstract createRetailersCall(Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;)Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;
.end method

.method public abstract createSearchCall(Lcom/ibotta/android/graphql/search/SearchGraphQLParams;)Lcom/ibotta/android/graphql/search/SearchGraphQLCall;
.end method

.method public abstract createTypeAheadSuggestionGraphQLCall(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;
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
.end method

.method public abstract createUnlockedOfferCategoriesCall()Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;
.end method

.method public abstract createUnlockedOffersCall()Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;
.end method

.method public abstract createViewedOfferCall()Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;
.end method

.method public abstract createViewedRetailerGraphQLCall(I)Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;
.end method
