.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;
.super Ljava/lang/Object;
.source "MCommEscortPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onButtonActionAcquired(Lcom/usebutton/sdk/action/ButtonAction;)V
.end method

.method public abstract onPurchasePathAcquired(Lcom/usebutton/sdk/purchasepath/PurchasePath;)V
.end method

.method public abstract setMcommEscortParamsParcel(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;)V
.end method
