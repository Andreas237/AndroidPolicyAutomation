.class public Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;
.super Lcom/ibotta/api/JsonParamApiCall;
.source "CustomerRetailerLaunchesPostCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/JsonParamApiCall<",
        "Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final customerId:I

.field private final launchInfoParam:Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;


# direct methods
.method public constructor <init>(ILcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/ibotta/api/JsonParamApiCall;-><init>()V

    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;->setRequiresAuthToken(Z)V

    .line 22
    iput p1, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;->customerId:I

    .line 23
    iput-object p2, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;->launchInfoParam:Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 43
    invoke-super {p0}, Lcom/ibotta/api/JsonParamApiCall;->buildParams()V

    .line 44
    iget-object v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;->launchInfoParam:Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;

    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;->setJsonParam(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;-><init>()V

    .line 50
    const-class v1, Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;

    invoke-static {p1, p2, v1}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;->setCustomerRetailerLaunch(Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;)V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/retailer_launches.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;->customerId:I

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
            "Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;",
            ">;"
        }
    .end annotation

    .line 28
    const-class v0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;

    return-object v0
.end method
