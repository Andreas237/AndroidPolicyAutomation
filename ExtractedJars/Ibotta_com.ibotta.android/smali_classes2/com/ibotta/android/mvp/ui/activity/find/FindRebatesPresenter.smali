.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;
.super Ljava/lang/Object;
.source "FindRebatesPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/search/SearchMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/search/SearchMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract favoriteRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
.end method

.method public abstract onManageFavoritesClicked()V
.end method

.method public abstract onRetailerCategoryClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
.end method
