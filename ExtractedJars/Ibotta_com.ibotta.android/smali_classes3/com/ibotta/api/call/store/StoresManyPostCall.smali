.class public Lcom/ibotta/api/call/store/StoresManyPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "StoresManyPostCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;
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
.field public static final API_FUNCTION:Ljava/lang/String; = "stores/many.json"


# instance fields
.field private final callParamsList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceUdid:Ljava/lang/String;

.field private final token:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 23
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/store/StoresManyPostCall;->setRequiresAuthToken(Z)V

    .line 24
    iput-object p1, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->deviceUdid:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->token:Ljava/lang/String;

    .line 26
    iput-object p3, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->callParamsList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 46
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->deviceUdid:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->params:Ljava/util/Map;

    const-string v1, "device_udid"

    iget-object v2, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->deviceUdid:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->token:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 53
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->params:Ljava/util/Map;

    const-string v1, "token"

    iget-object v2, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->token:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 57
    :goto_0
    iget-object v2, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->callParamsList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_5

    .line 58
    iget-object v2, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->callParamsList:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;

    .line 60
    invoke-virtual {p0}, Lcom/ibotta/api/call/store/StoresManyPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v3

    const-string v4, "events[%1$d]"

    const/4 v5, 0x1

    new-array v6, v5, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v0

    invoke-interface {v3, v4, v6}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 61
    sget-object v4, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v6, "Adding event %1$s"

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v3, v5, v0

    invoke-interface {v4, v6, v5}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    iget-object v4, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->params:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "[store_id]"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->getStoreId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    iget-object v4, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->params:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "[timestamp]"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->getTimestamp()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {p0, v6}, Lcom/ibotta/api/call/store/StoresManyPostCall;->formatISO8601Date(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    iget-object v4, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->params:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "[event]"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->getEventType()Lcom/ibotta/api/model/store/GeofenceEventType;

    move-result-object v6

    invoke-virtual {v6}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->getLatitude()Ljava/lang/Float;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 69
    iget-object v4, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->params:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "[lat]"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->getLatitude()Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Float;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :cond_2
    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->getLongitude()Ljava/lang/Float;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 72
    iget-object v4, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->params:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "[long]"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->getLongitude()Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Float;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    :cond_3
    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->getActivity()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 75
    iget-object v4, p0, Lcom/ibotta/api/call/store/StoresManyPostCall;->params:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "[activity]"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->getActivity()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_5
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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/store/StoresManyPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

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

    .line 82
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "stores/many.json"

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 36
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

    .line 31
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method
