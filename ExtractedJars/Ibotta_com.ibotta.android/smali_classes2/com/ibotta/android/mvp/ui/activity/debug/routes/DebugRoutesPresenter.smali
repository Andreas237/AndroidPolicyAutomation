.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;
.super Ljava/lang/Object;
.source "DebugRoutesPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onBonusSelected()V
.end method

.method public abstract onGoClicked()V
.end method

.method public abstract onNotifyClicked()V
.end method

.method public abstract onOfferCategorySelected()V
.end method

.method public abstract onOfferSelected()V
.end method

.method public abstract onRetailerCategorySelected()V
.end method

.method public abstract onRetailerSelected(I)V
.end method

.method public abstract onRouteSelected(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;I)V
.end method
