.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;
.super Ljava/lang/Object;
.source "GooglePayManager.java"


# virtual methods
.method public abstract createPaymentDataRequest(D)Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/wallet/PaymentData;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isReadyToPay()V
.end method

.method public abstract setGooglePayManagerListener(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerListener;)V
.end method
