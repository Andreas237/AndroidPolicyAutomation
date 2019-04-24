.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;
.super Ljava/lang/Object;
.source "EarningsPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;
.implements Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderListener;"
    }
.end annotation


# virtual methods
.method public abstract onEarningRowClicked(Lcom/ibotta/api/model/earnings/Earning;)V
.end method

.method public abstract onHelpIconClicked()V
.end method

.method public abstract onLastRowDisplayed(Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;)V
.end method

.method public abstract setPendingOnly(Z)V
.end method
