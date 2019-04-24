.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;
.super Ljava/lang/Object;
.source "ChangeQuantityPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onDecrementClicked()V
.end method

.method public abstract onDoneClicked()V
.end method

.method public abstract onIncrementClicked()V
.end method

.method public abstract setOfferId(I)V
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
