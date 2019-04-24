.class Lcom/ibotta/android/api/deviceauth/PinVerificationCall$PinVerificationApiExecution;
.super Ljava/lang/Object;
.source "PinVerificationCall.java"

# interfaces
.implements Lcom/ibotta/api/execution/ApiExecution;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/api/deviceauth/PinVerificationCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PinVerificationApiExecution"
.end annotation


# instance fields
.field private final customerByIdCall:Lcom/ibotta/api/call/customer/CustomerByIdCall;

.field private final customerPhoneVerificationsVerifyPostCall:Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostCall;

.field final synthetic this$0:Lcom/ibotta/android/api/deviceauth/PinVerificationCall;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/api/deviceauth/PinVerificationCall;Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostCall;Lcom/ibotta/api/call/customer/CustomerByIdCall;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall$PinVerificationApiExecution;->this$0:Lcom/ibotta/android/api/deviceauth/PinVerificationCall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p2, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall$PinVerificationApiExecution;->customerPhoneVerificationsVerifyPostCall:Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostCall;

    .line 75
    iput-object p3, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall$PinVerificationApiExecution;->customerByIdCall:Lcom/ibotta/api/call/customer/CustomerByIdCall;

    return-void
.end method


# virtual methods
.method public abort()V
    .locals 0

    return-void
.end method

.method public executeApiCall(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/api/ApiResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 80
    iget-object p1, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall$PinVerificationApiExecution;->this$0:Lcom/ibotta/android/api/deviceauth/PinVerificationCall;

    invoke-static {p1}, Lcom/ibotta/android/api/deviceauth/PinVerificationCall;->access$000(Lcom/ibotta/android/api/deviceauth/PinVerificationCall;)Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomer(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    .line 84
    :try_start_0
    iget-object p1, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall$PinVerificationApiExecution;->customerPhoneVerificationsVerifyPostCall:Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostCall;

    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostCall;->execute()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall$PinVerificationApiExecution;->customerPhoneVerificationsVerifyPostCall:Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostCall;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostCall;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 99
    :try_start_1
    iget-object v0, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall$PinVerificationApiExecution;->customerByIdCall:Lcom/ibotta/api/call/customer/CustomerByIdCall;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdCall;->execute()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall$PinVerificationApiExecution;->customerByIdCall:Lcom/ibotta/api/call/customer/CustomerByIdCall;

    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/CustomerByIdCall;->isSuccess()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->isPhoneVerified()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 112
    new-instance v1, Lcom/ibotta/android/api/deviceauth/PinVerificationResponse;

    invoke-direct {v1}, Lcom/ibotta/android/api/deviceauth/PinVerificationResponse;-><init>()V

    .line 113
    invoke-virtual {v1, p1}, Lcom/ibotta/android/api/deviceauth/PinVerificationResponse;->setCustomerPhoneVerificationsVerifyPostResponse(Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostResponse;)V

    .line 115
    invoke-virtual {v1, v0}, Lcom/ibotta/android/api/deviceauth/PinVerificationResponse;->setCustomerByIdResponse(Lcom/ibotta/api/call/customer/CustomerByIdResponse;)V

    return-object v1

    .line 109
    :cond_0
    new-instance p1, Lcom/ibotta/api/ApiException;

    const-string v0, "Failed to confirm that the phone is verified."

    invoke-direct {p1, v0}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    .line 101
    instance-of v0, p1, Lcom/ibotta/api/ApiException;

    if-eqz v0, :cond_1

    .line 102
    check-cast p1, Lcom/ibotta/api/ApiException;

    throw p1

    .line 104
    :cond_1
    new-instance v0, Lcom/ibotta/api/ApiException;

    const-string v1, "Failed to invoke CustomerByIdCall."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 94
    :cond_2
    new-instance p1, Lcom/ibotta/api/ApiException;

    const-string v0, "Failed to invoke CustomerPhoneVerificationsVerifyPostCall."

    invoke-direct {p1, v0}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_1
    move-exception p1

    .line 86
    instance-of v0, p1, Lcom/ibotta/api/ApiException;

    if-eqz v0, :cond_3

    .line 87
    check-cast p1, Lcom/ibotta/api/ApiException;

    throw p1

    .line 89
    :cond_3
    new-instance v0, Lcom/ibotta/api/ApiException;

    const-string v1, "Failed to invoke CustomerPhoneVerificationsVerifyPostCall."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public getEndpoint(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public isAborted()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
