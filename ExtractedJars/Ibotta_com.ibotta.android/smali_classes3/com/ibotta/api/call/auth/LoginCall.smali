.class public Lcom/ibotta/api/call/auth/LoginCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "LoginCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/customer/CustomerResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "login.json"


# instance fields
.field private login:Lcom/ibotta/api/model/auth/Login;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/auth/Login;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    const/4 p1, 0x0

    .line 26
    invoke-virtual {p0, p1}, Lcom/ibotta/api/call/auth/LoginCall;->setRequiresAuthToken(Z)V

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

    .line 58
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v0}, Lcom/ibotta/api/model/auth/Login;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/auth/AuthType;->IBOTTA:Lcom/ibotta/api/model/auth/AuthType;

    if-ne v0, v1, :cond_0

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->params:Ljava/util/Map;

    const-string v1, "email"

    iget-object v2, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/Login;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->params:Ljava/util/Map;

    const-string v1, "password"

    iget-object v2, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/Login;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v0}, Lcom/ibotta/api/model/auth/Login;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/auth/AuthType;->FACEBOOK:Lcom/ibotta/api/model/auth/AuthType;

    if-ne v0, v1, :cond_2

    .line 64
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->params:Ljava/util/Map;

    const-string v1, "type"

    iget-object v2, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/Login;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/AuthType;->toApiName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->params:Ljava/util/Map;

    const-string v1, "customer_social[identifier]"

    iget-object v2, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialIdentifier()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->params:Ljava/util/Map;

    const-string v1, "customer_social[token]"

    iget-object v2, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialToken()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v0}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialSecret()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->params:Ljava/util/Map;

    const-string v1, "customer_social[secret]"

    iget-object v2, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialSecret()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v0}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialExpiration()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    .line 71
    iget-object v1, p0, Lcom/ibotta/api/call/auth/LoginCall;->params:Ljava/util/Map;

    const-string v2, "customer_social[expiration]"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 72
    :cond_2
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v0}, Lcom/ibotta/api/model/auth/Login;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/auth/AuthType;->GOOGLE:Lcom/ibotta/api/model/auth/AuthType;

    if-ne v0, v1, :cond_4

    .line 73
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->params:Ljava/util/Map;

    const-string v1, "type"

    iget-object v2, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/Login;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/AuthType;->toApiName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->params:Ljava/util/Map;

    const-string v1, "customer_social[identifier]"

    iget-object v2, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialIdentifier()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->params:Ljava/util/Map;

    const-string v1, "customer_social[auth_code]"

    iget-object v2, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialAuthCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    :goto_0
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v0}, Lcom/ibotta/api/model/auth/Login;->getDeviceUdid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 81
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->params:Ljava/util/Map;

    const-string v1, "device_udid"

    iget-object v2, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/Login;->getDeviceUdid()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void

    .line 77
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Login type not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/Login;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/auth/LoginCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/CustomerResponse;

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

    .line 45
    const-class v0, Lcom/ibotta/api/model/customer/Customer;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/auth/LoginCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/Customer;

    .line 46
    new-instance p2, Lcom/ibotta/api/call/customer/CustomerResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/CustomerResponse;-><init>()V

    .line 47
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/CustomerResponse;->setCustomer(Lcom/ibotta/api/model/customer/Customer;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "login.json"

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 40
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getLogin()Lcom/ibotta/api/model/auth/Login;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/api/call/auth/LoginCall;->login:Lcom/ibotta/api/model/auth/Login;

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

    .line 31
    const-class v0, Lcom/ibotta/api/call/customer/CustomerResponse;

    return-object v0
.end method
