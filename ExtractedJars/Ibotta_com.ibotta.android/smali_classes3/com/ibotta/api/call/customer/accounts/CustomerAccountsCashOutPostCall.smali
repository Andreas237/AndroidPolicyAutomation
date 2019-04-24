.class public Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerAccountsCashOutPostCall.java"

# interfaces
.implements Lcom/ibotta/api/PasswordContainer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostResponse;",
        ">;",
        "Lcom/ibotta/api/PasswordContainer;"
    }
.end annotation


# static fields
.field private static final CONNECTION_TIMEOUT:J

.field private static final SOCKET_TIMEOUT:J


# instance fields
.field private callParams:Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 15
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xf

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->CONNECTION_TIMEOUT:J

    .line 16
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x14

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->SOCKET_TIMEOUT:J

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->setRequiresAuthToken(Z)V

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 52
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 54
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_id"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->getCustomerId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->params:Ljava/util/Map;

    const-string v1, "password"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->params:Ljava/util/Map;

    const-string v1, "id"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->getAccountId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->params:Ljava/util/Map;

    const-string v1, "payment[amount]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->getAmount()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->params:Ljava/util/Map;

    const-string v1, "payment[action_counter]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->getActionCounter()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->getDestination()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->params:Ljava/util/Map;

    const-string v1, "payment[destination]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->getDestination()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->getReferenceId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 64
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->params:Ljava/util/Map;

    const-string v1, "reference_id"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->getReferenceId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 70
    const-class v0, Lcom/ibotta/api/model/customer/CustomerAccount;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/CustomerAccount;

    .line 72
    new-instance p2, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostResponse;-><init>()V

    .line 73
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostResponse;->setCustomerAccount(Lcom/ibotta/api/model/customer/CustomerAccount;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/accounts/%2$d/cashout.json"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->getCustomerId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->callParams:Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;

    .line 47
    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->getAccountId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 46
    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getConnectionTimeout()Ljava/lang/Long;
    .locals 2

    .line 36
    sget-wide v0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->CONNECTION_TIMEOUT:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 31
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostResponse;",
            ">;"
        }
    .end annotation

    .line 26
    const-class v0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostResponse;

    return-object v0
.end method

.method public getSocketTimeout()Ljava/lang/Long;
    .locals 2

    .line 41
    sget-wide v0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;->SOCKET_TIMEOUT:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
