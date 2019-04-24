.class public Lcom/ibotta/api/call/problem/ProblemsPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "ProblemsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private callParams:Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/problem/ProblemsPostCall;->setRequiresAuthToken(Z)V

    .line 16
    iput-object p1, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall;->callParams:Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;

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

    .line 36
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 38
    iget-object v0, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall;->params:Ljava/util/Map;

    const-string v1, "problem_report[item_id]"

    iget-object v2, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall;->callParams:Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->getItemId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    iget-object v0, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall;->params:Ljava/util/Map;

    const-string v1, "problem_report[item_type]"

    iget-object v2, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall;->callParams:Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->getItemType()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    iget-object v0, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall;->callParams:Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall;->params:Ljava/util/Map;

    const-string v1, "problem_report[text]"

    iget-object v2, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall;->callParams:Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall;->callParams:Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->getPhoneData()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall;->params:Ljava/util/Map;

    const-string v1, "problem_report[phone_data]"

    iget-object v2, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall;->callParams:Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->getPhoneData()Ljava/lang/String;

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

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/problem/ProblemsPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

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

    .line 51
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "problems.json"

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 26
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

    .line 21
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method
