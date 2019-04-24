.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;
.super Ljava/lang/Object;
.source "SeasonalPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onFailedToLoadDismissed()V
.end method

.method public abstract onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
.end method

.method public abstract onSpecialConditionsLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract onUnlockCompleted()V
.end method

.method public abstract setRetailerCategoryParcel(Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V
.end method
