.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;
.super Ljava/lang/Object;
.source "RedeemRetailersPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onNoUnlocksOkClicked()V
.end method

.method public abstract onRetailerBound(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V
.end method

.method public abstract onRetailerClicked(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V
.end method

.method public abstract onTabSelected(Lcom/ibotta/android/view/retailer/RetailerFilterOption;)V
.end method
