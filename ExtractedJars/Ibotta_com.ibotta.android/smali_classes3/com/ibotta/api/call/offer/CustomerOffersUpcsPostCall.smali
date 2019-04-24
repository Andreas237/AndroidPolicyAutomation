.class public Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;
.super Lcom/ibotta/api/FileUploadApiCall;
.source "CustomerOffersUpcsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/FileUploadApiCall<",
        "Lcom/ibotta/api/call/offer/OfferProductsResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final callParams:Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Lcom/ibotta/api/FileUploadApiCall;-><init>()V

    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->setRequiresAuthToken(Z)V

    .line 25
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;

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

    .line 47
    invoke-super {p0}, Lcom/ibotta/api/FileUploadApiCall;->buildParams()V

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_id"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->getCustomerId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->params:Ljava/util/Map;

    const-string v1, "offer_id"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->getOfferId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->params:Ljava/util/Map;

    const-string v1, "upc"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->getUpc()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->getBarcodeType()Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->params:Ljava/util/Map;

    const-string v1, "scan_type"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->getBarcodeType()Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v2

    invoke-static {v2}, Lcom/ibotta/api/model/common/BarcodeType;->toApiName(Lcom/ibotta/api/model/common/BarcodeType;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v0, "product_image"

    .line 58
    iget-object v1, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;

    invoke-virtual {v1}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->getProductImage()Ljava/io/File;

    move-result-object v1

    const-string v2, "image/jpeg"

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->addFilePart(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 19
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/OfferProductsResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/OfferProductsResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 63
    const-class v0, Lcom/ibotta/api/call/offer/OfferProductsResponse;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/offer/OfferProductsResponse;

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 6

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->getCustomerId()I

    move-result v0

    .line 41
    iget-object v1, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->callParams:Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;

    invoke-virtual {v1}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->getOfferId()I

    move-result v1

    .line 42
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v2

    const-string v3, "customers/%1$d/offers/%2$d/upcs.json"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    invoke-interface {v2, v3, v4}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 35
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/offer/OfferProductsResponse;",
            ">;"
        }
    .end annotation

    .line 30
    const-class v0, Lcom/ibotta/api/call/offer/OfferProductsResponse;

    return-object v0
.end method
