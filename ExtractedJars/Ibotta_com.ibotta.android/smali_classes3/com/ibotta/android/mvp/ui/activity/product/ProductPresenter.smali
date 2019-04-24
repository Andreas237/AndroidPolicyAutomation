.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;
.super Ljava/lang/Object;
.source "ProductPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/product/ProductView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onProductImageCardClicked()V
.end method

.method public abstract onProductNotFoundDisplayed()V
.end method

.method public abstract onShopClicked()V
.end method

.method public abstract setProductId(Ljava/lang/String;)V
.end method
