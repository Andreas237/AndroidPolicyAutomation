.class public interface abstract Lcom/ibotta/api/call/ApiCallFactory;
.super Ljava/lang/Object;
.source "ApiCallFactory.java"


# virtual methods
.method public abstract createConfigCall()Lcom/ibotta/api/call/config/ConfigCall;
.end method

.method public abstract createCustomerAccountByIdCall(II)Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;
.end method

.method public abstract createCustomerByIdCall(I)Lcom/ibotta/api/call/customer/CustomerByIdCall;
.end method

.method public abstract createCustomerEarningsCall(ILjava/util/Set;Ljava/util/Set;ILjava/lang/Long;)Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;
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
.end method

.method public abstract createCustomerFriendsCall(I)Lcom/ibotta/api/call/customer/friends/CustomerFriendsCall;
.end method

.method public abstract createCustomerFriendsMessagePostCall(IILjava/lang/String;)Lcom/ibotta/api/call/customer/friends/CustomerFriendsMessagePostCall;
.end method

.method public abstract createCustomerGiftCardByIdCall(II)Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardByIdCall;
.end method

.method public abstract createCustomerReceiptByIdCall(II)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdCall;
.end method

.method public abstract createCustomerSocialsPostCall(Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;)Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;
.end method

.method public abstract createLogErrorPostCall(ILjava/lang/String;)Lcom/ibotta/api/call/problem/LogErrorPostCall;
.end method

.method public abstract createPayPalLinkPostCall(Ljava/lang/String;)Lcom/ibotta/api/call/paypal/PayPalLinkPostCall;
.end method

.method public abstract createPayPalLoginPostCall(Ljava/lang/String;)Lcom/ibotta/api/call/paypal/PayPalLoginPostCall;
.end method

.method public abstract createRefreshTokenCall(I)Lcom/ibotta/api/call/auth/RefreshTokenCall;
.end method

.method public abstract createSocialOfferByIdCall(II)Lcom/ibotta/api/call/offer/SocialOfferByIdCall;
.end method
