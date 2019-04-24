.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;
.super Ljava/lang/Object;
.source "MCommEscortStrategy.java"


# virtual methods
.method public abstract getFetchJobs()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end method

.method public abstract onAbandonFetchJobs()V
.end method

.method public abstract onButtonActionAcquired(Lcom/usebutton/sdk/action/ButtonAction;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end method

.method public abstract onFetchFinishedSuccessfully()V
.end method

.method public abstract onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V
.end method

.method public abstract onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V
.end method

.method public abstract onPurchasePathAcquired(Lcom/usebutton/sdk/purchasepath/PurchasePath;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end method
