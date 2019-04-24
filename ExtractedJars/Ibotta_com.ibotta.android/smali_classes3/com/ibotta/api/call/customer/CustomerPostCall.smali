.class public Lcom/ibotta/api/call/customer/CustomerPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerPostCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/customer/CustomerResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

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

    .line 40
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 43
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[email]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[password]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[password_confirmation]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getPasswordConfirmation()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getInviteCode()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "invite_code"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getInviteCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getZip()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 52
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[zip]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getZip()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getBirthDate()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 55
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[birth_date]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getBirthDate()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    :cond_2
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getGender()Lcom/ibotta/api/call/customer/Gender;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 58
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[gender]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getGender()Lcom/ibotta/api/call/customer/Gender;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/Gender;->getApiName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    :cond_3
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getUdid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[udid]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getUdid()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    :cond_4
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getPhone()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 64
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[phone]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getPhone()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    :cond_5
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getAddress()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 67
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[address]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    :cond_6
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getCity()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 70
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[city]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getCity()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    :cond_7
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getState()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 73
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[state]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getState()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    :cond_8
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getZip()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 76
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[zip]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getZip()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    :cond_9
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getFirstName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 79
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[first_name]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getFirstName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    :cond_a
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getLastName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 82
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer[last_name]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getLastName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    :cond_b
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getFriend()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 85
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "friend"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getFriend()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    :cond_c
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getDeviceUdid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 88
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "device_udid"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getDeviceUdid()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    :cond_d
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getInstalledApps()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 91
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "installed_apps"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getInstalledApps()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    :cond_e
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/auth/AuthType;->FACEBOOK:Lcom/ibotta/api/model/auth/AuthType;

    if-ne v0, v1, :cond_10

    .line 95
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "type"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/AuthType;->toApiName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_social[identifier]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getCustomerSocialIdentifier()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_social[token]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getCustomerSocialToken()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getCustomerSocialSecret()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 99
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_social[secret]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getCustomerSocialSecret()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    :cond_f
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getCustomerSocialExpiration()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    .line 102
    iget-object v1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->params:Ljava/util/Map;

    const-string v2, "customer_social[expiration]"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 103
    :cond_10
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/auth/AuthType;->IBOTTA:Lcom/ibotta/api/model/auth/AuthType;

    if-ne v0, v1, :cond_11

    :goto_0
    return-void

    .line 104
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Login type not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/CustomerPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/CustomerResponse;

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

    .line 110
    const-class v0, Lcom/ibotta/api/model/customer/Customer;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/CustomerPostCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/Customer;

    .line 111
    new-instance p2, Lcom/ibotta/api/call/customer/CustomerResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/CustomerResponse;-><init>()V

    .line 112
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/CustomerResponse;->setCustomer(Lcom/ibotta/api/model/customer/Customer;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "customers.json"

    return-object v0
.end method

.method public getCallParams()Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall;->callParams:Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 26
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

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

    .line 21
    const-class v0, Lcom/ibotta/api/call/customer/CustomerResponse;

    return-object v0
.end method
