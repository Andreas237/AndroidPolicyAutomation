.class public Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerSettingsPutCall.java"

# interfaces
.implements Lcom/ibotta/api/PasswordContainer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;",
        ">;",
        "Lcom/ibotta/api/PasswordContainer;"
    }
.end annotation


# instance fields
.field private callParams:Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;->setRequiresAuthToken(Z)V

    .line 19
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 39
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 41
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;->params:Ljava/util/Map;

    const-string v1, "password"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;->getSettings()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v2

    const-string v3, "settings[%1$s]"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    invoke-interface {v2, v3, v4}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 45
    iget-object v3, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;->params:Ljava/util/Map;

    iget-object v4, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;

    invoke-virtual {v4}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;->getSettings()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 51
    const-class v0, Lcom/ibotta/api/model/customer/CustomerSettingsGroup;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;->fromJsonToArrayList(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    .line 53
    new-instance p2, Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;-><init>()V

    .line 54
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;->setGroups(Ljava/util/List;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$s/settings/many.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;->callParams:Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;->getCustomerId()I

    move-result v3

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
            "Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;",
            ">;"
        }
    .end annotation

    .line 24
    const-class v0, Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;

    return-object v0
.end method
