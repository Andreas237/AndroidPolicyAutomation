.class public Lcom/ibotta/api/call/store/StoresPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "StoresPostCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/store/StoresPostCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "stores.json"


# instance fields
.field private callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/store/StoresPostCall$CallParams;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/store/StoresPostCall;->setRequiresAuthToken(Z)V

    .line 22
    iput-object p1, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 42
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 44
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "UTC"

    .line 45
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 48
    iget-object v1, p0, Lcom/ibotta/api/call/store/StoresPostCall;->params:Ljava/util/Map;

    const-string v2, "store_id"

    iget-object v3, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/store/StoresPostCall$CallParams;->getStoreId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    iget-object v1, p0, Lcom/ibotta/api/call/store/StoresPostCall;->params:Ljava/util/Map;

    const-string v2, "timestamp"

    iget-object v3, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/store/StoresPostCall$CallParams;->getTimestamp()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresPostCall;->params:Ljava/util/Map;

    const-string v1, "event"

    iget-object v2, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresPostCall$CallParams;->getEventType()Lcom/ibotta/api/model/store/GeofenceEventType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/store/StoresPostCall$CallParams;->getLatitude()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresPostCall;->params:Ljava/util/Map;

    const-string v1, "lat"

    iget-object v2, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresPostCall$CallParams;->getLatitude()Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Float;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/store/StoresPostCall$CallParams;->getLongitude()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 57
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresPostCall;->params:Ljava/util/Map;

    const-string v1, "long"

    iget-object v2, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresPostCall$CallParams;->getLongitude()Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Float;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/store/StoresPostCall$CallParams;->getDeviceUdid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresPostCall;->params:Ljava/util/Map;

    const-string v1, "device_udid"

    iget-object v2, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresPostCall$CallParams;->getDeviceUdid()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    :cond_2
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/store/StoresPostCall$CallParams;->getToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 63
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresPostCall;->params:Ljava/util/Map;

    const-string v1, "token"

    iget-object v2, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresPostCall$CallParams;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    :cond_3
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/store/StoresPostCall$CallParams;->getActivity()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 66
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresPostCall;->params:Ljava/util/Map;

    const-string v1, "activity"

    iget-object v2, p0, Lcom/ibotta/api/call/store/StoresPostCall;->callParams:Lcom/ibotta/api/call/store/StoresPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresPostCall$CallParams;->getActivity()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/store/StoresPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

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

    .line 72
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "stores.json"

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
            "Lcom/ibotta/api/EmptyResponse;",
            ">;"
        }
    .end annotation

    .line 27
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method
