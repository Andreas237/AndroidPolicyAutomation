.class public interface abstract Lcom/ibotta/api/helper/offer/OfferHelper;
.super Ljava/lang/Object;
.source "OfferHelper.java"


# virtual methods
.method public abstract containsOfferOfType(Ljava/util/List;Lcom/ibotta/api/model/offer/OfferType;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Lcom/ibotta/api/model/offer/OfferType;",
            ")Z"
        }
    .end annotation
.end method

.method public abstract findActive(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract findActiveByRetailer(Ljava/util/List;I)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract findActiveByRetailerCategorized(Ljava/util/List;IZ)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;IZ)",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/offer/Category;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract findActiveCategorized(Ljava/util/List;Z)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;Z)",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/offer/Category;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract findByRetailer(Ljava/util/List;I)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract findByRetailer(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Lcom/ibotta/api/model/RetailerModel;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract findByRetailerCategorized(Ljava/util/List;IZ)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;IZ)",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/offer/Category;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract findCategorized(Ljava/util/List;Z)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;Z)",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/offer/Category;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract findHotOffersInStore(Ljava/util/List;Ljava/util/List;IZ)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;IZ)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract findInactiveByRetailer(Ljava/util/List;I)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract findIndexByOfferId(Ljava/util/List;I)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;I)I"
        }
    .end annotation
.end method

.method public abstract findOfferById(Ljava/util/List;I)Lcom/ibotta/api/model/OfferModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;I)",
            "Lcom/ibotta/api/model/OfferModel;"
        }
    .end annotation
.end method

.method public abstract findOffersByIds(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract findUniqueOffers(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getBestCategory(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/api/model/offer/Category;
.end method

.method public abstract getBestCategory(Lcom/ibotta/api/model/OfferModel;Ljava/util/Set;)Lcom/ibotta/api/model/offer/Category;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/OfferModel;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/ibotta/api/model/offer/Category;"
        }
    .end annotation
.end method

.method public abstract getButtonId(Lcom/ibotta/api/model/OfferModel;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getOfferSortDataForRetailer(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)Ljava/lang/String;
.end method

.method public abstract getUnlockedTotal(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)F
.end method

.method public abstract isAtLeastOneOfferUnlocked(Ljava/util/List;I)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;I)Z"
        }
    .end annotation
.end method

.method public abstract isAvailableAt(Lcom/ibotta/api/model/OfferModel;I)Z
.end method

.method public abstract isDefaultOfferType(Lcom/ibotta/api/model/OfferModel;)Z
.end method

.method public abstract isExpired(Lcom/ibotta/api/model/OfferModel;)Z
.end method

.method public abstract isHeroOfferType(Lcom/ibotta/api/model/OfferModel;)Z
.end method

.method public abstract isLocationPermissionRequiredForEngagement(Lcom/ibotta/api/model/OfferModel;)Z
.end method

.method public abstract isPercentBackOfferPresent(Ljava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract isPercentBackType(Lcom/ibotta/api/model/OfferModel;)Z
.end method

.method public abstract isPromoOfferType(Lcom/ibotta/api/model/OfferModel;)Z
.end method

.method public abstract isSaleOfferType(Lcom/ibotta/api/model/OfferModel;)Z
.end method

.method public abstract isShopNow(Lcom/ibotta/api/model/OfferModel;)Z
.end method

.method public abstract isSinglePercentBackType(Lcom/ibotta/api/model/OfferModel;)Z
.end method

.method public abstract isSpecialOfferType(Lcom/ibotta/api/model/OfferModel;)Z
.end method

.method public abstract isVariablePercentBack(Lcom/ibotta/api/model/OfferModel;)Z
.end method

.method public abstract isWithinReachAndAvailableAt(Ljava/util/List;Lcom/ibotta/api/model/OfferModel;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/api/model/OfferModel;",
            ")Z"
        }
    .end annotation
.end method
