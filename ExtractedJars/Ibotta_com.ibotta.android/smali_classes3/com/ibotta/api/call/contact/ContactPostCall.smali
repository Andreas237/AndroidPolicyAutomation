.class public Lcom/ibotta/api/call/contact/ContactPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "ContactPostCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final email:Ljava/lang/String;

.field private final message:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final subject:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/contact/ContactPostCall;->setRequiresAuthToken(Z)V

    .line 19
    iput-object p1, p0, Lcom/ibotta/api/call/contact/ContactPostCall;->name:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lcom/ibotta/api/call/contact/ContactPostCall;->subject:Ljava/lang/String;

    .line 21
    iput-object p3, p0, Lcom/ibotta/api/call/contact/ContactPostCall;->message:Ljava/lang/String;

    .line 22
    iput-object p4, p0, Lcom/ibotta/api/call/contact/ContactPostCall;->email:Ljava/lang/String;

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

    .line 42
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/call/contact/ContactPostCall;->params:Ljava/util/Map;

    const-string v1, "contact[name]"

    iget-object v2, p0, Lcom/ibotta/api/call/contact/ContactPostCall;->name:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    iget-object v0, p0, Lcom/ibotta/api/call/contact/ContactPostCall;->params:Ljava/util/Map;

    const-string v1, "contact[subject]"

    iget-object v2, p0, Lcom/ibotta/api/call/contact/ContactPostCall;->subject:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/contact/ContactPostCall;->params:Ljava/util/Map;

    const-string v1, "contact[message]"

    iget-object v2, p0, Lcom/ibotta/api/call/contact/ContactPostCall;->message:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/call/contact/ContactPostCall;->params:Ljava/util/Map;

    const-string v1, "contact[email]"

    iget-object v2, p0, Lcom/ibotta/api/call/contact/ContactPostCall;->email:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/contact/ContactPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

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

    .line 53
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "contact.json"

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 32
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

    .line 27
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method
