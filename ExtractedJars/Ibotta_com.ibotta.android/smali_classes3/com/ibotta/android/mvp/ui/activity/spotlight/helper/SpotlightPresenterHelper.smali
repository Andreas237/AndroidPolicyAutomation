.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;
.super Ljava/lang/Object;
.source "SpotlightPresenterHelper.java"


# virtual methods
.method public abstract getAlsoBoughtOffers(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;",
            ")",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/api/model/OfferModel;",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAvailableAtRetailerList(Lcom/ibotta/api/call/home/HomeResponse;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/call/home/HomeResponse;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCheckProduct(Lcom/ibotta/api/rules/ScanRules;)Z
.end method

.method public abstract getCustomRebateRewardMessage()Ljava/lang/String;
.end method

.method public abstract getOfferIdIntegers()[Ljava/lang/Integer;
.end method

.method public abstract getOfferIds()[I
.end method

.method public abstract getOfferImageUrl()Ljava/lang/String;
.end method

.method public abstract getOfferModel()Lcom/ibotta/api/model/OfferModel;
.end method

.method public abstract getRelatedBonuses(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRetailerId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
.end method

.method public abstract handleProductOffersResponse(Lcom/ibotta/android/service/api/job/SingleApiJob;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/appcache/AppCache;Ljava/lang/String;)V
.end method

.method public abstract initDefaultRetailer(Lcom/ibotta/api/call/home/HomeResponse;)V
.end method

.method public abstract isAlsoBoughtViewedJobValid(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)Z
.end method

.method public abstract isHideCantFindItem()Z
.end method

.method public abstract isNewRebateRewarded()Z
.end method

.method public abstract isRebateRewarded()Z
.end method

.method public abstract offerHasAboutTitle()Z
.end method

.method public abstract setCustomRebateRewardMessage(Ljava/lang/String;)V
.end method

.method public abstract setNewRebateRewarded(Z)V
.end method

.method public abstract setOfferFromResponse(Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;)V
.end method

.method public abstract setOfferIds([I)V
.end method

.method public abstract setRebateRewarded(Z)V
.end method

.method public abstract setRetailerId(Ljava/lang/Integer;)V
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract shouldShowLocateStore()Z
.end method

.method public abstract shouldTrackOfferBonuses(Ljava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;)Z"
        }
    .end annotation
.end method
