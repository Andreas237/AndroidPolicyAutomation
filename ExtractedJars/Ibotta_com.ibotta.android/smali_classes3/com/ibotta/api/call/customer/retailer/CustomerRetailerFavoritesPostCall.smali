.class public Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;
.super Lcom/ibotta/api/JsonParamApiCall;
.source "CustomerRetailerFavoritesPostCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/JsonParamApiCall<",
        "Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final customerId:I

.field private final retailerIds:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/util/LinkedHashSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/JsonParamApiCall;-><init>()V

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;->setRequiresAuthToken(Z)V

    .line 19
    iput p1, p0, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;->customerId:I

    .line 20
    iput-object p2, p0, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;->retailerIds:Ljava/util/LinkedHashSet;

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

    .line 40
    invoke-super {p0}, Lcom/ibotta/api/JsonParamApiCall;->buildParams()V

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;->retailerIds:Ljava/util/LinkedHashSet;

    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;->setJsonParam(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 47
    const-class v0, Lcom/ibotta/api/model/customer/FavoriteRetailer;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;->fromJsonToArrayList(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    .line 49
    new-instance p2, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesResponse;-><init>()V

    .line 50
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesResponse;->setFavoriteRetailers(Ljava/util/List;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$s/retailer_favorites.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesPostCall;->customerId:I

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

    .line 30
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesResponse;",
            ">;"
        }
    .end annotation

    .line 25
    const-class v0, Lcom/ibotta/api/call/customer/retailer/CustomerRetailerFavoritesResponse;

    return-object v0
.end method
