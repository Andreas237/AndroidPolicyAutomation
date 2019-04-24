.class public Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerPhoneVerificationsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private customerId:I

.field private phone:Ljava/lang/String;

.field private referenceId:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->setRequiresAuthToken(Z)V

    .line 21
    iput p1, p0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->customerId:I

    .line 22
    iput-object p2, p0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->phone:Ljava/lang/String;

    .line 23
    iput-object p3, p0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->referenceId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 43
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 46
    iget-object v0, p0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_id"

    iget v2, p0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->customerId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->params:Ljava/util/Map;

    const-string v1, "phone"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->phone:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->referenceId:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->params:Ljava/util/Map;

    const-string v1, "reference_id"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->referenceId:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 57
    const-class v0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/phone_verifications.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 33
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;",
            ">;"
        }
    .end annotation

    .line 28
    const-class v0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;

    return-object v0
.end method
