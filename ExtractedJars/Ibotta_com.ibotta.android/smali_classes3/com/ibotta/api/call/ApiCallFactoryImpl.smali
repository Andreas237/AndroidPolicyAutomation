.class public Lcom/ibotta/api/call/ApiCallFactoryImpl;
.super Ljava/lang/Object;
.source "ApiCallFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/api/call/ApiCallFactory;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createConfigCall()Lcom/ibotta/api/call/config/ConfigCall;
    .locals 1

    .line 26
    new-instance v0, Lcom/ibotta/api/call/config/ConfigCall;

    invoke-direct {v0}, Lcom/ibotta/api/call/config/ConfigCall;-><init>()V

    return-object v0
.end method

.method public createCustomerAccountByIdCall(II)Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;
    .locals 1

    .line 77
    new-instance v0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;-><init>(II)V

    return-object v0
.end method

.method public createCustomerByIdCall(I)Lcom/ibotta/api/call/customer/CustomerByIdCall;
    .locals 1

    .line 46
    new-instance v0, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    invoke-direct {v0, p1}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    return-object v0
.end method

.method public createCustomerEarningsCall(ILjava/util/Set;Ljava/util/Set;ILjava/lang/Long;)Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;
    .locals 7
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
            "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;"
        }
    .end annotation

    .line 57
    new-instance v6, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;

    move-object v0, v6

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;-><init>(ILjava/util/Set;Ljava/util/Set;ILjava/lang/Long;)V

    return-object v6
.end method

.method public createCustomerFriendsCall(I)Lcom/ibotta/api/call/customer/friends/CustomerFriendsCall;
    .locals 1

    .line 51
    new-instance v0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsCall;

    invoke-direct {v0, p1}, Lcom/ibotta/api/call/customer/friends/CustomerFriendsCall;-><init>(I)V

    return-object v0
.end method

.method public createCustomerFriendsMessagePostCall(IILjava/lang/String;)Lcom/ibotta/api/call/customer/friends/CustomerFriendsMessagePostCall;
    .locals 1

    .line 67
    new-instance v0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsMessagePostCall;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/api/call/customer/friends/CustomerFriendsMessagePostCall;-><init>(IILjava/lang/String;)V

    return-object v0
.end method

.method public createCustomerGiftCardByIdCall(II)Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardByIdCall;
    .locals 1

    .line 72
    new-instance v0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardByIdCall;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardByIdCall;-><init>(II)V

    return-object v0
.end method

.method public createCustomerReceiptByIdCall(II)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdCall;
    .locals 1

    .line 82
    new-instance v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdCall;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdCall;-><init>(II)V

    return-object v0
.end method

.method public createCustomerSocialsPostCall(Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;)Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;
    .locals 1

    .line 62
    new-instance v0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;

    invoke-direct {v0, p1}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;-><init>(Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;)V

    return-object v0
.end method

.method public createLogErrorPostCall(ILjava/lang/String;)Lcom/ibotta/api/call/problem/LogErrorPostCall;
    .locals 1

    .line 92
    new-instance v0, Lcom/ibotta/api/call/problem/LogErrorPostCall;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Lcom/ibotta/api/call/problem/LogErrorPostCall;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public createPayPalLinkPostCall(Ljava/lang/String;)Lcom/ibotta/api/call/paypal/PayPalLinkPostCall;
    .locals 1

    .line 36
    new-instance v0, Lcom/ibotta/api/call/paypal/PayPalLinkPostCall;

    invoke-direct {v0, p1}, Lcom/ibotta/api/call/paypal/PayPalLinkPostCall;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public createPayPalLoginPostCall(Ljava/lang/String;)Lcom/ibotta/api/call/paypal/PayPalLoginPostCall;
    .locals 1

    .line 31
    new-instance v0, Lcom/ibotta/api/call/paypal/PayPalLoginPostCall;

    invoke-direct {v0, p1}, Lcom/ibotta/api/call/paypal/PayPalLoginPostCall;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public createRefreshTokenCall(I)Lcom/ibotta/api/call/auth/RefreshTokenCall;
    .locals 1

    .line 41
    new-instance v0, Lcom/ibotta/api/call/auth/RefreshTokenCall;

    invoke-direct {v0, p1}, Lcom/ibotta/api/call/auth/RefreshTokenCall;-><init>(I)V

    return-object v0
.end method

.method public createSocialOfferByIdCall(II)Lcom/ibotta/api/call/offer/SocialOfferByIdCall;
    .locals 1

    .line 87
    new-instance v0, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;-><init>(II)V

    return-object v0
.end method
