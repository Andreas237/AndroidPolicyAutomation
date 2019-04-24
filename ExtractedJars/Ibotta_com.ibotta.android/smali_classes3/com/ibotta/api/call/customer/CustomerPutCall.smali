.class public Lcom/ibotta/api/call/customer/CustomerPutCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerPutCall.java"

# interfaces
.implements Lcom/ibotta/api/PasswordContainer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/customer/CustomerResponse;",
        ">;",
        "Lcom/ibotta/api/PasswordContainer;"
    }
.end annotation


# instance fields
.field private callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/CustomerPutCall;->setRequiresAuthToken(Z)V

    .line 17
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

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

    .line 41
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 44
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "customer[email]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "password"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "customer[current_password]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getCurrentPassword()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getZip()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "customer[zip]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getZip()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getBirthDate()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "customer[birth_date]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getBirthDate()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getGender()Lcom/ibotta/api/call/customer/Gender;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 63
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "customer[gender]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getGender()Lcom/ibotta/api/call/customer/Gender;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/Gender;->getApiName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    :cond_2
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getUdid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 66
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "customer[udid]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getUdid()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    :cond_3
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getPhone()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 69
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "customer[phone]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getPhone()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :cond_4
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getAddress()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 72
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "customer[address]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    :cond_5
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getCity()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 75
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "customer[city]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getCity()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    :cond_6
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getState()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 78
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "customer[state]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getState()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    :cond_7
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getZip()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 81
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "customer[zip]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getZip()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    :cond_8
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getFirstName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 84
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "customer[first_name]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getFirstName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    :cond_9
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getLastName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 87
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->params:Ljava/util/Map;

    const-string v1, "customer[last_name]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getLastName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/CustomerPutCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/CustomerResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/CustomerResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 93
    const-class v0, Lcom/ibotta/api/model/customer/Customer;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/CustomerPutCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/Customer;

    .line 94
    new-instance p2, Lcom/ibotta/api/call/customer/CustomerResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/CustomerResponse;-><init>()V

    .line 95
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/CustomerResponse;->setCustomer(Lcom/ibotta/api/model/customer/Customer;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/CustomerPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$s.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->getCustomerId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCallParams()Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 31
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->PUT:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/CustomerResponse;",
            ">;"
        }
    .end annotation

    .line 26
    const-class v0, Lcom/ibotta/api/call/customer/CustomerResponse;

    return-object v0
.end method
