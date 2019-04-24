.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesView;
.super Ljava/lang/Object;
.source "MyFavoritesView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract setEmptyState(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
.end method

.method public abstract setRows(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;",
            ">;)V"
        }
    .end annotation
.end method
