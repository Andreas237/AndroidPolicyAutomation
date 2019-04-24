.class public Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerDevicePostCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/customer/device/CustomerDevicePostResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private callParams:Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->setRequiresAuthToken(Z)V

    .line 17
    iput-object p1, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->callParams:Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;

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
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->params:Ljava/util/Map;

    const-string v1, "type"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->callParams:Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->getDeviceType()Lcom/ibotta/api/call/customer/device/DeviceType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/device/DeviceType;->getApiName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->params:Ljava/util/Map;

    const-string v1, "customer_device[device_info]"

    sget-object v2, Lcom/ibotta/api/ApiModule;->INSTANCE:Lcom/ibotta/api/ApiModule;

    invoke-virtual {v2}, Lcom/ibotta/api/ApiModule;->getHttpHeaders()Lcom/ibotta/api/HttpHeaders;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/HttpHeaders;->getAppVersion()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->callParams:Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->getToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->params:Ljava/util/Map;

    const-string v1, "customer_device[token]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->callParams:Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->callParams:Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->getDeviceUdid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 52
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->params:Ljava/util/Map;

    const-string v1, "customer_device[device_udid]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->callParams:Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->getDeviceUdid()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->callParams:Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->getDeviceGlobalId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 55
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->params:Ljava/util/Map;

    const-string v1, "customer_device[device_globalid]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->callParams:Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->getDeviceGlobalId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/device/CustomerDevicePostResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/device/CustomerDevicePostResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 61
    const-class v0, Lcom/ibotta/api/model/customer/Device;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/Device;

    .line 62
    new-instance p2, Lcom/ibotta/api/call/customer/device/CustomerDevicePostResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostResponse;-><init>()V

    .line 63
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostResponse;->setDevice(Lcom/ibotta/api/model/customer/Device;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/devices.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->callParams:Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->getCustomerId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCallParams()Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->callParams:Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;

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
            "Lcom/ibotta/api/call/customer/device/CustomerDevicePostResponse;",
            ">;"
        }
    .end annotation

    .line 26
    const-class v0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostResponse;

    return-object v0
.end method
