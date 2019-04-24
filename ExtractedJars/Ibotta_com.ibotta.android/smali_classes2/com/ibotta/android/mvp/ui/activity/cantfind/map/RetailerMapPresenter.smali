.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;
.super Ljava/lang/Object;
.source "RetailerMapPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onGetMapAsyncFinish()V
.end method

.method public abstract onGetMapAsyncStart()V
.end method

.method public abstract onGooglePlayNotAvailable(I)V
.end method

.method public abstract onRetailerLocationClicked(DD)V
.end method

.method public abstract onRetailerLocationClicked(I)V
.end method

.method public abstract onRetailerMapClicked()V
.end method

.method public abstract onRetailerMapFailed()V
.end method

.method public abstract onSkipClicked()V
.end method

.method public abstract setCantFindIt(Z)V
.end method

.method public abstract setOfferId(I)V
.end method

.method public abstract setRetailerId(I)V
.end method
