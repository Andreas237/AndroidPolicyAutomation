.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;
.super Ljava/lang/Object;
.source "PwiApiManager.java"


# virtual methods
.method public abstract buildNewPaymentSourceFromCard(Lcom/stripe/android/model/Card;)V
.end method

.method public abstract buildPaymentAccountsDeleteCall(Ljava/lang/String;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation
.end method

.method public abstract buildPaymentAccountsPutCall(Ljava/lang/String;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation
.end method

.method public abstract buildTransactionByIdJob(Ljava/lang/String;)Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;
.end method

.method public abstract buildTransactionPollingJob(Ljava/lang/String;)Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;
.end method

.method public abstract buildTransactionPostJob(Lcom/ibotta/api/model/BuyableGiftCardModel;DLjava/lang/String;Ljava/lang/String;Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation
.end method

.method public abstract buildTransactionSpentJob(Ljava/lang/String;Z)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract buildTransactionUpdateBalanceJob(Ljava/lang/String;D)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract clearWalletCaches(I)V
.end method

.method public abstract getAllPaymentMethodsFromCustomer(Lcom/stripe/android/model/Customer;)Ljava/util/List;
    .param p1    # Lcom/stripe/android/model/Customer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/Customer;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/PwiPaymentMethod;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract getBuyableGiftCardModelFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/BuyableGiftCardModel;
    .param p1    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract getBuyableGiftCardModelsFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Ljava/util/List;
    .param p1    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract getDefaultPaymentMethodFromCustomer(Lcom/stripe/android/model/Customer;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Lcom/ibotta/android/mvp/ui/activity/pwi/IbottaStripeException;
        }
    .end annotation
.end method

.method public abstract getOptionalRetailerModelWithRetailerIdFromJob(Lcom/ibotta/android/service/api/job/HomeApiJob;I)Lcom/ibotta/api/model/RetailerModel;
    .param p1    # Lcom/ibotta/android/service/api/job/HomeApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getPaymentAccountFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
    .param p1    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Lcom/ibotta/android/mvp/ui/activity/pwi/NoPaymentAccountException;,
            Ljava/lang/IllegalStateException;,
            Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException;
        }
    .end annotation
.end method

.method public abstract getPwiRetailersFromJob(Lcom/ibotta/android/service/api/job/HomeApiJob;)Ljava/util/List;
    .param p1    # Lcom/ibotta/android/service/api/job/HomeApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/HomeApiJob;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract getRetailerModelsFromJob(Lcom/ibotta/android/service/api/job/HomeApiJob;)Ljava/util/List;
    .param p1    # Lcom/ibotta/android/service/api/job/HomeApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/HomeApiJob;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract getTransactionFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/model/pwi/BgcTransaction;
    .param p1    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract getTransactionsFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;Lcom/ibotta/android/service/api/job/HomeApiJob;)Ljava/util/List;
    .param p1    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/service/api/job/HomeApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            "Lcom/ibotta/android/service/api/job/HomeApiJob;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/BgcTransaction;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract getTransactionsFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;Lcom/ibotta/android/service/api/job/SingleApiJob;)Ljava/util/List;
    .param p1    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/service/api/job/SingleApiJob;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/BgcTransaction;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract initStripeCustomerSession(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)V
.end method

.method public abstract isFailedTransaction(Lcom/ibotta/android/service/api/job/SingleApiJob;)Z
.end method

.method public abstract retrieveStripeCurrentCustomer()V
.end method

.method public abstract setStripeManagerListener(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;)V
.end method

.method public abstract updateCacheOnSuccessfulPurchase(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
.end method
