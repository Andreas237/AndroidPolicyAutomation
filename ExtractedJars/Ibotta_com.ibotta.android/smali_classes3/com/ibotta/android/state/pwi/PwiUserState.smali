.class public interface abstract Lcom/ibotta/android/state/pwi/PwiUserState;
.super Ljava/lang/Object;
.source "PwiUserState.java"

# interfaces
.implements Lcom/ibotta/android/state/user/LogOutListener;


# virtual methods
.method public abstract addPendingTransaction(Ljava/lang/String;I)V
.end method

.method public abstract clearAll()V
.end method

.method public abstract getEarliestPendingTransactionId(I)Ljava/lang/String;
.end method

.method public abstract hasCompletedOnboarding()Z
.end method

.method public abstract hasPendingTransaction(I)Ljava/lang/Boolean;
.end method

.method public abstract isConfirmPurchaseAgain()Z
.end method

.method public abstract isGooglePayDefaultPayment()Ljava/lang/Boolean;
.end method

.method public abstract onOnboardingCompleted()V
.end method

.method public abstract removePendingTransaction(Ljava/lang/String;I)V
.end method

.method public abstract setGooglePayAsDefaultPayment(Z)V
.end method

.method public abstract showConfirmPurchaseAgain(Z)V
.end method
