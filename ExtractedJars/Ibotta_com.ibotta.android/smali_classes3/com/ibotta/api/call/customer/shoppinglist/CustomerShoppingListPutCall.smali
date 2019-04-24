.class public Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListPutCall;
.super Lcom/ibotta/api/JsonParamApiCall;
.source "CustomerShoppingListPutCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/JsonParamApiCall<",
        "Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final customerId:I

.field private final shoppingList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerShoppingListItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerShoppingListItem;",
            ">;)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Lcom/ibotta/api/JsonParamApiCall;-><init>()V

    const/4 v0, 0x1

    .line 17
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListPutCall;->setRequiresAuthToken(Z)V

    .line 18
    iput p1, p0, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListPutCall;->customerId:I

    .line 19
    iput-object p2, p0, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListPutCall;->shoppingList:Ljava/util/List;

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

    .line 39
    invoke-super {p0}, Lcom/ibotta/api/JsonParamApiCall;->buildParams()V

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListPutCall;->shoppingList:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListPutCall;->setJsonParam(Ljava/lang/Object;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListPutCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 45
    const-class v0, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListPutCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/shopping_list.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListPutCall;->customerId:I

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

    .line 29
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->PUT:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;",
            ">;"
        }
    .end annotation

    .line 24
    const-class v0, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;

    return-object v0
.end method
