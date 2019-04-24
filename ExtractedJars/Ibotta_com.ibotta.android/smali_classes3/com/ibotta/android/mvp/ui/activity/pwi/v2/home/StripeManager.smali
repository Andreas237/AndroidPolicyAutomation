.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;
.super Ljava/lang/Object;
.source "StripeManager.java"


# virtual methods
.method public abstract buildNewPaymentSourceFromCard(Lcom/stripe/android/model/Card;)V
.end method

.method public abstract initStripeCustomerSession(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)V
.end method

.method public abstract retrieveStripeCurrentCustomer()V
.end method

.method public abstract setStripeManagerListener(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;)V
.end method
