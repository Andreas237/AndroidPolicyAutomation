.class public Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall;
.super Lcom/ibotta/api/JsonParamApiCall;
.source "CustomerOfferCategoriesPutCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall$Payload;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/JsonParamApiCall<",
        "Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final customerId:I

.field private final payload:Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall$Payload;

.field private final retailerId:I


# direct methods
.method public constructor <init>(IILcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall$Payload;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/ibotta/api/JsonParamApiCall;-><init>()V

    const/4 v0, 0x1

    .line 27
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall;->setRequiresAuthToken(Z)V

    .line 28
    iput p1, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall;->customerId:I

    .line 29
    iput p2, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall;->retailerId:I

    .line 30
    iput-object p3, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall;->payload:Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall$Payload;

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

    .line 50
    invoke-super {p0}, Lcom/ibotta/api/JsonParamApiCall;->buildParams()V

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall;->payload:Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall$Payload;

    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall;->setJsonParam(Ljava/lang/Object;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 56
    const-class v0, Lcom/ibotta/api/model/customer/CustomerOfferCategory;

    .line 57
    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall;->fromJsonToArrayList(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    .line 59
    new-instance p2, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutResponse;-><init>()V

    .line 60
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutResponse;->setCustomerOfferCategories(Ljava/util/List;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 45
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/retailers/%2$d/offer_categories.json"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutCall;->retailerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 40
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->PUT:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutResponse;",
            ">;"
        }
    .end annotation

    .line 35
    const-class v0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesPutResponse;

    return-object v0
.end method
