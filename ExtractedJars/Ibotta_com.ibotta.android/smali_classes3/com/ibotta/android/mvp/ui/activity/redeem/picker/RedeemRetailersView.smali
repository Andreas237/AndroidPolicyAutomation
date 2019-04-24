.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;
.super Ljava/lang/Object;
.source "RedeemRetailersView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract addTabViewState(ILcom/ibotta/android/views/redeem/RedeemRetailerViewState;)V
.end method

.method public abstract removeAllTabs()V
.end method

.method public abstract selectTab(Lcom/ibotta/android/view/retailer/RetailerFilterOption;)V
.end method

.method public abstract showNoUnlocks()V
.end method

.method public abstract showRedeemScreen(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation
.end method
