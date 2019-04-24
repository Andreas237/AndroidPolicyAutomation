.class public Lcom/ibotta/android/api/deviceauth/PinVerificationResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "PinVerificationResponse.java"


# instance fields
.field private customerByIdResponse:Lcom/ibotta/api/call/customer/CustomerByIdResponse;

.field private customerPhoneVerificationsVerifyPostResponse:Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostResponse;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomerByIdResponse()Lcom/ibotta/api/call/customer/CustomerByIdResponse;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationResponse;->customerByIdResponse:Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    return-object v0
.end method

.method public getCustomerPhoneVerificationsVerifyPostResponse()Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostResponse;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationResponse;->customerPhoneVerificationsVerifyPostResponse:Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostResponse;

    return-object v0
.end method

.method public setCustomerByIdResponse(Lcom/ibotta/api/call/customer/CustomerByIdResponse;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationResponse;->customerByIdResponse:Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    return-void
.end method

.method public setCustomerPhoneVerificationsVerifyPostResponse(Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostResponse;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationResponse;->customerPhoneVerificationsVerifyPostResponse:Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostResponse;

    return-void
.end method
