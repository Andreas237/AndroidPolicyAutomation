.class public Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerSocialsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->setRequiresAuthToken(Z)V

    .line 17
    iput-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

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

    .line 43
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/auth/AuthType;->isSocial()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 44
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->params:Ljava/util/Map;

    const-string v1, "type"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/AuthType;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getCustomerSocialIdentifier()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_social[identifier]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getCustomerSocialIdentifier()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getCustomerSocialToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_social[token]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getCustomerSocialToken()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getCustomerSocialSecret()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 53
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_social[secret]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getCustomerSocialSecret()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    :cond_2
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getCustomerSocialExpiration()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 56
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getCustomerSocialExpiration()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    .line 57
    iget-object v1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->params:Ljava/util/Map;

    const-string v2, "customer_social[expiration]"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    :cond_3
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getCustomerSocialAuthCode()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_social[auth_code]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getCustomerSocialAuthCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void

    .line 63
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Auth type not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

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

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 69
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$s/socials.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->getCustomerId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCallParams()Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->callParams:Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 31
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/EmptyResponse;",
            ">;"
        }
    .end annotation

    .line 22
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method
