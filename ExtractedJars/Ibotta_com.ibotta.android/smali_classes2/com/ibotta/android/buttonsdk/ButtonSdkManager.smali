.class public interface abstract Lcom/ibotta/android/buttonsdk/ButtonSdkManager;
.super Ljava/lang/Object;
.source "ButtonSdkManager.java"

# interfaces
.implements Lcom/ibotta/android/state/user/LogOutListener;


# virtual methods
.method public abstract pollForTransactions(Lcom/ibotta/android/activity/CompatSupplier;)V
.end method

.method public abstract recordAppLaunch(Lcom/ibotta/android/fragment/retailer/RetailerParcel;JLjava/lang/String;)V
.end method

.method public abstract resetLaunch(Z)V
.end method

.method public abstract showWelcomeBackTransactionData(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V
.end method
