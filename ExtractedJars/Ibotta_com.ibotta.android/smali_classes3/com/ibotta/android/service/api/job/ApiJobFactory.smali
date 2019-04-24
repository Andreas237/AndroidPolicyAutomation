.class public interface abstract Lcom/ibotta/android/service/api/job/ApiJobFactory;
.super Ljava/lang/Object;
.source "ApiJobFactory.java"


# virtual methods
.method public abstract createConfigApiJob()Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract createCustomerAccountByIdJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract createCustomerByIdJob(I)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract createCustomerEarningsJob(ILjava/util/Set;Ljava/util/Set;ILjava/lang/Long;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;",
            ">;I",
            "Ljava/lang/Long;",
            ")",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;"
        }
    .end annotation
.end method

.method public abstract createCustomerFriendsJob(I)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract createCustomerFriendsMessagePostJob(IILjava/lang/String;)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract createCustomerGiftCardByIdJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract createCustomerReceiptByIdJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract createHomeApiJob(I)Lcom/ibotta/android/service/api/job/HomeApiJob;
.end method

.method public abstract createLogErrorPostCall(ILjava/lang/String;)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract createRelayApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/RelayApiJob;
.end method

.method public abstract createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method

.method public abstract createSocialOfferByIdJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;
.end method
