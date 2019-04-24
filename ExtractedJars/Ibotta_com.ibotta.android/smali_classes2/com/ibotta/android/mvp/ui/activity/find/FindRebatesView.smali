.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;
.super Ljava/lang/Object;
.source "FindRebatesView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/search/SearchMvpView;


# virtual methods
.method public abstract launchFavoriteRetailerGallery(Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract launchManageFavorites()V
.end method

.method public abstract launchRetailerCategoryGallery(Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V
.end method

.method public abstract setFindRebatesRows(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;",
            ">;)V"
        }
    .end annotation
.end method
