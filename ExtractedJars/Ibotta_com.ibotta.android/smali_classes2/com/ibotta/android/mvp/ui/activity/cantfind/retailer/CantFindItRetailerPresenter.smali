.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;
.super Ljava/lang/Object;
.source "CantFindItRetailerPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
.end method

.method public abstract onMainButtonClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
.end method

.method public abstract onRetailerLocationsDataSuccess()V
.end method

.method public abstract onRetailerRowClicked(Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract onRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
.end method

.method public abstract setOfferId(I)V
.end method
