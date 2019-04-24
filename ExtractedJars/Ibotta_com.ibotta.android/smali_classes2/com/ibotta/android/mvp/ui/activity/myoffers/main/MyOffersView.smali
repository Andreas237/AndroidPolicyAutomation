.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;
.super Ljava/lang/Object;
.source "MyOffersView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract setDataMap(Ljava/util/LinkedHashMap;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract setMoreMenuVisible(Z)V
.end method

.method public abstract showMoreMenu()V
.end method

.method public abstract showMoreStores()V
.end method

.method public abstract showMyOffersGallery(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/im/ImConnectionStatus;)V
.end method

.method public abstract showRemovedRebatesSuccess()V
.end method
