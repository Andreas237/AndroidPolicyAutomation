.class public Lcom/ibotta/android/api/deviceauth/PinVerificationCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "PinVerificationCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/api/deviceauth/PinVerificationCall$PinVerificationApiExecution;
    }
.end annotation


# instance fields
.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private final customerId:I

.field private final referenceId:Ljava/lang/String;

.field private final verificationCode:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/service/api/job/CacheClearJobFactory;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 34
    iput p2, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall;->customerId:I

    .line 35
    iput-object p3, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall;->referenceId:Ljava/lang/String;

    .line 36
    iput-object p4, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall;->verificationCode:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/api/deviceauth/PinVerificationCall;)Lcom/ibotta/android/service/api/job/CacheClearJobFactory;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-object p0
.end method


# virtual methods
.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
    .locals 4

    .line 61
    new-instance v0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostCall;

    iget v1, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall;->customerId:I

    iget-object v2, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall;->referenceId:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall;->verificationCode:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostCall;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 63
    new-instance v1, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget v2, p0, Lcom/ibotta/android/api/deviceauth/PinVerificationCall;->customerId:I

    invoke-direct {v1, v2}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    .line 64
    new-instance v2, Lcom/ibotta/android/api/deviceauth/PinVerificationCall$PinVerificationApiExecution;

    invoke-direct {v2, p0, v0, v1}, Lcom/ibotta/android/api/deviceauth/PinVerificationCall$PinVerificationApiExecution;-><init>(Lcom/ibotta/android/api/deviceauth/PinVerificationCall;Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsVerifyPostCall;Lcom/ibotta/api/call/customer/CustomerByIdCall;)V

    return-object v2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/pin_verification"

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 41
    const-class v0, Lcom/ibotta/android/api/deviceauth/PinVerificationResponse;

    return-object v0
.end method
