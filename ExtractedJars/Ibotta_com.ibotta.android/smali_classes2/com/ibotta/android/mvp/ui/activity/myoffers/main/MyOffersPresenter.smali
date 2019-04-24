.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;
.super Ljava/lang/Object;
.source "MyOffersPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onFindRebatesClicked()V
.end method

.method public abstract onMoreEllipsesClicked()V
.end method

.method public abstract onRebatesRemoved()V
.end method

.method public abstract onRetailerCardClicked(Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract onSeeMoreClicked()V
.end method
