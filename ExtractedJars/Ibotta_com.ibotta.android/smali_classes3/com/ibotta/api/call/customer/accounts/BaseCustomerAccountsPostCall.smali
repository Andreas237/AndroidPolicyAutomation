.class public abstract Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "BaseCustomerAccountsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/ibotta/api/ApiResponse;",
        ">",
        "Lcom/ibotta/api/BaseApiCall<",
        "TT;>;"
    }
.end annotation


# instance fields
.field protected callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 14
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->setRequiresAuthToken(Z)V

    .line 15
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 25
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 26
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->getType()Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    move-result-object v0

    .line 28
    sget-object v1, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->PAYPAL:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->VENMO:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->CREDIT_CARD:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->BANK_ACCOUNT:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 30
    :goto_1
    sget-object v4, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->BANK_ACCOUNT:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-ne v0, v4, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    .line 31
    :goto_2
    sget-object v5, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->CREDIT_CARD:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-eq v0, v5, :cond_4

    sget-object v5, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->BANK_ACCOUNT:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-ne v0, v5, :cond_3

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v5, 0x1

    .line 32
    :goto_4
    sget-object v6, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->PAYPAL:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-eq v0, v6, :cond_6

    sget-object v6, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->CREDIT_CARD:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-ne v0, v6, :cond_5

    goto :goto_5

    :cond_5
    const/4 v6, 0x0

    goto :goto_6

    :cond_6
    :goto_5
    const/4 v6, 0x1

    .line 33
    :goto_6
    sget-object v7, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->BANK_ACCOUNT:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-ne v0, v7, :cond_7

    const/4 v7, 0x1

    goto :goto_7

    :cond_7
    const/4 v7, 0x0

    .line 34
    :goto_7
    sget-object v8, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->BANK_ACCOUNT:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-ne v0, v8, :cond_8

    const/4 v8, 0x1

    goto :goto_8

    :cond_8
    const/4 v8, 0x0

    .line 35
    :goto_8
    sget-object v9, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->SCHOOL_DONATION:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-ne v0, v9, :cond_9

    const/4 v9, 0x1

    goto :goto_9

    :cond_9
    const/4 v9, 0x0

    .line 36
    :goto_9
    sget-object v10, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->UNITED_WAY:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-ne v0, v10, :cond_a

    const/4 v2, 0x1

    .line 38
    :cond_a
    iget-object v3, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->params:Ljava/util/Map;

    const-string v10, "customer_id"

    iget-object v11, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    invoke-virtual {v11}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->getCustomerId()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v3, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    iget-object v3, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->params:Ljava/util/Map;

    const-string v10, "type"

    iget-object v11, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    invoke-virtual {v11}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->getType()Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    move-result-object v11

    invoke-virtual {v11}, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v3, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    sget-object v3, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->PAYPAL:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-eq v0, v3, :cond_b

    sget-object v3, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->VENMO:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    if-ne v0, v3, :cond_c

    .line 41
    :cond_b
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->params:Ljava/util/Map;

    const-string v3, "password"

    iget-object v10, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    invoke-virtual {v10}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->getPassword()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    if-eqz v2, :cond_d

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_account[account_holder]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->getType()Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_d
    if-eqz v1, :cond_e

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_account[account_number]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->getAccountNumber()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    if-eqz v4, :cond_f

    .line 53
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_account[bank_number]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->getBankNumber()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    if-eqz v5, :cond_10

    .line 56
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_account[account_type]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->getAccountType()Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    if-eqz v6, :cond_11

    .line 59
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_account[account_holder]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->getAccountHolder()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    if-eqz v7, :cond_12

    .line 62
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_account[account_date]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->getAccountDate()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    if-eqz v8, :cond_13

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_account[account_secret]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->getAccountSecret()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_13
    if-eqz v9, :cond_14

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_account[destination_id]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;

    .line 69
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->getDestinationId()I

    move-result v2

    .line 68
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    :goto_a
    return-void
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 20
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method
