.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;
.super Ljava/lang/Object;
.source "RetailerMapView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract finishWithResult(IZ)V
.end method

.method public abstract hideMapLoading()V
.end method

.method public abstract setMapData(Lcom/ibotta/api/model/retailer/Retailer;Landroid/location/Location;)V
.end method

.method public abstract setTitleForCantFindIt()V
.end method

.method public abstract showExternalMap(Ljava/lang/String;)V
.end method

.method public abstract showGooglePlayNotAvailable(I)V
.end method

.method public abstract showMapLoading()V
.end method

.method public abstract showNoStoresFound(Ljava/lang/String;)V
.end method

.method public abstract showRetailerMapFailed()V
.end method
