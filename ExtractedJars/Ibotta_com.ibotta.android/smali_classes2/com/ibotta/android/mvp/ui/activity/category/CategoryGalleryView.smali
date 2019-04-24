.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;
.super Ljava/lang/Object;
.source "CategoryGalleryView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract getRetailerCategoryId()I
.end method

.method public abstract launchRoute(Ljava/lang/String;)V
.end method

.method public abstract setDataMap(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryTab;",
            "Lcom/ibotta/android/views/list/IbottaListViewState;",
            ">;)V"
        }
    .end annotation
.end method
