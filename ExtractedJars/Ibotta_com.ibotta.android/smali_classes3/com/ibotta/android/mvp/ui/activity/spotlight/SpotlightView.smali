.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;
.super Ljava/lang/Object;
.source "SpotlightView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract captureProductImage(Ljava/lang/String;)V
.end method

.method public abstract getAvailableAtTitle(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getEventContributor()Lcom/ibotta/android/tracking/proprietary/event/EventContributor;
.end method

.method public abstract getRecentlyViewedTitle()Ljava/lang/String;
.end method

.method public abstract setAvailableAtRetailers(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;Lcom/ibotta/android/views/base/title/TitleBarViewState;ZZ)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
            "ZZ)V"
        }
    .end annotation
.end method

.method public abstract setCheckProductAllowed(Z)V
.end method

.method public abstract setRelatedBonuses(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setRetailerId(Ljava/lang/Integer;)V
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setup(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract setupAlsoBoughtViewedOffers(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/LinkedHashMap;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/api/model/OfferModel;",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setupContentCard(Lcom/ibotta/android/content/card/ContentCardViewState;)V
.end method

.method public abstract setupLocateStore(Z)V
.end method

.method public abstract shareRebate(Lcom/ibotta/api/model/customer/Customer;Ljava/lang/Integer;Lcom/ibotta/api/model/OfferModel;)V
    .param p2    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract showAbout(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
.end method

.method public abstract showAddProductUpcApproved()V
.end method

.method public abstract showAddProductUpcFail()V
.end method

.method public abstract showAddProductUpcPending()V
.end method

.method public abstract showAddProductUpcRejected()V
.end method

.method public abstract showBonus(Lcom/ibotta/api/model/BonusModel;)V
.end method

.method public abstract showCantFindItSuccessMessage(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
.end method

.method public abstract showCantFindItem(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract showCantFindItem(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)V
.end method

.method public abstract showCaptureProductImageNotPossible()V
.end method

.method public abstract showFixRebateNotice()V
.end method

.method public abstract showFullScreenImage(Ljava/lang/String;)V
.end method

.method public abstract showNewRebateRewarded()V
.end method

.method public abstract showNoPlaceToSaveImageError()V
.end method

.method public abstract showOfferNotFound()V
.end method

.method public abstract showProductBarcodeScanner(Lcom/ibotta/api/model/OfferModel;)V
.end method

.method public abstract showProductImageCaptureFailed()V
.end method

.method public abstract showProductNotMatched(ILcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V
.end method

.method public abstract showProductVerificationFailed()V
.end method

.method public abstract showProductVerifiedSuccessfully()V
.end method

.method public abstract showRebateRewarded()V
.end method

.method public abstract showRebateRewarded(Ljava/lang/String;)V
.end method

.method public abstract showRecentlyViewedContent(Lcom/ibotta/android/views/list/IbottaListViewState;)V
.end method

.method public abstract showRetailerLocationsMap(Ljava/lang/Integer;)V
.end method
