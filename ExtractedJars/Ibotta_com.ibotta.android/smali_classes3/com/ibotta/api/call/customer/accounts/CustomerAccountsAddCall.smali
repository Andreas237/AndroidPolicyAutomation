.class public Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddCall;
.super Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;
.source "CustomerAccountsAddCall.java"

# interfaces
.implements Lcom/ibotta/api/PasswordContainer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall<",
        "Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddResponse;",
        ">;",
        "Lcom/ibotta/api/PasswordContainer;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;-><init>(Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;)V

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

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 29
    const-class v0, Lcom/ibotta/api/model/customer/CustomerAccount;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/CustomerAccount;

    .line 31
    new-instance p2, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddResponse;-><init>()V

    .line 32
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddResponse;->setCustomerAccount(Lcom/ibotta/api/model/customer/CustomerAccount;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/accounts.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->getCustomerId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddResponse;",
            ">;"
        }
    .end annotation

    .line 19
    const-class v0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddResponse;

    return-object v0
.end method
