.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;
.super Ljava/lang/Object;
.source "MoreStoresView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract setDataMap(Ljava/util/LinkedHashMap;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract showMyOffersGallery(Lcom/ibotta/api/model/RetailerModel;)V
.end method
