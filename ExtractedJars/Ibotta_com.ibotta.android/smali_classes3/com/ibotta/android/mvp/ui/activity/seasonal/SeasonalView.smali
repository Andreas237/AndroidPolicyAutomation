.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;
.super Ljava/lang/Object;
.source "SeasonalView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract getRetailerCategoryId()I
.end method

.method public abstract launchRoute(Ljava/lang/String;)V
.end method

.method public abstract setRetailerCategoryParcel(Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V
.end method

.method public abstract setRows(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showFailedToLoad()V
.end method
