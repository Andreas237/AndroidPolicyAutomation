.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenter;
.super Ljava/lang/Object;
.source "MyFavoritesPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onMyFavoritesSwapped()V
.end method

.method public abstract onRetailerAdded(Lcom/ibotta/android/apiandroid/content/ContentId;)V
.end method

.method public abstract onRetailerRemoved(Lcom/ibotta/android/apiandroid/content/ContentId;)V
.end method
