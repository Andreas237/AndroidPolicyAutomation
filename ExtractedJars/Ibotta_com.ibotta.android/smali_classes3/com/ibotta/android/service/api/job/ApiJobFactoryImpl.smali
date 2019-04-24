.class public Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;
.super Ljava/lang/Object;
.source "ApiJobFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobFactory;


# instance fields
.field private final apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/ApiCallFactory;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    return-void
.end method


# virtual methods
.method public createConfigApiJob()Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    invoke-interface {v0}, Lcom/ibotta/api/call/ApiCallFactory;->createConfigCall()Lcom/ibotta/api/call/config/ConfigCall;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    return-object v0
.end method

.method public createCustomerAccountByIdJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/call/ApiCallFactory;->createCustomerAccountByIdCall(II)Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    return-object p1
.end method

.method public createCustomerByIdJob(I)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    invoke-interface {v0, p1}, Lcom/ibotta/api/call/ApiCallFactory;->createCustomerByIdCall(I)Lcom/ibotta/api/call/customer/CustomerByIdCall;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    return-object p1
.end method

.method public createCustomerEarningsJob(ILjava/util/Set;Ljava/util/Set;ILjava/lang/Long;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 6
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

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/ibotta/api/call/ApiCallFactory;->createCustomerEarningsCall(ILjava/util/Set;Ljava/util/Set;ILjava/lang/Long;)Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    return-object p1
.end method

.method public createCustomerFriendsJob(I)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    invoke-interface {v0, p1}, Lcom/ibotta/api/call/ApiCallFactory;->createCustomerFriendsCall(I)Lcom/ibotta/api/call/customer/friends/CustomerFriendsCall;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    return-object p1
.end method

.method public createCustomerFriendsMessagePostJob(IILjava/lang/String;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    invoke-interface {v0, p1, p2, p3}, Lcom/ibotta/api/call/ApiCallFactory;->createCustomerFriendsMessagePostCall(IILjava/lang/String;)Lcom/ibotta/api/call/customer/friends/CustomerFriendsMessagePostCall;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    return-object p1
.end method

.method public createCustomerGiftCardByIdJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/call/ApiCallFactory;->createCustomerGiftCardByIdCall(II)Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardByIdCall;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    return-object p1
.end method

.method public createCustomerReceiptByIdJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/call/ApiCallFactory;->createCustomerReceiptByIdCall(II)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdCall;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    return-object p1
.end method

.method public createHomeApiJob(I)Lcom/ibotta/android/service/api/job/HomeApiJob;
    .locals 1

    .line 28
    new-instance v0, Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-direct {v0, p1}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    return-object v0
.end method

.method public createLogErrorPostCall(ILjava/lang/String;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/call/ApiCallFactory;->createLogErrorPostCall(ILjava/lang/String;)Lcom/ibotta/api/call/problem/LogErrorPostCall;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    return-object p1
.end method

.method public createRelayApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/RelayApiJob;
    .locals 1

    .line 23
    new-instance v0, Lcom/ibotta/android/service/api/job/RelayApiJob;

    invoke-direct {v0, p1}, Lcom/ibotta/android/service/api/job/RelayApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-object v0
.end method

.method public createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 1

    .line 18
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-object v0
.end method

.method public createSocialOfferByIdJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/call/ApiCallFactory;->createSocialOfferByIdCall(II)Lcom/ibotta/api/call/offer/SocialOfferByIdCall;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/ApiJobFactoryImpl;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    return-object p1
.end method
