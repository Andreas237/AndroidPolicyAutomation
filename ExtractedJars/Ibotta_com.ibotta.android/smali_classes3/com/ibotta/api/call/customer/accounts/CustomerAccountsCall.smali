.class public Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "CustomerAccountsCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/customer/accounts/CustomerAccountsResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private customerId:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x1

    .line 17
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;->setRequiresAuthToken(Z)V

    .line 18
    iput p1, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;->customerId:I

    return-void
.end method


# virtual methods
.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/accounts/CustomerAccountsResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/accounts/CustomerAccountsResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 38
    const-class v0, Lcom/ibotta/api/model/customer/CustomerAccount;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;->fromJsonToArrayList(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    .line 40
    new-instance p2, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsResponse;-><init>()V

    .line 41
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsResponse;->setCustomerAccounts(Ljava/util/List;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 33
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/accounts.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "customer_accounts"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    iget v1, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCall;->customerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 28
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/accounts/CustomerAccountsResponse;",
            ">;"
        }
    .end annotation

    .line 23
    const-class v0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
