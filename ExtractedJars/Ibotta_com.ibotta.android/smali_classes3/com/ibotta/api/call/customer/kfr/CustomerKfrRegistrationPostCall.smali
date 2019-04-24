.class public Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerKfrRegistrationPostCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "customers/%1$d/kfr_registration.json"


# instance fields
.field private callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->setRequiresAuthToken(Z)V

    .line 22
    iput-object p1, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

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

    .line 46
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->params:Ljava/util/Map;

    const-string v1, "first_name"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->getFirstName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->params:Ljava/util/Map;

    const-string v1, "last_name"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->getLastName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->params:Ljava/util/Map;

    const-string v1, "email"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->params:Ljava/util/Map;

    const-string v1, "birthdate"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->getBirthdate()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->params:Ljava/util/Map;

    const-string v1, "password"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->params:Ljava/util/Map;

    const-string v1, "address1"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->getAddress1()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->params:Ljava/util/Map;

    const-string v1, "city"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->getCity()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->params:Ljava/util/Map;

    const-string v1, "state"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->getState()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->params:Ljava/util/Map;

    const-string v1, "zip_code"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->getZipCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->params:Ljava/util/Map;

    const-string v1, "accepted_tos"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->isAcceptedTos()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->getAddress2()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->params:Ljava/util/Map;

    const-string v1, "address2"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->getAddress2()Ljava/lang/String;

    move-result-object v2

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

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 68
    const-class v0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/kfr_registration.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->getCustomerId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCallParams()Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;->callParams:Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 32
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;",
            ">;"
        }
    .end annotation

    .line 27
    const-class v0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;

    return-object v0
.end method
